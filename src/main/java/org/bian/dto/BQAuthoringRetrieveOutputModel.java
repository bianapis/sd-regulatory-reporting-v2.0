package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthoringRetrieveOutputModelAuthoringInstanceAnalysis;
import org.bian.dto.BQAuthoringRetrieveOutputModelAuthoringInstanceRecord;
import org.bian.dto.BQAuthoringRetrieveOutputModelAuthoringInstanceReport;
import org.bian.dto.BQAuthoringRetrieveOutputModelConsolidationInstanceRecord;
import org.bian.dto.BQAuthoringRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAuthoringRetrieveOutputModel
 */
public class BQAuthoringRetrieveOutputModel   {
  private BQAuthoringRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord regulatoryComplianceAdministrativePlanInstanceRecord = null;

  private BQAuthoringRetrieveOutputModelConsolidationInstanceRecord consolidationInstanceRecord = null;

  private BQAuthoringRetrieveOutputModelAuthoringInstanceRecord authoringInstanceRecord = null;

  private String authoringRetrieveActionTaskReference = null;

  private Object authoringRetrieveActionTaskRecord = null;

  private String authoringRetrieveActionResponse = null;

  private BQAuthoringRetrieveOutputModelAuthoringInstanceReport authoringInstanceReport = null;

  private BQAuthoringRetrieveOutputModelAuthoringInstanceAnalysis authoringInstanceAnalysis = null;


  /**
   * Get regulatoryComplianceAdministrativePlanInstanceRecord
   * @return regulatoryComplianceAdministrativePlanInstanceRecord
  **/

  public BQAuthoringRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord getRegulatoryComplianceAdministrativePlanInstanceRecord() {
    return regulatoryComplianceAdministrativePlanInstanceRecord;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceRecord(BQAuthoringRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord regulatoryComplianceAdministrativePlanInstanceRecord) {
    this.regulatoryComplianceAdministrativePlanInstanceRecord = regulatoryComplianceAdministrativePlanInstanceRecord;
  }


  /**
   * Get consolidationInstanceRecord
   * @return consolidationInstanceRecord
  **/

  public BQAuthoringRetrieveOutputModelConsolidationInstanceRecord getConsolidationInstanceRecord() {
    return consolidationInstanceRecord;
  }

  public void setConsolidationInstanceRecord(BQAuthoringRetrieveOutputModelConsolidationInstanceRecord consolidationInstanceRecord) {
    this.consolidationInstanceRecord = consolidationInstanceRecord;
  }


  /**
   * Get authoringInstanceRecord
   * @return authoringInstanceRecord
  **/

  public BQAuthoringRetrieveOutputModelAuthoringInstanceRecord getAuthoringInstanceRecord() {
    return authoringInstanceRecord;
  }

  public void setAuthoringInstanceRecord(BQAuthoringRetrieveOutputModelAuthoringInstanceRecord authoringInstanceRecord) {
    this.authoringInstanceRecord = authoringInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Authoring instance retrieve service call 
   * @return authoringRetrieveActionTaskReference
  **/

  public String getAuthoringRetrieveActionTaskReference() {
    return authoringRetrieveActionTaskReference;
  }

  public void setAuthoringRetrieveActionTaskReference(String authoringRetrieveActionTaskReference) {
    this.authoringRetrieveActionTaskReference = authoringRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return authoringRetrieveActionTaskRecord
  **/

  public Object getAuthoringRetrieveActionTaskRecord() {
    return authoringRetrieveActionTaskRecord;
  }

  public void setAuthoringRetrieveActionTaskRecord(Object authoringRetrieveActionTaskRecord) {
    this.authoringRetrieveActionTaskRecord = authoringRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return authoringRetrieveActionResponse
  **/

  public String getAuthoringRetrieveActionResponse() {
    return authoringRetrieveActionResponse;
  }

  public void setAuthoringRetrieveActionResponse(String authoringRetrieveActionResponse) {
    this.authoringRetrieveActionResponse = authoringRetrieveActionResponse;
  }


  /**
   * Get authoringInstanceReport
   * @return authoringInstanceReport
  **/

  public BQAuthoringRetrieveOutputModelAuthoringInstanceReport getAuthoringInstanceReport() {
    return authoringInstanceReport;
  }

  public void setAuthoringInstanceReport(BQAuthoringRetrieveOutputModelAuthoringInstanceReport authoringInstanceReport) {
    this.authoringInstanceReport = authoringInstanceReport;
  }


  /**
   * Get authoringInstanceAnalysis
   * @return authoringInstanceAnalysis
  **/

  public BQAuthoringRetrieveOutputModelAuthoringInstanceAnalysis getAuthoringInstanceAnalysis() {
    return authoringInstanceAnalysis;
  }

  public void setAuthoringInstanceAnalysis(BQAuthoringRetrieveOutputModelAuthoringInstanceAnalysis authoringInstanceAnalysis) {
    this.authoringInstanceAnalysis = authoringInstanceAnalysis;
  }


}

