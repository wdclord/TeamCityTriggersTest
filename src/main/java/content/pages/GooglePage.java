package content.pages;

import framework.page.AbstractPage;
import framework.page.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@Page
public class GooglePage extends AbstractPage {

    @Autowired
    private WebDriver driver;

    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(css = "input[type=submit]")
    private WebElement submitButton;

    public GooglePage open() {
        driver.get("https://www.google.ru");
        return this;
    }

    public GooglePage enterText(String text) {
        searchField.sendKeys(text);
        searchField.submit();
        return this;
    }

    public String getTitle(){
        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }
}
