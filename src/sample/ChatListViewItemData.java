package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class ChatListViewItemData {
    @FXML
    private HBox hBox;
    @FXML
    private Label label1;

    public ChatListViewItemData() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chatListViewItem.fxml"));
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
    public void setInfo(String string)
    {
        label1.setText(string);
    }

    public HBox getBox()
    {
        return hBox;
    }
}
