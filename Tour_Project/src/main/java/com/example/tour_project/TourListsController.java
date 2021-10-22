package com.example.tour_project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TourListsController implements Initializable {
    @FXML
    private TableView<TourLists> tableListTours;

    @FXML
    private TableColumn<TourLists, Integer> idTourColumn;

    @FXML
    private TableColumn<TourLists, String> namePacketColumn;

    @FXML
    private TableColumn<TourLists, String> featureColumn;

    private ObservableList<TourLists> tourList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tourList = FXCollections.observableArrayList(
                new TourLists(1, "Sài Gòn - Đà Lạt - Nha Trang", "bla bla" ),
                new TourLists(2, "Cần Giờ - Vũng Tàu - Phú Quốc ", "Sang, xịn mịn, bla bla" )

        );
        idTourColumn.setCellValueFactory(new PropertyValueFactory<TourLists, Integer>("idTour"));
        namePacketColumn.setCellValueFactory(new PropertyValueFactory<TourLists, String>("namePacket"));
        featureColumn.setCellValueFactory(new PropertyValueFactory<TourLists, String>("feature"));

        tableListTours.setItems(tourList);
    }

    public void gotoDetails(ActionEvent e) throws IOException {
        //lấy stage hiện tại
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("tour-details.fxml"));
        Parent tourDetailsParent = loader.load();
        Scene scene = new Scene(tourDetailsParent);

        TourDetailsController controller = loader.getController();
        TourLists selected = tableListTours.getSelectionModel().getSelectedItem();
        controller.setTourList(selected);

        stage.setScene(scene);
    }
}
