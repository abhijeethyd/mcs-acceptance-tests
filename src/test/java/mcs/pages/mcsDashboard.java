package mcs.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class mcsDashboard extends PageObject {

    public static Target DASHBOARD_TEXT = Target.the("Dashboard left hand panel heading")
            .locatedBy("//span[text()='Dashboard']");


    public static Target CREATE_A_WEBAPP_LINK = Target.the("Create a WebApp link")
            .locatedBy("//h5[text()='Create a WebApp']");


}
