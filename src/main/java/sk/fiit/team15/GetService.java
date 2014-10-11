package sk.fiit.team15;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/get")
public class GetService {

	@GET
	@Path("sayHi/{name}")
	public Response getMsg(@PathParam("name") String name) {
		return Response.status(200).entity("What is going on " + name.toUpperCase()).build();
	}
}