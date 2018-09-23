package restpro.impls;

import org.springframework.stereotype.Service;

import restpro.interfaces.ProgrammingI;
import restpro.models.MasterProgramDescription;

@Service
public class ProgrammingEndpoint implements ProgrammingI {

	@Override
	public MasterProgramDescription getPoemByName() {

		MasterProgramDescription model = new MasterProgramDescription();
		model.setProgramming("Java, less coffee needed.");
		
		return model;
	}
}

