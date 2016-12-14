package com.apple;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Sarfraz Bhairakdar
 *
 */
public class StringReplaceTest {

	// Test for character removal without api
	@Test(dataProvider = "testdata")
	public void testRemoveCharacter(String myStr, char charToRemove,
			String expcted) throws Exception {
		Assert.assertEquals(StringReplace.removeCharacter(myStr, charToRemove),
				expcted);
	}

	// Test for character removal with api
	@Test(dataProvider = "testdata")
	public void testRemoveCharacterUsingApi(String myStr, char charToRemove,
			String output) throws Exception {
		Assert.assertEquals(
				StringReplace.removeCharacterUsingStringApi(myStr, charToRemove),
				output);
	}

	
	@DataProvider(name = "testdata")
	public Object[][] stringReplaceDataProvider() {
		return new Object[][] { { null, 'a', null }, 
								{ "", 'z', "" },
								{ "Testing", 'T', "esting" },
								{ "Testing", 'g', "Testin" },
								{ "Testing", 'i', "Testng" }, 
								{ "$Testing$", '$', "Testing" },
								{ "TTTT", 'T', "" } };
	}
}
