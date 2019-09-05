package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthoringRetrieveOutputModelAuthoringInstanceRecord
 */
public class BQAuthoringRetrieveOutputModelAuthoringInstanceRecord   {
  private String regulatoryReportTypeComplianceReportingRequirements = null;

  private String reportingPeriod = null;

  private String reportingBusinessLegalEntityReference = null;

  private String reportingBusinessUnitReference = null;

  private String regulatoryReportReference = null;

  private Object regulatoryReport = null;

  private String regulatoryReportDocumentReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the production information/measurements required for reporting - includes reporting format 
   * @return regulatoryReportTypeComplianceReportingRequirements
  **/

  public String getRegulatoryReportTypeComplianceReportingRequirements() {
    return regulatoryReportTypeComplianceReportingRequirements;
  }

  public void setRegulatoryReportTypeComplianceReportingRequirements(String regulatoryReportTypeComplianceReportingRequirements) {
    this.regulatoryReportTypeComplianceReportingRequirements = regulatoryReportTypeComplianceReportingRequirements;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The time period covered by a report 
   * @return reportingPeriod
  **/

  public String getReportingPeriod() {
    return reportingPeriod;
  }

  public void setReportingPeriod(String reportingPeriod) {
    this.reportingPeriod = reportingPeriod;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E48d9cTGEeChad0JzLk7QA_-400209460/elements/_yagFILl5EeOpCN0IL2Swqw  bian-reference: ReportInvolvement (as PartyRole).Party (as Organisation). LegalEntityIdentifier  general-info: Refers to the company group or subsidiary covered by the regulatory report 
   * @return reportingBusinessLegalEntityReference
  **/

  public String getReportingBusinessLegalEntityReference() {
    return reportingBusinessLegalEntityReference;
  }

  public void setReportingBusinessLegalEntityReference(String reportingBusinessLegalEntityReference) {
    this.reportingBusinessLegalEntityReference = reportingBusinessLegalEntityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the responsible reporting business units for the report 
   * @return reportingBusinessUnitReference
  **/

  public String getReportingBusinessUnitReference() {
    return reportingBusinessUnitReference;
  }

  public void setReportingBusinessUnitReference(String reportingBusinessUnitReference) {
    this.reportingBusinessUnitReference = reportingBusinessUnitReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FDYMVMTGEeChad0JzLk7QA_-1222522700  bian-reference: RegulatoryReport  general-info: Refers to the regulatory report 
   * @return regulatoryReportReference
  **/

  public String getRegulatoryReportReference() {
    return regulatoryReportReference;
  }

  public void setRegulatoryReportReference(String regulatoryReportReference) {
    this.regulatoryReportReference = regulatoryReportReference;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FDYMVMTGEeChad0JzLk7QA_-1222522700  bian-reference: RegulatoryReport `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FDYMVMTGEeChad0JzLk7QA_-1222522700  bian-reference: RegulatoryReport `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The regulatory report in any suitable format and media 
   * @return regulatoryReport
  **/

  public Object getRegulatoryReport() {
    return regulatoryReport;
  }

  public void setRegulatoryReport(Object regulatoryReport) {
    this.regulatoryReport = regulatoryReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for the record of the report 
   * @return regulatoryReportDocumentReference
  **/

  public String getRegulatoryReportDocumentReference() {
    return regulatoryReportDocumentReference;
  }

  public void setRegulatoryReportDocumentReference(String regulatoryReportDocumentReference) {
    this.regulatoryReportDocumentReference = regulatoryReportDocumentReference;
  }


}

