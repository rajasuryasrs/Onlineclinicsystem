package com.ocs.demo.bean;

import jakarta.persistence.*;


@Entity
@Table(name="OCS_TBL_LEAVE")
public class LeaveBean {
	@Id
	private int leaveID;
	@Column
	 private String reporterID;
	@Column
	 private String repoterName;
	@Column 
	 private String leaveForm;
	@Column
	private String leaveTo;
	@Column
	 private String reason;
	@Column
	 private  String status;
	@ManyToOne
	@JoinColumn(name="docter" , referencedColumnName="doctorID")
	private DoctorBean doctorBean;
	
	public DoctorBean getDoctorBean() {
		return doctorBean;
	}
	public void setDoctorBean(DoctorBean doctorBean) {
		this.doctorBean = doctorBean;
	}
	public int getLeaveID() {
		return leaveID;
	}
	public void setLeaveID(int leaveID) {
		this.leaveID = leaveID;
	}
	public String getReporterID() {
		return reporterID;
	}
	public void setReporterID(String reporterID) {
		this.reporterID = reporterID;
	}
	public String getRepoterName() {
		return repoterName;
	}
	public void setRepoterName(String repoterName) {
		this.repoterName = repoterName;
	}
	public String getLeaveForm() {
		return leaveForm;
	}
	public void setLeaveForm(String leaveForm) {
		this.leaveForm = leaveForm;
	}
	public String getLeaveTo() {
		return leaveTo;
	}
	public void setLeaveTo(String leaveTo) {
		this.leaveTo = leaveTo;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LeaveBean [leaveID=" + leaveID + ", reporterID=" + reporterID + ", repoterName=" + repoterName
				+ ", leaveForm=" + leaveForm + ", leaveTo=" + leaveTo + ", reason=" + reason + ", status=" + status
				+ ", doctorBean=" + doctorBean + "]";
	}
	
}
