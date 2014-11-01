/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweetwallfx.jdub1581;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.fxyz.cameras.AdvancedCamera;
import org.fxyz.cameras.controllers.FPSController;

/**
 *
 * @author Jason Pollastrini aka jdub1581
 */
public class LogoTest extends Application {
    private final StackPane root = new StackPane();
    private SubScene subScene;
    
    private final Group root3D = new Group();
    private final AdvancedCamera cam = new AdvancedCamera();
    private final FPSController controller = new FPSController();
    //private DevoxxBillboardLogo logo;
    
    @Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("PropertyTest.fxml"));
        DevoxxBillboardLogo logo = new DevoxxBillboardLogo(1500,700); 
        logo.setFrequency(20.0f);
        logo.setPeriod(55.0f);
        logo.setWaveLength(80.0f);
        logo.setAmplitude(65.0f);
        logo.setTranslateZ(2500);
        
        Scene scene = new Scene(root3D,1024, 768, true, SceneAntialiasing.BALANCED); 
        scene.setFill(Color.DARKSLATEGRAY);
        scene.setCamera(cam);
        controller.setScene(scene);
        cam.setController(controller);
       
        
        PointLight light = new PointLight(Color.WHITESMOKE);
        light.setTranslateY(-250);
        light.translateZProperty().bind(logo.translateZProperty().subtract(800));
        
        root3D.getChildren().addAll(cam.getWrapper(), logo, light);
        
        stage.setTitle("3D LogoTest!");
        stage.setScene(scene);
        //stage.setMaximized(true);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
