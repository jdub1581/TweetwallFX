/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweetwallfx.jdub1581;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.PointLight;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import org.fxyz.cameras.AdvancedCamera;
import org.fxyz.cameras.controllers.FPSController;

/**
 * FXML Controller class
 *
 * @author Jason Pollastrini aka jdub1581
 */
public class TestController implements Initializable {
    @FXML
    private AnchorPane anchor;
    @FXML
    private VBox sliders;
    @FXML
    private Slider freqSlider;
    @FXML
    private Slider perSlider;
    @FXML
    private Slider zSlider;
    @FXML
    private Slider rdSlider;
    @FXML
    private SubScene subScene;

    private final Group root = new Group();
    private final AdvancedCamera cam = new AdvancedCamera();
    private final FPSController controller = new FPSController();
    private final DevoxxBillboardLogo logo = new DevoxxBillboardLogo();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {   
        anchor.getChildren().remove(subScene);
        
        subScene = new SubScene(root, 1024, 768, true, SceneAntialiasing.BALANCED);
        subScene.widthProperty().bind(anchor.widthProperty());
        subScene.heightProperty().bind(anchor.heightProperty());        
        subScene.setCamera(cam); 
        subScene.setRoot(root);
        
        anchor.getChildren().addAll(subScene);
        
        controller.setSubScene(subScene);
        cam.setController(controller);
        cam.setTranslateZ(-2500);
        
        PointLight light = new PointLight(Color.WHITESMOKE);
        light.setTranslateY(-250);
        light.setTranslateZ(-400);
        
        root.getChildren().addAll(cam, logo, light);
        
        freqSlider.setValue(logo.getFrequency());       
        logo.frequencyProperty().bind(freqSlider.valueProperty());
        
        perSlider.setValue(logo.getPeriod());
        logo.periodProperty().bind(perSlider.valueProperty());
        
        zSlider.setValue(logo.getPeriod());
        logo.waveLengthProperty().bind(zSlider.valueProperty());
        
        rdSlider.setValue(logo.getPeriod());
        logo.amplitudeProperty().bind(rdSlider.valueProperty());
        
        sliders.toFront();
    }    

    public DevoxxBillboardLogo getLogo() {
        return logo;
    }

    
    
}
