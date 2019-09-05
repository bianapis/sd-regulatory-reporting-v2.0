package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEnquiriesUpdateInputModelEnquiriesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQEnquiriesUpdateInputModel
 */
public class BQEnquiriesUpdateInputModel   {
  private String regulatoryComplianceAdministrativePlanInstanceReference = null;

  private String enquiriesInstanceReference = null;

  private BQEnquiriesUpdateInputModelEnquiriesInstanceRecord enquiriesInstanceRecord = null;

  private Object enquiriesUpdateActionTaskRecord = null;

  private String enquiriesUpdateActionRequest = null;


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

  public BQEnquiriesUpdateInputModelEnquiriesInstanceRecord getEnquiriesInstanceRecord() {
    return enquiriesInstanceRecord;
  }

  public void setEnquiriesInstanceRecord(BQEnquiriesUpdateInputModelEnquiriesInstanceRecord enquiriesInstanceRecord) {
    this.enquiriesInstanceRecord = enquiriesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return enquiriesUpdateActionTaskRecord
  **/

  public Object getEnquiriesUpdateActionTaskRecord() {
    return enquiriesUpdateActionTaskRecord;
  }

  public void setEnquiriesUpdateActionTaskRecord(Object enquiriesUpdateActionTaskRecord) {
    this.enquiriesUpdateActionTaskRecord = enquiriesUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return enquiriesUpdateActionRequest
  **/

  public String getEnquiriesUpdateActionRequest() {
    return enquiriesUpdateActionRequest;
  }

  public void setEnquiriesUpdateActionRequest(String enquiriesUpdateActionRequest) {
    this.enquiriesUpdateActionRequest = enquiriesUpdateActionRequest;
  }


}

