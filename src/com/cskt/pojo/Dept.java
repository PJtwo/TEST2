package com.cskt.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Byte deptno;
	private String dname;
	private String loc;
	private HashSet<Emp> emps = new HashSet<Emp>();

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** minimal constructor */
	public Dept(Byte deptno) {
		this.deptno = deptno;
	}

	/** full constructor */
	public Dept(Byte deptno, String dname, String loc, HashSet emps) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		this.emps = emps;
	}

	// Property accessors

	public Byte getDeptno() {
		return this.deptno;
	}

	public void setDeptno(Byte deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Set getEmps() {
		return this.emps;
	}

	public void setEmps(HashSet emps) {
		this.emps = emps;
	}

	
}