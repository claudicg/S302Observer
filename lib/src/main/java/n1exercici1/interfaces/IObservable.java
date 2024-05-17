package n1exercici1.interfaces;

public interface IObservable {

	void addObserver(IAgency agency);
	void removeObserver(IAgency agency);
	void notifyObservers();
}
