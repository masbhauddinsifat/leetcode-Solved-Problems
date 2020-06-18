package leetcodeProblemTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import leetcodeProblem.SearchAndInsertPosition;

class SearchAndInsertPositon {

	@Test
	@DisplayName("First Test case")
	void firstTest() {
		assertEquals(2, SearchAndInsertPosition.searchInsert(new int[] {1,3,5,6}, 5));
	}
	
	@Test
	@DisplayName("Second Test case")
	void SecondTest() {
		assertEquals(1, SearchAndInsertPosition.searchInsert(new int[] {1,3,5,6}, 2));
	}
	
	@Test
	@DisplayName("Third Test case")
	void ThirdTest() {
		assertEquals(4, SearchAndInsertPosition.searchInsert(new int[] {1,3,5,6}, 7));
	}
	
	@Test
	@DisplayName("Fourth Test case")
	void FourthTest() {
		assertEquals(0, SearchAndInsertPosition.searchInsert(new int[] {1,3,5,6}, 0));
	}

}
