package ocpp_2_0_1_sbs;

import java.util.HashMap;

public class OCPPError {
	String description;
	HashMap<String, String> details;
	HashMap<String, String> errors = new HashMap<String, String>(); //all supporrted errors
	
	public OCPPError(String des, HashMap<String, String> det) { 
		//adding all errors
		errors.put("FormatViolation","Payload for Action is syntactically incorrect");
		errors.put("GenericError","Any other error not covered by the more specific error codes in this table");
		errors.put("InternalError","An internal error occurred and the receiver was not able to process the requested Action successfully");
		errors.put("MessageTypeNotSupported","A message with an Message Type Number received that is not supported by this implementation.");
		errors.put("NotImplemented","Requested Action is not known by receiver");
		errors.put("NotSupported","Request Action is recognized but not supported by the receiver");
		errors.put("OccurrenceConstraintViolation","Payload for Action is syntactically correct but at least one of the fields violates occurrence constraints");
		errors.put("PropertyConstraintViolation","Payload is syntactically correct but at least one field contains an invalid value");
		errors.put("ProtocolError","Payload for Action is not conform the PDU structure");
		errors.put("RpcFrameworkError","Content of the call is not a valid RPC Request, for example: MessageId could not be read.");
		errors.put("SecurityError","During the processing of Action a security issue occurred preventing receiver from completing the Action successfully");
		errors.put("TypeConstraintViolation","Payload for Action is syntactically correct but at least one of the fields violates data type constraints");
		
		if(des=="") {
			//description=default_description;
		}else {
			description=des;
		}
		details = new HashMap<String, String>();
	}
	
	/*
	@Override
	public boolean equals(Object o) {
		if(true) {
			return (this.description,this.details)==(o.description,o.details);
		}
		return NotImp;
	}*/
	
	@Override
	public String toString() {
		return this.getClass().getName()+": description="+this.description+", details="+this.details+">";
	}

}
