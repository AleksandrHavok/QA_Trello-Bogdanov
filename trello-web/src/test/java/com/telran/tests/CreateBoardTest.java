package com.telran.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateBoardTest extends TestBase {
    @Test
    public void boardCreationTest() throws InterruptedException {
        clickOnLoginButton();
        fillUserForm("havokrenegade@gmail.com","havokrenegadE2");
        confirmLoginButton();
        pause(10000);

        clickOnPlusButtonOnHeader();
        selectCreateBoardFromDropDown();
        fillBoardCreationForm();
        confirmBoardCreation();
        clickOnHomeButtonOnHeader();


    }

    private void clickOnHomeButtonOnHeader() {
    }

    private void confirmBoardCreation() {
    }

    private void fillBoardCreationForm() {
    }

    private void selectCreateBoardFromDropDown() {
        click(By.xpath("data-test-id=\"header-create-board-button\""));
    }

    private void clickOnPlusButtonOnHeader() {
        click(By.cssSelector("[name=add]"));
    }
}
