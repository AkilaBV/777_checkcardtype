package CheckcardType;

import org.testng.annotations.Test;

public class CheckcardTypeVORM {
	public String checkCardType(String s) {
		String out;
		String sub=s.substring(0,4);
		System.out.println(sub);
		int n=Integer.parseInt(sub);
		int sum=0,r=0;
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}System.out.println(sum);
if(sum==16) {
	out="visa";
	
}else
	out="master";
		
		return out;
	}
	
	@Test
	public void testVisa () {
		String num="4471 6578 4567 3456";
		System.out.println(checkCardType(num));
	}
	@Test
	public void testMaster () {
		String num="4475 6578 4567 3456";
		System.out.println(checkCardType(num));
	}

}
