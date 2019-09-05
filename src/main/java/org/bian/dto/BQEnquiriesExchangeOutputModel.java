package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEnquiriesExchangeOutputModel
 */
public class BQEnquiriesExchangeOutputModel   {
  private String enquiriesExchangeActionTaskReference = null;

  private Object enquiriesExchangeActionTaskRecord = null;

  private String enquiriesExchangeActionResponse = null;

  private String enquiriesInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Enquiries instance exchange service call 
   * @return enquiriesExchangeActionTaskReference
  **/

  public String getEnquiriesExchangeActionTaskReference() {
    return enquiriesExchangeActionTaskReference;
  }

  public void setEnquiriesExchangeActionTaskReference(String enquiriesExchangeActionTaskReference) {
    this.enquiriesExchangeActionTaskReference = enquiriesExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return enquiriesExchangeActionResponse
  **/

  public String getEnquiriesExchangeActionResponse() {
    return enquiriesExchangeActionResponse;
  }

  public void setEnquiriesExchangeActionResponse(String enquiriesExchangeActionResponse) {
    this.enquiriesExchangeActionResponse = enquiriesExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Enquiries instance (e.g. accepted, rejected, verified) 
   * @return enquiriesInstanceStatus
  **/

  public String getEnquiriesInstanceStatus() {
    return enquiriesInstanceStatus;
  }

  public void setEnquiriesInstanceStatus(String enquiriesInstanceStatus) {
    this.enquiriesInstanceStatus = enquiriesInstanceStatus;
  }


}

