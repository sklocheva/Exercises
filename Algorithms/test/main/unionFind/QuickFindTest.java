package main.unionFind;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.unionFind.QuickFind;
import main.unionFind.UnionFind;

public class QuickFindTest {

	public UnionFind find;
	public int length = 10;
	public boolean result;

	@Before
	public void before() {
		find = new QuickFind(length);
		find.unite(3, 4);
		find.unite(3, 8);
		find.unite(6, 5);
		find.unite(9, 4);
		find.unite(2, 1);
		find.unite(7, 2);
		find.unite(6, 1);

	}

	@Test
	public void testConnectedTrue() {
		result = find.connected(8, 9);
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testConnectedTrue2() {
		result = find.connected(1, 5);
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testConnectedFalse() {
		result = find.connected(2, 8);
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testConnectedFalseNumber() {
		result = find.connected(2, 10);
		Assert.assertEquals(false, result);
	}

}
