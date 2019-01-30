package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class SampleController extends AnchorPane {
	
	//Controller class for the FXML file. 
	
	@FXML private TextField name;
	@FXML private TextField characterClass;
	@FXML private TextField level;
	@FXML private TextField race;
	@FXML private TextField subrace;
	
	public SampleController() {
		
	}
	
	@FXML
	private void initialize() {
		
	}
	
	
}
