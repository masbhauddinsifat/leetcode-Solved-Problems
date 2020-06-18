package leetcodeProblemTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import leetcodeProblem.ProductAndSum;

class ProductAndSumTest {

	@Test
	@DisplayName("First Test")
	void firstTest() {
		assertEquals(15, ProductAndSum.subtractProductAndSum(234));
	}
	
	@Test
	@DisplayName("Second Test")
	void secondTest() {
		assertEquals(21, ProductAndSum.subtractProductAndSum(4421));
	}

}
