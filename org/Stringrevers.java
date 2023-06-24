package one.org;

public class Stringrevers {

	public static void main(String[] args) {
		String a="prabhu raman";
		String s="";	
		String[] split = a.split(" ");
//		for (String word : split) {
//			String[] split2 = word.split("");
//			
//			for(int i=split2.length-1;i>=0;i--)
//			{
//				System.out.print(split2[i]);
//			}
//			System.out.print(" ");
//		}
		for(int i=0;i<=split.length-1;i++)
		{
			String string = split[i];
		
			String[] split2 = string.split("");
			for(int j=split2.length-1;j>=0;j--)
			{
				System.out.print(split2[j]);
			}
			System.out.print(" ");
			
			
		
		
		
		}	
	}
}
