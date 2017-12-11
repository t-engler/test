package de.tse.gwTracker.application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ApplicationController extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			openView(primaryStage, "/fxml/LoginView.fxml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static void openView(Stage primaryStage, String viewURI) throws IOException {
		Pane loginView = FXMLLoader.load(ApplicationController.getClass().getResource(viewURI));
		Scene scene = new Scene(loginView);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
