package Ex;

public class TakeCoffee {

	public static void main(String[] args) {
		Person kim = new Person("kim", 10000);
		Person lee = new Person("lee", 15000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarCoffee(starCoffee, 4000);
		kim.buyBeanCoffee(beanCoffee, 4500);

	}

}
