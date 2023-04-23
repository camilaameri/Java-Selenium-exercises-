package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTest {

    @Test
    public void testSelectOption(){
        var dropTownPage = homePage.clickDropDown();
        String option = "Option 1";

        dropTownPage.selectFromDropDown(option);
        var selectedOption = dropTownPage.getSelectOption();
        assertEquals(selectedOption.size(), 1 , "incorrect number of selection");
        assertTrue(selectedOption.contains(option), "Option not selected");
    }
}
