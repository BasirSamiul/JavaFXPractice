package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		try {

//			Text txt = new Text("Welcome to JavaFX!!!");
//			
//			Button btn = new Button("Exit");
//
//			VBox root = new VBox();
//
//			root.getChildren().add(txt);
//			root.getChildren().add(btn);
//			
//			btn.setOnAction(e -> Platform.exit());

			Label nameFld = new Label("Please, Enter your name:");

			TextField txtFld = new TextField();

			Label msg = new Label();
			msg.setStyle("-fx-text-fill: blue;");

			Button btn = new Button("Say Hello");
			Button btnExit = new Button("Exit");

			btn.setOnAction(e -> {
				String name = txtFld.getText();
				if (name.trim().length() > 0) {
					msg.setText("Hello " + name);
				} else {
					msg.setText("Hello There!");
				}
			});

			btnExit.setOnAction(e -> {
				Platform.exit();
			});

			VBox root = new VBox();
			root.setSpacing(5);
			root.getChildren().addAll(nameFld, txtFld, msg, btn, btnExit);

			Scene scene = new Scene(root, 500, 300);
			primaryStage.setTitle("Welcome to JavaFX!!!");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
