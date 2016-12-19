package unionFindTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import unionFind.QuickUnion;
import unionFind.UnionFind;

public class QuickUnionTest {

	public UnionFind union;
	public int length = 10;
	public boolean result;

	@Before
	public void before() {
		union = new QuickUnion(length);
		union.unite(3, 4);
		union.unite(3, 8);
		union.unite(6, 5);
		union.unite(9, 4);
		union.unite(2, 1);
		union.unite(7, 2);
		union.unite(6, 1);

	}

	@Test
	public void testConnectedTrue() {
		result = union.connected(8, 9);
		Assert.assertEquals(true, result);
	}

	@Test
	public void testConnectedTrue2() {
		result = union.connected(5, 1);
		Assert.assertEquals(true, result);
	}

	@Test
	public void testConnectedFalse() {
		result = union.connected(2, 8);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testConnectedFalseNumber() {
		result = union.connected(2, 10);
		Assert.assertEquals(false, result);
	}

}
