package com.cskt.Biz;

import java.util.Iterator;
import java.util.List;

import com.cskt.pojo.Dept;

public interface DeptBiz {
	//��ѯ
	List<Dept> selectAll();
	//
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
}
