package quiz;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Quiz1 extends Application implements EventHandler<ActionEvent> {
    Button knappen1;
    Button knappen2;
    Button knappen3;
    Button knappen4;
    Text visare;
    Text fraga;
    String fragor = "Vad är bäst";
    Text svar;
    String svars = "svar 1, svar 2, svar 3, svar 4";




    public static void main(String[] args) {
        launch(args);
        String fraga1="Vilken bilmärke är bäst\n" + "(a)volvo/\n(b)BMW\n(c)Audi\n"; // frågor med svars

        String fraga2="Vilken dricka är bäst\n" + "(a)Fanta/\n(b)Sprite\n(c)Cola\n";

        frogorfil[] questions = {

                new frogorfil(fraga1, "a"), // skickar in frågor och svars
                new frogorfil(fraga2,"c")
        };
        Test(questions);

    }
        public static void Test(frogorfil[] question){
        int score = 0;
        for(int i = 0; i < question.length; i++){

            if() //vet inte hur man gör så att en knapp fungerar med if//


        }


        }
    @Override
    public void start(Stage primaryStage) throws Exception {
        int i = 0;
        visare = new Text(String.valueOf(i));
        visare.setTranslateY(10);
        visare.setTranslateX(50);

        fraga = new Text(String.valueOf(fragor));
        fraga.setTranslateY(200);
        fraga.setTranslateX(200);


        svar = new Text(String.valueOf(svars));
        svar.setTranslateX(500);
        svar.setTranslateY(200);





        
        knappen1 = new Button("svar 1");
        knappen1.setMinWidth(100);
        knappen1.setMinHeight(50);
        knappen1.setTranslateY(400);
        knappen1.setOnAction(this);

        knappen2 = new Button("svar 2");
        knappen2.setMinWidth(100);
        knappen2.setMinHeight(50);
        knappen2.setTranslateX(200);
        knappen2.setTranslateY(400);
        knappen2.setOnAction(this);

        knappen3 = new Button("svar 3");
        knappen3.setMinWidth(100);
        knappen3.setMinHeight(50);
        knappen3.setTranslateX(400);
        knappen3.setTranslateY(400);
        knappen3.setOnAction(this);

        knappen4 = new Button("svar 2");
        knappen4.setMinWidth(100);
        knappen4.setMinHeight(50);
        knappen4.setTranslateX(600);
        knappen4.setTranslateY(400);
        knappen4.setOnAction(this);










        Group root = new Group();
        root.getChildren().add(knappen1);
        root.getChildren().add(knappen2);
        root.getChildren().add(knappen3);
        root.getChildren().add(knappen4);
        root.getChildren().add(visare);
        root.getChildren().add(fraga);
        root.getChildren().add(svar);


        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    @Override
    public void handle(ActionEvent actionEvent) {








    }
}
