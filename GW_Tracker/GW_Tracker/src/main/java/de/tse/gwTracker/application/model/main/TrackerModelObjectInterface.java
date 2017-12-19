package de.tse.gwTracker.application.model.main;

import lombok.Getter;

public abstract class TrackerModelObjectInterface {
	@Getter
	private final ApplicationModel applicationModel;
	
	public TrackerModelObjectInterface(ApplicationModel applicationModel) {
		this.applicationModel = applicationModel;
	}
}
