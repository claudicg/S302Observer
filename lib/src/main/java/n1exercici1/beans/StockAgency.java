package n1exercici1.beans;

import n1exercici1.interfaces.IAgency;
import n1exercici1.utils.Constants;

public class StockAgency implements IAgency {

	private String name;
	private int value;
	
	public StockAgency(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public void update(Object object) {
		
		this.setValue((int)object);
		System.out.println(this.name + Constants.Messages.CHANGED + this.value);
		
	}
}
