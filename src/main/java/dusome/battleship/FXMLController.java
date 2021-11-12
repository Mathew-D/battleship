package dusome.battleship;

/*
Put header here
MAthew Dusome
2222
 */

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class FXMLController implements Initializable {

    @FXML
    private ImageView img1;
    @FXML
    private ImageView img2;

    int rand = ThreadLocalRandom.current().nextInt(1, 2 + 1);

    @FXML
    void imgClick(MouseEvent event) {
        ImageView img = (ImageView) event.getSource();
        Image king = new Image(getClass().getResource("/king.png").toString());
        if (rand == 1 && img.getId().equals("img1")) {
            img.setImage(king);
        } else if (rand == 2 && img.getId().equals("img2")) {
            img.setImage(king);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
