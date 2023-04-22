 package com.ocs.demo.bean;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="OCS_TBL_PATIENT")
public class PatientBean {
 @Id
 @GeneratedValue
 private int patientID;
 @ManyToOne
 @JoinColumn(name="Pat",referencedColumnName="userId")
 private ProfileBean profileBean;
 @Column
 private String appointmentDate;
 @Column
 private String ailmentType;
 @Column
 private String ailmentDetails;
 @Column
 private String diagnosisHistory;

public ProfileBean getProfileBean() {
	return profileBean;
}
public void setProfileBean(ProfileBean profileBean) {
	this.profileBean = profileBean;
}
public int getPatientID() {
	return patientID;
}
public void setPatientID(int patientID) {
	this.patientID = patientID;
}

public String getAppointmentDate() {
	return appointmentDate;
}
public void setAppointmentDate(String appointmentDate) {
	this.appointmentDate = appointmentDate;
}
public String getAilmentType() {
	return ailmentType;
}
public void setAilmentType(String ailmentType) {
	this.ailmentType = ailmentType;
}
public String getAilmentDetails() {
	return ailmentDetails;
}
public void setAilmentDetails(String ailmentDetails) {
	this.ailmentDetails = ailmentDetails;
}
public String getDiagnosisHistory() {
	return diagnosisHistory;
}
public void setDiagnosisHistory(String diagnosisHistory) {
	this.diagnosisHistory = diagnosisHistory;
}

@Override
public String toString() {
	return "PatientBean [patientID=" + patientID + ", profileBean=" + profileBean + ", appointmentDate="
			+ appointmentDate + ", ailmentType=" + ailmentType + ", ailmentDetails=" + ailmentDetails
			+ ", diagnosisHistory=" + diagnosisHistory + "]";
}

}
