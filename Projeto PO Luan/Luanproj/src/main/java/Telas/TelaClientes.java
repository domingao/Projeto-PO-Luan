

package Telas;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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

public class TelaClientes extends Application {
	private	AnchorPane	pane;

	@Override
	public void start(final Stage stagew) throws Exception {
		// TODO Auto-generated method stub
		pane	=	new	AnchorPane();
		pane.setPrefSize(800, 600);
		Scene scene = new Scene(pane);
		stagew.setScene(scene);
		stagew.setResizable(false);
		
		
		BackgroundImage backg= new BackgroundImage(new Image("https://i2.wp.com/obscenidadedigital.com/wp-content/uploads/2017/10/gradiente.png",900,800,false,true),
		BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		BackgroundSize.DEFAULT);
		//then you set to your node
		pane.setBackground(new Background(backg));
		
		
		
		TextField NomeCliente = new TextField("Nome");
		NomeCliente.setLayoutX(20);
		NomeCliente.setLayoutY(190);
		
		TextField CPFCliente = new TextField("CPF");
		CPFCliente.setLayoutX(250);
		CPFCliente.setLayoutY(190);
		
		TextField idadeCliente = new TextField("Idade Cliente");
		idadeCliente.setLayoutX(20);
		idadeCliente.setLayoutY(250);
		
		
		TextField CodCliente = new TextField("Codigo Do CLiente");
		CodCliente.setLayoutX(250);
		CodCliente.setLayoutY(250);
		
		
		//botao
		Button btvoltar = new Button("Voltar");
		btvoltar.setTextFill(Color.DARKSLATEGREY);
		btvoltar.setFont(Font.font("verdana", FontWeight.BOLD, 15));
		btvoltar.setLayoutX(20);
		btvoltar.setLayoutY(600);
		
		
		pane.getChildren().addAll(btvoltar,CodCliente,NomeCliente,CPFCliente,idadeCliente);
		
		btvoltar.setOnAction(e -> handle(stagew));
		
		stagew.show();
		
	}
	public	void	handle(Stage stage)	{
		try {
			new	appfunc().start(new Stage());
			stage.close();
		} catch (Exception e) {
			//
			e.printStackTrace();
		}
	}

}
