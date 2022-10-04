/*package ocpp_2_0_1_sbs;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

//import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.PathParam;
//import javax.websocket.server.ServerApplicationConfig;
//import javax.websocket.server.ServerContainer;
import javax.websocket.server.ServerEndpoint;
//import javax.websocket.server.ServerEndpointConfig;
import javax.websocket.EncodeException;
//import javax.websocket.MessageHandler;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

@ServerEndpoint(
		value="wss://csms.connectiongURL.com/ocppj/{stationname}")
public class OCPP_JSON {
	
	private Session session;
    private static Set<OCPP_JSON> chargingStations = new CopyOnWriteArraySet<>();
    private static HashMap<String, String> users = new HashMap<>();

	@OnOpen
	public void onOpen(Session session, @PathParam("stationname") String stationname) throws IOException{
		//Get session and WebSocket connection
		this.session = session;
        chargingStations.add(this);
        users.put(session.getId(), stationname);

        Message message = new Message();
        message.setFrom(stationname);
        message.setContent("Connected!");
        broadcast(message);
	}
	
	@OnMessage
	public void onMessage(Session session, Message message) throws IOException, EncodeException{
		//Handle new messages
		
		message.setFrom(users.get(session.getId()));

        broadcast(message);
	}
	
	@OnClose
	public void onClose(Session session) throws IOException{
		//WebSocket connection closes
		
		chargingStations.remove(this);
		
        Message message = new Message();
        message.setFrom(users.get(session.getId()));
        message.setContent("Disconnected!");
        broadcast(message);
	}
	
	@OnError
	public void onError(Session session, Throwable throwable) {
		//Do error handling here
	}
	
	private static void broadcast(Message message) throws IOException, EncodeException{
		
		chargingStations.forEach(endpoint -> {
			synchronized (endpoint) {
				try {
					endpoint.session.getBasicRemote().sendObject(message);
				}catch (IOException | EncodeException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
*/

