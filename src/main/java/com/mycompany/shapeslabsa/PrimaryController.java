package com.mycompany.shapeslabsa;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private Rectangle theRectangle;

    @FXML
    private void moveRect() {

        Translate moveRect = new Translate();
        moveRect.setX(100);
        theRectangle.getTransforms().add(moveRect);

    }
}
