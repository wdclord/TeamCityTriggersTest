package content.steps;

import content.pages.GooglePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.hamcrest.MatcherAssert.assertThat;

@Component
public class GooglePageSteps {

    @Autowired
    private GooglePage googlePage;

    public GooglePageSteps searchFor(String text) {
        googlePage
                .open()
                .enterText(text);
        return this;
    }

    public void checkThatTittleIs(String text){
        assertThat("Title is incorrect", googlePage.getTitle().startsWith(text));
    }

}
