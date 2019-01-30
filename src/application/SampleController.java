package application;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.util.regex.*;

public class SampleController extends AnchorPane {
	
	//Controller class for the FXML file. 
	//I don't think I care that much what you name your character. Shouldn't need much input verification.
	@FXML private TextField name;
	//Class too is fine as it is.
	@FXML private TextField characterClass;
	//Level should be two-digit numeric. I doubt there's much use in bounding it to twenty, but I might if I feel like it.
	@FXML private TextField level;
	//There are enough homebrew races and subraces to make an elephant choke.
	@FXML private TextField race;
	@FXML private TextField subrace;
	@FXML private TextField xpNext;
	@FXML private TextField size;
	@FXML private TextField age;
	@FXML private TextField background;
	@FXML private TextArea languages;
	@FXML private TextField gender;
	@FXML private TextField hair;
	@FXML private TextField alignment;
	@FXML private TextField eyes;
	@FXML private TextField religion;
	@FXML private TextField weight;
	@FXML private TextField xp;
	
	

	public SampleController() {
		
	}
	

	//Primitive solution: just attach a listener to all fields on-init. Should write data to the saveable character sheet. 
	@FXML
	private void initialize() {
		name.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.name = newVal;
				System.out.println(newVal);
			}
		});

		characterClass.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.characterClass = newVal;
				System.out.println(newVal);
			}
		});
		level.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				System.out.println(newVal);
			}
		});
	}

}
