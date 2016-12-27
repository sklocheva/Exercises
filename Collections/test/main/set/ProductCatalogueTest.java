package main.set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//statically imported a fixture
import static main.ProductFixtures.*;

import java.util.Arrays;

public class ProductCatalogueTest {
	ProductCatalogue catalogue;
	
	@Before
	public void before() {
		catalogue = new ProductCatalogue();		
	}
	
	@Test
	public void holdsUnique() {

		catalogue.isSuppliedBy(bobs);
		catalogue.isSuppliedBy(kates);
		
		Assert.assertEquals(true, catalogue.contains(Arrays.asList(door, panel)));

	}

}
