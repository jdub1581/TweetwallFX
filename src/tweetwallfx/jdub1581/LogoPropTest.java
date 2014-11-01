/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweetwallfx.jdub1581;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Jason Pollastrini aka jdub1581
 */
public class LogoPropTest extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PropertyTest.fxml"));        
        Parent logo = loader.load();
        TestController controller = (TestController)loader.getController();
        
        Button btn = new Button();
        btn.setText("Animate");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                controller.getLogo().setAnimated(!controller.getLogo().isAnimated());
            }
        });
        StackPane.setAlignment(btn, Pos.BOTTOM_LEFT);
        StackPane.setMargin(btn, new Insets(10));
        
        root.getChildren().addAll(logo, btn);
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
