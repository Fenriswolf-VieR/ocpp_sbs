package ocpp_2_0_1_sbs;

import java.util.ArrayList;
import com.google.gson.Gson;

public class MessageType {
	
	static Gson gson_m = new Gson();
	static final int Call = 2;
	static final int CallResult = 3;
	static final int CallError = 4;
	
	public Object unpack(String json) { //unpacks a message into either a Call, CallError or Callresult.
		ArrayList<String> msg;
		msg=gson_m.fromJson(json,ArrayList.class); //implement FormatViolation and ProtocolError!!!
		switch(Integer.parseInt(msg.get(0))) {
			case Call:
				Object p = msg.get(3);
				return new OCPPCall(msg.get(1),msg.get(2),p);
			case CallResult:
				Object pa = msg.get(2);
				return new OCPPCallResult(msg.get(1),pa,"none");
			case CallError:
				//String uid, String erc, String erdesc, Object erdet
				Object det = msg.get(4);
				return new OCPPCallError(msg.get(1),msg.get(2),msg.get(3),det);
			default:
				//implement PropertyConstraintViolation (messageTypeId isn't valid or not contained in message)
				return new Object();
		}
	}
	
	//pack() returns the JSON representation of a Call, CallError or CallResult. It is here mainly to complement the unpack function of this module
	public String pack(OCPPCall msg) {
		return msg.toJson();
	}
	
	public String pack(OCPPCallResult msg) {
		return msg.toJson();
	}
	
	public String pack(OCPPCallError msg) { 
		return msg.toJson();
	}
	
	private Object getValidator(int mestyid,String act,String vers) {
		return new Object();
		//NotImplemented if fail to validate
	}
	
	public void validate_payload(Object message,String ocpp_version) {
		Object validator;
		if(message.getClass()==OCPPCall.class) {
			validator = getValidator(((OCPPCall)message).MessageTypeId,((OCPPCall)message).action,ocpp_version);
		}else if(message.getClass()==OCPPCallResult.class){
			validator = getValidator(((OCPPCallResult)message).MessageTypeId,((OCPPCallResult)message).action,ocpp_version);
		}else {
			//validationerror
		}
		//validate here or call errors
	}
}
