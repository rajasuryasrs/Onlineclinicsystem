package com.ocs.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ocs.demo.bean.CredentialsBean;
import com.ocs.demo.bean.ProfileBean;
import com.ocs.demo.dao.profiledao;


@Service
public class ProfileService {
@Autowired
private profiledao adao;
public  String registerUser(CredentialsBean user)
{
	return adao.registerUser(user);
}
public boolean authenticate(CredentialsBean user) 
{
return  adao.authenticate(user);
}
public String addProfile(ProfileBean profileBean) 
{
	return adao.addProfile(profileBean);
}
public ArrayList<ProfileBean> viewProfile()
{
	return adao.viewProfile();
}
public String updateProfile(ProfileBean profileBean)
{
	return adao.updateProfile(profileBean);
}
public String deleteProfile(int profileId)
{
	return adao.deleteProfile(profileId);
}
public ProfileBean viewProfileById(int profileId)
{
	return adao.viewProfileById(profileId);
}

}
