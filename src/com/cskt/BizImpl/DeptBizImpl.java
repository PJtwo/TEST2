package com.cskt.BizImpl;

import java.util.Iterator;
import java.util.List;

import com.cskt.Biz.DeptBiz;
import com.cskt.Dao.DeptDao;
import com.cskt.DaoImpl.DeptDaoImpl;
import com.cskt.pojo.Dept;

public class DeptBizImpl implements DeptBiz{

	DeptDao dpDao=new DeptDaoImpl();
	public List<Dept> selectAll() {
		return dpDao.selectAll();
	}

	public Dept getID(byte id) {
		return dpDao.getID(id);
	}

	public void addDept(Dept d) {
		dpDao.addDept(d);
	}

	public void delDept(Byte e) {
		dpDao.delDept(e);
	}

	public void upDept(Dept u) {
		dpDao.upDept(u);
	}

	public Iterator<Dept> selectAll2() {
		return dpDao.selectAll2();
	}

	public List<Dept> selectMohu(String name) {
		return dpDao.selectMohu(name);
	}

	public List<Dept> selectMohu2(Dept dept) {
		return dpDao.selectMohu2(dept);
	}

	public List<Dept> selFenYe(int pageIndex, int pageCount) {
		return dpDao.selFenYe(pageIndex, pageCount);
	}

	public Long selCount(String dname) {
		return dpDao.selCount(dname);
	}

	public List<String> selTY1() {
		return dpDao.selTY1();
	}

	public List<Object[]> selTY2() {
		return dpDao.selTY2();
	}

}
