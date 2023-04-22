package com.ocs.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="OCS_TBL_SCHEDULES")
public class ScheduleBean {
	@Id
    private int scheduleID;
	@ManyToOne
   @JoinColumn(name="dd", referencedColumnName="doctorID")	
	private DoctorBean doctorBean;
	@Column
	private String availableDays;
	@Column
	private String slots;
	public DoctorBean getDoctorBean() {
		return doctorBean;
	}
	public void setDoctorBean(DoctorBean doctorBean) {
		this.doctorBean = doctorBean;
	}
	public int getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}

	public String getAvailableDays() {
		return availableDays;
	}
	public void setAvailableDays(String availableDays) {
		this.availableDays = availableDays;
	}
	public String getSlots() {
		return slots;
	}
	public void setSlots(String slots) {
		this.slots = slots;
	}
	

	@Override
	public String toString() {
		return "ScheduleBean [scheduleID=" + scheduleID + ", doctorBean=" + doctorBean + ", availableDays="
				+ availableDays + ", slots=" + slots + "]";
	}

}
