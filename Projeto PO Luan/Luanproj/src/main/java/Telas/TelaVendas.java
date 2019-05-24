package Telas;
import String.Strings;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
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

public class TelaVendas extends Application {
	private	AnchorPane	pane;

	@Override
	public void start(final Stage stagew) throws Exception {
		// TODO Auto-generated method stub
		pane	=	new	AnchorPane();
		pane.setPrefSize(800, 600);
		Scene scene = new Scene(pane);
		stagew.setScene(scene);
		stagew.setResizable(false);
		
		
		PieChart grafico = new PieChart();
		grafico.getData().addAll(new PieChart.Data("Semestere 1", 20),
		  new PieChart.Data("Semestre 2", 10),
		  new PieChart.Data("Semestre 3", 34),
		  new PieChart.Data("Semestre 5", 12));
		grafico.setTitle("Lucros por Semestre");
		grafico.setPrefSize(300, 300);
		
		
		grafico.setLayoutX(320);
		grafico.setLayoutY(320);
		
		BackgroundImage backg= new BackgroundImage(new Image("https://i2.wp.com/obscenidadedigital.com/wp-content/uploads/2017/10/gradiente.png",900,800,false,true),
		BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		BackgroundSize.DEFAULT);
		//then you set to your node
		pane.setBackground(new Background(backg));
		
		
		
		TextField CodProduto = new TextField("Codigo do Produto");
		CodProduto.setLayoutX(20);
		CodProduto.setLayoutY(190);
		
		TextField PrecoProduto = new TextField("Preço Produto");
		PrecoProduto.setLayoutX(250);
		PrecoProduto.setLayoutY(190);
		
		
		TextField QuantidadeProduto = new TextField("Quantidade");
		QuantidadeProduto.setLayoutX(20);
		QuantidadeProduto.setLayoutY(250);
		
		
		TextField CodCliente = new TextField("Codigo Cliente(Opcional)");
		CodCliente.setLayoutX(250);
		CodCliente.setLayoutY(250);
		
		
		TextField DataVenda = new TextField("Data Venda");
		DataVenda.setLayoutX(20);
		DataVenda.setLayoutY(310);
		
		//botao
		
		Button btSalvarVD = new Button(Strings.botaoSalvar);
		btSalvarVD.setTextFill(Color.DARKSLATEGREY);
		btSalvarVD.setFont(Font.font("verdana", FontWeight.BOLD, 25));
		btSalvarVD.setLayoutX(750);
		btSalvarVD.setLayoutY(580);
		
		
		Button btvoltar = new Button("Voltar");
		btvoltar.setTextFill(Color.DARKSLATEGREY);
		btvoltar.setFont(Font.font("verdana", FontWeight.BOLD, 15));
		btvoltar.setLayoutX(20);
		btvoltar.setLayoutY(600);
		
		
		pane.getChildren().addAll(grafico,btSalvarVD,btvoltar,DataVenda,PrecoProduto,CodCliente,QuantidadeProduto,CodProduto);
		
		btSalvarVD.setOnAction(e -> btsalvar(stagew));
		
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
			new	TelaVendas().start(new Stage());
			new TelaSalvo().start(new Stage());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	

}
