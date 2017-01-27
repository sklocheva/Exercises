package main.hackerrank.javadatastructures;

import java.util.Comparator;

/*
 * You are not responsible for printing any output to stdout. The locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element.

	Sample Input
	
	5
	amy 100
	david 100
	heraldo 50
	aakansha 75
	aleksa 150
	Sample Output
	
	aleksa 150
	amy 100
	david 100
	aakansha 75
	heraldo 50
 *
 */
public class JavaComparator {
	class Checker implements Comparator<Player> {
		public int compare(Player a, Player b) {
			if (a.score == b.score) {
				return (a.name).compareTo(b.name);
			} else {
				if (a.score < b.score) {
					return 1;
				} else {
					return -1;
				}
			}
		}
	}

}

class Player {
	public int score;
	public String name;
}
