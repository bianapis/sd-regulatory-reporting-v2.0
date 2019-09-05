package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEnquiriesRetrieveOutputModelEnquiriesInstanceAnalysis;
import org.bian.dto.BQEnquiriesRetrieveOutputModelEnquiriesInstanceRecord;
import org.bian.dto.BQEnquiriesRetrieveOutputModelEnquiriesInstanceReport;
import org.bian.dto.BQEnquiriesRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQEnquiriesRetrieveOutputModel
 */
public class BQEnquiriesRetrieveOutputModel   {
  private BQEnquiriesRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord regulatoryComplianceAdministrativePlanInstanceRecord = null;

  private BQEnquiriesRetrieveOutputModelEnquiriesInstanceRecord enquiriesInstanceRecord = null;

  private String enquiriesRetrieveActionTaskReference = null;

  private Object enquiriesRetrieveActionTaskRecord = null;

  private String enquiriesRetrieveActionResponse = null;

  private BQEnquiriesRetrieveOutputModelEnquiriesInstanceReport enquiriesInstanceReport = null;

  private BQEnquiriesRetrieveOutputModelEnquiriesInstanceAnalysis enquiriesInstanceAnalysis = null;


  /**
   * Get regulatoryComplianceAdministrativePlanInstanceRecord
   * @return regulatoryComplianceAdministrativePlanInstanceRecord
  **/

  public BQEnquiriesRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord getRegulatoryComplianceAdministrativePlanInstanceRecord() {
    return regulatoryComplianceAdministrativePlanInstanceRecord;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceRecord(BQEnquiriesRetrieveOutputModelRegulatoryComplianceAdministrativePlanInstanceRecord regulatoryComplianceAdministrativePlanInstanceRecord) {
    this.regulatoryComplianceAdministrativePlanInstanceRecord = regulatoryComplianceAdministrativePlanInstanceRecord;
  }


  /**
   * Get enquiriesInstanceRecord
   * @return enquiriesInstanceRecord
  **/

  public BQEnquiriesRetrieveOutputModelEnquiriesInstanceRecord getEnquiriesInstanceRecord() {
    return enquiriesInstanceRecord;
  }

  public void setEnquiriesInstanceRecord(BQEnquiriesRetrieveOutputModelEnquiriesInstanceRecord enquiriesInstanceRecord) {
    this.enquiriesInstanceRecord = enquiriesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Enquiries instance retrieve service call 
   * @return enquiriesRetrieveActionTaskReference
  **/

  public String getEnquiriesRetrieveActionTaskReference() {
    return enquiriesRetrieveActionTaskReference;
  }

  public void setEnquiriesRetrieveActionTaskReference(String enquiriesRetrieveActionTaskReference) {
    this.enquiriesRetrieveActionTaskReference = enquiriesRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return enquiriesRetrieveActionTaskRecord
  **/

  public Object getEnquiriesRetrieveActionTaskRecord() {
    return enquiriesRetrieveActionTaskRecord;
  }

  public void setEnquiriesRetrieveActionTaskRecord(Object enquiriesRetrieveActionTaskRecord) {
    this.enquiriesRetrieveActionTaskRecord = enquiriesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return enquiriesRetrieveActionResponse
  **/

  public String getEnquiriesRetrieveActionResponse() {
    return enquiriesRetrieveActionResponse;
  }

  public void setEnquiriesRetrieveActionResponse(String enquiriesRetrieveActionResponse) {
    this.enquiriesRetrieveActionResponse = enquiriesRetrieveActionResponse;
  }


  /**
   * Get enquiriesInstanceReport
   * @return enquiriesInstanceReport
  **/

  public BQEnquiriesRetrieveOutputModelEnquiriesInstanceReport getEnquiriesInstanceReport() {
    return enquiriesInstanceReport;
  }

  public void setEnquiriesInstanceReport(BQEnquiriesRetrieveOutputModelEnquiriesInstanceReport enquiriesInstanceReport) {
    this.enquiriesInstanceReport = enquiriesInstanceReport;
  }


  /**
   * Get enquiriesInstanceAnalysis
   * @return enquiriesInstanceAnalysis
  **/

  public BQEnquiriesRetrieveOutputModelEnquiriesInstanceAnalysis getEnquiriesInstanceAnalysis() {
    return enquiriesInstanceAnalysis;
  }

  public void setEnquiriesInstanceAnalysis(BQEnquiriesRetrieveOutputModelEnquiriesInstanceAnalysis enquiriesInstanceAnalysis) {
    this.enquiriesInstanceAnalysis = enquiriesInstanceAnalysis;
  }


}

