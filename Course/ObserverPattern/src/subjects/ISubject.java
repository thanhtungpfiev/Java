package subjects;

import observers.IObserver;

/**
 * tungdt9
 * Aug 1, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public interface ISubject {
	public void registerObserver(IObserver o);
	public void removeObserver(IObserver o);
	public void notifyObservers();
}
