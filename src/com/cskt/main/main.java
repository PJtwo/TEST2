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
		//循环遍历集合数据
		for (Dept dept : list) {
			System.out.println(dept.getDname());
		}*/
		DeptBizImpl dp=new DeptBizImpl();
		//投影查询1
		/*List<String> l= dp.selTY1();
		for (String string : l) {
			System.out.println(string);
		}*/
		//投影查询2
		List<Object[]> l= dp.selTY2();
		for (Object[] objects : l) {
			for (int i = 0; i < objects.length; i++) {
				System.out.println(objects[i]);
			}
		}
		//查询总记录数
		/*Long lo=dp.selCount("O");
		System.out.println(lo);*/
		//分页
		/*List<Dept> list=dp.selFenYe(1, 3);
		for (Dept dept : list) {
			System.out.println(dept.getDname());
		}*/
		//查询返回值Iterator
		/*Iterator<Dept> it=dp.selectAll2();
		while (it.hasNext()) {
			Dept dt=it.next();
			System.out.println(dt.getDname());
		}*/
		//模糊查询
		/*List<Dept> dM= dp.selectMohu("A");
		for (Dept dept : dM) {
			System.out.println(dept.getDname());
		}*/
		//模糊查询2
		/*Dept d=new Dept();
		d.setDname("O");
		d.setLoc("O");
		List<Dept> dM= dp.selectMohu2(d);
		for (Dept dept : dM) {
			System.out.println(dept.getDname()+"\t"+dept.getLoc());
		}*/
		//根据ID查询
		/*Dept dept=dp.getID((byte)10);
		System.out.println(dept.getDname());*/
		//新增
		/*Dept d=new Dept();
		d.setDeptno((byte)60);
		d.setDname("一诺");
		dp.addDept(d);*/
		//删除
		/*dp.delDept((byte)55);*/
		//修改
		/*Dept d=new Dept();
		d.setDeptno((byte)60);
		d.setDname("一诺");
		d.setLoc("儿子");
		dp.upDept(d);*/
		System.out.println("操作成功！");
	}

}
