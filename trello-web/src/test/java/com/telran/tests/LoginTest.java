package com.telran.tests;

import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest() throws InterruptedException {
        clickOnLoginButton();
        fillUserForm("havokrenegade@gmail.com","havokrenegadE2");
        confirmLoginButton();
        pause(4000);

    }

}
