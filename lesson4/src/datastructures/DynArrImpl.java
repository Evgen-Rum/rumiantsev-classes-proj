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
		boolean isDeleted = false;

		for (int i = 0; i < numOfElements; i++) {
			if (isDeleted) {
				dynArray[i - 1] = dynArray[i];
			} else if (dynArray[i].equals(obj)) {
				dynArray[i] = null;
				numOfElements--;
				isDeleted = true;
			}
		}
		if (isDeleted) {
			dynArray[numOfElements] = null;
		}
		return isDeleted;
	}

	@Override
	public boolean contains(Object obj) {
		for (int i = 0; i < numOfElements; i++) {
			if (dynArray[i].equals(obj)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Object get() {
		if (numOfElements == 0) {
			return null;
		}
		return dynArray[numOfElements - 1];
	}

	@Override
	public Object[] toArray() {
		return Arrays.copyOf(dynArray, numOfElements);
	}

}
