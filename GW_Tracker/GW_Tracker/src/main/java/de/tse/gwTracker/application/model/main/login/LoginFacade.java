package de.tse.gwTracker.application.model.main.login;

import de.tse.gwTracker.application.model.main.ApplicationModel;
import de.tse.gwTracker.application.model.main.TrackerModelObjectInterface;
import de.tse.gwTracker.application.model.main.exceptions.APIException;

public class LoginFacade extends TrackerModelObjectInterface {

	public LoginFacade(ApplicationModel applicationModel) {
		super(applicationModel);
	}
	
	public boolean checkApiKey(String key) throws APIException {
		throw new APIException("TODO");
	}

}
