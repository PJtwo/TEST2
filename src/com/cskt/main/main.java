package com.cskt.main;

import java.util.Iterator;
import java.util.List;

import com.cskt.BizImpl.DeptBizImpl;
import com.cskt.DaoImpl.DeptDaoImpl;
import com.cskt.pojo.Dept;
public class main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*DeptDaoImpl dDao=new DeptDaoImpl();
		List<Dept> list=dDao.selectAll();
		//ѭ��������������
		for (Dept dept : list) {
			System.out.println(dept.getDname());
		}*/
		DeptBizImpl dp=new DeptBizImpl();
		//ͶӰ��ѯ1
		/*List<String> l= dp.selTY1();
		for (String string : l) {
			System.out.println(string);
		}*/
		//ͶӰ��ѯ2
		List<Object[]> l= dp.selTY2();
		for (Object[] objects : l) {
			for (int i = 0; i < objects.length; i++) {
				System.out.println(objects[i]);
			}
		}
		//��ѯ�ܼ�¼��
		/*Long lo=dp.selCount("O");
		System.out.println(lo);*/
		//��ҳ
		/*List<Dept> list=dp.selFenYe(1, 3);
		for (Dept dept : list) {
			System.out.println(dept.getDname());
		}*/
		//��ѯ����ֵIterator
		/*Iterator<Dept> it=dp.selectAll2();
		while (it.hasNext()) {
			Dept dt=it.next();
			System.out.println(dt.getDname());
		}*/
		//ģ����ѯ
		/*List<Dept> dM= dp.selectMohu("A");
		for (Dept dept : dM) {
			System.out.println(dept.getDname());
		}*/
		//ģ����ѯ2
		/*Dept d=new Dept();
		d.setDname("O");
		d.setLoc("O");
		List<Dept> dM= dp.selectMohu2(d);
		for (Dept dept : dM) {
			System.out.println(dept.getDname()+"\t"+dept.getLoc());
		}*/
		//����ID��ѯ
		/*Dept dept=dp.getID((byte)10);
		System.out.println(dept.getDname());*/
		//����
		/*Dept d=new Dept();
		d.setDeptno((byte)60);
		d.setDname("һŵ");
		dp.addDept(d);*/
		//ɾ��
		/*dp.delDept((byte)55);*/
		//�޸�
		/*Dept d=new Dept();
		d.setDeptno((byte)60);
		d.setDname("һŵ");
		d.setLoc("����");
		dp.upDept(d);*/
		System.out.println("�����ɹ���");
	}

}
