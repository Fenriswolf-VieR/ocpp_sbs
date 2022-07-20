package ocpp_2_0_1_sbs;

import com.google.gson.Gson;

public class OCPPCallError {
	/*
	 A CallError is a response to a Call that indicates an error.
    From the specification:
        A CallError always consists of 5 elements: 
        The standard elements MessageTypeId and UniqueId, 
        an errorCode string, 
        an errorDescription string 
        and an errorDetails object.
        The syntax of a call looks like this: [<MessageTypeId>, "<UniqueId>", "<errorCode>", "<errorDescription>", {<errorDetails>}]
        (No example was given)
	 */
	
	static Gson gson_e = new Gson();
	int MessageTypeId = MessageType.CallError;
	String UniqueId, errorCode, errorDescription;
	Object errorDetails;
	
	public OCPPCallError(String uid, String erc, String erdesc, Object erdet) { 
		UniqueId=uid;
		errorCode=erc;
		errorDescription=erdesc;
		errorDetails=erdet;
	}
	
	public String toJson() { //returns a valid JSON representation of the instance
		String json_rep = gson_e.toJson(this);
		return json_rep;
	}
	
	public OCPPError toError() {//returns the error that corresponds to this CallError
		return OCPPError.createOCPPError(errorCode,errorDescription,errorDetails);
	}

}
