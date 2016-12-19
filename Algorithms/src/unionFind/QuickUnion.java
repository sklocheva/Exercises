package unionFind;

public class QuickUnion extends UnionFind {

	public QuickUnion(int length) {
		super(length);
	}

	/**
	 * checks if the index is the same as the value, if it's not it changes the
	 * index to this value and checks again, in order to find the root
	 * 
	 * @param a
	 *            : index
	 * @return : root connection
	 */
	private int root(int a) {

		while (a != id[a]) {
			// change the value (points to parent index) of the current index to
			// it's parent's value
			int parentIndex = id[a];
			id[a] = id[parentIndex];
			a = id[a];
		}
		return a;
	}

	@Override
	public boolean connected(int a, int b) {
		if (a < id.length && b < id.length) {

			return root(a) == root(b);
		}
		return false;
	}

	/**
	 * finds the roots of both indexes and makes the second one a parent root
	 */
	@Override
	public void unite(int a, int b) {
		int rootA = root(a);
		int rootB = root(b);

		if (rootA != rootB) {

			id[rootA] = rootB;
		}

	}

}
