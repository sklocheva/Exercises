package main.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryGapTest {

	BinaryGap gap;

	@Before
	public void before() {
		gap = new BinaryGap();
	}

	@Test
	public void testNoGap() {
		assertEquals(0, gap.solution(15));
	}

	@Test
	public void testFiveGaps() {
		assertEquals(5, gap.solution(1041));
	}

	@Test
	public void testZeroEnding() {
		assertEquals(2, gap.solution(1152));
	}

	@Test
	public void testLongSequence() {
		assertEquals(20, gap.solution(8388613));
	}
}
