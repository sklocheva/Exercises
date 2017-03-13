package main.codility;

public class FrogJmp {
	public int solution(int X, int Y, int D) {
		int total = Y - X;
		if (total % D == 0) {
			return (Y - X) / D;
		} else {
			return ((Y - X) / D) + 1;
		}
	}
}
