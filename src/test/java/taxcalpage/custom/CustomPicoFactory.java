package taxcalpage.custom;

import taxcalpage.controller.SauceLabController;
import taxcalpage.helpers.ReadConfigHelper;
import taxcalpage.pages.TaxCalculatorPageImp;
import taxcalpage.controller.ChromeController;
import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;

public class CustomPicoFactory implements ObjectFactory {


    private PicoFactory delegate = new PicoFactory();
    private ReadConfigHelper readConfigHelper = new ReadConfigHelper();

    // private ReadConfigHelper readConfigHelper = new ReadConfigHelper();
    public CustomPicoFactory() {
        setDriver();
        addClass(TaxCalculatorPageImp.class);
    }


    @Override
    public void start() {
        delegate.start();
    }

    @Override
    public void stop() {
        delegate.stop();
    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return delegate.addClass(aClass);
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return delegate.getInstance(aClass);
    }

    private void setDriver() {

        boolean runOnLocal = Boolean.parseBoolean(readConfigHelper.readRunOnLocal());
        if (runOnLocal) {

            addClass(ChromeController.class);
            return;
        }

        addClass(SauceLabController.class);
    }
}
