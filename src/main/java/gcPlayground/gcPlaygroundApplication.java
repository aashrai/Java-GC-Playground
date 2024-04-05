package gcPlayground;

import gcPlayground.resources.LargeObjectCreator;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class gcPlaygroundApplication extends Application<gcPlaygroundConfiguration> {

    public static void main(final String[] args) throws Exception {
        new gcPlaygroundApplication().run(args);
    }

    @Override
    public String getName() {
        return "gcPlayground";
    }

    @Override
    public void initialize(final Bootstrap<gcPlaygroundConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final gcPlaygroundConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new LargeObjectCreator());
    }

}
