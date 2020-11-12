package com.hogwarts.web;

import com.hogwarts.web.core.DriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc
 */
public class BaseTest {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeAll
	public static void init(){
		driver = DriverFactory.getDriver().getBrowser("chrome");
	}

	@AfterAll
	public static void tearDown(){
		driver.quit();
	}
}