package n1exercici1.observer;

import java.util.ArrayList;
import java.util.List;

import n1exercici1.interfaces.IAgency;

public class ObservableStockAgency {

	private List<IAgency> agencies;
    private int value;
    

    public ObservableStockAgency() {
		super();
		this.agencies = new ArrayList<>();
	}

	public void addObserver(IAgency agency) {
        this.agencies.add(agency);
    }

    public void removeObserver(IAgency agency) {
        this.agencies.remove(agency);
    }

    public void notifyObservers() {
        
        agencies.forEach((agency)-> agency.update(this.value));
    }

    public void setValue(int newValue) {
        this.value = newValue;
        notifyObservers();
    }
}
