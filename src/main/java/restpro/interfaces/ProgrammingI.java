package restpro.interfaces;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.http.MediaType;

import restpro.models.MasterProgramDescription;

@Path("/language")
public interface ProgrammingI {
	
	@Path("/description")
	@GET
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	public MasterProgramDescription getPoemByName();

}
