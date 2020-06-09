package Decorator;

public abstract class FineryDecorator extends PersonComponent {


	  protected PersonComponent personComponent;

	  public void setPersonComponent(PersonComponent personComponent) {
	    this.personComponent = personComponent;
	  }

	  public abstract void show();
	}
