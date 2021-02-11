import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	private Button b1;
	private Button b2;
	private Button b3;
	private Button b4;
	private Button b5;
	private Label la;
	private TextField tf;
	private HBox hb1;
	private HBox hb2;

	//student Task #4:
	//  declare an instance of DataManager
	DataManager m;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		b1 = new Button("Hello");
		b2 = new Button("Howdy");
		b3 = new Button("Chinese");
		b4 = new Button("Clear");
		b5 = new Button("Exit");
		la = new Label("Feedback:");
		tf = new TextField();
		hb1 = new HBox();
		hb2 = new HBox();
		
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hb1.getChildren().addAll(la,tf);
		//  add the buttons to the other HBox
		hb2.getChildren().addAll(b1,b2,b3,b4,b5);

		//  add the HBoxes to this FXMainPanel (a VBox)
		this.getChildren().addAll(hb1,hb2);
		
		b1.setOnAction(new ButtonHandler());
		b2.setOnAction(new ButtonHandler());
		b3.setOnAction(new ButtonHandler());
		b4.setOnAction(new ButtonHandler());
		b5.setOnAction(new ButtonHandler());

		//student Task #4:
		//  instantiate the DataManager instance
		m = new DataManager();
		//  set margins and set alignment of the components
		hb2.setMargin(b1, hb2.getInsets());
		hb2.setMargin(b2, hb2.getInsets());
		hb2.setMargin(b3, hb2.getInsets());
		hb2.setMargin(b4, hb2.getInsets());
		hb2.setMargin(b5, hb2.getInsets());
		
		hb2.setAlignment(Pos.CENTER);

	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent>
	{		
		public void handle(ActionEvent event) {
			if(event.getTarget() == b1)
			{
				m.getHello();
				tf.setText(m.getHello());
				
			}
			else if(event.getTarget() == b2)
			{
				m.getHowdy();
				tf.setText(m.getHowdy());

			}
			else if(event.getTarget() == b3)
			{
				m.getChinese();
				tf.setText(m.getChinese());

			}
			else if(event.getTarget() == b4)
			{
				tf.setText("");
				
			}
			else if(event.getTarget() == b5)
			{
				Platform.exit();
				System.exit(0);
				
			}
			
		}
		
	}
}
	