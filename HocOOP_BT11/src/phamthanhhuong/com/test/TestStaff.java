package phamthanhhuong.com.test;

import phamthanhhuong.com.model.Emloyee;
import phamthanhhuong.com.model.Executive;
import phamthanhhuong.com.model.Staff;

public class TestStaff {

	public static void main(String[] args) {
		Staff st=new Staff();
		Emloyee teo=new Emloyee();
		teo.setName("Nguyễn Văn Tèo");
		teo.setAddress("Quận 1");
		teo.setPhone("123");
		teo.setPayRate(0.12);
		teo.setSocialSecurityNumber("SEC123");
		st.addStaffMember(teo);
	
		Emloyee ty=new Emloyee();
		ty.setName("Nguyễn Văn Tý");
		ty.setAddress("Quận 2");
		ty.setPhone("456");
		ty.setPayRate(0.14);
		ty.setSocialSecurityNumber("SEC456");
		st.addStaffMember(ty);
	
		Executive an=new Executive();
		an.setName("Nguyễn Thị An");
		an.setAddress("Quận 3");
		an.setPhone("789");
		an.setPayRate(0.15);
		an.setSocialSecurityNumber("SEC789");
		an.awardBonus(100);
		st.addStaffMember(an);
		st.payDay();
	}

}
