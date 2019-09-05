package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEnquiriesInitiateOutputModelEnquiriesInstanceRecord
 */
public class BQEnquiriesInitiateOutputModelEnquiriesInstanceRecord   {
  private String enquiryTransactionRecords = null;

  private String regulatoryEnquiryWorkProducts = null;

  private String regulatoryEnquiryResult = null;

  private String regulatoryEnquiryDocumentReference = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the enquiry 
   * @return regulatoryEnquiryWorkProducts
  **/

  public String getRegulatoryEnquiryWorkProducts() {
    return regulatoryEnquiryWorkProducts;
  }

  public void setRegulatoryEnquiryWorkProducts(String regulatoryEnquiryWorkProducts) {
    this.regulatoryEnquiryWorkProducts = regulatoryEnquiryWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The record or report that is the outcome/result of the enquiry 
   * @return regulatoryEnquiryResult
  **/

  public String getRegulatoryEnquiryResult() {
    return regulatoryEnquiryResult;
  }

  public void setRegulatoryEnquiryResult(String regulatoryEnquiryResult) {
    this.regulatoryEnquiryResult = regulatoryEnquiryResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for all classified/archived documents from the enquiry 
   * @return regulatoryEnquiryDocumentReference
  **/

  public String getRegulatoryEnquiryDocumentReference() {
    return regulatoryEnquiryDocumentReference;
  }

  public void setRegulatoryEnquiryDocumentReference(String regulatoryEnquiryDocumentReference) {
    this.regulatoryEnquiryDocumentReference = regulatoryEnquiryDocumentReference;
  }


}

