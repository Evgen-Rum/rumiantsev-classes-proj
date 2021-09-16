package datastructures;

import java.util.Arrays;

public class DynArrImpl implements MyCollection {

	private Object[] dynArray = new Object[10];
	private int numOfElements;

	@Override
	public int size() {
		return numOfElements;
	}

	@Override
	public void add(Object obj) {
		if (numOfElements >= dynArray.length) {
			dynArray = Arrays.copyOf(dynArray, (int) (dynArray.length * 1.5));
		}
		dynArray[numOfElements++] = obj;
	}

	@Override
	public boolean remove(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

}
