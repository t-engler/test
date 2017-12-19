package de.tse.gwTracker.application;

import java.io.IOException;

import de.tse.gwTracker.application.viewer.controller.login.LoginViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ApplicationController extends Application {
	
	private static Stage primaryStage;
	
	private static final ApplicationController applicationController = new ApplicationController();

	@Override
	public void start(Stage primaryStage) {
		if(ApplicationController.primaryStage == null && primaryStage != null) {
			ApplicationController.primaryStage = primaryStage;
		} else if(ApplicationController.primaryStage == null && primaryStage == null) {
			try {
				stop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {			
			openView(LoginViewController.URI);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static void openView(String viewURI) throws IOException {
		Pane loginView = FXMLLoader.load(applicationController.getClass().getResource(viewURI));
		Scene scene = new Scene(loginView);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
