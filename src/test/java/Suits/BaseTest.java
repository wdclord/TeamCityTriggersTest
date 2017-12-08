package Suits;

import framework.FrameworkConfiguration;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {FrameworkConfiguration.class})
public abstract class BaseTest {

    @Autowired
    private WebDriver driver;

    @Before
    public void setup() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
