package leetcodeProblemTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import leetcodeProblem.IpAddress;

class IpAddressTest {

	@Test
	@DisplayName("First Ip")
	void first() {
		assertEquals("1[.]1[.]1[.]1", IpAddress.defangIPaddr("1.1.1.1"));
	}
	
	
	@Test
	@DisplayName("Second Ip")
	void second() {
		assertEquals("172[.]16[.]50[.]4", IpAddress.defangIPaddr("172.16.50.4"));
	}

}
