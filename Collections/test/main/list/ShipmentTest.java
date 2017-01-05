package main.list;

//statically imported a fixture
import static main.ProductFixtures.door;
import static main.ProductFixtures.panel;
import static main.ProductFixtures.window;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.HouseholdItem;
import main.Furniture;

public class ShipmentTest {
	
	// Shipment takes only items from a SPECIFIC class of
	// the interface ShipableItems.
	private Shipment<Furniture> shipment;
	private Shipment<HouseholdItem> items;

	@Before
	public void beforeTest() {

		shipment = new Shipment<Furniture>();
		items = new Shipment<HouseholdItem>();
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
		Assert.assertTrue(shipment.getHeavyList().contains(door));
		;
		Assert.assertTrue(shipment.getLightList().contains(window));

	}
}
