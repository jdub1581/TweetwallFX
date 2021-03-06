package tweetwallfx;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.scene.DepthTest;
import javafx.scene.paint.Color;
import javafx.scene.paint.Material;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
import org.fxyz.shapes.containers.ShapeContainer;

/**
 * TweetWallFX - Devoxx 2014
 * @johanvos @SvenNB @SeanMiPhillips @JPeredaDnr
 * 
 * SegmentedTorus is based in Torus from F(x)yz, but allows a segmented Torus Mesh
 */
public class SegmentedTorus extends ShapeContainer<SegmentedTorusMesh> {

    public SegmentedTorusMesh mesh;

    public SegmentedTorus() {
        super(new SegmentedTorusMesh());
        this.mesh = getShape();        
    }
    
    public SegmentedTorus(double radius, double tRadius){
        this();
        mesh.setRadius(radius);
        mesh.setTubeRadius(tRadius);
    }
    
    public SegmentedTorus(int rDivs, int tDivs, int crop, double radius, double tRadius) {
        this();
        mesh.setRadiusDivisions(rDivs);
        mesh.setTubeDivisions(tDivs);
        mesh.setTorusCrop(crop);
        mesh.setRadius(radius);
        mesh.setTubeRadius(tRadius);
        mesh.setDepthTest(DepthTest.ENABLE);
    }

    public SegmentedTorus(Color c) {
        this();
        this.setDiffuseColor(c);
    }
    
    public SegmentedTorus(double radius, double tRadius, Color c){
        this(radius, tRadius);
        this.setDiffuseColor(c);
    }
    
    public SegmentedTorus(int rDivs, int tDivs, int crop, double radius, double tRadius, Color c) {
        this(rDivs, tDivs, crop, radius, tRadius);
        this.setDiffuseColor(c);
    }

    public final int getRadiusDivisions() {
        return mesh.getRadiusDivisions();
    }

    public final void setRadiusDivisions(int value) {
        mesh.setRadiusDivisions(value);
    }

    public IntegerProperty radiusDivisionsProperty() {
        return mesh.radiusDivisionsProperty();
    }

    public final int getTubeDivisions() {
        return mesh.getTubeDivisions();
    }

    public final void setTubeDivisions(int value) {
        mesh.setTubeDivisions(value);
    }

    public IntegerProperty tubeDivisionsProperty() {
        return mesh.tubeDivisionsProperty();
    }

    public final int getTorusCrop() {
        return mesh.getTorusCrop();
    }

    public final void setTorusCrop(int value) {
        mesh.setTorusCrop(value);
    }

    public IntegerProperty torusCropProperty() {
        return mesh.torusCropProperty();
    }

    public final double getRadius() {
        return mesh.getRadius();
    }

    public final void setRadius(double value) {
        mesh.setRadius(value);
    }

    public DoubleProperty radiusProperty() {
        return mesh.radiusProperty();
    }

    public final double getTubeRadius() {
        return mesh.getTubeRadius();
    }

    public final void setTubeRadius(double value) {
        mesh.setTubeRadius(value);
    }

    public DoubleProperty tubeRadiusProperty() {
        return mesh.tubeRadiusProperty();
    }

    public final double getTubeStartAngleOffset() {
        return mesh.getTubeStartAngleOffset();
    }

    public void setTubeStartAngleOffset(double value) {
        mesh.setTubeStartAngleOffset(value);
    }

    public DoubleProperty tubeStartAngleOffsetProperty() {
        return mesh.tubeStartAngleOffsetProperty();
    }

    public final double getxOffset() {
        return mesh.getxOffset();
    }

    public void setxOffset(double value) {
        mesh.setxOffset(value);
    }

    public DoubleProperty xOffsetProperty() {
        return mesh.xOffsetProperty();
    }

    public final double getyOffset() {
        return mesh.getyOffset();
    }

    public void setyOffset(double value) {
        mesh.setyOffset(value);
    }

    public DoubleProperty yOffsetProperty() {
        return mesh.yOffsetProperty();
    }

    public final double getzOffset() {
        return mesh.getzOffset();
    }

    public void setzOffset(double value) {
        mesh.setzOffset(value);
    }

    public DoubleProperty zOffsetProperty() {
        return mesh.zOffsetProperty();
    }

    public final void setMaterial(Material value) {
        mesh.setMaterial(value);
    }

    public final void setDrawMode(DrawMode value) {
        mesh.setDrawMode(value);
    }

    public final void setCullFace(CullFace value) {
        mesh.setCullFace(value);
    }
    
}
