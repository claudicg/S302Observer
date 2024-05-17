package n1exercici1.main;

import n1exercici1.beans.StockAgency;
import n1exercici1.observer.ObservableStockAgency;


public class ObserverMain {
	

	public static void main(String[] args) {
		
		ObservableStockAgency observable = new ObservableStockAgency();
		
		StockAgency observer1 = new StockAgency("Agencia 1", 1400);
		observable.addObserver(observer1);
		
	    StockAgency observer2 = new StockAgency("Agencia 2", 1100);
	    observable.addObserver(observer2);
		
		observable.setValue(1300);
		
	}
}
