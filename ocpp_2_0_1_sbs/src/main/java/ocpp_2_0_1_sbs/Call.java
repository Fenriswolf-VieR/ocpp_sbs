package ocpp_2_0_1_sbs;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@SuppressWarnings("rawtypes") //remove this afterwards!!!
public class Call{
	
	class AuthorizePayload{
		Map idToken;
		Optional<String> certificate = Optional.empty();
		Optional<ArrayList> iso15118CertificateHashData = Optional.empty();
		
		AuthorizePayload(Map id){
			idToken=id;
		}
		
		public void setCertificate(String cer) {
			certificate = Optional.of(cer);
		}
		
		public void setCertificateHashData(ArrayList hash) {
			iso15118CertificateHashData = Optional.of(hash);
		}
	}

	class BootNotificationPayload{
		Map chargingStation;
		String reason;
		
		BootNotificationPayload(Map charg, String reas){
			chargingStation=charg;
			reason=reas;
		}
	}

	class CancelReservationPayload {
		int reservationId;
		
		CancelReservationPayload(int rese){
			reservationId=rese;
		}
	}

	class CertificateSignedPayload{
		String certificateChain;
		Optional<String> certificateType = Optional.empty();
		
		CertificateSignedPayload(String cert){
			certificateChain=cert;
		}
		
		public void setCertificateType(String type) {
			certificateType=Optional.of(type);
		}
	}

	class ChangeAvailabilityPayload{
		String operationalStatus; 
		Optional<Map> evse = Optional.empty();
		
		ChangeAvailabilityPayload(String ope){
			operationalStatus=ope;
		}
		
		public void setEvse(Map ev) {
			evse=Optional.of(ev);
		}
	}

	class ClearCachePayload {
		ClearCachePayload(){
			//no requirements or options
		}
	}

	class ClearChargingProfilePayload{
		Optional<Integer> chargingProfileId= Optional.empty();
		
		ClearChargingProfilePayload(){
			//no requirements
		}
		
		public void setProfileId(int pro) {
			chargingProfileId=Optional.of(pro);
		}
	}
	
	class ClearDisplayMessagePayload{
		int id;
		
		ClearDisplayMessagePayload(int i){
			id=i;
		}
	}
	
	class ClearVariableMonitoringPayload{
		ArrayList id;
		
		ClearVariableMonitoringPayload(ArrayList i) {
			id=i;
		}
	}
	
	class ClearedChargingLimitPayload{
		String chargingLimitSource;
		Optional<Integer> evseId = Optional.empty();
		
		ClearedChargingLimitPayload(String charg){
			chargingLimitSource = charg;
		}
		
		public void setEvseId(int ev) {
			evseId=Optional.of(ev);
		}
	}
	
	class CostUpdatedPayload{
		int totalCost;
		String transactionId;
		
		CostUpdatedPayload(int tot, String trans){
			totalCost=tot;
			transactionId=trans;
		}
	}
	
	class CustomerInformationPayload{
		int requestId;
		boolean report;
		boolean clear;
		Optional<Map> customerCertificate = Optional.empty();
		Optional<Map> idToken = Optional.empty();
		Optional<String> customerIdentifier = Optional.empty();
		
		CustomerInformationPayload(int req, boolean rep, boolean cle){
			requestId = req;
			report = rep;
			clear = cle;
		}
		
		public void setCertificate(Map cert) {
			customerCertificate=Optional.of(cert);
		}
		
		public void setIdToken(Map idt) {
			idToken=Optional.of(idt);
		}
		
		public void setIdentifier(String customer) {
			customerIdentifier=Optional.of(customer);
		}
	}
	
	class DataTransferPayload{
		String vendorId;
		Optional<String> messageId = Optional.empty();
		Optional<String> data = Optional.empty();
		
		DataTransferPayload(String ven){
			vendorId=ven;
		}
		
		public void setMessageId(String message) {
			messageId=Optional.of(message);
		}
		
		public void setData(String dat) {
			data=Optional.of(dat);
		}
	}
	
	class DeleteCertificatePayload{
		Map certificateHashData;
		
		DeleteCertificatePayload(Map cer){
			certificateHashData = cer;
		}
	}
	
	class FirmwareStatusNotificationPayload{
		String status;
		Optional<Integer> requestId = Optional.empty();
		
		FirmwareStatusNotificationPayload(String sta){
			status=sta;
		}
		
		public void setRequestId(int req) {
			requestId=Optional.of(req);
		}
	}
	
	class Get15118EVCertificatePayload{
		String iso15118SchemaVersion;
		String action;
		String exiRequest;
		
		Get15118EVCertificatePayload(String iso, String act, String exi){
			iso15118SchemaVersion = iso;
			action = act;
			exiRequest = exi;
		}
	}
	
	class GetBaseReportPayload{
		int requestId;
		String reportBase;
		
		GetBaseReportPayload(int req, String rep){
			requestId=req;
			reportBase=rep;
		}
	}
	 
	class GetCertificateStatusPayload{
		Map ocspRequestData;
		
		GetCertificateStatusPayload(Map ocs){
			ocspRequestData=ocs;
		}
	}
	   
	class GetChargingProfilesPayload{
		 int requestId;
		 Map chargingProfile;
		 Optional<Integer> evseId = Optional.empty();
		 
		 GetChargingProfilesPayload(int req, Map cha){
			 requestId=req;
			 chargingProfile=cha;
		 }
		 
		 public void setEvseId(int evs) {
			 evseId=Optional.of(evs);
		 }
	}

	class GetCompositeSchedulePayload{
	    int duration;
	    int evseId;
	    Optional<String> chargingRateUnit = Optional.empty();
	    
	    GetCompositeSchedulePayload(int dur, int evs){
	    	duration=dur;
	    	evseId=evs;
	    }
	    
	    public void setUnit(String cha) {
	    	chargingRateUnit=Optional.of(cha);
	    }
	}

	class GetDisplayMessagesPayload{
	    int requestId;
	    Optional<ArrayList> id = Optional.empty();
	    Optional<String> priority = Optional.empty();
	    Optional<String> state = Optional.empty();
	    
	    GetDisplayMessagesPayload(int req){
	    	requestId=req;
	    }
	    
	    public void setId(ArrayList i) {
	    	id=Optional.of(i);
	    }
	    
	    public void setPriority(String prio) {
	    	priority=Optional.of(prio);
	    }
	    
	    public void setState(String sta) {
	    	state=Optional.of(sta);
	    }
	}

	class GetInstalledCertificateIdsPayload{
	    Optional<ArrayList> certificateType= Optional.empty();
	    
	    GetInstalledCertificateIdsPayload(){
			//no requirements
	    }
	    
	    public void setType(ArrayList cert) {
	    	certificateType=Optional.of(cert);
	    }
	}

	class GetLocalListVersionPayload{
		GetLocalListVersionPayload(){
			//no requirements or options
		}
	}

	class GetLogPayload{
	    Map log;
	    String logType;
	    int requestId;
	    Optional<Integer> retries = Optional.empty();
	    Optional<Integer> retryInterval = Optional.empty();
	    
	    GetLogPayload(Map lo, String logt, int req){
	    	log=lo;
	    	logType=logt;
	    	requestId=req;
	    }
	    
	    public void setRetries(int ret) {
	    	retries=Optional.of(ret);
	    }
	    
	    public void setInterval(int interval) {
	    	retryInterval=Optional.of(interval);
	    }
	}

	class GetMonitoringReportPayload{
	    int requestId;
	    Optional<ArrayList> componentVariable = Optional.empty();
	    Optional<ArrayList> monitoringCriteria = Optional.empty();
	    
	    GetMonitoringReportPayload(int req){
	    	requestId=req;
	    }
	    
	    public void SetComponent(ArrayList com) {
	    	componentVariable=Optional.of(com);
	    }
	    
	    public void setMonitoring(ArrayList mon) {
	    	monitoringCriteria=Optional.of(mon);
	    }
	}

	class GetReportPayload{
	    int requestId;
	    Optional<ArrayList> componentVariable = Optional.empty();
	    Optional<ArrayList> componentCriteria = Optional.empty();
	    
	    GetReportPayload(int req){
	    	requestId=req;
	    }
	    
	    public void setVariable(ArrayList com) {
	    	componentVariable=Optional.of(com);
	    }
	    
	    public void setCriteria(ArrayList crit) {
	    	componentCriteria=Optional.of(crit);
	    }
	}

	class GetTransactionStatusPayload{
	    Optional<String>transactionId = Optional.empty();
	    
	    GetTransactionStatusPayload(){
	    	//no requirements
	    }
	    
	    public void setId(String id) {
	    	transactionId=Optional.of(id);
	    }
	}

	class GetVariablesPayload{
	    ArrayList getVariableData;
	    
	    GetVariablesPayload(ArrayList get){
	    	getVariableData = get;
	    }
	}

	class HeartbeatPayload{
		HeartbeatPayload(){
			//no requirements or options
		}
	}

	class InstallCertificatePayload{
	    String certificateType;
	    String certificate;
	    
	    InstallCertificatePayload(String ty, String cert){
	    	certificateType=ty;
	    	certificate = cert;
	    }
	}

	class LogStatusNotificationPayload{
	    String status;
	    Optional<Integer> requestId = Optional.empty();
	    
	    LogStatusNotificationPayload(String sta){
	    	status=sta;
	    }
	    
	    public void setId(int req) {
	    	requestId=Optional.of(req);
	    }
	}

	class MeterValuesPayload{
	    int evseId;
	    ArrayList meterValue;
	    
	    MeterValuesPayload(int evs, ArrayList met){
	    	evseId=evs;
	    	meterValue=met;
	    }
	}

	class NotifyChargingLimitPayload{
	    Map chargingLimit;
	    Optional<ArrayList> chargingSchedule = Optional.empty();
	    Optional<Integer> evseId = Optional.empty();
	    
	    NotifyChargingLimitPayload(Map cha){
	    	chargingLimit = cha;
	    }
	    
	    public void setSchedule(ArrayList cha) {
	    	chargingSchedule=Optional.of(cha);
	    }
	    
	    public void setEvse(int evs) {
	    	evseId=Optional.of(evs);
	    }
	}

	class NotifyCustomerInformationPayload{
	    String data;
	    int seqNo;
	    String generatedAt;
	    int requestId;
	    Optional<Boolean> tbc = Optional.empty();
	    
	    NotifyCustomerInformationPayload(String da,int seq,String gen, int req){
	    	data=da;
	    	seqNo=seq;
	    	generatedAt=gen;
	    	requestId=req;
	    }
	    
	    public void setTbc(boolean tb) {
	    	tbc=Optional.of(tb);
	    }
	}

	class NotifyDisplayMessagesPayload{
	    int requestId;
	    Optional<ArrayList> messageInfo = Optional.empty();
	    Optional<Boolean> tbc = Optional.empty();
	    
	    NotifyDisplayMessagesPayload(int req){
	    	requestId=req;
	    }
	    
	    public void setInfo(ArrayList info) {
	    	messageInfo=Optional.of(info);
	    }
	    
	    public void setTbc(boolean tb) {
	    	tbc=Optional.of(tb);
	    }
	}

	class NotifyEVChargingNeedsPayload{
	    Map chargingNeeds;
	    int evseId;
	    Optional<Integer> maxScheduleTuples = Optional.empty();
	    
	    NotifyEVChargingNeedsPayload(Map cha, int evs){
	    	chargingNeeds = cha;
	    	evseId = evs;
	    }
	    
	    public void setSchedule(int max) {
	    	maxScheduleTuples=Optional.of(max);
	    }
	}

	class NotifyEVChargingSchedulePayload{
	    String timeBase;
	    Map chargingSchedule;
	    int evseId;
	    
	    NotifyEVChargingSchedulePayload(String tim, Map charg, int evs){
	    	timeBase=tim;
	    	chargingSchedule=charg;
	    	evseId=evs;
	    }
	}

	class NotifyEventPayload{
	    String generatedAt;
	    int seqNo;
	    ArrayList eventData;
	    Optional<Boolean> tbc = Optional.empty();
	    
	    NotifyEventPayload(String gen, int seq, ArrayList eve){
	    	generatedAt=gen;
	    	seqNo=seq;
	    	eventData=eve;
	    }
	    
	    public void setTbc(boolean tb) {
	    	tbc=Optional.of(tb);
	    }
	}

	class NotifyMonitoringReportPayload{
	    int requestId;
	    int seqNo;
	    String generatedAt;
	    Optional<ArrayList> monitor = Optional.empty();
	    Optional<Boolean> tbc = Optional.empty();
	    
	    NotifyMonitoringReportPayload(int req,int seq,String gen){
	    	requestId=req;
	    	seqNo=seq;
	    	generatedAt=gen;
	    }
	    
	    public void setMonitor(ArrayList mon) {
	    	monitor=Optional.of(mon);
	    }
	    
	    public void setTbc(boolean tb) {
	    	tbc=Optional.of(tb);
	    }
	}

	class NotifyReportPayload{
	    int requestId;
	    String generatedAt;
	    int seqNo;
	    Optional<ArrayList> reportData = Optional.empty();
	    Optional<Boolean> tbc = Optional.empty();
	    
	    NotifyReportPayload(int req,String gen,int seq){
	    	requestId=req;
	    	generatedAt=gen;
	    	seqNo=seq;
	    }
	    
	    public void setData(ArrayList dat) {
	    	reportData=Optional.of(dat);
	    }
	    
	    public void setTbc(boolean tb) {
	    	tbc=Optional.of(tb);
	    }
	}

	class PublishFirmwarePayload{
	    String location;
	    String checksum;
	    int requestId;
	    Optional<Integer> retries = Optional.empty();
	    Optional<Integer> retryInterval = Optional.empty();
	    
	    PublishFirmwarePayload(String loc,String che,int req){
	    	location=loc;
	    	checksum=che;
	    	requestId=req;
	    }
	    
	    public void setRetries(int ret) {
	    	retries=Optional.of(ret);
	    }
	    
	    public void setInterval(int interval) {
	    	retryInterval=Optional.of(interval);
	    }
	}

	class PublishFirmwareStatusNotificationPayload{
	    String status;
	    Optional<ArrayList> location = Optional.empty();
	    Optional<Integer> requestId = Optional.empty();
	    
	    PublishFirmwareStatusNotificationPayload(String sta){
	    	status=sta;
	    }
	    
	    public void setLocation(ArrayList loc) {
	    	location=Optional.of(loc);
	    }
	    
	    public void setId(int id) {
	    	requestId=Optional.of(id);
	    }
	}

	class ReportChargingProfilesPayload{
	    int requestId;
	    String chargingLimitSource;
	    ArrayList chargingProfile;
	    int evseId;
	    Optional<Boolean> tbc = Optional.empty();
	    
	    ReportChargingProfilesPayload(int req, String cha, ArrayList chap, int evs){
	    	requestId=req;
	    	chargingLimitSource=cha;
	    	chargingProfile=chap;
	    	evseId=evs;
	    }
	    
	    public void setTbc(boolean tb) {
	    	tbc=Optional.of(tb);
	    }
	}

	class RequestStartTransactionPayload{
	    Map idToken;
	    int remoteStartId;
	    Optional<Integer> evseId = Optional.empty();
	    Optional<Map> groupIdToken = Optional.empty();
	    Optional<Map> chargingProfile = Optional.empty();
	    
	    RequestStartTransactionPayload(Map id, int rem){
	    	idToken=id;
	    	remoteStartId=rem;
	    }
	    
	    public void setEvse(int evs) {
	    	evseId=Optional.of(evs);
	    }
	    
	    public void setIdToken(Map id) {
	    	groupIdToken=Optional.of(id);
	    }
	    
	    public void setProfile(Map pro) {
	    	chargingProfile=Optional.of(pro);
	    }
	}

	class RequestStopTransactionPayload{
	    String transactionId;
	    
	    RequestStopTransactionPayload(String trans){
	    	transactionId=trans;
	    }
	}

	class ReservationStatusUpdatePayload{
	    int reservationId;
	    String reservationUpdateStatus;
	    
	    ReservationStatusUpdatePayload(int res, String resup){
	    	reservationId=res;
	    	reservationUpdateStatus=resup;
	    }
	}

	class ReserveNowPayload{
	    int id;
	    String expiryDateTime;
	    Map idToken;
	    Optional<String> connectorType = Optional.empty();
	    Optional<Integer> evseId = Optional.empty();
	    Optional<Map> groupIdToken = Optional.empty();
	    
	    ReserveNowPayload(int i,String exp,Map idt){
	    	id=i;
	    	expiryDateTime=exp;
	    	idToken=idt;
	    }
	    
	    public void setConnector(String con) {
	    	connectorType=Optional.of(con);
	    }
	    
	    public void setEvse(int evs) {
	    	evseId=Optional.of(evs);
	    }
	    
	    public void setIdToken(Map group) {
	    	groupIdToken=Optional.of(group);
	    }
	}

	class ResetPayload{
	    String type;
	    Optional<Integer> evseId = Optional.empty();
	    
	    ResetPayload(String ty){
	    	type=ty;
	    }
	    
	    public void setEvse(int evs) {
	    	evseId=Optional.of(evs);
	    }
	}

	class SecurityEventNotificationPayload{
	    String type;
	    String timestamp;
	    Optional<String> techInfo = Optional.empty();
	    
	    SecurityEventNotificationPayload(String ty,String tim){
	    	type=ty;
	    	timestamp=tim;
	    }
	    
	    public void setInfo(String tec) {
	    	techInfo=Optional.of(tec);
	    }
	}

	class SendLocalListPayload{
	    int versionNumber;
	    String updateType;
	    Optional<ArrayList> localAuthorizationList = Optional.empty();
	    
	    SendLocalListPayload(int ver,String upt){
	    	versionNumber=ver;
	    	updateType=upt;
	    }
	    
	    public void setAuthorization(ArrayList loc) {
	    	localAuthorizationList=Optional.of(loc);
	    }
	}

	class SetChargingProfilePayload{
	    int evseId;
	    Map chargingProfile;
	    
	    SetChargingProfilePayload(int evs, Map cha){
	    	evseId=evs;
	    	chargingProfile=cha;
	    }
	}

	class SetDisplayMessagePayload{
	    Map message;
	    
	    SetDisplayMessagePayload(Map mes){
	    	message=mes;
	    }
	}

	class SetMonitoringBasePayload{
	    String monitoringBase;
	    
	    SetMonitoringBasePayload(String mon){
	    	monitoringBase=mon;
	    }
	}

	class SetMonitoringLevelPayload{
	    int severity;
	    
	    SetMonitoringLevelPayload(int sev){
	    	severity=sev;
	    }
	}

	class SetNetworkProfilePayload{
	    int configurationSlot;
	    Map connectionData;
	    
	    SetNetworkProfilePayload(int con,Map cond){
	    	configurationSlot=con;
	    	connectionData=cond;
	    }
	}

	class SetVariableMonitoringPayload{
	    ArrayList setMonitoringData;
	    
	    SetVariableMonitoringPayload(ArrayList set){
	    	setMonitoringData=set;
	    }
	}

	class SetVariablesPayload{
	    ArrayList setVariableData;
	    
	    SetVariablesPayload(ArrayList set){
	    	setVariableData=set;
	    }
	}

	class SignCertificatePayload{
	    String csr;
	    Optional<String> certificateType = Optional.empty();
	    
	    SignCertificatePayload(String cs){
	    	csr=cs;
	    }
	    
	    public void setType(String cert) {
	    	certificateType=Optional.of(cert);
	    }
	}

	class StatusNotificationPayload{
	    String timestamp;
	    String connectorStatus;
	    int evseId;
	    int connectorId;
	    
	    StatusNotificationPayload(String tim,String con,int evs,int coni){
	    	timestamp=tim;
	    	connectorStatus=con;
	    	evseId=evs;
	    	connectorId=coni;
	    }
	}

	class TransactionEventPayload{
	    String eventType;
	    String timestamp;
	    String triggerReason;
	    int seqNo;
	    Map transactionInfo;
	    Optional<ArrayList> meterValue = Optional.empty();
	    Optional<Boolean> offline = Optional.empty();
	    Optional<Integer> numberOfPhasesUsed = Optional.empty();
	    Optional<Integer> cableMaxCurrent = Optional.empty();
	    Optional<Integer> reservationId = Optional.empty();
	    Optional<Map> evse = Optional.empty();
	    Optional<Map> idToken = Optional.empty();
	    
	    TransactionEventPayload(String eve,String tim,String tri,int seq,Map tran){
	    	eventType=eve;
	    	timestamp=tim;
	    	triggerReason=tri;
	    	seqNo=seq;
	    	transactionInfo=tran;
	    }
	    
	    public void setValue(ArrayList meter) {
	    	meterValue=Optional.of(meter);
	    }
	    
	    public void setOffline(boolean off) {
	    	offline=Optional.of(off);
	    }
	    
	    public void setNumberOfPhases(int num) {
	    	numberOfPhasesUsed=Optional.of(num);
	    }
	    
	    public void setMaxCurrent(int max) {
	    	cableMaxCurrent=Optional.of(max);
	    }
	    
	    public void setReservationId(int id) {
	    	reservationId=Optional.of(id);
	    }
	    
	    public void setEvse(Map evs) {
	    	evse=Optional.of(evs);
	    }
	    
	    public void setIdToken(Map id) {
	    	idToken=Optional.of(id);
	    }
	}

	class TriggerMessagePayload{
	    String requestedMessage;
	    Optional<Map> evse = Optional.empty();
	    
	    TriggerMessagePayload(String req){
	    	requestedMessage=req;
	    }
	    
	    public void setEvse(Map evs) {
	    	evse=Optional.of(evs);
	    }
	}

	class UnlockConnectorPayload{
	    int evseId;
	    int connectorId;
	    
	    UnlockConnectorPayload(int evs,int con){
	    	evseId=evs;
	    	connectorId=con;
	    }
	}

	class UnpublishFirmwarePayload{
	    String checksum;
	    
	    UnpublishFirmwarePayload(String che){
	    	checksum=che;
	    }
	}
	
	class UpdateFirmwarePayload{
		int requestId;
		Map firmware;
		Optional<Integer> retries = Optional.empty();
		Optional<Integer> retryInterval = Optional.empty();
		
		UpdateFirmwarePayload(int req,Map fir){
			requestId=req;
			firmware=fir;
		}
		
		public void setRetries(int ret) {
			retries=Optional.of(ret);
		}
		
		public void setRetryInterval(int inter) {
			retryInterval=Optional.of(inter);
		}
	}
}
