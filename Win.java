package javapack;
import java.util.*;
public class Win {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Player1: ");
		String p1=sc.nextLine();
		p1=p1.toUpperCase();
		System.out.print("Player2: ");
		String p2=sc.nextLine();
		p2=p2.toUpperCase();
		Player p=new Player();
		p.getMap();
		int score1=p.getScore(p1);
		int score2=p.getScore(p2);
		if(score1>score2)
			System.out.println("Player 1 wins!");
		else if(score2>score1)
			System.out.println("Player 2 wins!");
		else if(score1==score2)
			System.out.println("Tie!");
	}

}
class Player
{
	HashMap<Character,Integer> h=new HashMap<>();
	public void getMap()
	{
		h.put('A',1);h.put('B',3);h.put('C',3);h.put('D',2);
		h.put('E',1);h.put('F',4);h.put('G',2);h.put('H',4);
		h.put('I',1);h.put('J',8);h.put('K',5);h.put('L',1);
		h.put('M',3);h.put('N',1);h.put('O',1);h.put('P',3);
		h.put('Q',10);h.put('R',1);h.put('S',1);h.put('T',1);
		h.put('U',1);h.put('V',4);h.put('W',4);h.put('X',8);
		h.put('Y',4);h.put('Z',10);
	}
	public int getScore(String s)
	{
		int score=0;
		for(int i=0;i<s.length();i++)
		{
	
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			score+=h.get(s.charAt(i));
			else
				continue;
		}
		return score;
		
	}
	
	
}
	
	


