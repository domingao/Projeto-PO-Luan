package Telas;
import javax.swing.JOptionPane;

import Main.Main;
import Telas.TelaClientes;
import Telas.TelaFornecedores;
import Telas.TelaProdutos;
import Telas.TelaVendas;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

public class appfunc extends Application	{
				private	AnchorPane	pane;
				@Override
				public	void	start(final Stage	stage)	throws	Exception	{
								pane	=	new	AnchorPane();
								pane.setPrefSize(800, 600);
								Scene scene = new Scene(pane);
								stage.setScene(scene);
								stage.setResizable(false);
								
								
								BackgroundImage backg= new BackgroundImage(new Image("https://i2.wp.com/obscenidadedigital.com/wp-content/uploads/2017/10/gradiente.png",900,800,false,true),
								BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
								BackgroundSize.DEFAULT);
								//then you set to your node
								pane.setBackground(new Background(backg));
								
								//botao
								Button btprodutos = new Button("Produtos");
								btprodutos.setLayoutX(40);
								btprodutos.setLayoutY(150);
								btprodutos.setTextFill(Color.DARKSLATEGREY);
								btprodutos.setFont(Font.font("verdana", FontWeight.BOLD, 25));
								
								btprodutos.setOnAction(new	EventHandler<ActionEvent>()	{				
									public	void	handle(ActionEvent	event)	{
										try {
											stage.close();
											new	TelaProdutos().start(new Stage());
										} catch (Exception e) {
											//
											e.printStackTrace();
										}
									}
								});
							
								
								
								Button btclientes = new Button("Clientes");
								btclientes.setLayoutX(40);
								btclientes.setLayoutY(230);
								btclientes.setTextFill(Color.DARKSLATEGREY);
								btclientes.setFont(Font.font("verdana", FontWeight.BOLD, 25));
								
								btclientes.setOnAction(new	EventHandler<ActionEvent>()	{				
									public	void	handle(ActionEvent	event)	{
										try {
											stage.close();
											new	TelaClientes().start(new Stage());
										} catch (Exception e) {
											//
											e.printStackTrace();
										}
									}
								});
								
								
								
								Button btfornecedores = new Button("Fornecedores");
								btfornecedores.setLayoutX(40);
								btfornecedores.setLayoutY(310);
								btfornecedores.setTextFill(Color.DARKSLATEGREY);
								btfornecedores.setFont(Font.font("verdana", FontWeight.BOLD, 25));
								
								btfornecedores.setOnAction(new	EventHandler<ActionEvent>()	{				
									public	void	handle(ActionEvent	event)	{
										try {
											stage.close();
											new	TelaFornecedores().start(new Stage());
										} catch (Exception e) {
											//
											e.printStackTrace();
										}
									}
								});
								
								Button btvendas = new Button("vendas");
								btvendas.setLayoutX(40);
								btvendas.setLayoutY(390);
								btvendas.setTextFill(Color.DARKSLATEGREY);
								btvendas.setFont(Font.font("verdana", FontWeight.BOLD, 25));
								
								btvendas.setOnAction(new	EventHandler<ActionEvent>()	{				
									public	void	handle(ActionEvent	event)	{
										try {
											stage.close();
											new	TelaVendas().start(new Stage());
										} catch (Exception e) {
											//
											e.printStackTrace();
										}
									}
								});
							
								
								Button btvoltar = new Button("Voltar");
								btvoltar.setTextFill(Color.DARKSLATEGREY);
								btvoltar.setFont(Font.font("verdana", FontWeight.BOLD, 15));
								btvoltar.setLayoutX(20);
								btvoltar.setLayoutY(600);
								
								btvoltar.setOnAction(new	EventHandler<ActionEvent>()	{				
									public	void	handle(ActionEvent	event)	{
										try {
											stage.close();
											new	Main().start(new Stage());
										} catch (Exception e) {
											//
											e.printStackTrace();
										}
									}
								});
								
								
								
								pane.getChildren().addAll(btprodutos, btvoltar, btclientes, btfornecedores, btvendas);

								stage.show();
								
				}
}