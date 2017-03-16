package main.codewars;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleEncryption1Test {

	@Test
	public void testEncrypt() {
		// assertEquals("expected", "actual");
		assertEquals("This is a test!", SimpleEncryption1.encrypt("This is a test!", 0));
		assertEquals("hsi  etTi sats!", SimpleEncryption1.encrypt("This is a test!", 1));
		assertEquals("s eT ashi tist!", SimpleEncryption1.encrypt("This is a test!", 2));
		assertEquals(" Tah itse sits!", SimpleEncryption1.encrypt("This is a test!", 3));
		assertEquals("This is a test!", SimpleEncryption1.encrypt("This is a test!", 4));
		assertEquals("This is a test!", SimpleEncryption1.encrypt("This is a test!", -1));
		assertEquals("hskt svr neetn!Ti aai eyitrsig", SimpleEncryption1.encrypt("This kata is very interesting!", 1));
	}

	@Test
	public void testDecrypt() {
		// assertEquals("expected", "actual");
		assertEquals("This is a test!", SimpleEncryption1.decrypt("This is a test!", 0));
		assertEquals("This is a test!", SimpleEncryption1.decrypt("hsi  etTi sats!", 1));
		assertEquals("This is a test!", SimpleEncryption1.decrypt("s eT ashi tist!", 2));
		assertEquals("This is a test!", SimpleEncryption1.decrypt(" Tah itse sits!", 3));
		assertEquals("This is a test!", SimpleEncryption1.decrypt("This is a test!", 4));
		assertEquals("This is a test!", SimpleEncryption1.decrypt("This is a test!", -1));
		assertEquals("This kata is very interesting!", SimpleEncryption1.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
	}

	@Test
	public void testNullOrEmpty() {
		// assertEquals("expected", "actual");
		assertEquals("", SimpleEncryption1.encrypt("", 0));
		assertEquals("", SimpleEncryption1.decrypt("", 0));
		assertEquals(null, SimpleEncryption1.encrypt(null, 0));
		assertEquals(null, SimpleEncryption1.decrypt(null, 0));
	}

}