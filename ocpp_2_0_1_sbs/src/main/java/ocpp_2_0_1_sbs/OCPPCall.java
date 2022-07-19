package ocpp_2_0_1_sbs;

import com.google.gson.Gson;

public class OCPPCall {
	/*
	A Call is a type of message that initiate a request/response sequence.
    Both central systems and charge points can send this message.
    From the specification:
        A Call always consists of 4 elements: 
        The standard elements MessageTypeId and UniqueId, 
        a specific Action that is required on the other side and 
        a payload, the arguments to the Action. 
        The syntax of a call looks like this: [<MessageTypeId>, "<UniqueId>", "<Action>", {<Payload>}]
        ...
        For example, a BootNotification request could look like this:
            [2,
             "19223201",
             "BootNotification",
             {
              "chargePointVendor": "VendorX",
              "chargePointModel": "SingleSocketCharger"
             }
            ]
	 */
	
	static Gson gson_c = new Gson();
	int MessageTypeId = MessageType.Call;
	String UniqueId, action;
	Object payload;
	
	public OCPPCall(String uid, String act, Object pal){
		UniqueId=uid;
		action=act;
		payload=pal;
	}
	
	public String toJson() { //returns a valid JSON representation of the instance
		String json_rep = gson_c.toJson(this);
		return json_rep;
	}
	
	public OCPPCallResult createCallResult(Object pal) {
		OCPPCallResult result = new OCPPCallResult(UniqueId,pal,action);
		return result;
	}
	
	public OCPPCallError createCallError(Object pal, OCPPError ero) {
		OCPPCallError error = new OCPPCallError(UniqueId,ero.code,ero.description,ero.details);
		return error;
	}

}
