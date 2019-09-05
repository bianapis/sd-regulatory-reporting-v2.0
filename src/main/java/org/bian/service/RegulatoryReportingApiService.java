/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface RegulatoryReportingApiService {

	SDRegulatoryReportingActivateOutputModel activate(SDRegulatoryReportingActivateInputModel request);
	
	BQConsolidationCaptureOutputModel captureConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationCaptureInputModel request);
	
	BQEnquiriesCaptureOutputModel captureEnquiries(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEnquiriesCaptureInputModel request);
	
	SDRegulatoryReportingConfigureOutputModel configure(String sdReferenceId, SDRegulatoryReportingConfigureInputModel request);
	
	BQAuthoringExchangeOutputModel exchangeAuthoring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuthoringExchangeInputModel request);
	
	BQEnquiriesExchangeOutputModel exchangeEnquiries(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEnquiriesExchangeInputModel request);
	
	SDRegulatoryReportingFeedbackOutputModel feedback(String sdReferenceId, SDRegulatoryReportingFeedbackInputModel request);
	
	BQEnquiriesInitiateOutputModel initiateEnquiries(String sdReferenceId, String crReferenceId, BQEnquiriesInitiateInputModel request);
	
	CRRegulatoryComplianceAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRRegulatoryComplianceAdministrativePlanRequestInputModel request);
	
	BQAuthoringRetrieveOutputModel retrieveAuthoring(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQConsolidationRetrieveOutputModel retrieveConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQEnquiriesRetrieveOutputModel retrieveEnquiries(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRRegulatoryComplianceAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDRegulatoryReportingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRRegulatoryComplianceAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRRegulatoryComplianceAdministrativePlanUpdateInputModel request);
	
	BQConsolidationUpdateOutputModel updateConsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConsolidationUpdateInputModel request);
	
	BQEnquiriesUpdateOutputModel updateEnquiries(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEnquiriesUpdateInputModel request);
	
}
