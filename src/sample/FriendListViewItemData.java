package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class FriendListViewItemData {
    @FXML
    private HBox hBox;
    @FXML
    private Label username;

    public FriendListViewItemData() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FriendListViewItem.fxml"));
        fxmlLoader.setController(this);
        try
        {
            fxmlLoader.load();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    public void setInfo(Friend friend)
    {
        username.setText(friend.getUsername());
    }

    public HBox getBox()
    {
        return hBox;
    }
}
