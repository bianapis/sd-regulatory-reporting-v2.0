package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEnquiriesInitiateInputModelEnquiriesInstanceRecord
 */
public class BQEnquiriesInitiateInputModelEnquiriesInstanceRecord   {
  private String regulatoryEnquiry = null;

  private String enquiryBusinessUnitReference = null;

  private String enquiryProductServiceReference = null;

  private String enquiryCustomerReference = null;

  private String enquiryTransactionRecords = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The description of the requested information for the regulatory enquiry 
   * @return regulatoryEnquiry
  **/

  public String getRegulatoryEnquiry() {
    return regulatoryEnquiry;
  }

  public void setRegulatoryEnquiry(String regulatoryEnquiry) {
    this.regulatoryEnquiry = regulatoryEnquiry;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The business unit being assessed for enquiry if appropriate 
   * @return enquiryBusinessUnitReference
  **/

  public String getEnquiryBusinessUnitReference() {
    return enquiryBusinessUnitReference;
  }

  public void setEnquiryBusinessUnitReference(String enquiryBusinessUnitReference) {
    this.enquiryBusinessUnitReference = enquiryBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The instances of products/services being assessed if appropriate 
   * @return enquiryProductServiceReference
  **/

  public String getEnquiryProductServiceReference() {
    return enquiryProductServiceReference;
  }

  public void setEnquiryProductServiceReference(String enquiryProductServiceReference) {
    this.enquiryProductServiceReference = enquiryProductServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer being assessed if appropriate 
   * @return enquiryCustomerReference
  **/

  public String getEnquiryCustomerReference() {
    return enquiryCustomerReference;
  }

  public void setEnquiryCustomerReference(String enquiryCustomerReference) {
    this.enquiryCustomerReference = enquiryCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The possibly extensive collection of production transaction records assembled for the enquiry 
   * @return enquiryTransactionRecords
  **/

  public String getEnquiryTransactionRecords() {
    return enquiryTransactionRecords;
  }

  public void setEnquiryTransactionRecords(String enquiryTransactionRecords) {
    this.enquiryTransactionRecords = enquiryTransactionRecords;
  }


}

