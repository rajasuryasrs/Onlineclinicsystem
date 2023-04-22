package com.ocs.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ocs.demo.bean.AppointmentBean;
import com.ocs.demo.bean.CredentialsBean;
import com.ocs.demo.bean.DoctorBean;
import com.ocs.demo.dao.doctordao;


@Service
public class DoctorService {
@Autowired
private doctordao adao;
public  String registerUser(CredentialsBean user)
{
	return adao.registerUser(user);
}
public boolean authenticate(CredentialsBean user) 
{
return  adao.authenticate(user);
}
public String addDoctor(DoctorBean doctorBean) 
{
	return adao.addDoctor(doctorBean);
}
public ArrayList<DoctorBean> viewDoctor()
{
	return adao.viewDoctor();
}
public String updateDoctor(DoctorBean doctorBean)
{
	return adao.updateDoctor(doctorBean);
}
public String deleteDoctor(int doctorId)
{
	return adao.deleteDoctor(doctorId);
}
public DoctorBean viewDoctorById(int doctorId)
{
	return adao.viewDoctorById(doctorId);
}

public AppointmentBean viewPatientsBydate(int appointmentDate){
	return adao.viewPatientsBydate(appointmentDate);
}

}
