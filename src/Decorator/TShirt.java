package Decorator;

public class TShirt extends FineryDecorator{

	  @Override
	  public void show() {

	    personComponent.show();
	    System.out.println("TShirt...");
	  }
	}