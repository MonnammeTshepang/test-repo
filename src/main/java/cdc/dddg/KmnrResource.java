package cdc.dddg;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
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
    public List<KmnrDto> getKmnrs() {
        return this.service.getKmnrs();
    }

    @Produces({"application/json"})
    @GET
    @Path("list")
    public List<Kmnr> findAll() {
        return this.service.findAll();
    }
}