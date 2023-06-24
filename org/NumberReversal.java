package one.org;

public class NumberReversal {
	public static int reverse(int a) {
		int rev=0;
		while( a>0)
		{
			int b=a/10;  // 12345/10=1234    //1234/10= 123   
			System.out.println("divide: "+b);
			int c=a%10;//12345%10= 5     // 1234% =4
			System.out.println("percentage:"+c);
	//			4+(5*10)=54
			rev= c+(rev*10);
			a=b;
		}
		return rev;
	}
	public static void main(String[] args) {
		int reverse = reverse(12345);
		System.out.println(reverse);
	}
}
