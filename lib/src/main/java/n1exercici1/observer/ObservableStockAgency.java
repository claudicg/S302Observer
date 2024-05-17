package n1exercici1.observer;

import java.util.ArrayList;
import java.util.List;

import n1exercici1.interfaces.IAgency;
import n1exercici1.interfaces.IObservable;

public class ObservableStockAgency implements IObservable{

	private List<IAgency> agencies;
    private int value;
    

    public ObservableStockAgency() {
		super();
		this.agencies = new ArrayList<>();
	}

    @Override
	public void addObserver(IAgency agency) {
        this.agencies.add(agency);
    }

    @Override
    public void removeObserver(IAgency agency) {
        this.agencies.remove(agency);
    }

    @Override
    public void notifyObservers() {
        
        agencies.forEach((agency)-> agency.update(this.value));
    }

    public void setValue(int newValue) {
        this.value = newValue;
        notifyObservers();
    }
}
