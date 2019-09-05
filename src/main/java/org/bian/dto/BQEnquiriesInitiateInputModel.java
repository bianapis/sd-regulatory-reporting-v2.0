package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEnquiriesInitiateInputModelEnquiriesInstanceRecord;
import org.bian.dto.BQEnquiriesInitiateInputModelRegulatoryComplianceAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQEnquiriesInitiateInputModel
 */
public class BQEnquiriesInitiateInputModel   {
  private BQEnquiriesInitiateInputModelRegulatoryComplianceAdministrativePlanInstanceRecord regulatoryComplianceAdministrativePlanInstanceRecord = null;

  private String regulatoryComplianceAdministrativePlanInstanceReference = null;

  private Object enquiriesInitiateActionRecord = null;

  private BQEnquiriesInitiateInputModelEnquiriesInstanceRecord enquiriesInstanceRecord = null;


  /**
   * Get regulatoryComplianceAdministrativePlanInstanceRecord
   * @return regulatoryComplianceAdministrativePlanInstanceRecord
  **/

  public BQEnquiriesInitiateInputModelRegulatoryComplianceAdministrativePlanInstanceRecord getRegulatoryComplianceAdministrativePlanInstanceRecord() {
    return regulatoryComplianceAdministrativePlanInstanceRecord;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceRecord(BQEnquiriesInitiateInputModelRegulatoryComplianceAdministrativePlanInstanceRecord regulatoryComplianceAdministrativePlanInstanceRecord) {
    this.regulatoryComplianceAdministrativePlanInstanceRecord = regulatoryComplianceAdministrativePlanInstanceRecord;
  }


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
   * Get enquiriesInstanceRecord
   * @return enquiriesInstanceRecord
  **/

  public BQEnquiriesInitiateInputModelEnquiriesInstanceRecord getEnquiriesInstanceRecord() {
    return enquiriesInstanceRecord;
  }

  public void setEnquiriesInstanceRecord(BQEnquiriesInitiateInputModelEnquiriesInstanceRecord enquiriesInstanceRecord) {
    this.enquiriesInstanceRecord = enquiriesInstanceRecord;
  }


}

