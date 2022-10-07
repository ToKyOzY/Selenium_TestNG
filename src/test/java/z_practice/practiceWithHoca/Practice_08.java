package z_practice.practiceWithHoca;

import org.testng.annotations.Test;
import pages.HerokuPage;
import utilities.Driver;

public class Practice_08 {
    //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    //Click all the buttons and verify they are all clicked

    HerokuPage herokuPage;

    @Test
    public void test01() {

        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        //Click all the buttons and verify they are all clicked
        herokuPage=new HerokuPage();
        //kodlarımız yazarken clean code kapsamında daha sade code yazbilmek amacı ile her test methodu içerisinde
        //ayrı bir object create etmektense bu objecti class seviyesinde instance olarak create edip test
        // methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir.

        herokuPage.onBlur.click();
        herokuPage.onMouseOver.click();
        herokuPage.onClick.click();
        herokuPage.onContextMenu.click();
        herokuPage.onFocus.click();
        herokuPage.onDoubleClick.click();
        herokuPage.onKeyDown.click();
        herokuPage.onKeyPress.click();
        herokuPage.onKeyUp.click();
        herokuPage.onMouseLeave.click();
        herokuPage.onMouseDown.click();


    }
}
