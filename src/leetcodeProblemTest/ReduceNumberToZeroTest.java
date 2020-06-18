package leetcodeProblemTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import leetcodeProblem.ReduceNumberToZero;

class ReduceNumberToZeroTest {

	@Test
	@DisplayName("First test")
	void test() {
		assertEquals(6,ReduceNumberToZero.numberOfSteps(14));
	}
	
	@Test
	@DisplayName("second test")
	void second() {
		assertEquals(4,ReduceNumberToZero.numberOfSteps(8));
	}

}
