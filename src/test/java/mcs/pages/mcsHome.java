package mcs.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://lowcodeazure.azurewebsites.net")
public class mcsHome extends PageObject {

    public static Target LOGIN_LINK = Target.the("Login link")
            .locatedBy("css:a[href='/Account/Login']");
}
