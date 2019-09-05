package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQConsolidationRetrieveInputModelConsolidationInstanceAnalysis;
import org.bian.dto.BQConsolidationRetrieveInputModelConsolidationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQConsolidationRetrieveInputModel
 */
public class BQConsolidationRetrieveInputModel   {
  private String regulatoryComplianceAdministrativePlanInstanceReference = null;

  private String consolidationInstanceReference = null;

  private Object consolidationRetrieveActionTaskRecord = null;

  private String consolidationRetrieveActionRequest = null;

  private BQConsolidationRetrieveInputModelConsolidationInstanceReport consolidationInstanceReport = null;

  private BQConsolidationRetrieveInputModelConsolidationInstanceAnalysis consolidationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Regulatory Compliance Administrative Plan instance 
   * @return regulatoryComplianceAdministrativePlanInstanceReference
  **/

  public String getRegulatoryComplianceAdministrativePlanInstanceReference() {
    return regulatoryComplianceAdministrativePlanInstanceReference;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceReference(String regulatoryComplianceAdministrativePlanInstanceReference) {
    this.regulatoryComplianceAdministrativePlanInstanceReference = regulatoryComplianceAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Consolidation instance 
   * @return consolidationInstanceReference
  **/

  public String getConsolidationInstanceReference() {
    return consolidationInstanceReference;
  }

  public void setConsolidationInstanceReference(String consolidationInstanceReference) {
    this.consolidationInstanceReference = consolidationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return consolidationRetrieveActionTaskRecord
  **/

  public Object getConsolidationRetrieveActionTaskRecord() {
    return consolidationRetrieveActionTaskRecord;
  }

  public void setConsolidationRetrieveActionTaskRecord(Object consolidationRetrieveActionTaskRecord) {
    this.consolidationRetrieveActionTaskRecord = consolidationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return consolidationRetrieveActionRequest
  **/

  public String getConsolidationRetrieveActionRequest() {
    return consolidationRetrieveActionRequest;
  }

  public void setConsolidationRetrieveActionRequest(String consolidationRetrieveActionRequest) {
    this.consolidationRetrieveActionRequest = consolidationRetrieveActionRequest;
  }


  /**
   * Get consolidationInstanceReport
   * @return consolidationInstanceReport
  **/

  public BQConsolidationRetrieveInputModelConsolidationInstanceReport getConsolidationInstanceReport() {
    return consolidationInstanceReport;
  }

  public void setConsolidationInstanceReport(BQConsolidationRetrieveInputModelConsolidationInstanceReport consolidationInstanceReport) {
    this.consolidationInstanceReport = consolidationInstanceReport;
  }


  /**
   * Get consolidationInstanceAnalysis
   * @return consolidationInstanceAnalysis
  **/

  public BQConsolidationRetrieveInputModelConsolidationInstanceAnalysis getConsolidationInstanceAnalysis() {
    return consolidationInstanceAnalysis;
  }

  public void setConsolidationInstanceAnalysis(BQConsolidationRetrieveInputModelConsolidationInstanceAnalysis consolidationInstanceAnalysis) {
    this.consolidationInstanceAnalysis = consolidationInstanceAnalysis;
  }


}

