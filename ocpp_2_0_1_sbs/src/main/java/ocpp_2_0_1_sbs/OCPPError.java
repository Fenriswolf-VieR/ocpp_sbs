package ocpp_2_0_1_sbs;

@SuppressWarnings("serial")
public class OCPPError extends Exception{
	
	String code="";
	String description, default_description;
	Object details;
	
	public OCPPError() {//for creation of inner classes
		
	}
	
	private OCPPError(String cod,String def_des, String des, Object det) { //should only be created by object of inner classes
		super((des=="") ? def_des : des);
		code=cod;
		default_description=def_des;
		details=det;
		
		if(des=="") {
			description=def_des;
		}else {
			description=des;
		}
	}
	
	public static OCPPError createOCPPError(String cod,String des,Object det) {//returns the error corresponding to the error code or generic error if not found
		switch(cod) {
			case "FormatViolation":
				return new OCPPError().new FormatViolationError(des,det);
			case "GenericError":
				return new OCPPError().new GenericError(des,det);
			case "InternalError":
				return new OCPPError().new InternalError(des,det);
			case "MessageTypeNotSupported":
				return new OCPPError().new MessageTypeNotSupportedError(des,det);
			case "NotImplemented":
				return new OCPPError().new NotImplementedError(des,det);
			case "NotSupported":
				return new OCPPError().new NotSupportedError(des,det);
			case "OccurrenceConstraintViolation":
				return new OCPPError().new OccurrenceConstraintViolationError(des,det);
			case "PropertyConstraintViolation":
				return new OCPPError().new PropertyConstraintViolationError(des,det);
			case "ProtocolError":
				return new OCPPError().new ProtocolError(des,det);
			case "RpcFrameworkError":
				return new OCPPError().new RpcFrameworkError(des,det);
			case "SecurityError":
				return new OCPPError().new SecurityError(des,det);
			case "TypeConstraintViolation":
				return new OCPPError().new TypeConstraintViolationError(des,det);
			default:
				return new OCPPError().new GenericError("Error code "+cod+" is not defined by the OCPP specification",det);
		}
	}
	

	@Override
	public String toString() {
		return this.code+": description="+this.description+", details="+this.details+">";
	}
	
	class FormatViolationError extends OCPPError{
		FormatViolationError(String des, Object det){
			super("FormatViolation","Payload for Action is syntactically incorrect",des,det);
		}
	}
	
	class GenericError extends OCPPError{
		GenericError(String des, Object det){
			super("GenericError","Any other error not covered by the more specific error codes in this table",des,det);
		}
	}
	
	class InternalError extends OCPPError{
		InternalError(String des, Object det){
			super("InternalError","An internal error occurred and the receiver was not able to process the requested Action successfully",des,det);
		}
	}
	
	class MessageTypeNotSupportedError extends OCPPError{
		MessageTypeNotSupportedError(String des, Object det){
			super("MessageTypeNotSupported","A message with an Message Type Number received that is not supported by this implementation",des,det);
		}
	}
	
	class NotImplementedError extends OCPPError{
		NotImplementedError(String des, Object det){
			super("NotImplemented","Requested Action is not known by receiver",des,det);
		}
	}
	
	class NotSupportedError extends OCPPError{
		NotSupportedError(String des, Object det){
			super("NotSupported","Request Action is recognized but not supported by the receiver",des,det);
		}
	}
	
	class OccurrenceConstraintViolationError extends OCPPError{
		OccurrenceConstraintViolationError(String des, Object det){
			super("OccurrenceConstraintViolation","Payload for Action is syntactically correct but at least one of the fields violates occurrence constraints",des,det);
		}
	}
	
	class PropertyConstraintViolationError extends OCPPError{
		PropertyConstraintViolationError(String des, Object det){
			super("PropertyConstraintViolation","Payload is syntactically correct but at least one field contains an invalid value",des,det);
		}
	}
	
	class ProtocolError extends OCPPError{
		ProtocolError(String des, Object det){
			super("ProtocolError","Payload for Action is not conform the PDU structure",des,det);
		}
	}
	
	class RpcFrameworkError extends OCPPError{
		RpcFrameworkError(String des, Object det){
			super("RpcFrameworkError","Content of the call is not a valid RPC Request, for example: MessageId could not be read",des,det);
		}
	}
	
	class SecurityError extends OCPPError{
		SecurityError(String des, Object det){
			super("SecurityError","During the processing of Action a security issue occurred preventing receiver from completing the Action successfully",des,det);
		}
	}
	
	class TypeConstraintViolationError extends OCPPError{
		TypeConstraintViolationError(String des, Object det){
			super("TypeConstraintViolation","Payload for Action is syntactically correct but at least one of the fields violates data type constraints",des,det);
		}
	}
}
