/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class RegulatoryReportingApiServiceImpl implements RegulatoryReportingApiService {

	public SDRegulatoryReportingActivateOutputModel activate(SDRegulatoryReportingActivateInputModel request){
		return JsonReader.read("activate-SDRegulatoryReportingActivateOutputModel.json",new TypeReference<SDRegulatoryReportingActivateOutputModel>(){});
	}
	
	public BQConsolidationCaptureOutputModel captureConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationCaptureInputModel request){
		return JsonReader.read("capture-BQConsolidationCaptureOutputModel.json",new TypeReference<BQConsolidationCaptureOutputModel>(){});
	}
	
	public BQEnquiriesCaptureOutputModel captureEnquiries(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEnquiriesCaptureInputModel request){
		return JsonReader.read("capture-BQEnquiriesCaptureOutputModel.json",new TypeReference<BQEnquiriesCaptureOutputModel>(){});
	}
	
	public SDRegulatoryReportingConfigureOutputModel configure(String sdReferenceId, SDRegulatoryReportingConfigureInputModel request){
		return JsonReader.read("configure-SDRegulatoryReportingConfigureOutputModel.json",new TypeReference<SDRegulatoryReportingConfigureOutputModel>(){});
	}
	
	public BQAuthoringExchangeOutputModel exchangeAuthoring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuthoringExchangeInputModel request){
		return JsonReader.read("exchange-BQAuthoringExchangeOutputModel.json",new TypeReference<BQAuthoringExchangeOutputModel>(){});
	}
	
	public BQEnquiriesExchangeOutputModel exchangeEnquiries(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEnquiriesExchangeInputModel request){
		return JsonReader.read("exchange-BQEnquiriesExchangeOutputModel.json",new TypeReference<BQEnquiriesExchangeOutputModel>(){});
	}
	
	public SDRegulatoryReportingFeedbackOutputModel feedback(String sdReferenceId, SDRegulatoryReportingFeedbackInputModel request){
		return JsonReader.read("feedback-SDRegulatoryReportingFeedbackOutputModel.json",new TypeReference<SDRegulatoryReportingFeedbackOutputModel>(){});
	}
	
	public BQEnquiriesInitiateOutputModel initiateEnquiries(String sdReferenceId, String crReferenceId, BQEnquiriesInitiateInputModel request){
		return JsonReader.read("initiate-BQEnquiriesInitiateOutputModel.json",new TypeReference<BQEnquiriesInitiateOutputModel>(){});
	}
	
	public CRRegulatoryComplianceAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRRegulatoryComplianceAdministrativePlanRequestInputModel request){
		return JsonReader.read("request-CRRegulatoryComplianceAdministrativePlanRequestOutputModel.json",new TypeReference<CRRegulatoryComplianceAdministrativePlanRequestOutputModel>(){});
	}
	
	public BQAuthoringRetrieveOutputModel retrieveAuthoring(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAuthoringRetrieveOutputModel.json",new TypeReference<BQAuthoringRetrieveOutputModel>(){});
	}
	
	public BQConsolidationRetrieveOutputModel retrieveConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQConsolidationRetrieveOutputModel.json",new TypeReference<BQConsolidationRetrieveOutputModel>(){});
	}
	
	public BQEnquiriesRetrieveOutputModel retrieveEnquiries(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQEnquiriesRetrieveOutputModel.json",new TypeReference<BQEnquiriesRetrieveOutputModel>(){});
	}
	
	public CRRegulatoryComplianceAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRRegulatoryComplianceAdministrativePlanRetrieveOutputModel.json",new TypeReference<CRRegulatoryComplianceAdministrativePlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDRegulatoryReportingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDRegulatoryReportingRetrieveOutputModel.json",new TypeReference<SDRegulatoryReportingRetrieveOutputModel>(){});
	}
	
	public CRRegulatoryComplianceAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRRegulatoryComplianceAdministrativePlanUpdateInputModel request){
		return JsonReader.read("update-CRRegulatoryComplianceAdministrativePlanUpdateOutputModel.json",new TypeReference<CRRegulatoryComplianceAdministrativePlanUpdateOutputModel>(){});
	}
	
	public BQConsolidationUpdateOutputModel updateConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationUpdateInputModel request){
		return JsonReader.read("update-BQConsolidationUpdateOutputModel.json",new TypeReference<BQConsolidationUpdateOutputModel>(){});
	}
	
	public BQEnquiriesUpdateOutputModel updateEnquiries(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEnquiriesUpdateInputModel request){
		return JsonReader.read("update-BQEnquiriesUpdateOutputModel.json",new TypeReference<BQEnquiriesUpdateOutputModel>(){});
	}
	
}
