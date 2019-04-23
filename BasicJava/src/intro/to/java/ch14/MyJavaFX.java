package intro.to.java.ch14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
	@Override
	// Override the start method in the Application Class
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 200, 250);
		
		// Set the stage title
		primaryStage.setTitle("MyJavaFX");
		
		// Place the scene in the stage
		primaryStage.setScene(scene);
		
		// Display the stage
		primaryStage.show();
	}
	
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}
}
