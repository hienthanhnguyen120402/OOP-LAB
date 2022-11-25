package oop2;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.65f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Scifi","Geogre Lucas",57,24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		anOrder.show_cart();
		System.out.println("Total Cost is " + anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.show_cart();
		System.out.println("Total Cost is " + anOrder.totalCost());

	}

}
