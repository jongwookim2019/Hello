package com.mycompany.kjw;

public class PersonExample {
public static void main(String[] args) {
	Person p1 = new Person();
	p1.setName("hong");
	p1.setAge(-20);
	p1.setHeight(-180.8);
	p1.setWeight(-77.7);
	System.out.println("이름은: "+ p1.getName()+"나이는 : "+p1.getAge()+"키는 :"+p1.getHeight()+ "몸무게는 :"+ p1.getWeight());
	
	}
}
