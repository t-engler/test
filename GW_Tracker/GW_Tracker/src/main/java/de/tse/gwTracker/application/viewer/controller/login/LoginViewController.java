package de.tse.gwTracker.application.viewer.controller.login;

import java.io.IOException;

import de.tse.gwTracker.application.ApplicationController;
import de.tse.gwTracker.application.model.main.ApplicationModel;
import de.tse.gwTracker.application.model.main.exceptions.APIException;
import de.tse.gwTracker.application.viewer.controller.account.AccountViewController;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import lombok.Getter;

public class LoginViewController {

	/**
	 * View part.
	 */
	public static final String URI = "/fxml/LoginView.fxml";

	@FXML
	TextField apiKey;

	@FXML
	Text loginMessage;

	@FXML
	public void login() {
		try {
			if (applicationModel.getLoginFacade().checkApiKey(apiKey.getText())) {
				applicationModel.getLoginProperties().setApiKey(apiKey.getText());
				ApplicationController.openView(AccountViewController.URI);
			}
		} catch (APIException | IOException e) {
			loginMessage.setText(e.getMessage());
		} finally {
			apiKey.clear();
		}
	}

	/**
	 * Controller part.
	 */
	public LoginViewController() {
		applicationModel = ApplicationModel.requestApplicationModel();
	}

	@Getter
	private final ApplicationModel applicationModel;
}
