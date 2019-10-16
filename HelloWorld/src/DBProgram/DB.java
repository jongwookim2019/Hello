package DBProgram;

import java.sql.Date;

public class DB {
	int employeeNo;
	String name;
	String departmentName;
	int salary;
	Date hareDate;
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getHareDate() {
		return hareDate;
	}
	public void setHareDate(Date date) {
		this.hareDate = date;
	}
	
}
