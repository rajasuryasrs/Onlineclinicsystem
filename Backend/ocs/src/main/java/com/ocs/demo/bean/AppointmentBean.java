package com.ocs.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="OCS_TBL_APPOINTMENTS")
public class AppointmentBean {
	@Id
	private int appointmentID;
	
	@ManyToOne
	@JoinColumn(name="doctorapp", referencedColumnName="doctorID")
	private DoctorBean doctorBean;
	
	@ManyToOne
	@JoinColumn(name="doctorpat" , referencedColumnName="patientID")
	private PatientBean patientBean;
	@Column
	private String appointmentDate;
	@Column
	private String appointmentTime;
	public int getAppointmentID() {
		return appointmentID;
	}
	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}
	public DoctorBean getDoctorBean() {
		return doctorBean;
	}
	public void setDoctorBean(DoctorBean doctorBean) {
		this.doctorBean = doctorBean;
	}
	public PatientBean getPatientBean() {
		return patientBean;
	}
	public void setPatientBean(PatientBean patientBean) {
		this.patientBean = patientBean;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	@Override
	public String toString() {
		return "AppointmentBean [appointmentID=" + appointmentID + ", doctorBean=" + doctorBean + ", patientBean="
				+ patientBean + ", appointmentDate=" + appointmentDate + ", appointmentTime=" + appointmentTime + "]";
	}
}
