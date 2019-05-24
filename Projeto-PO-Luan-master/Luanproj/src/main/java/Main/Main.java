package Main;

import String.Strings;
import Telas.TelaErro;
import Telas.TelaFunçoes;
import Telas.appfunc;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class Main extends Application{
	
	
	@Override
	public void start(final Stage stage) throws Exception {		
		stage.setTitle(Strings.labelLogin);
		
			
		
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(640, 480);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setResizable(false);
		
		
		
		
		//botao
		Button logar = new Button(Strings.botaoLogar);
		logar.setTextFill(Color.DIMGRAY);
		logar.setFont(Font.font("verdana", FontWeight.BOLD, 25));
		logar.setLayoutX(350);
		logar.setLayoutY(330);
		
		

		
		Button Sair = new Button(Strings.botaoSair);
		Sair.setTextFill(Color.DIMGRAY);
		Sair.setFont(Font.font("verdana", FontWeight.BOLD, 25));
		Sair.setLayoutX(230);
		Sair.setLayoutY(330);
		
		
		//label de LOGIN texto
		Label textoLogin = new Label(Strings.labelLogin);
		
		//label informaçao para login
		Label InfoLogin = new Label(Strings.InfoUser);
		final TextField Login = new TextField();
		
		Label InfoSenha = new Label(Strings.InfoSenha);
		final PasswordField Senha = new PasswordField();
		
		//sets layout login
		InfoLogin.setLayoutX(250);
		InfoLogin.setLayoutY(200);
		
		Login.setLayoutX(250);
		Login.setLayoutY(220);
		Login.setText("Nome");
		
		//sets layout senha
		InfoSenha.setLayoutX(250);
		InfoSenha.setLayoutY(270);
		Senha.setLayoutX(250);
		Senha.setLayoutY(290);

		////
		textoLogin.setLayoutX(250);
		textoLogin.setLayoutY(60);
		
		
		textoLogin.setTextFill(Color.ORANGE);
		textoLogin.setFont(Font.font("verdana", FontWeight.BOLD, 50));
		
		Reflection reflet = new Reflection();
		textoLogin.setEffect(reflet);
	
		
		
		
		
		
		BackgroundImage backglogin= new BackgroundImage(new Image("https://i2.wp.com/obscenidadedigital.com/wp-content/uploads/2017/10/gradiente.png"),
		BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		BackgroundSize.DEFAULT);
		//then you set to your node
		pane.setBackground(new Background(backglogin));
		
		pane.getChildren().add(textoLogin);
		pane.getChildren().add(Login);
		pane.getChildren().add(Senha);
		pane.getChildren().add(InfoLogin);
		pane.getChildren().add(InfoSenha);
		pane.getChildren().add(logar);
		pane.getChildren().add(Sair);
		
		stage.show();
		
		
		
		Sair.setOnAction(new	EventHandler<ActionEvent>()	{				
		public	void	handle(ActionEvent	event)	{
			Sair();
		}
		private void Sair() {
			TelaFunçoes.sair();
		}});
				
		logar.setOnAction(new	EventHandler<ActionEvent>()	{				
		public	void	handle(ActionEvent	event)	{
			try {
				logar();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		private void logar() throws Exception {
			if	(Login.getText().equals("admin")	&& Senha.getText().equals("admin"))	{
				System.out.println("eae men");
				stage.close();
				new	appfunc().start(new	Stage());
				}else{
				new TelaErro().start(new Stage());
			}
		}});
			
		

			
		}



	public static void main(String[] args) {
		launch(args);
	}



}

