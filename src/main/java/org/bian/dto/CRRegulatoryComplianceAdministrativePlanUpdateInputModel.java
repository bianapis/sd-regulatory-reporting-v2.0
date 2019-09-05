package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAdministrativePlanUpdateInputModelRegulatoryComplianceAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAdministrativePlanUpdateInputModel
 */
public class CRRegulatoryComplianceAdministrativePlanUpdateInputModel   {
  private String regulatoryReportingServicingSessionReference = null;

  private String regulatoryComplianceAdministrativePlanInstanceReference = null;

  private CRRegulatoryComplianceAdministrativePlanUpdateInputModelRegulatoryComplianceAdministrativePlanInstanceRecord regulatoryComplianceAdministrativePlanInstanceRecord = null;

  private Object regulatoryComplianceAdministrativePlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return regulatoryReportingServicingSessionReference
  **/

  public String getRegulatoryReportingServicingSessionReference() {
    return regulatoryReportingServicingSessionReference;
  }

  public void setRegulatoryReportingServicingSessionReference(String regulatoryReportingServicingSessionReference) {
    this.regulatoryReportingServicingSessionReference = regulatoryReportingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Regulatory Compliance Administrative Plan instance 
   * @return regulatoryComplianceAdministrativePlanInstanceReference
  **/

  public String getRegulatoryComplianceAdministrativePlanInstanceReference() {
    return regulatoryComplianceAdministrativePlanInstanceReference;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceReference(String regulatoryComplianceAdministrativePlanInstanceReference) {
    this.regulatoryComplianceAdministrativePlanInstanceReference = regulatoryComplianceAdministrativePlanInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

