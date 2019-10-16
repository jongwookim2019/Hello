package DBProgram;

import java.sql.Date;

public class DB {
	int empId;
	String name;
	String deptName;
	int salary;
	Date hireDate;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empNo) {
		this.empId = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
}
