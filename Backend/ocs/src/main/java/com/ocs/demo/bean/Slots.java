package com.ocs.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="OCS_TBL_SLOTS")
public class Slots {
	@Id
 private String slotNumber;
	@Column
 private String duration;
	@Override
	public String toString() {
		return "Slots [slotNumber=" + slotNumber + ", duration=" + duration + "]";
	}
	public 	String getSlotNumber() {
		return slotNumber;
	}
	public void setSlotNumber(String slotNumber) {
		this.slotNumber = slotNumber;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}
