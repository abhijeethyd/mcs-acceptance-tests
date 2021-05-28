package mcs.pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class mcsAreYouSureModal extends PageObject {

    public static Target YES_BUTTON = Target.the("Login button")
            .locatedBy("//button[@class='confirm']");

}
