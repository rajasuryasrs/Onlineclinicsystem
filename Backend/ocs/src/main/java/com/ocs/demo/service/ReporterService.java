package com.ocs.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ocs.demo.bean.CredentialsBean;
import com.ocs.demo.bean.LeaveBean;
import com.ocs.demo.dao.repoterdao;


@Service
public class ReporterService {
@Autowired
private repoterdao  adao;
public  String registerUser(CredentialsBean user)
{
	return adao.registerUser(user);
}
public boolean authenticate(CredentialsBean user) 
{
return  adao.authenticate(user);
}
public String addReporter(LeaveBean leaveBean) 
{
	return adao.addRepoter(leaveBean);
}
public ArrayList<LeaveBean> viewReporter()
{
	return adao.viewReporter();
}
public String updateReporter(LeaveBean reporterBean)
{
	return adao.updateReporter(reporterBean);
}
public String deleteReporter(int reporterId)
{
	return adao.deleteReporter(reporterId);
}
public LeaveBean viewReporterById(int reporterId)
{
	return adao.viewReporterById(reporterId);
}
public String addLeave(LeaveBean lb)
{
	return adao.addLeave(lb);
}
}
