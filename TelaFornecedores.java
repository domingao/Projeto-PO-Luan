package Telas;
import String.Strings;
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

public class TelaFornecedores extends Application {
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
		
		
		
		TextField CodFornecedor = new TextField("Codigo Do Fornecedor");
		CodFornecedor.setLayoutX(20);
		CodFornecedor.setLayoutY(190);
		
		TextField NomeFornecedor = new TextField("Nome");
		NomeFornecedor.setLayoutX(250);
		NomeFornecedor.setLayoutY(190);
		
		
		TextField CNPJFornecedor = new TextField("CNPJ");
		CNPJFornecedor.setLayoutX(20);
		CNPJFornecedor.setLayoutY(250);
		
		
		TextField PrecoprodutoFornecedor = new TextField("Preço Do Produto");
		PrecoprodutoFornecedor.setLayoutX(250);
		PrecoprodutoFornecedor.setLayoutY(250);
		
		
		TextField descricaoProduto = new TextField("Descriçao do produto");
		descricaoProduto.setLayoutX(20);
		descricaoProduto.setLayoutY(310);
		
		TextField quantidadeProduto = new TextField("Quantidade do produto");
		quantidadeProduto.setLayoutX(250);
		quantidadeProduto.setLayoutY(310);
		
		
		
		
		
		
		//botao
		
		Button btSalvarFD = new Button(Strings.botaoSalvar);
		btSalvarFD.setTextFill(Color.DARKSLATEGREY);
		btSalvarFD.setFont(Font.font("verdana", FontWeight.BOLD, 25));
		btSalvarFD.setLayoutX(750);
		btSalvarFD.setLayoutY(580);
		
		
		
		
		Button btvoltar = new Button("Voltar");
		btvoltar.setTextFill(Color.DARKSLATEGREY);
		btvoltar.setFont(Font.font("verdana", FontWeight.BOLD, 15));
		btvoltar.setLayoutX(20);
		btvoltar.setLayoutY(600);
		
		
		pane.getChildren().addAll(btSalvarFD,btvoltar,CodFornecedor,NomeFornecedor,CNPJFornecedor,PrecoprodutoFornecedor,descricaoProduto,quantidadeProduto);
		
		btvoltar.setOnAction(e -> handle(stagew));
		btSalvarFD.setOnAction(e -> btsalvarfd(stagew) );
		
		stagew.show();
		
	}
	
	
	public void btsalvarfd(Stage stage){
		try {
			stage.close();
			new	TelaFornecedores().start(new Stage());
			new TelaSalvo().start(new Stage());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
