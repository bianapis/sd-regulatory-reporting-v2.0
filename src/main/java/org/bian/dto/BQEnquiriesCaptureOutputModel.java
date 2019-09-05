package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEnquiriesCaptureOutputModel
 */
public class BQEnquiriesCaptureOutputModel   {
  private String enquiriesCaptureActionTaskReference = null;

  private Object enquiriesCaptureActionTaskRecord = null;

  private String enquiriesCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Enquiries instance capture service call 
   * @return enquiriesCaptureActionTaskReference
  **/

  public String getEnquiriesCaptureActionTaskReference() {
    return enquiriesCaptureActionTaskReference;
  }

  public void setEnquiriesCaptureActionTaskReference(String enquiriesCaptureActionTaskReference) {
    this.enquiriesCaptureActionTaskReference = enquiriesCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Enquiries structured input transaction/record 
   * @return enquiriesCaptureRecordReference
  **/

  public String getEnquiriesCaptureRecordReference() {
    return enquiriesCaptureRecordReference;
  }

  public void setEnquiriesCaptureRecordReference(String enquiriesCaptureRecordReference) {
    this.enquiriesCaptureRecordReference = enquiriesCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

