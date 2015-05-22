import java.util.Scanner;


public class Cards {

//	private int cardsArr[] = new int[20];
	private String[] cardsArr = { "a", "a", "b", "b", 
			"c", "c", "d", "d", "e", "e", "f", "f", 
			"g", "g", "h", "h", "i", "i", "j", "j" };
	
	
	public Cards()
	{
		// constructor
		for (int i=0; i< (cardsArr.length); i++)
		{
		//	cardsArr[i] = i;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner user_input = new Scanner( System.in );
		
		Cards myCards = new Cards();
		
		System.out.println("Hello World");
		
		myCards.shuffleCards();
		
		myCards.printCards();
		
		System.out.print("Select first card: ");		
		int cardA = Integer.parseInt(user_input.next());
		
		System.out.print("Select Second card: ");		
		int cardB = Integer.parseInt(user_input.next());

		System.out.println("CardA = " + cardA);
		System.out.println("CardB = " + cardB);
		
		boolean match = myCards.foundMatch(cardA, cardB);
		
		if (match == true)
		{
			System.out.println("Found match!");
		}
		else
		{		
			System.out.println("No match!");
		}
		
		
	}
	
	public boolean foundMatch(int cardA, int cardB)
	{
		return (cardsArr[cardA] == cardsArr[cardB]);
	}
	
	public void shuffleCards()
	{
		// Create a loop that swaps cards.
		
		// swap temp = A, A = B, B = temp
		
		
		System.out.println("I'm shuffling...");
	}
	
	public void printCards()
	{
		for (int i=0; i< (cardsArr.length); i++)
		{
			System.out.println(i + " : " + cardsArr[i]);
		}
	}
}
