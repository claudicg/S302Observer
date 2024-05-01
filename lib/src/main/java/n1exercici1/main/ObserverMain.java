package n1exercici1.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import n1exercici1.beans.StockAgency;
import n1exercici1.observer.ObservableStockAgency;


public class ObserverMain {
	
	private static Logger logger = LoggerFactory.getLogger(ObserverMain.class);

	public static void main(String[] args) {
		
		ObservableStockAgency observable = new ObservableStockAgency();
		
		StockAgency observer1 = new StockAgency("Agencia 1", 1000);
		observable.addObserver(observer1);
		
	    StockAgency observer2 = new StockAgency("Agencia 2", 1100);
	    observable.addObserver(observer2);
		
		int value = 1200;
		for(int i = 0; i < 3; i++) {
			logger.debug("ObserverMain :: main :: changing value to " + value);
			observable.setValue(value);
			value = value + 100;
		}
	}
}
