package com.ocs.demo.dao;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ocs.demo.bean.AppointmentBean;
import com.ocs.demo.bean.CredentialsBean;
import com.ocs.demo.bean.DoctorBean;
@Repository
public class doctordao{
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query<DoctorBean> q; 
	private Query<AppointmentBean> a;
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
			System.out.println(cb);
				System.out.println("Record is  present"+cb.getCid()+" "+cb.getPassword());
			
				count++;
			
			}
		if(count>=0)
		{
			return true;
		}
		else
		{
		return false;
		}		
	}

	public String addDoctor(DoctorBean doctorBean) 
	{
		System.out.println("Under dao "+doctorBean);
		if(doctorBean!=null)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(doctorBean);
			transaction.commit();
			session.close();
			return "SUCCESS";
		}
		else if(doctorBean==null)
		{
			System.out.println(doctorBean);
			return "ERROR";
		}
		else
		{
			System.out.println(doctorBean);
			return "FAIL";
		}
	}
	
	public String updateDoctor(DoctorBean doctorBean)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(doctorBean!=null)
		{
		session.update(doctorBean);

		transaction.commit();

		session.close();
		return "SUCCESS";
		}
		else if(doctorBean==null)
		{
			return "FAIL";
		}
		else
		{
			return "ERROR";
		}
	}
	public String deleteDoctor(int doctorId)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(doctorId>=0)
		{
		Query q1=session.createQuery("delete from DoctorBean where doctorID=:eid");
		q1.setParameter("eid", doctorId);
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
	public ArrayList<DoctorBean> viewDoctor()
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		q=session.createQuery("from DoctorBean");
		return (ArrayList<DoctorBean>) q.list();
	}
	public DoctorBean viewDoctorById(int doctorId)
	{
		DoctorBean elBean=new DoctorBean();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	Query<DoctorBean> q2=session.createQuery("from DoctorBean where doctorID=:did");
	q2.setParameter("did", doctorId);
	ArrayList<DoctorBean> all=(ArrayList<DoctorBean>) q2.getResultList();
	for(DoctorBean e1:all)
	{
		elBean=e1;
	}
	return elBean;
	}
	
	public AppointmentBean viewPatientsBydate(int appointmentDate) {
		{
			AppointmentBean d1Bean=new AppointmentBean();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
		Query<AppointmentBean> a=session.createQuery("from AppointmentBean where appointmentDate=:did");
		a.setParameter("did", appointmentDate);
		ArrayList<AppointmentBean> all=(ArrayList<AppointmentBean>) a.getResultList();
		for(AppointmentBean d1:all)
		{
			d1Bean=d1;
		}
		return d1Bean;
		}
	}
}
