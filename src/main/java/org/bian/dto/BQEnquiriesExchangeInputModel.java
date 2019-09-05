package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthoringExchangeInputModelAuthoringExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQEnquiriesExchangeInputModel
 */
public class BQEnquiriesExchangeInputModel   {
  private String regulatoryComplianceAdministrativePlanInstanceReference = null;

  private String enquiriesInstanceReference = null;

  private Object enquiriesExchangeActionTaskRecord = null;

  private BQAuthoringExchangeInputModelAuthoringExchangeActionRequest enquiriesExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return enquiriesExchangeActionTaskRecord
  **/

  public Object getEnquiriesExchangeActionTaskRecord() {
    return enquiriesExchangeActionTaskRecord;
  }

  public void setEnquiriesExchangeActionTaskRecord(Object enquiriesExchangeActionTaskRecord) {
    this.enquiriesExchangeActionTaskRecord = enquiriesExchangeActionTaskRecord;
  }


  /**
   * Get enquiriesExchangeActionRequest
   * @return enquiriesExchangeActionRequest
  **/

  public BQAuthoringExchangeInputModelAuthoringExchangeActionRequest getEnquiriesExchangeActionRequest() {
    return enquiriesExchangeActionRequest;
  }

  public void setEnquiriesExchangeActionRequest(BQAuthoringExchangeInputModelAuthoringExchangeActionRequest enquiriesExchangeActionRequest) {
    this.enquiriesExchangeActionRequest = enquiriesExchangeActionRequest;
  }


}

