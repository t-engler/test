package de.tse.gwTracker.application.model.main.login;

import de.tse.gwTracker.application.model.main.ApplicationModel;
import de.tse.gwTracker.application.model.main.TrackerModelObjectInterface;
import lombok.Getter;
import lombok.Setter;

public class LoginProperties extends TrackerModelObjectInterface {

	public LoginProperties(ApplicationModel applicationModel) {
		super(applicationModel);
	}
	
	@Getter
	@Setter
	private String apiKey;

}
