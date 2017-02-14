package main.behavioral.iterator;

/**
 * Conrete Aggragator + Conrete Iterator
 * 
 * @author Sophie
 *
 */
/*
 * Conrete Aggragator
 */
public class NameRepository implements Container {

	String[] arr;

	public NameRepository(String[] arr) {
		this.arr = arr;
	}

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	/*
	 * Conrete Iterator
	 */
	private class NameIterator implements Iterator {

		int index = 0;

		@Override
		public boolean hasNext() {
			if (index < arr.length) {
				return true;
			}
			return false;
		}

		@Override
		public String next() {
			if (this.hasNext()) {
				return arr[index++];
			}
			return null;
		}

	}

}
