package mcs.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import mcs.pages.mcsHome;

public class NavigateTo {

    public static Performable mcsHome() {
        return Task.where("{0} opens the MicroCloud services home page",
                Open.browserOn().the(mcsHome.class));
    }
}
