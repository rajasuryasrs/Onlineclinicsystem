package com.ocs.demo.dao;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ocs.demo.bean.CredentialsBean;
import com.ocs.demo.bean.ProfileBean;
@Repository
public class profiledao{
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query<ProfileBean> q; 
	public  String registerUser(CredentialsBean user)
	{
		System.out.println("Under Dao "+user.getCid()+" "+user.getPassword());
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		return "SUCCESS";
	}
	public boolean authenticate(CredentialsBean user) 
	{
		System.out.println("Under Dao "+user.getCid()+" "+user.getPassword());
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		Query q3=session.createQuery("from CredentialsBean where cid=:uid and password=:pss");
		q3.setParameter("uid", user.getCid());
		q3.setParameter("pss", user.getPassword());
		ArrayList<CredentialsBean> al=(ArrayList<CredentialsBean>) q3.getResultList();
		int count=0;
		for(CredentialsBean cb:al)
		{
			if((cb.getCid()==(user.getCid()))&&(cb.getPassword().equals(user.getPassword())))
			{
				System.out.println("Record is  present"+cb.getCid()+" "+cb.getPassword());
			
				count++;
				if(count>0)
				{
		return true;
				}
				else
				{
					return false;
				}
			}
		}
		return false;
		
	}

	public String addProfile(ProfileBean profileBean) 
	{
		System.out.println("Under dao "+profileBean);
		if(profileBean!=null)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(profileBean);
			transaction.commit();
			session.close();
			return "SUCCESS";
		}
		else if(profileBean==null)
		{
			System.out.println(profileBean);
			return "ERROR";
		}
		else
		{
			System.out.println(profileBean);
			return "FAIL";
		}
	}
	
	public String updateProfile(ProfileBean profileBean)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(profileBean!=null)
		{
		session.update(profileBean);

		transaction.commit();

		session.close();
		return "SUCCESS";
		}
		else if(profileBean==null)
		{
			return "FAIL";
		}
		else
		{
			return "ERROR";
		}
	}
	public String deleteProfile(int profileId)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(profileId>=0)
		{
		Query q1=session.createQuery("delete from ProfileBean where profileID=:eid");
		q1.setParameter("eid", profileId);
		q1.executeUpdate();
transaction.commit();
session.close();
		return "SUCCESS";
		}
		else
		{
			return "FAIL";
		}
	}
	public ArrayList<ProfileBean> viewProfile()
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		q=session.createQuery("from ProfileBean");
		return (ArrayList<ProfileBean>) q.list();
	}
	public ProfileBean viewProfileById(int profileId)
	{
		ProfileBean elBean=new ProfileBean();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	Query<ProfileBean> q2=session.createQuery("from ProfileBean where profileID=:did");
	q2.setParameter("did", profileId);
	ArrayList<ProfileBean> all=(ArrayList<ProfileBean>) q2.getResultList();
	for(ProfileBean e1:all)
	{
		elBean=e1;
	}
	return elBean;
	}
}
