package main.recursion;


import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.recursion.DiskUsage;

public class DiskUsageTest {

	DiskUsage usage;
	File file;
	long total;
	
	@Before
	public void before() {
		usage = new DiskUsage();
		String filename = new File(".").getAbsolutePath();
		file = new File(filename);
	}
	@Test
	public void test() {
		total = usage.diskUsage(file);
		Assert.assertEquals(100l, total);
	}

}
