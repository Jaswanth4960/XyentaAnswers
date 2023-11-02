package javapack;
import java.util.Scanner;
public class Pat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Height : ");
		int n=sc.nextInt();
		System.out.print("Enter alignment : ");
		String s=sc.next();
		if(s.equalsIgnoreCase("left"))
		{
			LeftAlignPattern l=new LeftAlignPattern();
		l.Hashpattern(n);
		}
		else if(s.equalsIgnoreCase("right"))
		{
			RightAlignPattern r=new RightAlignPattern();
			r.Hashpattern(n);
		}
		else
		{
			System.out.println("Please Enter Correct Alignment");
		}
	}

}
class LeftAlignPattern{
public void Hashpattern(int rows)
{
	for(int i=0;i<rows;i++) {
		for(int j=0;j<=i;j++)
		{
			System.out.print("#");
		}
		System.out.println();
	}
		
}
}
class RightAlignPattern extends LeftAlignPattern
{
	public void Hashpattern(int rows)
	{
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++)
			{
				if(j<rows-(i+1))
				System.out.print(" ");
				else
				System.out.print("#");
			}
			System.out.println();
		}
		
	}
}
