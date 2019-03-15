package atm;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Options {
	Stage stage;
	Scene scene;
	Loginform loginform;
	Deposite deposite;
	Withdraw withdraw;
	account acc=new account (0);
	int k=1;
	TransactionHistory h;
	
	
	public Options(Stage stage) {
		this.stage=stage;
	}
 public void preparescene(){
	
	 Button Deposite=new Button("Deposite");
	 Button withdrawl=new Button("Withdrawl");
	 Button Balance_Inquiry=new Button("Balance_Inquiry");
	 Button Previous=new Button("Previous");
	 Button Next=new Button ("next");
	 Label balance = new Label();
	 Label transactionhistory = new Label();
     GridPane grid=new GridPane();
     grid.add(Deposite, 3, 3);
     grid.add(withdrawl, 4, 4);
     grid.add(Balance_Inquiry, 5, 5);
     grid.add(Previous, 6, 6);
     grid.add(Next, 7, 7);
     grid.add(balance, 5, 7);
     grid.add(transactionhistory, 8, 8);
     
     Previous.setStyle("-fx-background-color: honeydew; -fx-text-fill: purple;-fx-font: normal bold 20px 'serif' ");
 	Balance_Inquiry.setStyle("-fx-background-color: honeydew; -fx-text-fill: purple;-fx-font: normal bold 20px 'serif'");
 	Deposite.setStyle("-fx-background-color: honeydew; -fx-text-fill: purple;-fx-font: normal bold 20px 'serif'");
 	grid.setStyle("-fx-background-color: honeydew; ");
 	withdrawl.setStyle("-fx-background-color: honeydew; -fx-text-fill: purple;-fx-font: normal bold 20px 'serif'");
 	Next.setStyle("-fx-background-color: honeydew; -fx-text-fill: purple;-fx-font: normal bold 20px 'serif'");
     
     
     
     
 	Deposite.setOnAction(new EventHandler<ActionEvent>(){
		@Override
		public void handle(ActionEvent event) {
			stage.setScene(deposite.getScene());
		}});
	withdrawl.setOnAction(new EventHandler<ActionEvent>(){
		@Override
		public void handle(ActionEvent event) {
			stage.setScene(withdraw.getScene());
		}});
	Balance_Inquiry.setOnAction(new EventHandler<ActionEvent>(){
		@Override
		public void handle(ActionEvent event) {
			System.out.println(acc.getBalance());
			//double x=Double.parseDouble(acc.getBalance());
			//balance.setText(x);
			
		}});
	
	
	Previous.setOnAction(new EventHandler<ActionEvent>(){
		@Override
		public void handle(ActionEvent event) {
	
			if(h.s.empty())
				System.out.println("No Transactions");	
				else
			System.out.println(	h.s.pop());
	
		
			
		}});
	Next.setOnAction(new EventHandler<ActionEvent>(){
		@Override
		public void handle(ActionEvent event) {
		if(h.s.empty())
		System.out.println("No Transactions");	
		else
	System.out.println(	h.s.pop());
	
		
			
		}});
	
	
	

 scene=new Scene(grid,600,300);}

public Stage getStage() {
	return stage;
}
public void setStage(Stage stage) {
	this.stage = stage;
}
public void setScene(Scene scene) {
	this.scene = scene;
}
public Withdraw getWithdraw() {
	return withdraw;
}
public Scene getScene() {
	return scene;
}
public void setWithdraw(Withdraw withdraw) {
	this.withdraw = withdraw;
}
public void setLoginform(Loginform loginform) {
	this.loginform = loginform;
}
public void setDeposite(Deposite deposite) {
	this.deposite=deposite;
	
}

 
}
