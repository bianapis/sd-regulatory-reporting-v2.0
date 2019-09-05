package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEnquiriesUpdateOutputModel
 */
public class BQEnquiriesUpdateOutputModel   {
  private String enquiriesUpdateActionTaskReference = null;

  private Object enquiriesUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return enquiriesUpdateActionTaskReference
  **/

  public String getEnquiriesUpdateActionTaskReference() {
    return enquiriesUpdateActionTaskReference;
  }

  public void setEnquiriesUpdateActionTaskReference(String enquiriesUpdateActionTaskReference) {
    this.enquiriesUpdateActionTaskReference = enquiriesUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

