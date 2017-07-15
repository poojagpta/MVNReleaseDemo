package com.demo;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.demo.resources.GreetingResource;
import com.demo.health.AppHealthCheck;

public class PoojaApplication extends Application<PoojaConfiguration> {

    public static void main(final String[] args) throws Exception {
        new PoojaApplication().run(args);
    }

    @Override
    public String getName() {
        return "Pooja";
    }

    @Override
    public void initialize(final Bootstrap<PoojaConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final PoojaConfiguration configuration,
                    final Environment environment) {
        GreetingResource greetingResource = new GreetingResource();
        environment.jersey().register(greetingResource);
        environment.healthChecks().register("health", new AppHealthCheck());
    }

}
