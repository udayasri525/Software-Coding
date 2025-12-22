package com.school.staff;
import com.school.management.*;
import com.school.app.*;
public class SchoolApp {

	public static void main(String[] args) {
		School obj1=new School();
		principal obj2=new principal();
		obj1.nameset("zphs high school");
		obj1.loactionset("andhara pradhesh kakinada district karapa mandal");
		obj1.showSchoolInfo();
		System.out.println("-----------------------");
		obj2.setPrinicipalName("krishina");
		obj2.setExperience(10);
		obj2.showPrincipalInfo();
	}

}
