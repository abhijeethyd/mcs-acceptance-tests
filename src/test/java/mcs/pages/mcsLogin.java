package mcs.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class mcsLogin extends PageObject {
    public static Target PASSWORD_FIELD = Target.the("Password input box")
            .locatedBy("css:input[name=password]");
    public static Target USERNAME_EMAIL_FIELD = Target.the("Username or email input box")
            .locatedBy("css:input[name=usernameOrEmailAddress]");
    public static Target LOGIN_BUTTON = Target.the("Login button")
            .locatedBy("//button[text()='Log in']");
}
