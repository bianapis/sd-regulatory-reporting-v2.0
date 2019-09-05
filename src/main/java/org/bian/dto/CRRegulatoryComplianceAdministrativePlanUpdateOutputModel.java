package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAdministrativePlanUpdateInputModelRegulatoryComplianceAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAdministrativePlanUpdateOutputModel
 */
public class CRRegulatoryComplianceAdministrativePlanUpdateOutputModel   {
  private CRRegulatoryComplianceAdministrativePlanUpdateInputModelRegulatoryComplianceAdministrativePlanInstanceRecord regulatoryComplianceAdministrativePlanInstanceRecord = null;

  private String regulatoryComplianceAdministrativePlanUpdateActionTaskReference = null;

  private Object regulatoryComplianceAdministrativePlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get regulatoryComplianceAdministrativePlanInstanceRecord
   * @return regulatoryComplianceAdministrativePlanInstanceRecord
  **/

  public CRRegulatoryComplianceAdministrativePlanUpdateInputModelRegulatoryComplianceAdministrativePlanInstanceRecord getRegulatoryComplianceAdministrativePlanInstanceRecord() {
    return regulatoryComplianceAdministrativePlanInstanceRecord;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceRecord(CRRegulatoryComplianceAdministrativePlanUpdateInputModelRegulatoryComplianceAdministrativePlanInstanceRecord regulatoryComplianceAdministrativePlanInstanceRecord) {
    this.regulatoryComplianceAdministrativePlanInstanceRecord = regulatoryComplianceAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return regulatoryComplianceAdministrativePlanUpdateActionTaskReference
  **/

  public String getRegulatoryComplianceAdministrativePlanUpdateActionTaskReference() {
    return regulatoryComplianceAdministrativePlanUpdateActionTaskReference;
  }

  public void setRegulatoryComplianceAdministrativePlanUpdateActionTaskReference(String regulatoryComplianceAdministrativePlanUpdateActionTaskReference) {
    this.regulatoryComplianceAdministrativePlanUpdateActionTaskReference = regulatoryComplianceAdministrativePlanUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return regulatoryComplianceAdministrativePlanUpdateActionTaskRecord
  **/

  public Object getRegulatoryComplianceAdministrativePlanUpdateActionTaskRecord() {
    return regulatoryComplianceAdministrativePlanUpdateActionTaskRecord;
  }

  public void setRegulatoryComplianceAdministrativePlanUpdateActionTaskRecord(Object regulatoryComplianceAdministrativePlanUpdateActionTaskRecord) {
    this.regulatoryComplianceAdministrativePlanUpdateActionTaskRecord = regulatoryComplianceAdministrativePlanUpdateActionTaskRecord;
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

