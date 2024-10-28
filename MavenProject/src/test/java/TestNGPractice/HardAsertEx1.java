package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsertEx1 {
	
	@Test
	public void m1() {
		System.out.println("step1");
		System.out.println("step2");
		Assert.assertEquals(false, false);
		System.out.println("step3");
		System.out.println("step4");
	}
	
	@Test
	public void m2() {
		int a=10;
		int b=10;
		Assert.assertEquals(a,b,"Not equals= ");
		System.out.println("It is Equal");
	}
	
	@Test
	public void m3() {
		int a=10;
		int b=1;
		Assert.assertEquals(a,b,"It is Equal = ");
		System.out.println("Not Equal = ");
	}
	@Test
	public void m4() {
		String s="Hello";
		String s1="Hello";
		Assert.assertTrue(s.equalsIgnoreCase(s1), "fasle =");
		System.out.println("True= ");
	}
	
	@Test
	public void m5() {
		String s="hello";
		String s1="hell";
		Assert.assertFalse(s.equalsIgnoreCase(s1), "Assert contains");
		System.out.println("Assert not conatins");
	}
	@Test
	public void m6() {
		String s="hi";
		Assert.assertNull(s, "it is not null");
		System.out.println("It is null");
	}
	@Test
	public void m7() {
		String s=null;
		Assert.assertNull(s, "It is not null");
		System.out.println("It is null");
	}

}
