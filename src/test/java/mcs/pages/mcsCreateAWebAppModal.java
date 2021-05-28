package mcs.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class mcsCreateAWebAppModal extends PageObject {

    public static Target WEB_APP_NAME = Target.the("Web App Name input field")
            .locatedBy("//input[@ng-model='vm.UMCR.Name']");
    public static Target SERVICE_PLAN = Target.the("Web App Name input field")
            .locatedBy("//input[@id='appserviceplan']");
    public static Target SAVE_BUTTON = Target.the("Login button")
            .locatedBy("//span[text()='Save']");

}
