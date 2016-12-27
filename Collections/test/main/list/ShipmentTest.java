package main.list;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//statically imported a fixture
import static main.ProductFixtures.*;

public class ShipmentTest {
	
	private Shipment shipment;
	
	@Before
	public void beforeTest() {

		shipment = new Shipment();
	}

	@Test
	public void addItems() {
		shipment.add(door);
		shipment.add(window);

		Assert.assertEquals(true, shipment.contains(Arrays.asList(door, window)));
	}

	@Test
	public void replaceItems() {
		shipment.add(door);
		shipment.add(window);
		
		shipment.replace(door, panel);
		Assert.assertEquals(true, shipment.contains(Arrays.asList(panel, window)));
	}
	
	@Test
	public void testVanRequirements() {
		shipment.add(door);
		shipment.add(window);
		shipment.add(panel);

		shipment.prepare();
		Assert.assertTrue(shipment.getHeavyList().contains(door));;
		Assert.assertTrue(shipment.getLightList().contains(window));
		
	}
}
