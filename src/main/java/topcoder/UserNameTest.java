package topcoder;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserNameTest {
	
	@Test
	public void test1() {
		String[] existingNames = {"MasterOfDisaster", "DingBat", "Orpheus", "WolfMan", "MrKnowItAll"};
		String newName = "TygerTyger";
		String expected = "TygerTyger";
		String actual = UserName.newMember(existingNames, newName);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		String[] existingNames = {"MasterOfDisaster", "TygerTyger1", "DingBat", "Orpheus", "TygerTyger", "WolfMan", "MrKnowItAll"};
		String newName = "TygerTyger";
		String expected = "TygerTyger2";
		String actual = UserName.newMember(existingNames, newName);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test3() {
		String[] existingNames = {"TygerTyger2000", "TygerTyger1", "MasterDisaster", "DingBat", "Orpheus", "WolfMan", "MrKnowItAll"};
		String newName = "TygerTyger";
		String expected = "TygerTyger";
		String actual = UserName.newMember(existingNames, newName);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		String[] existingNames = {"grokster2", "BrownEyedBoy", "Yoop", "BlueEyedGirl", "grokster", "Elemental", "NightShade", "Grokster1"};
		String newName = "grokster";
		String expected = "grokster1";
		String actual = UserName.newMember(existingNames, newName);
		assertEquals(expected, actual);
	}

	@Test
	public void test5() {
		String[] existingNames = {"Bart4", "Bart5", "Bart6", "Bart7", "Bart8", "Bart9", "Bart10", "Lisa", "Marge", "Homer", "Bart", "Bart1", "Bart2", "Bart3", "Bart11", "Bart12"};
		String newName = "Bart";
		String expected = "Bart13";
		String actual = UserName.newMember(existingNames, newName);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testX() {
		String existingName = "milkboy713";
		String newName = "milkboy";
		String num = existingName.substring(newName.length());
		System.out.println(num);
	}
}
