package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQConsolidationCaptureInputModelCaptureRecordType;
import org.bian.dto.BQEnquiriesCaptureInputModelEnquiriesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQEnquiriesCaptureInputModel
 */
public class BQEnquiriesCaptureInputModel   {
  private String regulatoryComplianceAdministrativePlanInstanceReference = null;

  private String enquiriesInstanceReference = null;

  private BQEnquiriesCaptureInputModelEnquiriesInstanceRecord enquiriesInstanceRecord = null;

  private Object enquiriesCaptureActionTaskRecord = null;

  private BQConsolidationCaptureInputModelCaptureRecordType captureRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Enquiries instance 
   * @return enquiriesInstanceReference
  **/

  public String getEnquiriesInstanceReference() {
    return enquiriesInstanceReference;
  }

  public void setEnquiriesInstanceReference(String enquiriesInstanceReference) {
    this.enquiriesInstanceReference = enquiriesInstanceReference;
  }


  /**
   * Get enquiriesInstanceRecord
   * @return enquiriesInstanceRecord
  **/

  public BQEnquiriesCaptureInputModelEnquiriesInstanceRecord getEnquiriesInstanceRecord() {
    return enquiriesInstanceRecord;
  }

  public void setEnquiriesInstanceRecord(BQEnquiriesCaptureInputModelEnquiriesInstanceRecord enquiriesInstanceRecord) {
    this.enquiriesInstanceRecord = enquiriesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return enquiriesCaptureActionTaskRecord
  **/

  public Object getEnquiriesCaptureActionTaskRecord() {
    return enquiriesCaptureActionTaskRecord;
  }

  public void setEnquiriesCaptureActionTaskRecord(Object enquiriesCaptureActionTaskRecord) {
    this.enquiriesCaptureActionTaskRecord = enquiriesCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQConsolidationCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQConsolidationCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

