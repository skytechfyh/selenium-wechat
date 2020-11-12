package com.hogwarts.web.page;

import com.hogwarts.web.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author fyh
 * @date 2020/11/11
 * @desc
 */
public class HomePage extends BasePage {

	@FindBy(css = "[node-type='addmember']")
	private WebElement addMemberButton;

	@FindBy(id = "menu_contacts")
	private WebElement contactMenu;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * 单击添加成员按钮，进入通讯录管理页面
	 */
	public void clickButton(){
		click(addMemberButton, true);
	}
}
