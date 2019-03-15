package atm;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Loginform {
Stage stage;
	Scene scene;
Login login;	
Options options;	
	public  Loginform(Stage stage) {
	this.stage = stage;

	}
	
	public void preparescene() {
		
		login=new Login();
	
	
	Label usernameLabel=new Label("Card Number");
	Label passwordLabel=new Label("password");
	
	TextField usernameField=new TextField();
	PasswordField passwordField=new PasswordField();
	Button ok=new Button("ok");
	Label validationLabel= new Label();
	GridPane grid=new GridPane();
	grid.add(usernameLabel,0,0);
	grid.add(passwordLabel,0,1);
	grid.add(usernameField,1,0);
	grid.add(passwordField,1,1);
	grid.add(ok,1,3);
	grid.add(validationLabel, 1, 4);
	usernameLabel.setStyle("-fx-background-color: honeydew; -fx-text-fill: purple;-fx-font: normal bold 20px 'serif' ");
	passwordLabel.setStyle("-fx-background-color: honeydew; -fx-text-fill: purple;-fx-font: normal bold 20px 'serif'");
	ok.setStyle("-fx-background-color: honeydew; -fx-text-fill: purple;-fx-font: normal bold 20px 'serif'");
	grid.setStyle("-fx-background-color: honeydew; ");
	 usernameField.setStyle("-fx-font: normal bold 20px 'serif' ");
	 
	 grid.setAlignment(Pos.CENTER);
	
	 ok.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
			String username=usernameField.getText();
			String password=passwordField.getText();
			 boolean valid=login.validate(username, password);
			 if(valid) {
				 
				 stage.setScene(options.getScene());
				 
			 }else {
				 validationLabel.setText("Wrong Card Number or Password");
			 }
			}
		     });
	   scene=new Scene(grid,1000,500);
		
	}
	public  Scene getScene() { 
		return this.scene;
		}
	public void setOptions(Options options) {
		this.options = options;
	}

		


}
