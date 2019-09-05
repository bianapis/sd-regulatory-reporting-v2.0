/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Administer;

@BianRestController
public class RegulatoryReportingApiController {

	@Autowired
	RegulatoryReportingApiService service;
	
	@Administer.Activate
	public BianResponse<SDRegulatoryReportingActivateOutputModel> activate(@RequestBody BianRequest<SDRegulatoryReportingActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("consolidation")
	@Administer.Capture
	public BianResponse<BQConsolidationCaptureOutputModel> captureConsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQConsolidationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureConsolidation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("enquiries")
	@Administer.Capture
	public BianResponse<BQEnquiriesCaptureOutputModel> captureEnquiries(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQEnquiriesCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureEnquiries(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Configure
	public BianResponse<SDRegulatoryReportingConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDRegulatoryReportingConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("authoring")
	@Administer.Exchange
	public BianResponse<BQAuthoringExchangeOutputModel> exchangeAuthoring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAuthoringExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeAuthoring(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("enquiries")
	@Administer.Exchange
	public BianResponse<BQEnquiriesExchangeOutputModel> exchangeEnquiries(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQEnquiriesExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeEnquiries(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Feedback
	public BianResponse<SDRegulatoryReportingFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDRegulatoryReportingFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("enquiries")
	@Administer.Initiate
	public BianResponse<BQEnquiriesInitiateOutputModel> initiateEnquiries(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQEnquiriesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateEnquiries(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Request
	public BianResponse<CRRegulatoryComplianceAdministrativePlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRRegulatoryComplianceAdministrativePlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("authoring")
	@Administer.Retrieve
	public BianResponse<BQAuthoringRetrieveOutputModel> retrieveAuthoring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAuthoring(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("consolidation")
	@Administer.Retrieve
	public BianResponse<BQConsolidationRetrieveOutputModel> retrieveConsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveConsolidation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("enquiries")
	@Administer.Retrieve
	public BianResponse<BQEnquiriesRetrieveOutputModel> retrieveEnquiries(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveEnquiries(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Administer.Retrieve
	public BianResponse<CRRegulatoryComplianceAdministrativePlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Administer.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Administer.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Administer.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Administer.RetrieveSD
	public BianResponse<SDRegulatoryReportingRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Administer.Update
	public BianResponse<CRRegulatoryComplianceAdministrativePlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRRegulatoryComplianceAdministrativePlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("consolidation")
	@Administer.Update
	public BianResponse<BQConsolidationUpdateOutputModel> updateConsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQConsolidationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateConsolidation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("enquiries")
	@Administer.Update
	public BianResponse<BQEnquiriesUpdateOutputModel> updateEnquiries(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQEnquiriesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateEnquiries(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
