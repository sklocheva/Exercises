package unionFind;

public class QuickFind extends UnionFind {

	public QuickFind(int length) {
		super(length);
	}

	@Override
	public boolean connected(int a, int b) {
		if (a < id.length && b < id.length) {
			return id[a] == id[b];
		}
		return false;
	}

	@Override
	public void unite(int a, int b) {
		if (id[a] != id[b]) {
			int idA = id[a];
			int idB = id[b];

			for (int i = 0; i < id.length; i++) {
				if (idA == id[i]) {
					id[i] = idB;
				}
			}
		}
	}

}
