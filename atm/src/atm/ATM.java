package atm;
 


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.GridPane;

public class ATM extends Application {
	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("ATM Login");
		Loginform loginform=new Loginform(primaryStage);
		Options options=new Options(primaryStage);
		Deposite deposite=new Deposite(primaryStage);
		Withdraw withdraw=new Withdraw(primaryStage);	
		loginform.preparescene();
		options.preparescene();
		deposite.preparescene();
		withdraw.preparescene();		
		loginform.setOptions(options);
		options.setLoginform(loginform);
		options.setDeposite(deposite);
		options.setWithdraw(withdraw);
		withdraw.setOptions(options);	
		deposite.setOptions(options);
		primaryStage.setScene(loginform.getScene());		
		primaryStage.show();
		
	}

}
