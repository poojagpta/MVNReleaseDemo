package com.demo.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by pooja on 2/11/17.
 */
public class AppHealthCheck  extends HealthCheck {


    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
