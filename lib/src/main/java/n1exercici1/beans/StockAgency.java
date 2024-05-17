package n1exercici1.beans;

import n1exercici1.interfaces.IAgency;
import n1exercici1.utils.Constants;

public class StockAgency implements IAgency {

	private String name;
	private int newValue;
	private int currentValue;
	
	public StockAgency() {
		super();
	}
	
	public StockAgency(String name, int currentValue) {
		super();
		this.name = name;
		this.currentValue = currentValue;
		this.newValue = currentValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNewValue() {
		return newValue;
	}

	public void setNewValue(int newValue) {
		this.newValue = newValue;
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	@Override
	public void update(Object object) {
		
		this.currentValue = this.newValue;
		this.setNewValue((int)object);
		
		String message = "";
		
		if(this.currentValue > this.newValue) {
			message = this.name + Constants.Messages.CHANGED + this.newValue 
					+ Constants.Messages.DOWN;
		}else if(currentValue < this.newValue) {
			message = this.name + Constants.Messages.CHANGED + this.newValue 
					+ Constants.Messages.UP;
		}else {
			message = this.name + Constants.Messages.CHANGED + this.newValue 
					+ Constants.Messages.SAME;
		}
		System.out.println(message);
			
	}
}
