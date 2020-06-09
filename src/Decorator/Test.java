package Decorator;

public class Test {

	  public static void main(String[] args) {

	    PersonComponent personComponent = new PersonComponent();

	    FineryDecorator tShirt = new TShirt();
	    FineryDecorator bigTrouser = new BigTrouser();

	    tShirt.setPersonComponent(personComponent);
	    bigTrouser.setPersonComponent(tShirt);
	    bigTrouser.show();

	  }
	}