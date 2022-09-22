package com.luizffdemoraes.reserva;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/reserva")
public class ReservaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reserva> get(){
        return Reserva.listAll();
    }

    @Transactional
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Reserva newReserva(Reserva reserva) {
        reserva.id =null;
        reserva.persist();

        return reserva;
    }
}
