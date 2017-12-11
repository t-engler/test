package de.tse.gwTracker.application.model.main;

public class ApplicationModel {
	
	private static ApplicationModel applicationModelSingleton;
	
	private ApplicationModel() {
		
	}

	public static ApplicationModel requestApplicationModel() {
		if(applicationModelSingleton == null) {
			initializeApplicationModel();
		}
		return applicationModelSingleton;
	}

	public static void initializeApplicationModel() {
		if(applicationModelSingleton != null) {
			applicationModelSingleton = new ApplicationModel();
		}		
	}

}
