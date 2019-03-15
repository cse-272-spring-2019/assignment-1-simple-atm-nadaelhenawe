package atm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Deposite {
 Stage stage;
 Scene scene;
 Options options;
 account acc=new account (0);
 public Deposite(Stage stage) {
	 this.stage=stage;
 }
 public void preparescene() {
	 Label DepositeLabel=new Label("Amount");
	 Label showamountLabel=new Label();
	 TextField DepositeField=new TextField();
	 Button ok=new Button("ok");
	 Button Back=new Button("Back");
	 GridPane grid=new GridPane();
		grid.add(DepositeLabel,0,0);
		grid.add(DepositeField, 1, 1);
		grid.add(ok,1,3);
		grid.add(Back,1,4);
		grid.add(showamountLabel, 1, 5);
		
		
		
		 ok.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
				double Amount=Double.parseDouble(DepositeField.getText());
				acc.Deposite(Amount);
				showamountLabel.setText("success") ;
				
				}
			     });
		 Back.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					stage.setScene(options.getScene());
				
				}
			     });
		 
		 
		ok.setStyle("-fx-background-color: honeydew; -fx-text-fill: purple;-fx-font: normal bold 20px 'serif'");
		Back.setStyle("-fx-background-color: honeydew; -fx-text-fill: purple;-fx-font: normal bold 20px 'serif'");
		grid.setStyle("-fx-background-color: honeydew; ");
		showamountLabel.setStyle("-fx-background-color: honeydew; -fx-text-fill: purple;-fx-font: normal bold 20px 'serif' ");
		grid.setAlignment(Pos.CENTER);
		DepositeLabel.setStyle("-fx-background-color: honeydew; -fx-text-fill: purple;-fx-font: normal bold 20px 'serif' ");
		scene=new Scene(grid,600,300);
 }
 

public Scene getScene() {
	return scene;
}
public void setScene(Scene scene) {
	this.scene = scene;
}
public Stage getStage() {
	return stage;
}
public void setStage(Stage stage) {
	this.stage = stage;
}
public Options getOptions() {
	return options;
}
public void setOptions(Options options) {
	this.options = options;
}
public account getAcc() {
	return acc;
}
public void setAcc(account acc) {
	this.acc = acc;
}
		

}





