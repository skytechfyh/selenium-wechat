package com.hogwarts.web;

import com.hogwarts.web.core.DriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc  测试类的基类，初始化driver与关闭driver
 */
public class BaseTest {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}


	@BeforeAll
	public static void init(String browser){
		driver = DriverFactory.getDriver().getBrowser(browser);
	}

	@AfterAll
	public static void tearDown(){
		driver.quit();
	}
}
