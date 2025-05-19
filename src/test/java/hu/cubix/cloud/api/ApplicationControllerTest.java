package hu.cubix.cloud.api;

import hu.cubix.cloud.model.CubixResponse;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

class ApplicationControllerTest {

    @Test
    void defaultMessage() {
        String defaultMessage = "This is a default message";
        ApplicationController controller = new ApplicationController(defaultMessage);
        CubixResponse response = controller.demoMessage("");
        assertThat(response.time(), is(notNullValue()));
        assertThat(response.message(), is(defaultMessage));
    }

    @Test
    void customMessage() {
        String message = "hello";
        ApplicationController controller = new ApplicationController("default");
        CubixResponse response = controller.demoMessage(message);
        assertThat(response.time(), is(notNullValue()));
        assertThat(response.message(), is(message));
    }
}