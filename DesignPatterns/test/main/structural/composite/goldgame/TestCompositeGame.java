package main.structural.composite.goldgame;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * This class is used to illustrate the Game points example of the Composite Pattern.
 * 
 * @author Sophie
 *
 */
public class TestCompositeGame {

	Party joe;
	Party jake;
	Party emily;
	Party sophia;
	Party brian;
	
	Party oldBob;
	Party newBob;
	
	Party bobs;
	Party developers;
	Party parties;
	
	@Before
	public void brefore() {

		joe = new Person(){{ setName("Joe"); }};
		jake = new Person(){{ setName("jake"); }};
		emily = new Person(){{ setName("emily"); }};
		sophia = new Person(){{ setName("sophia"); }};
		brian = new Person(){{ setName("brian"); }};
		oldBob = new Person(){{ setName("oldBob"); }};
		newBob = new Person(){{ setName("newBob"); }};
		
		bobs = new Group(){{groupList = new ArrayList<Party>(){{
													add(oldBob);
													add(newBob);
										}};
		}};
							
		developers = new Group(){{groupList = new ArrayList<Party>(){{
													add(joe);
													add(jake);
													add(emily);
													add(bobs);
										}};
		}};
		parties = new Group(){{groupList = new ArrayList<Party>(){{
													add(sophia);
													add(brian);
													add(developers);
										}};
		}};
		
								
								
	}
	
	@Test
	public void test() {
		int goldForKill = 1023;
		parties.setGold(goldForKill);
		parties.Stats();
	}

}
