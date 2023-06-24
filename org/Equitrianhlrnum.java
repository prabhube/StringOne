package one.org;

public class Equitrianhlrnum {
	public static void main(String[] args) {
		
		for(int i=1;i<5;i++) {
			for(int j=5; j>i;j--) {
				System.out.print(" ");
			}
			int a=5;
			for(int k=0; k<(i*2)-1;k++)
			{
				System.out.print(a+" ");
				a--;
			}
			System.out.println("");
		}
		
	}
}
