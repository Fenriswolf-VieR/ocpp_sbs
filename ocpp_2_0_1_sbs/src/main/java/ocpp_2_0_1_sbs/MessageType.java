package ocpp_2_0_1_sbs;

import java.net.URL;
import java.util.ArrayList;
import com.google.gson.Gson;
import net.jimblackler.jsonschemafriend.Schema;
import net.jimblackler.jsonschemafriend.SchemaStore;
import net.jimblackler.jsonschemafriend.Validator;
import net.jimblackler.jsonschemafriend.GenerationException;
import net.jimblackler.jsonschemafriend.MissingPropertyError;

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
	
	private Schema getSchema(int messagetypeid,String act,String vers) {
		//maybe chache results for performance
		if(vers !="2.0.1") {
			//ValueError
		}
		String schema_dir = "v"+vers.replace(".","")+"/schemas/";
		String schema_name = act;
		if(messagetypeid == Call) {
			schema_name+="Request";
		}else if(messagetypeid == CallResult) {
			schema_name+="Response";
		}
		String path=schema_dir+schema_name+".json";
		URL url = getClass().getResource(path);
		SchemaStore store = new SchemaStore();
		Schema schema = null;
		try {
			schema = store.loadSchema(url);
		} catch (GenerationException e) {
			//NotImplementedError if fail to load
			e.printStackTrace();
		}
		return schema;
	}
	
	public void validate_payload(Object message,String ocpp_version) {
		Schema schema=null;
		String json = "";
		if(message.getClass()==OCPPCall.class) {
			schema = getSchema(((OCPPCall)message).MessageTypeId,((OCPPCall)message).action,ocpp_version);
			json = ((OCPPCall)message).toJson();
		}else if(message.getClass()==OCPPCallResult.class){
			schema = getSchema(((OCPPCallResult)message).MessageTypeId,((OCPPCallResult)message).action,ocpp_version);
			json = ((OCPPCallResult)message).toJson();
		}else {
			//validationerror
		}
		//validate here or call errors
		new Validator().validate(schema,json,validationError ->{
			if (validationError instanceof MissingPropertyError) {
				MissingPropertyError missingPropertyError = (MissingPropertyError) validationError;
				System.out.println("A missing property was: " + missingPropertyError.getProperty());
			}
		});
	}
}
