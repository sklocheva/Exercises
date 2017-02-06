package main.pluralsight.list;

import static main.pluralsight.ProductFixtures.door;
import static main.pluralsight.ProductFixtures.panel;
import static main.pluralsight.ProductFixtures.window;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.pluralsight.HouseholdItem;
import main.pluralsight.Product;
import main.pluralsight.list.Shipment;

public class ShipmentTest {
	
	// Shipment takes only items from a SPECIFIC class of
	// the interface ShipableItems.
	private Shipment<Product> shipment;
	private Shipment<HouseholdItem> items;

	@Before
	public void beforeTest() {

		shipment = new Shipment<Product>();
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
