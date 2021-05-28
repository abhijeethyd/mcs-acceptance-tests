package mcs.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import mcs.navigation.NavigateTo;
import mcs.pages.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;

import java.util.List;

public class CreateAWebAppStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} is logged in on mcs {string} with a default {string}")
    public void loggedInWithAUser(Actor actor , String dashboard ,String user) {
        actor.wasAbleTo(NavigateTo.mcsHome());
        actor.attemptsTo(Click.on(mcsHome.LOGIN_LINK));
        actor.attemptsTo(Enter.theValue(user).into(mcsLogin.USERNAME_EMAIL_FIELD));
        actor.attemptsTo(Enter.theValue("123zxc").into(mcsLogin.PASSWORD_FIELD));
        actor.attemptsTo(Click.on(mcsLogin.LOGIN_BUTTON));
        actor.attemptsTo(Ensure.that(mcsDashboard.DASHBOARD_TEXT).hasText(dashboard));
    }

    @When("{actor} creates a web app with WebAppName as {string} and Plan as {string}")
    public void heCreatesAWebAppWithConfigurationAsBelow(Actor actor, String webAppName , String plan ) {

        actor.attemptsTo(Click.on(mcsDashboard.CREATE_A_WEBAPP_LINK));
        actor.attemptsTo(Enter.theValue(webAppName).into(mcsCreateAWebAppModal.WEB_APP_NAME));
        actor.attemptsTo(Enter.theValue(plan).into(mcsCreateAWebAppModal.SERVICE_PLAN));
        actor.attemptsTo(Click.on(mcsCreateAWebAppModal.SAVE_BUTTON));
        actor.attemptsTo(Click.on(mcsAreYouSureModal.YES_BUTTON));
        actor.attemptsTo(WaitUntil.angularRequestsHaveFinished());

    }
}
