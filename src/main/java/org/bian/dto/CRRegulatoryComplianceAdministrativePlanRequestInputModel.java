package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAdministrativePlanRequestInputModelRegulatoryComplianceAdministrativePlanInstanceRecord;
import org.bian.dto.CRRegulatoryComplianceAdministrativePlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAdministrativePlanRequestInputModel
 */
public class CRRegulatoryComplianceAdministrativePlanRequestInputModel   {
  private String regulatoryReportingServicingSessionReference = null;

  private String regulatoryComplianceAdministrativePlanInstanceReference = null;

  private CRRegulatoryComplianceAdministrativePlanRequestInputModelRegulatoryComplianceAdministrativePlanInstanceRecord regulatoryComplianceAdministrativePlanInstanceRecord = null;

  private Object regulatoryComplianceAdministrativePlanRequestActionTaskRecord = null;

  private CRRegulatoryComplianceAdministrativePlanRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRRegulatoryComplianceAdministrativePlanRequestInputModelRegulatoryComplianceAdministrativePlanInstanceRecord getRegulatoryComplianceAdministrativePlanInstanceRecord() {
    return regulatoryComplianceAdministrativePlanInstanceRecord;
  }

  public void setRegulatoryComplianceAdministrativePlanInstanceRecord(CRRegulatoryComplianceAdministrativePlanRequestInputModelRegulatoryComplianceAdministrativePlanInstanceRecord regulatoryComplianceAdministrativePlanInstanceRecord) {
    this.regulatoryComplianceAdministrativePlanInstanceRecord = regulatoryComplianceAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return regulatoryComplianceAdministrativePlanRequestActionTaskRecord
  **/

  public Object getRegulatoryComplianceAdministrativePlanRequestActionTaskRecord() {
    return regulatoryComplianceAdministrativePlanRequestActionTaskRecord;
  }

  public void setRegulatoryComplianceAdministrativePlanRequestActionTaskRecord(Object regulatoryComplianceAdministrativePlanRequestActionTaskRecord) {
    this.regulatoryComplianceAdministrativePlanRequestActionTaskRecord = regulatoryComplianceAdministrativePlanRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRRegulatoryComplianceAdministrativePlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRRegulatoryComplianceAdministrativePlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

