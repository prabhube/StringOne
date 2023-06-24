package one.org;

public class Palaindromenumber {
 public static String palindromeone(int a) {
	 	int	temp=a;
		int rev=0;
		while( a>0)
		{
			int b=a/10;  // 12345/10=1234    //1234/10= 123   
			
			int c=a%10;//12345%10= 5     // 1234% =4
		
			rev= c+(rev*10);
			a=b;
		}
		if(temp==rev) {
		return "polindrome number :"+ temp;
		} else {
			return "non polindrome number :"+ temp;
		}
	}
 	public static void main(String[] args) {
		String palindromeone = palindromeone(123);
		System.out.println(palindromeone);
	}
 

}
