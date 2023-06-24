package one.org;

public class CountOfDigit {
public static int countnumbers(int a) {
	int count=0;
	while(a>0)
	{
	int b=a/10;
	int c=a%10;
	a=b;
	count++;
}
return count;
}
public static void main(String[] args) {
	int countnumbers = countnumbers(1234567);
	System.out.println(countnumbers);
}
}