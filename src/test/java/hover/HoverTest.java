package hover;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTest extends BaseTest {
    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(caption.getTitle(),"name: user1","caption title incorrect.");
        assertEquals(caption.getLinkText(), "View profile", "caption link text incorrect.");
        assertTrue(caption.getLink().endsWith("/users/1"), "link is incorrect");


    }

}
