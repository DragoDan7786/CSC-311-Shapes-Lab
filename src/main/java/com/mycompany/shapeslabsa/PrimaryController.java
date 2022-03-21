package com.mycompany.shapeslabsa;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private Rectangle theRectangle;

    @FXML
    private Circle theCircle;

    @FXML
    private void moveRect() {

        Translate moveRect = new Translate();
        moveRect.setX(100);
        theRectangle.getTransforms().add(moveRect);

    }

    @FXML
    private void moveAll() {
        
        Translate moveAll = new Translate();
        moveAll.setX(200);
        theRectangle.getTransforms().add(moveAll);
        theCircle.getTransforms().add(moveAll);
    }
    
    @FXML
    private void rotateRect(){
        Rotate rotateRect = new Rotate();
        rotateRect.setAngle(60);
        rotateRect.setPivotX(theRectangle.getWidth()/2);
        rotateRect.setPivotY(theRectangle.getHeight()/2);
        theRectangle.getTransforms().add(rotateRect);
        
    }
}
