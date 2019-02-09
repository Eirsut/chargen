package application;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.util.regex.*;

public class Controller extends AnchorPane {

	/*Controller class for the FXML file.
	Living proof that the "don't repeat yourself" programming axiom is dead and we live in a godless wasteland of spaghetti code.*/
	
	
	
	@FXML private TextField name;
	//Class too is fine as it is.
	@FXML private TextField characterClass;
	//Level should be two-digit numeric. I doubt there's much use in bounding it to twenty, but I might if I feel like it.
	@FXML private TextField level;
	//It might be interesting to make more stat autocalc using a dropdown field with predetermined racial bonuses...
	//But for this first implementation I'm sticking with simple string representation. 
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



	public Controller() {

	}


	//HERE BE EVENT HANDLERS
	@FXML
	private void initialize() {
		name.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.name = newVal;
			}
		});

		characterClass.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.characterClass = newVal;
			}
		});
		level.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				try {
					if (!newVal.matches("[0-9]{0,2}")) {
						Character.level = Integer.parseInt(oldVal);
						level.textProperty().setValue(oldVal);
					} else {
						Character.level = Integer.parseInt(newVal);
					}
				}catch(NumberFormatException e) {
					//Can't patternmatch on an empty string. It's not really a problem, but pointless exceptions flying at you in the console is generally not great.
				}
			}
		});
		race.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.race = newVal;
			}
		});
		
		subrace.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.subrace = newVal;
			}
		});
		xp.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				try {
					if (!newVal.matches("[0-9]*")) {
						Character.xp = Integer.parseInt(oldVal);
						level.textProperty().setValue(oldVal);
					} else {
						Character.xp = Integer.parseInt(newVal);
					}
				}catch(NumberFormatException e) {
				}
			}
		});
		xpNext.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				try {
					if (!newVal.matches("[0-9]*")) {
						Character.xpNext = Integer.parseInt(oldVal);
						level.textProperty().setValue(oldVal);
					} else {
						Character.xpNext = Integer.parseInt(newVal);
					}
				}catch(NumberFormatException e) {
				}
			}
		});
		size.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.size = newVal;
			}
		});
		
		age.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.age = newVal;
			}
		});
		background.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.background = newVal;
			}
		});
		
		languages.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.languages = newVal;
			}
		});
		
		gender.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.gender = newVal;
			}
		});
		
		hair.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.hair = newVal;
			}
		});
		
		alignment.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.alignment = newVal;
			}
		});
		
		eyes.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observableVal, String oldVal, String newVal) {
				Character.eyes = newVal;
			}
		});
	}

}
