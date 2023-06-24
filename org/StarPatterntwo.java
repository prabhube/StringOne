package one.org;

public class StarPatterntwo {
	public static void main(String[] args) {
		for(int i=0;i<7;i++)
		{
			for(int j=0; j<=i;j++)
			{
				if(i%2==0)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
