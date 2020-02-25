import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calcolatrice extends Application {
	
	Button canc,button1,button2, button3, button4, button5, button6, button7, button8, button9, buttondiv, buttonmol, button0, buttonsub, buttonadd, buttonp, buttoneq, buttonradice; 
	
	TextField answer = new TextField("");
		
	private boolean resetDisplay = true;
	private double  operandoCorrente  = 0.0;
	private double  sndoperandoCorrente  = 0.0;
	private char    operatoreCorrente = '?';
	double risultato;
	boolean control= true;
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception{
		
		stage.setTitle("Calculator");
		VBox vBox = new VBox();
		Scene scene = new Scene(vBox,500,500);
		
		answer.setAlignment(Pos.TOP_RIGHT);
		answer.setStyle("-fx-font-size:40");
		
		button7 = new Button("7");
		button7.setOnAction((event) -> {
			if(control==false) {
				  answer.setText(button7.getText());
				  resetDisplay=true;
				  control=true;	  
			  }
			  else {
			  answer.setText(answer.getText()+button7.getText());} 
			});
		button8 = new Button("8");
		button8.setOnAction((event) -> {
			if(control==false) {
				  answer.setText(button8.getText());
				  resetDisplay=true;
				  control=true;	  
			  }
			  else {
			  answer.setText(answer.getText()+button8.getText());}	  
			});
		button9 = new Button("9");
		button9.setOnAction((event) -> {
			if(control==false) {
				  answer.setText(button9.getText());
				  resetDisplay=true;
				  control=true;	  
			  }
			  else {
			  answer.setText(answer.getText()+button9.getText());}
			});
		buttondiv = new Button("/");
		buttondiv.setOnAction((event) -> {
			 if(control==false && risultato!=007){
				  operandoCorrente=Double.parseDouble(answer.getText());
				  operatoreCorrente= '/';
				  answer.setText("");
			  }
			  else if(control==false && risultato==007){
				  answer.setText("Error");
			  }
			  else {
			  operandoCorrente=Double.parseDouble(answer.getText());
			  answer.setText("");
			  resetDisplay=true;
			  operatoreCorrente= '/';
			  }
			});
		button4 = new Button("4"); 
		button4.setOnAction((event) -> {
			if(control==false) {
				  answer.setText(button4.getText());
				  resetDisplay=true;
				  control=true;	  
			  }
			  else {
			  answer.setText(answer.getText()+button4.getText());}
			});
		button5 = new Button("5");
		button5.setOnAction((event) -> {
			if(control==false) {
				  answer.setText(button5.getText());
				  resetDisplay=true;
				  control=true;	  
			  }
			  else {
			  answer.setText(answer.getText()+button5.getText());}
			});
		button6 = new Button("6");
		button6.setOnAction((event) -> {
			if(control==false) {
				  answer.setText(button6.getText());
				  resetDisplay=true;
				  control=true;	  
			  }
			  else {
			  answer.setText(answer.getText()+button6.getText());}
			});
		buttonmol = new Button("*");
		buttonmol.setOnAction((event) -> {
			 if(control==false && risultato!=007){
				  operandoCorrente=Double.parseDouble(answer.getText());
				  operatoreCorrente= '*';
				  answer.setText("");
			  }
			  else if(control==false && risultato==007){
				  answer.setText("Error");
			  }
			  else {
			  operandoCorrente=Double.parseDouble(answer.getText());
			  answer.setText("");
			  resetDisplay=true;
			  operatoreCorrente= '*';
			  }
		 });
		button1 = new Button();
		button1.setText("1");
		button1.setOnAction((event) -> {
			  if(control==false) {
				  answer.setText(button1.getText());
				  resetDisplay=true;
				  control=true;	  
			  }
			  else {
			  answer.setText(answer.getText()+button1.getText());}
			});
	    button2 = new Button("2");
	    button2.setOnAction((event) -> {
	    	if(control==false) {
				  answer.setText(button2.getText());
				  resetDisplay=true;
				  control=true;	  
			  }
			  else {
			  answer.setText(answer.getText()+button2.getText());}
			});
		button3 = new Button("3");
		button3.setOnAction((event) -> {
			if(control==false) {
				  answer.setText(button3.getText());
				  resetDisplay=true;
				  control=true;	  
			  }
			  else {
			  answer.setText(answer.getText()+button3.getText());}
			});
		buttonsub = new Button("-");
		buttonsub.setOnAction((event) -> {
			  if(control==false && risultato!=007){
				  operandoCorrente=Double.parseDouble(answer.getText());
				  operatoreCorrente= '-';
				  answer.setText("");
			  }
			  else if(control==false && risultato==007){
				  answer.setText("Error");
			  }
			  else {
			  operandoCorrente=Double.parseDouble(answer.getText());
			  answer.setText("");
			  resetDisplay=true;
			  operatoreCorrente= '-';
			  }
			});
		buttonp = new Button(".");
		buttonp.setOnAction((event) -> {
			if(control==false) {
				  answer.setText(buttonp.getText());
				  resetDisplay=true;
				  control=true;	  
			  }
			  else {
			  answer.setText(answer.getText()+buttonp.getText());}
			});
		button0 = new Button("0");
		button0.setOnAction((event) -> {
			if(control==false) {
				  answer.setText(button0.getText());
				  resetDisplay=true;
				  control=true;	  
			  }
			  else {
			  answer.setText(answer.getText()+button0.getText());}
			});
		buttoneq = new Button("=");
		buttoneq.setOnAction((event) -> {
			 
			 if (operatoreCorrente != '?' && operatoreCorrente != '√') {
				 double sndoperandoCorrente = Double.parseDouble(answer.getText());
	             risultato = calcolaRisultato(operandoCorrente, sndoperandoCorrente, operatoreCorrente);
	             if(risultato == 007) {
	            	 answer.setText("Error");
	            	 control=false;
	             }
	             else {
	             answer.setText(String.valueOf(risultato));
	             resetDisplay = true; 
	             control=false;
	             }
			 }else if (operatoreCorrente == '√') {
	            	 risultato = calcolaRadice(operandoCorrente, operatoreCorrente);
	             if(risultato == 007) {
	            	 answer.setText("Error");
	            	 control=false;
	             } else {
	             answer.setText(String.valueOf(risultato));
	             resetDisplay = true; 
	             control=false;
	             }
	             }
		}
	            
			);

		buttonadd = new Button("+");
		buttonadd.setOnAction((event) -> {
			 if(control==false && risultato!=007){
				  operandoCorrente=Double.parseDouble(answer.getText());
				  operatoreCorrente= '+';
				  answer.setText("");
			  }
			  else if(control==false && risultato==007){
				  answer.setText("Error");
			  }
			  else {
			  operandoCorrente=Double.parseDouble(answer.getText());
			  answer.setText("");
			  resetDisplay=true;
			  operatoreCorrente= '+';
			  }
			});
		canc = new Button("C");
		canc.setOnAction((event) -> {
			  resetDisplay=true;
			  answer.setText("");
			});
		
		buttonradice = new Button("√");
		buttonradice.setOnAction((event)->{if(control==false && risultato!=007){
			  operandoCorrente=Double.parseDouble(answer.getText());
			  operatoreCorrente= '√';
			  answer.setText("");
		  }
		  else if(control==false && risultato==007){
			  answer.setText("Error");
		  }
		  else {
		  operandoCorrente=Double.parseDouble(answer.getText());
		  answer.setText("√" + answer.getText());
		  
		  operatoreCorrente= '√';
		  }
			
		});
		
		button7.setMinSize(80,80);
		button7.setStyle("-fx-font-size:30");
		button8.setMinSize(80,80);
		button8.setStyle("-fx-font-size:30");
		button9.setMinSize(80,80);
		button9.setStyle("-fx-font-size:30");
		buttondiv.setMinSize(80,80);
		buttondiv.setStyle("-fx-font-size:30");
		button4.setMinSize(80,80);
		button4.setStyle("-fx-font-size:30");
		button5.setMinSize(80,80);
		button5.setStyle("-fx-font-size:30");
		button6.setMinSize(80,80);
		button6.setStyle("-fx-font-size:30");
		buttonmol.setMinSize(80,80);
		buttonmol.setStyle("-fx-font-size:30");
		button1.setMinSize(80,80);
		button1.setStyle("-fx-font-size:30");
		button2.setMinSize(80,80);
		button2.setStyle("-fx-font-size:30");
		button3.setMinSize(80,80);
		button3.setStyle("-fx-font-size:30");
		buttonsub.setMinSize(80,80);
		buttonsub.setStyle("-fx-font-size:30");
		buttonp.setMinSize(80, 80);
		buttonp.setStyle("-fx-font-size:30");
		button0.setMinSize(80,80);
		button0.setStyle("-fx-font-size:30");
		buttoneq.setMinSize(80,80);
		buttoneq.setStyle("-fx-font-size:30");
		buttonadd.setMinSize(80,80);
		buttonadd.setStyle("-fx-font-size:30");
		canc.setMinSize(80,80);
		canc.setStyle("-fx-font-size:30");
		buttonradice.setMinSize(80,80);
		buttonradice.setStyle("-fx-font-size:30");
		
		GridPane grid = new GridPane(); 
		grid.setAlignment(Pos.CENTER);
		grid.add(button7,0,0);
		grid.add(button8,1,0);
		grid.add(button9,2,0);
		grid.add(buttondiv,3,0);
		grid.add(button4,0,1);
		grid.add(button5,1,1);
		grid.add(button6,2,1);
		grid.add(buttonmol,3,1);
		grid.add(button1,0,2); 
		grid.add(button2,1,2);
		grid.add(button3,2,2);
		grid.add(buttonsub,3,2);
		grid.add(buttonp,0,3); 
		grid.add(button0,1,3);
		grid.add(canc,2,3);
		grid.add(buttonadd,3,3);
		grid.add(buttoneq,2,4);
		grid.add(buttonradice, 3, 4);
		
		vBox.getChildren().addAll(answer,grid);		
		stage.setScene(scene);
		stage.show();
	}
	
	private double calcolaRadice(double operandoCorrente2, char operatoreCorrente2) {

	   return (Math.sqrt(operandoCorrente2));
	}

	public void inseritoPunto() {
        if (resetDisplay) {
            answer.setText("");
            resetDisplay = false;
        }
        answer.setText(answer.getText() + ".");
    }
	public void insertNum( char c ) {
        if (resetDisplay) {
        	answer.setText("");
            resetDisplay = false;
        }
        answer.setText(answer.getText() + c);
	}
	
	private double calcolaRisultato(double op1, double op2, char oper) {
        switch (oper) {
        case '+' : return (op1 + op2);
        case '-' : return (op1 - op2);
        case '*' : return (op1 * op2);
        case '√' : return (Math.sqrt(op1));
        case '/' : 
        	if(op2==0) {
        		double h=007;
        		return h;
        	}
        	return (op1 / op2);
     
        default : return 0.0;
        }
    }
	
}
