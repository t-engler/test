package de.tse.gwTracker.application.viewer.controller.login;

import javax.security.auth.login.LoginException;

import de.tse.gwTracker.application.ApplicationController;
import de.tse.gwTracker.application.model.main.ApplicationModel;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import lombok.Getter;

public class LoginViewController {

	/**
	 * View part.
	 */

	@FXML
	TextField apiKey;

	@FXML
	Text loginMessage;

	@FXML
	public void login() {
		try {
			applicationModel.getAPILoginProperties().checkAPIKey(apiKey.getText());
			applicationModel.getAPILoginProperties().storeAPIKey(apiKey.getText());
			ApplicationController.openView(viewURI);
		} catch (APIException e) {
			loginMessage.setText(e.getMessage());
		} finally {
			apiKey.clear();
		}
	}

	/**
	 * Controller part.
	 */

	@Getter
	private final ApplicationModel applicationModel = ApplicationModel.requestApplicationModel();
}
