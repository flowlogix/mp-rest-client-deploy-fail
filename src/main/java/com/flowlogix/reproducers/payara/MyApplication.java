package com.flowlogix.reproducers.payara;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class MyApplication {
    @Inject
    @RestClient
    RestApiClient client;
}
