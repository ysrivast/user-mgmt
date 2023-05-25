package com.bcg.resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/users")
public class UserResource {

    private static final List<String> users = new ArrayList<>();
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<String> getUsers(){
        return users;
    }

    @POST
    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    public String create(String user){
        users.add(user);
        return "added";
    }
}
