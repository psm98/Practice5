package Ex;

public class CardCompanyTest {

	public static void main(String[] args) {
			CardCompany card = CardCompany.getInstance();
			Card acard = card.createCard();
			Card bcard = card.createCard();
			System.out.println(acard.getCarNum());
			System.out.println(bcard.getCarNum());

		}

	}
