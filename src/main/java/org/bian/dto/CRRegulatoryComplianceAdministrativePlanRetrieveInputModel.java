package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAdministrativePlanRetrieveInputModelRegulatoryComplianceAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRRegulatoryComplianceAdministrativePlanRetrieveInputModelRegulatoryComplianceAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAdministrativePlanRetrieveInputModel
 */
public class CRRegulatoryComplianceAdministrativePlanRetrieveInputModel   {
  private Object regulatoryComplianceAdministrativePlanRetrieveActionTaskRecord = null;

  private String regulatoryComplianceAdministrativePlanRetrieveActionRequest = null;

  private CRRegulatoryComplianceAdministrativePlanRetrieveInputModelRegulatoryComplianceAdministrativePlanInstanceReportRecord regulatoryComplianceAdministrativePlanInstanceReportRecord = null;

  private CRRegulatoryComplianceAdministrativePlanRetrieveInputModelRegulatoryComplianceAdministrativePlanInstanceAnalysis regulatoryComplianceAdministrativePlanInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return regulatoryComplianceAdministrativePlanRetrieveActionRequest
  **/

  public String getRegulatoryComplianceAdministrativePlanRetrieveActionRequest() {
    return regulatoryComplianceAdministrativePlanRetrieveActionRequest;
  }

  public void setRegulatoryComplianceAdministrativePlanRetrieveActionRequest(String regulatoryComplianceAdministrativePlanRetrieveActionRequest) {
    this.regulatoryComplianceAdministrativePlanRetrieveActionRequest = regulatoryComplianceAdministrativePlanRetrieveActionRequest;
  }


  /**
   * Get regulatoryComplianceAdministrativePlanInstanceReportRecord
   * @return regulatoryComplianceAdministrativePlanInstanceReportRecord
  **/

  public CRRegulatoryComplianceAdministrativePlanRetrieveInputModelRegulatoryComplianceAdministrativePlanInstanceReportRecord getRegulatoryComplianceAdministrativePlanInstanceReportRecord() {
    return regulatoryComplianceAdministrativePlanInstanceReportRecord;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceReportRecord(CRRegulatoryComplianceAdministrativePlanRetrieveInputModelRegulatoryComplianceAdministrativePlanInstanceReportRecord regulatoryComplianceAdministrativePlanInstanceReportRecord) {
    this.regulatoryComplianceAdministrativePlanInstanceReportRecord = regulatoryComplianceAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get regulatoryComplianceAdministrativePlanInstanceAnalysis
   * @return regulatoryComplianceAdministrativePlanInstanceAnalysis
  **/

  public CRRegulatoryComplianceAdministrativePlanRetrieveInputModelRegulatoryComplianceAdministrativePlanInstanceAnalysis getRegulatoryComplianceAdministrativePlanInstanceAnalysis() {
    return regulatoryComplianceAdministrativePlanInstanceAnalysis;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceAnalysis(CRRegulatoryComplianceAdministrativePlanRetrieveInputModelRegulatoryComplianceAdministrativePlanInstanceAnalysis regulatoryComplianceAdministrativePlanInstanceAnalysis) {
    this.regulatoryComplianceAdministrativePlanInstanceAnalysis = regulatoryComplianceAdministrativePlanInstanceAnalysis;
  }


}

