package com.cskt.Dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.cskt.pojo.Dept;
import com.cskt.pojo.Emp;

public interface DeptDao {
	//查询 返回值为LIST 
	List<Dept> selectAll();
	//查询 返回值为Iterator 
	Iterator<Dept> selectAll2();
	//根据部门ID查询部门名称
	Dept getID(byte id);
	//新增
	void addDept(Dept d);
	//删除
	void delDept(Byte e);
	//修改
	void upDept(Dept u);
	//模糊查询
	List<Dept> selectMohu(String dname);
	List<Dept> selectMohu2(Dept dept);
	//分页
	List<Dept> selFenYe(int pageIndex,int pageCount);
	//查询记录数
	Long selCount(String dname);
	//投影查询    查单列
	List<String> selTY1();
	//投影查询    查多列
	List<Object[]> selTY2();
	//根据部门查询部门的所有员工
	HashSet<Emp> selename();
}
