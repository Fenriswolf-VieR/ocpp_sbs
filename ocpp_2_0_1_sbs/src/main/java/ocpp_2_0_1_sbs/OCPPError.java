package ocpp_2_0_1_sbs;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class OCPPError {
	String description, code;
	Object details;
	static final Map<String, String> errors; //all supporrted errors
	static {
		HashMap<String, String> error = new HashMap<String, String>();
		//adding all errors
		error.put("FormatViolation","Payload for Action is syntactically incorrect");
		error.put("GenericError","Any other error not covered by the more specific error codes in this table");
		error.put("InternalError","An internal error occurred and the receiver was not able to process the requested Action successfully");
		error.put("MessageTypeNotSupported","A message with an Message Type Number received that is not supported by this implementation.");
		error.put("NotImplemented","Requested Action is not known by receiver");
		error.put("NotSupported","Request Action is recognized but not supported by the receiver");
		error.put("OccurrenceConstraintViolation","Payload for Action is syntactically correct but at least one of the fields violates occurrence constraints");
		error.put("PropertyConstraintViolation","Payload is syntactically correct but at least one field contains an invalid value");
		error.put("ProtocolError","Payload for Action is not conform the PDU structure");
		error.put("RpcFrameworkError","Content of the call is not a valid RPC Request, for example: MessageId could not be read.");
		error.put("SecurityError","During the processing of Action a security issue occurred preventing receiver from completing the Action successfully");
		error.put("TypeConstraintViolation","Payload for Action is syntactically correct but at least one of the fields violates data type constraints");
		errors = Collections.unmodifiableMap(error);
	}
	
	public OCPPError(String cod, String des, Object det) { 
		if(errors.containsKey(cod)) {
			code=cod;
		}else {
			code="GenericError";
		}
		
		if(des=="") {
			description=errors.get(code);
		}else {
			description=des;
		}
		
		details = det;
	}
	
	/*
	@Override
	public boolean equals(Object o) {
		//might need this otherwise delete it
	}*/
	
	@Override
	public String toString() {
		return this.code+": description="+this.description+", details="+this.details+">";
	}

}
