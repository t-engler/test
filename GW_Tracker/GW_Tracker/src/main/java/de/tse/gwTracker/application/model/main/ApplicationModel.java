package de.tse.gwTracker.application.model.main;

import de.tse.gwTracker.application.model.main.login.LoginFacade;
import de.tse.gwTracker.application.model.main.login.LoginProperties;
import lombok.Getter;

public class ApplicationModel {
	
	private static ApplicationModel applicationModelSingleton;
	
	@Getter
	private final LoginFacade loginFacade;
	
	@Getter	
	private final LoginProperties loginProperties;
	
	private ApplicationModel() {
		loginFacade = new LoginFacade(this);
		loginProperties = new LoginProperties(this);
	}

	public static ApplicationModel requestApplicationModel() {
		if(applicationModelSingleton == null) {
			initializeApplicationModel();
		}
		return applicationModelSingleton;
	}

	private static void initializeApplicationModel() {
		if(applicationModelSingleton == null) {
			applicationModelSingleton = new ApplicationModel();
		}
	}


}
