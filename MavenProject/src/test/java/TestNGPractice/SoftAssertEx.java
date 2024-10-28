package TestNGPractice;

import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	public void m1() {
		System.out.println("Step1");
		System.out.println("step2");
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(false, true);
		
		System.out.println("step3");
		System.out.println("step4");
		soft.assertAll();
	}

}
