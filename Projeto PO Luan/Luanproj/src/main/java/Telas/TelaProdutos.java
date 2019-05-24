package Telas;
import String.Strings;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.Glow;
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

public class TelaProdutos extends Application {
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
		
		
		
		TextField CodProduto = new TextField("Codigo Do Produto");
		CodProduto.setLayoutX(20);
		CodProduto.setLayoutY(190);
		
		TextField NomeProduto = new TextField("Nome Do Produto");
		NomeProduto.setLayoutX(250);
		NomeProduto.setLayoutY(190);
		
		
		TextField Precoproduto = new TextField("Preço Do Produto");
		Precoproduto.setLayoutX(20);
		Precoproduto.setLayoutY(250);
		
		
		TextField descricaoProduto = new TextField("Descriçao do produto");
		descricaoProduto.setLayoutX(250);
		descricaoProduto.setLayoutY(250);
		
		TextField quantidadeProduto = new TextField("Quantidade do produto");
		quantidadeProduto.setLayoutX(20);
		quantidadeProduto.setLayoutY(310);
		
		
		
		
		
		
		
		
		
		
		
		
		//botao
		
		Button btSalvarPD = new Button(Strings.botaoSalvar);
		btSalvarPD.setTextFill(Color.DARKSLATEGREY);
		btSalvarPD.setFont(Font.font("verdana", FontWeight.BOLD, 25));
		btSalvarPD.setLayoutX(750);
		btSalvarPD.setLayoutY(580);
		
		
		
		
		
		
		Button btvoltar = new Button("Voltar");
		btvoltar.setTextFill(Color.DARKSLATEGREY);
		btvoltar.setFont(Font.font("verdana", FontWeight.BOLD, 15));
		btvoltar.setLayoutX(20);
		btvoltar.setLayoutY(600);
		
		
		pane.getChildren().addAll(btvoltar,btSalvarPD,CodProduto, NomeProduto,Precoproduto,descricaoProduto,quantidadeProduto);
		
		
		btSalvarPD.setOnAction(e -> btsalvar(stagew));		
		
		btvoltar.setOnAction(e -> btvoltars(stagew));				
		
		stagew.show();
		
	}
	
	public void btvoltars(Stage stage) {
		try {
			stage.close();
			new	appfunc().start(new Stage());
		} catch (Exception e) {
			//
			e.printStackTrace();
		}
		
		
	}
	
	public void btsalvar(Stage stage){
			try {
				stage.close();
				new	TelaProdutos().start(new Stage());
				new TelaSalvo().start(new Stage());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
