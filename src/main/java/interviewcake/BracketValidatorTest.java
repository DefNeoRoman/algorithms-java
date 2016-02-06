package interviewcake;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BracketValidatorTest {

	BracketValidator bracketValidator = new BracketValidator();;
	
	@Test
	public void test1() {
		String input = "{ [ ] ( ) }";
		assertTrue(bracketValidator.validate(input));
		assertTrue(bracketValidator.validate2(input));
	}
	
	@Test
	public void test2() {
		String input = "{ [ ( ] ) }";
		assertFalse(bracketValidator.validate(input));
		assertFalse(bracketValidator.validate2(input));
	}
	
	@Test
	public void test3() {
		String input = "{ [ }";
		assertFalse(bracketValidator.validate(input));
		assertFalse(bracketValidator.validate2(input));
	}
	
	@Test
	public void test4() {
		String input = "[{(2+3)(5-2)}{()}{}][()][]";
		assertTrue(bracketValidator.validate(input));
		assertTrue(bracketValidator.validate2(input));
	}
	
	@Test
	public void test5() {
		String input = "[{(";
		assertFalse(bracketValidator.validate(input));
		assertFalse(bracketValidator.validate2(input));
	}
	
	@Test
	public void test6() {
		String input = ")}]";
		assertFalse(bracketValidator.validate(input));
		assertFalse(bracketValidator.validate2(input));
	}


}
