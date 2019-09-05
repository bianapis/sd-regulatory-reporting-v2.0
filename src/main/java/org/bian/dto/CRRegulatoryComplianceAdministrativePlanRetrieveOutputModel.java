package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelConsolidationInstanceRecord;
import org.bian.dto.CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord;
import org.bian.dto.CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAdministrativePlanRetrieveOutputModel
 */
public class CRRegulatoryComplianceAdministrativePlanRetrieveOutputModel   {
  private CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord regulatoryComplianceAdministrativePlanInstanceRecord = null;

  private String regulatoryComplianceAdministrativePlanRetrieveActionTaskReference = null;

  private Object regulatoryComplianceAdministrativePlanRetrieveActionTaskRecord = null;

  private String regulatoryComplianceAdministrativePlanRetrieveActionResponse = null;

  private CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceReportRecord regulatoryComplianceAdministrativePlanInstanceReportRecord = null;

  private CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceAnalysis regulatoryComplianceAdministrativePlanInstanceAnalysis = null;

  private CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelConsolidationInstanceRecord consolidationInstanceRecord = null;


  /**
   * Get regulatoryComplianceAdministrativePlanInstanceRecord
   * @return regulatoryComplianceAdministrativePlanInstanceRecord
  **/

  public CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord getRegulatoryComplianceAdministrativePlanInstanceRecord() {
    return regulatoryComplianceAdministrativePlanInstanceRecord;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceRecord(CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord regulatoryComplianceAdministrativePlanInstanceRecord) {
    this.regulatoryComplianceAdministrativePlanInstanceRecord = regulatoryComplianceAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Regulatory Compliance Administrative Plan instance retrieve service call 
   * @return regulatoryComplianceAdministrativePlanRetrieveActionTaskReference
  **/

  public String getRegulatoryComplianceAdministrativePlanRetrieveActionTaskReference() {
    return regulatoryComplianceAdministrativePlanRetrieveActionTaskReference;
  }

  public void setRegulatoryComplianceAdministrativePlanRetrieveActionTaskReference(String regulatoryComplianceAdministrativePlanRetrieveActionTaskReference) {
    this.regulatoryComplianceAdministrativePlanRetrieveActionTaskReference = regulatoryComplianceAdministrativePlanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return regulatoryComplianceAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getRegulatoryComplianceAdministrativePlanRetrieveActionTaskRecord() {
    return regulatoryComplianceAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setRegulatoryComplianceAdministrativePlanRetrieveActionTaskRecord(Object regulatoryComplianceAdministrativePlanRetrieveActionTaskRecord) {
    this.regulatoryComplianceAdministrativePlanRetrieveActionTaskRecord = regulatoryComplianceAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return regulatoryComplianceAdministrativePlanRetrieveActionResponse
  **/

  public String getRegulatoryComplianceAdministrativePlanRetrieveActionResponse() {
    return regulatoryComplianceAdministrativePlanRetrieveActionResponse;
  }

  public void setRegulatoryComplianceAdministrativePlanRetrieveActionResponse(String regulatoryComplianceAdministrativePlanRetrieveActionResponse) {
    this.regulatoryComplianceAdministrativePlanRetrieveActionResponse = regulatoryComplianceAdministrativePlanRetrieveActionResponse;
  }


  /**
   * Get regulatoryComplianceAdministrativePlanInstanceReportRecord
   * @return regulatoryComplianceAdministrativePlanInstanceReportRecord
  **/

  public CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceReportRecord getRegulatoryComplianceAdministrativePlanInstanceReportRecord() {
    return regulatoryComplianceAdministrativePlanInstanceReportRecord;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceReportRecord(CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceReportRecord regulatoryComplianceAdministrativePlanInstanceReportRecord) {
    this.regulatoryComplianceAdministrativePlanInstanceReportRecord = regulatoryComplianceAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get regulatoryComplianceAdministrativePlanInstanceAnalysis
   * @return regulatoryComplianceAdministrativePlanInstanceAnalysis
  **/

  public CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceAnalysis getRegulatoryComplianceAdministrativePlanInstanceAnalysis() {
    return regulatoryComplianceAdministrativePlanInstanceAnalysis;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceAnalysis(CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceAnalysis regulatoryComplianceAdministrativePlanInstanceAnalysis) {
    this.regulatoryComplianceAdministrativePlanInstanceAnalysis = regulatoryComplianceAdministrativePlanInstanceAnalysis;
  }


  /**
   * Get consolidationInstanceRecord
   * @return consolidationInstanceRecord
  **/

  public CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelConsolidationInstanceRecord getConsolidationInstanceRecord() {
    return consolidationInstanceRecord;
  }

  public void setConsolidationInstanceRecord(CRRegulatoryComplianceAdministrativePlanRetrieveOutputModelConsolidationInstanceRecord consolidationInstanceRecord) {
    this.consolidationInstanceRecord = consolidationInstanceRecord;
  }


}

