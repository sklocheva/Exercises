package main.set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//statically imported a fixture class
import static main.ProductFixtures.*;

import java.util.Arrays;

public class ProductCatalogueTest {
	ProductCatalogue catalogue;

	@Before
	public void before() {
		catalogue = new ProductCatalogue();
	}

	@Test
	public void holdsUniqueAndSame() {

		catalogue.isSuppliedBy(bobs);
		catalogue.isSuppliedBy(kates);

		Assert.assertEquals(true, catalogue.contains(Arrays.asList(door, panel)));
	}

	@Test
	public void testLightProducts() {

		catalogue.isSuppliedBy(bobs);
		catalogue.isSuppliedBy(kates);

		Assert.assertEquals(true, catalogue.getLightProducts().contains(window));
	}

	@Test
	public void testHeavyProducts() {

		catalogue.isSuppliedBy(bobs);
		catalogue.isSuppliedBy(kates);

		Assert.assertEquals(true, catalogue.getHeavyProducts().contains(panel));
	}

	// returns an empty Set, because it excludes the returned null from the
	// sublist
	@Test
	public void testNoLightProducts() {

		catalogue.isSuppliedBy(heavyProductSuppl);
		Assert.assertEquals(true, catalogue.getLightProducts().isEmpty());
	}

	// throws an exception, because it doesn't find any heavy products and
	// is inclusive of the returned null
	@Test(expected = NullPointerException.class)
	public void testNoHeavyProducts() {

		catalogue.isSuppliedBy(lightProductSuppl);
		catalogue.getHeavyProducts();
	}

}
