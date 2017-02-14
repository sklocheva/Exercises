package main.structural.composite.goldgame;

import java.util.List;

/**
 * ***Composite***
 * 
 * @author Sophie
 *
 */
public class Group implements Party {

	private int groupGold;
	protected List<Party> groupList;

	@Override
	public int getGold() {
		return this.groupGold;
	}

	@Override
	public void setGold(int gold) {
		groupGold = gold;
		int leftover = gold % groupList.size();
		int split = gold / groupList.size();

		for (Party x : groupList) {
			x.setGold(split + leftover);
			leftover = 0;
		}
	}

	@Override
	public void Stats() {
		for (Party x : groupList) {
			x.Stats();
		}
	}

}
