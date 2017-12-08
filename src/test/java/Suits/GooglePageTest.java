package Suits;

import content.steps.GooglePageSteps;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class GooglePageTest extends BaseTest {

    @Autowired
    private GooglePageSteps googlePageSteps;

    @Test
    public void googleSearchText() {
        String text = "Selenium";
        googlePageSteps
                .searchFor(text)
                .checkThatTittleIs(text);
    }

    @Test
    public void searchWindows() {
        String text = "Windows";
        googlePageSteps
                .searchFor(text)
                .checkThatTittleIs(text);
    }

    @Test
    public void searchMoscow() {
        String text = "Moscow";
        googlePageSteps
                .searchFor(text)
                .checkThatTittleIs(text);
    }

}
