package com.demo.resources;

import io.dropwizard.hibernate.UnitOfWork;
import io.dropwizard.jersey.params.IntParam;
import io.dropwizard.jersey.params.LongParam;
import jersey.repackaged.com.google.common.base.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * Created by pooja on 2/1/17.
 */
@Path("Greeting")
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {

 //SLF4J is provided with dropwizard. Logback is also provided
    Logger log = LoggerFactory.getLogger(GreetingResource.class);
    
    @GET
    @Path("/hello")
    @UnitOfWork
    @PermitAll
    public String getMessage() {
        log.debug("Hello debug");
        log.info("Hello info");
        log.error("Hello error");
        return "Hello from app ";
    }

   }
