package sample;

import com.google.gson.JsonArray;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
@FXML private TableView<Info> tableView;
@FXML private TableColumn<Info , String> idColumn;
@FXML private TableColumn<Info , String> buyColumn;
@FXML private TableColumn<Info , String> sellColumn;
@FXML private TableColumn<Info , String> supplyColumn;
@FXML private TableColumn<Info , String> demandColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
idColumn.setCellValueFactory((new PropertyValueFactory<Info,String>("id")));
buyColumn.setCellValueFactory((new PropertyValueFactory<Info,String>("buy")));
sellColumn.setCellValueFactory((new PropertyValueFactory<Info,String>("sell")));
supplyColumn.setCellValueFactory((new PropertyValueFactory<Info,String>("supply")));
demandColumn.setCellValueFactory((new PropertyValueFactory<Info,String>("demand")));

tableView.setItems(getInfo());
    }
    public ObservableList<Info> getInfo(){
ObservableList<Info> info = FXCollections.observableArrayList();


info.add(new Info("1010101","2385","94893","3353053","42535"));
        info.add(new Info("1010101","2385","94893","3353053","42535"));
        info.add(new Info("1010101","2385","94893","3353053","42535"));
        return info;
    }

}
