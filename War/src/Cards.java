
public class Cards
	{
	public String cardName;
	public int cardValue;
	
	public Cards(String cn, int cv)
		{
		cardName = cn;
		cardValue = cv;
		}
	
	public String getCardName()
		{
		return cardName;
		}
	
	
	public int getCardValue()
		{
		return cardValue;
		}
	public String toString()
		{
		return "Player One " + getCardName();
		}
	}
