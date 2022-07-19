package ocpp_2_0_1_sbs;

import com.google.gson.Gson;

public class OCPPCallResult {
	/*
	 A CallResult is a message indicating that a Call has been handled succesfully.
    From the specification:
        A CallResult always consists of 3 elements: 
        The standard elements MessageTypeId, UniqueId 
        and a payload, containing the response to the Action in the original Call. 
        The syntax of a call looks like this: [<MessageTypeId>, "<UniqueId>", {<Payload>}]
        ...
        For example, a BootNotification response could look like this:
            [3,
             "19223201",
             {
              "status":"Accepted",
              "currentTime":"2013-02-01T20:53:32.486Z",
              "heartbeatInterval":300
             }
            ]
	 */
	
	static Gson gson_r = new Gson();
	int MessageTypeId = MessageType.CallResult;
	String UniqueId;
	transient String action;
	Object payload;
	
	public OCPPCallResult(String uid, Object pal, String act) { //strictly speaking no action is required
		//but in order to validate the message it is needed
		action=act;
		UniqueId=uid;
		payload=pal;
	}
	
	public String toJson() { //returns a valid JSON representation of the instance
		String json_rep = gson_r.toJson(this);
		return json_rep;
	}

}
