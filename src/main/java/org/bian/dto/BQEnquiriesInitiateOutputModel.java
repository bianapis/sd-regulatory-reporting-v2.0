package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEnquiriesInitiateOutputModelEnquiriesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQEnquiriesInitiateOutputModel
 */
public class BQEnquiriesInitiateOutputModel   {
  private String enquiriesInstanceReference = null;

  private String enquiriesInitiateActionReference = null;

  private Object enquiriesInitiateActionRecord = null;

  private String enquiriesInstanceStatus = null;

  private BQEnquiriesInitiateOutputModelEnquiriesInstanceRecord enquiriesInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return enquiriesInitiateActionReference
  **/

  public String getEnquiriesInitiateActionReference() {
    return enquiriesInitiateActionReference;
  }

  public void setEnquiriesInitiateActionReference(String enquiriesInitiateActionReference) {
    this.enquiriesInitiateActionReference = enquiriesInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return enquiriesInitiateActionRecord
  **/

  public Object getEnquiriesInitiateActionRecord() {
    return enquiriesInitiateActionRecord;
  }

  public void setEnquiriesInitiateActionRecord(Object enquiriesInitiateActionRecord) {
    this.enquiriesInitiateActionRecord = enquiriesInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Enquiries instance (e.g. initialised, pending, active) 
   * @return enquiriesInstanceStatus
  **/

  public String getEnquiriesInstanceStatus() {
    return enquiriesInstanceStatus;
  }

  public void setEnquiriesInstanceStatus(String enquiriesInstanceStatus) {
    this.enquiriesInstanceStatus = enquiriesInstanceStatus;
  }


  /**
   * Get enquiriesInstanceRecord
   * @return enquiriesInstanceRecord
  **/

  public BQEnquiriesInitiateOutputModelEnquiriesInstanceRecord getEnquiriesInstanceRecord() {
    return enquiriesInstanceRecord;
  }

  public void setEnquiriesInstanceRecord(BQEnquiriesInitiateOutputModelEnquiriesInstanceRecord enquiriesInstanceRecord) {
    this.enquiriesInstanceRecord = enquiriesInstanceRecord;
  }


}

