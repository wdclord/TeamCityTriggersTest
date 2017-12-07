package Suits;

import content.steps.GooglePageSteps;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


class GooglePageTest extends BaseTest {

    @Autowired
    private GooglePageSteps googlePageSteps;

    @Test
    void googleSearchText() {
        String text = "Selenium";
        googlePageSteps
                .searchFor(text)
                .checkThatTittleIs(text);
    }

}
