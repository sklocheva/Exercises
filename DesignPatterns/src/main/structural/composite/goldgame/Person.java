package main.structural.composite.goldgame;

/**
 * 
 * ***Leaf***
 * 
 * @author Sophie
 *
 */
public class Person implements Party {

	private String name;
	private int gold;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getGold() {
		return gold;
	}

	@Override
	public void setGold(int gold) {
		this.gold = gold;
	}

	@Override
	public void Stats() {
		System.out.printf("%s has %d gold points.\r\n", name, gold);
	}

}
