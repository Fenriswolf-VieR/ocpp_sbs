package ocpp_2_0_1_sbs;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@SuppressWarnings("rawtypes") //remove this afterwards!!!
public class CallResult {
	
	class AuthorizePayload{
		Map idTokenInfo;
		Optional<String> certificateStatus = Optional.empty();
		
		AuthorizePayload(Map id){
			idTokenInfo=id;
		}
		
		public void setCertificate(String cer) {
			certificateStatus = Optional.of(cer);
		}
	}

	class BootNotificationPayload{
		String currentTime;
		int interval;
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		BootNotificationPayload(String cur,int inter,String sta){
			currentTime=cur;
			interval=inter;
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class CancelReservationPayload {
		String status;
		Optional<Map> statusInfo=Optional.empty();
		
		CancelReservationPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class CertificateSignedPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		CertificateSignedPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class ChangeAvailabilityPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		ChangeAvailabilityPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class ClearCachePayload {
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		ClearCachePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class ClearChargingProfilePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		ClearChargingProfilePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}
	
	class ClearDisplayMessagePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		ClearDisplayMessagePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}
	
	class ClearVariableMonitoringPayload{
		ArrayList clearMonitoringResult;
		
		ClearVariableMonitoringPayload(ArrayList cle) {
			clearMonitoringResult=cle;
		}
	}
	
	class ClearedChargingLimitPayload{
		ClearedChargingLimitPayload(){
			//no requirements or options
		}
	}
	
	class CostUpdatedPayload{
		CostUpdatedPayload(){
			//no requirements or options
		}
	}
	
	class CustomerInformationPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		CustomerInformationPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}
	
	class DataTransferPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		Optional<Map> data=Optional.empty();
		
		DataTransferPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
		
		public void setData(Map dat) {
			data=Optional.of(dat);
		}
	}
	
	class DeleteCertificatePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		DeleteCertificatePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}
	
	class FirmwareStatusNotificationPayload{
		FirmwareStatusNotificationPayload(){
			//no requirements or options
		}
	}
	
	class Get15118EVCertificatePayload{
		String status;
		String exiResponse;
		Optional<Map> statusInfo = Optional.empty();
		
		Get15118EVCertificatePayload(String sta, String exi){
			status=sta;
			exiResponse=exi;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}
	
	class GetBaseReportPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		GetBaseReportPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}
	 
	class GetCertificateStatusPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		Optional<String> ocspResult = Optional.empty(); 
		
		GetCertificateStatusPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
		
		public void setOcspResult(String ocsp) {
			ocspResult=Optional.of(ocsp);
		}
	}
	   
	class GetChargingProfilesPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		GetChargingProfilesPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class GetCompositeSchedulePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		Optional<Map> schedule = Optional.empty();
		
		GetCompositeSchedulePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
		
		public void setSchedule(Map sche) {
			schedule=Optional.of(sche);
		}
	}

	class GetDisplayMessagesPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		GetDisplayMessagesPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class GetInstalledCertificateIdsPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		Optional<ArrayList> certificateHashDataChain = Optional.empty();
		
		GetInstalledCertificateIdsPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
		
		public void setHashDataChain(ArrayList cert) {
			certificateHashDataChain=Optional.of(cert);
		}
	}

	class GetLocalListVersionPayload{
		int versionNumber;
		
		GetLocalListVersionPayload(int vers){
			versionNumber=vers;
		}
	}

	class GetLogPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		Optional<String> filename = Optional.empty();
		
		GetLogPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
		
		public void setFilename(String fil) {
			filename=Optional.of(fil);
		}
	}

	class GetMonitoringReportPayload{
	    String status;
		Optional<Map> statusInfo = Optional.empty();
		
		GetMonitoringReportPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class GetReportPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		GetReportPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class GetTransactionStatusPayload{
		boolean messagesInQueue;
	    Optional<Boolean>ongoingIndicator = Optional.empty();
	    
	    GetTransactionStatusPayload(boolean mes){
	    	messagesInQueue=mes;
	    }
	    
	    public void setOngoingIndicator(boolean ong) {
	    	ongoingIndicator=Optional.of(ong);
	    }
	}

	class GetVariablesPayload{
	    ArrayList getVariableResult;
	    
	    GetVariablesPayload(ArrayList get){
	    	getVariableResult = get;
	    }
	}

	class HeartbeatPayload{
		String currentTime;
		
		HeartbeatPayload(String cur){
			currentTime=cur;
		}
	}

	class InstallCertificatePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		InstallCertificatePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class LogStatusNotificationPayload{
	    LogStatusNotificationPayload(){
	    	//no requirements or options
	    }
	}

	class MeterValuesPayload{
	    MeterValuesPayload(){
	    	//no requirements or options
	    }
	}

	class NotifyChargingLimitPayload{
	    NotifyChargingLimitPayload(){
	    	//no requirements or options
	    }
	}

	class NotifyCustomerInformationPayload{
	    NotifyCustomerInformationPayload(){
	    	//no requirements or options
	    }
	}

	class NotifyDisplayMessagesPayload{
	    NotifyDisplayMessagesPayload(){
	    	//no requirements or options
	    }
	}

	class NotifyEVChargingNeedsPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		NotifyEVChargingNeedsPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class NotifyEVChargingSchedulePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		NotifyEVChargingSchedulePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class NotifyEventPayload{
	    NotifyEventPayload(){
	    	//no requirements or options
	    }
	}

	class NotifyMonitoringReportPayload{
	    NotifyMonitoringReportPayload(){
	    	//no requirements or options
	    }
	}

	class NotifyReportPayload{
	    NotifyReportPayload(){
	    	//no requirements or options
	    }
	}

	class PublishFirmwarePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		PublishFirmwarePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class PublishFirmwareStatusNotificationPayload{
	    PublishFirmwareStatusNotificationPayload(){
	    	//no requirements or options
	    }
	}

	class ReportChargingProfilesPayload{
	    ReportChargingProfilesPayload(){
	    	//no requirements or options
	    }
	}

	class RequestStartTransactionPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		Optional<String> transactionId = Optional.empty();
		
		RequestStartTransactionPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
		
		public void setId(String id) {
			transactionId=Optional.of(id);
		}
	}

	class RequestStopTransactionPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		RequestStopTransactionPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class ReservationStatusUpdatePayload{
	    ReservationStatusUpdatePayload(){
	    	//no requirements or options
	    }
	}

	class ReserveNowPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		ReserveNowPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class ResetPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		ResetPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class SecurityEventNotificationPayload{
	    SecurityEventNotificationPayload(){
	    	//no requirements or options
	    }
	}

	class SendLocalListPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		SendLocalListPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class SetChargingProfilePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		SetChargingProfilePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class SetDisplayMessagePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		SetDisplayMessagePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class SetMonitoringBasePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		SetMonitoringBasePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class SetMonitoringLevelPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		SetMonitoringLevelPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class SetNetworkProfilePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		SetNetworkProfilePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class SetVariableMonitoringPayload{
	    ArrayList setMonitoringResult;
	    
	    SetVariableMonitoringPayload(ArrayList set){
	    	setMonitoringResult=set;
	    }
	}

	class SetVariablesPayload{
	    ArrayList setVariableResult;
	    
	    SetVariablesPayload(ArrayList set){
	    	setVariableResult=set;
	    }
	}

	class SignCertificatePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		SignCertificatePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class StatusNotificationPayload{
	    StatusNotificationPayload(){
	    	//no requirements or options
	    }
	}

	class TransactionEventPayload{
	    Optional<Integer> totalCost = Optional.empty();
	    Optional<Integer> chargingPriority = Optional.empty();
	    Optional<Map> idTokenInfo = Optional.empty();
	    Optional<Map> updatedPersonalMessage = Optional.empty();
	    
	    TransactionEventPayload(){
	    	//no requirements
	    }
	    
	    public void setCost(int cost) {
	    	totalCost=Optional.of(cost);
	    }
	    
	    public void setPriority(int cha) {
	    	chargingPriority = Optional.of(cha);
	    }
	    
	    public void setTokenInfo(Map id) {
	    	idTokenInfo=Optional.of(id);
	    }
	    
	    public void setPersonalMessage(Map message) {
	    	updatedPersonalMessage=Optional.of(message);
	    }
	}

	class TriggerMessagePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		TriggerMessagePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class UnlockConnectorPayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		UnlockConnectorPayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}

	class UnpublishFirmwarePayload{
		String status;
		
		UnpublishFirmwarePayload(String sta){
			status=sta;
		}
	}
	
	class UpdateFirmwarePayload{
		String status;
		Optional<Map> statusInfo = Optional.empty();
		
		UpdateFirmwarePayload(String sta){
			status=sta;
		}
		
		public void setInfo(Map sta) {
			statusInfo=Optional.of(sta);
		}
	}
}

