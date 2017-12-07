package framework;

import framework.page.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"content"},
        includeFilters = @ComponentScan.Filter(Page.class),
        lazyInit = true)
public class FrameworkConfiguration {

    @Bean
    public InitPageObjectPostProcessor initPageObjectPostProcessor() {
        return new InitPageObjectPostProcessor();
    }

    @Bean
    public WebDriver webDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        return new ChromeDriver();
    }
}
