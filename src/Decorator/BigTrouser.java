package Decorator;

public class BigTrouser extends FineryDecorator {

	  @Override
	  public void show() {

	    personComponent.show();
	    System.out.println("bigtrouser...");
	  }
	}
