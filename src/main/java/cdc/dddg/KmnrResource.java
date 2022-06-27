package cdc.dddg;

import org.jboss.resteasy.reactive.RestQuery;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import java.net.HttpURLConnection;
import java.util.List;

@Path("/kmnr")
@ApplicationScoped
public class KmnrResource {
    final KmnrService service;

    @Inject
    public KmnrResource(KmnrService fragment) {
        this.service = fragment;
    }

    @Produces({"application/json"})
    @GET
    @Path("filtered-list")
    public List<Kmnr> getKmnrs() {
        return this.service.getKmnrs();
    }

    @Produces({"application/json"})
    @GET
    @Path("list")
    public List<Kmnr> findAll() {
        return this.service.findAll();
    }

    @Produces({"application/json"})
    @GET
    public Kmnr findbyKmnr(@RestQuery String kmnr) {
        if (this.service.findByKmnr(kmnr).isPresent())
            return this.service.findByKmnr(kmnr).get();
        else
            throw new WebApplicationException(HttpURLConnection.HTTP_NOT_FOUND);
    }
}