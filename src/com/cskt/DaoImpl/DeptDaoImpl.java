package com.cskt.DaoImpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cskt.Dao.DeptDao;
import com.cskt.pojo.Dept;
import com.cskt.tools.HibernateSessionFactory;

public class DeptDaoImpl implements DeptDao{
	
	public List<Dept> selectAll() {
		Session session =HibernateSessionFactory.getSession();
		Query query =session.createQuery("from Dept");
		List<Dept> list=query.list();
		return list;
	}

	public Dept getID(byte id) {
		Dept dept=(Dept)HibernateSessionFactory.getSession().get(Dept.class, id);
		//Dept dept=(Dept)HibernateSessionFactory.getSession().load(Dept.class, id);
		return dept;
	}

	public void addDept(Dept d) {
		Transaction tx=null;
		try {
			//��������
			tx=HibernateSessionFactory.getSession().beginTransaction();
			HibernateSessionFactory.getSession().save(d);
			//�ύ����
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����쳣��");
			if (tx!=null) {
				//�ع�����
				tx.rollback();
			}
		}
	}

	public void delDept(Byte id) {
		Transaction tx=null;
		try {
			//��������
			tx=HibernateSessionFactory.getSession().beginTransaction();
			//ɾ��ǰ�����Ȳ�ѯ
			Dept dept=getID(id);
			HibernateSessionFactory.getSession().delete(dept);
			//�ύ����
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����쳣��");
			if (tx!=null) {
				//�ع�����
				tx.rollback();
			}
		}
	}

	public void upDept(Dept dept) {
		Transaction tx=null;
		try {
			//��������
			tx=HibernateSessionFactory.getSession().beginTransaction();
			//ͨ��get()��load()������Ҫ�޸ĵĲ��Ŷ���
			Dept d=getID(dept.getDeptno());
			d.setDname(dept.getDname());
			d.setLoc(dept.getLoc());
			//�޸�  1.update  2.saveorupdate  3.merge
			HibernateSessionFactory.getSession().merge(d);
			//�ύ����
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����쳣��");
			if (tx!=null) {
				//�ع�����
				tx.rollback();
			}
		}
	}

	public Iterator<Dept> selectAll2() {
		String hql="from Dept";
		Query query =HibernateSessionFactory.getSession().createQuery(hql);
		return query.iterate();
	}

	public List<Dept> selectMohu(String dname) {
		//String hql="from Dept where dname like '%"+dname+"%'";
		//String hql="from Dept where dname like ? ";
		String hql="from Dept where dname like :name";
		Query query =HibernateSessionFactory.getSession().createQuery(hql);
		//query.setString(0, "%"+dname+"%");
		query.setString("name", "%"+dname+"%");
		return query.list();
	}

	public List<Dept> selectMohu2(Dept dept) {
		StringBuilder hql=new StringBuilder("from Dept dept where 1=1 ");
		if (dept.getDname()!=null && !"".equals(dept.getDname())) {
			hql.append(" and dept.dname like :dname ");
		}
		if (dept.getLoc()!=null && !"".equals(dept.getLoc())) {
			hql.append(" and dept.loc like :loc ");
		}
		Query query =HibernateSessionFactory.getSession()
				.createQuery(hql.toString());
		if (dept.getDname()!=null && !"".equals(dept.getDname())) {
			query.setString("dname", "%"+dept.getDname()+"%");
		}
		if (dept.getLoc()!=null && !"".equals(dept.getLoc())) {
			query.setString("loc", "%"+dept.getLoc()+"%");
		}
		return query.list();
	}

	public List<Dept> selFenYe(int pageIndex, int pageCount) {
		String hql=" from Dept ";
		Query query =HibernateSessionFactory.getSession().createQuery(hql);
		query.setFirstResult((pageIndex-1)*pageCount);
		query.setMaxResults(pageCount);
		return query.list();
	}

	public Long selCount(String dname) {
		String hql="select count(deptno) from Dept where dname like :dname";
		Long lo=(Long)HibernateSessionFactory.getSession().createQuery(hql)
				.setString("dname", "%"+dname+"%").uniqueResult();
		return lo;
	}

	public List<String> selTY1() {
		String hql="select dname from Dept";
		Query query =HibernateSessionFactory.getSession().createQuery(hql);
		return query.list();
	}

	public List<Object[]> selTY2() {
		String hql="select dname,loc from Dept";
		Query query =HibernateSessionFactory.getSession().createQuery(hql);
		return query.list();
	}
}
