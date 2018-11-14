package com.cskt.Dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.cskt.pojo.Dept;
import com.cskt.pojo.Emp;

public interface DeptDao {
	//��ѯ ����ֵΪLIST 
	List<Dept> selectAll();
	//��ѯ ����ֵΪIterator 
	Iterator<Dept> selectAll2();
	//���ݲ���ID��ѯ��������
	Dept getID(byte id);
	//����
	void addDept(Dept d);
	//ɾ��
	void delDept(Byte e);
	//�޸�
	void upDept(Dept u);
	//ģ����ѯ
	List<Dept> selectMohu(String dname);
	List<Dept> selectMohu2(Dept dept);
	//��ҳ
	List<Dept> selFenYe(int pageIndex,int pageCount);
	//��ѯ��¼��
	Long selCount(String dname);
	//ͶӰ��ѯ    �鵥��
	List<String> selTY1();
	//ͶӰ��ѯ    �����
	List<Object[]> selTY2();
	//���ݲ��Ų�ѯ���ŵ�����Ա��
	HashSet<Emp> selename();
}
