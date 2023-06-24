package one.org;

public class ProgramTwo {
	public static void main(String[] args) {
		String s="Hai Prabhu";
		String[] split=s.split(" ");
		for(int i=split.length-1; i>=0;i--)
		{
			System.out.print(split[i]);
		}
	}
}
