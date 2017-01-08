package main.recursion;

import java.io.File;

public class DiskUsage {

	public long diskUsage(File root) {
		long total = root.length();

		if (root.isDirectory()) {
			for (String childname : root.list()) {
				File child = new File(root, childname);
				total = total + diskUsage(child);
			}
		}
		return total;

	}
}
