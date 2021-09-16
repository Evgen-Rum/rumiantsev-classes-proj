package datastructures;

import java.util.Arrays;

public class DynArrImpl implements MyCollection {

	Object[] dynArray = new Object[1];
	int numOfElements;

	@Override
	public int size() {
		return dynArray.length;
	}

	@Override
	public boolean add(Object obj) {
		if (numOfElements < dynArray.length) {
			for (int i = 0; i < dynArray.length; i++) {
				if (dynArray[i] == null) {
					dynArray[i] = obj;
					numOfElements++;
				}
			}
		} else {
			dynArray = Arrays.copyOf(dynArray, dynArray.length * 2);
			dynArray[numOfElements] = obj;
			numOfElements++;
		}
		return true;
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
