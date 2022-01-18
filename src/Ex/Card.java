package Ex;

public class Card {
	private static int serialNum = 10000;
	private int cardNum;
	
	public Card() {
		serialNum++;
		cardNum = serialNum;
	}

	public int getCarNum() {
		return cardNum;
	}

	public void setCarNum(int carNum) {
		this.cardNum = carNum;
	}
}
