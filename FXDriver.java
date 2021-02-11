import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class FXDriver extends Application {
		   
		/**
		 * The main method for the GUI example program JavaFX version
		 * @param args not used
		 * @throws IOException
		 */
		public static void main(String[] args) {		
			launch(args);   
		}
			   
		@Override
		public void start(Stage stage) /*throws IOException*/ {
			//student Task #1:
			//  instantiate the FXMainPane, name it root
			FXMainPane root=new FXMainPane();
			//  set the scene to hold root
			stage.setScene(new Scene(root,stage.getWidth(),stage.getHeight()));
			//set stage title
			stage.setTitle("Hello World GUI");
			//display the stage
			stage.show();

		}
}
