package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRRegulatoryComplianceAdministrativePlanRequestInputModelRegulatoryComplianceAdministrativePlanInstanceRecordRegulatoryReportingSchedule;

import javax.validation.Valid;
  
/**
 * CRRegulatoryComplianceAdministrativePlanRequestInputModelRegulatoryComplianceAdministrativePlanInstanceRecord
 */
public class CRRegulatoryComplianceAdministrativePlanRequestInputModelRegulatoryComplianceAdministrativePlanInstanceRecord   {
  private CRRegulatoryComplianceAdministrativePlanRequestInputModelRegulatoryComplianceAdministrativePlanInstanceRecordRegulatoryReportingSchedule regulatoryReportingSchedule = null;


  /**
   * Get regulatoryReportingSchedule
   * @return regulatoryReportingSchedule
  **/

  public CRRegulatoryComplianceAdministrativePlanRequestInputModelRegulatoryComplianceAdministrativePlanInstanceRecordRegulatoryReportingSchedule getRegulatoryReportingSchedule() {
    return regulatoryReportingSchedule;
  }

  public void setRegulatoryReportingSchedule(CRRegulatoryComplianceAdministrativePlanRequestInputModelRegulatoryComplianceAdministrativePlanInstanceRecordRegulatoryReportingSchedule regulatoryReportingSchedule) {
    this.regulatoryReportingSchedule = regulatoryReportingSchedule;
  }


}

