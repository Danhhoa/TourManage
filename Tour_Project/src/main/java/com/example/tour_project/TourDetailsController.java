package com.example.tour_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class TourDetailsController {
    @FXML
    Label tourLabel;

    @FXML
    Label nameLabel;

    @FXML
    Label typeLabel;

    @FXML
    Label featureLabel;

    @FXML
    Label startTimeLable;

    @FXML
    Label endTimeLable;

    @FXML
    Label priceLabel;

    // truyen data tu controler nay sang controller khác
    public void setTourList(TourLists tourList) {
        tourLabel.setText(String.valueOf(tourList.getIdTour()));
        nameLabel.setText(String.valueOf(tourList.getNamePacket()));
        featureLabel.setText(String.valueOf(tourList.getFeature()));
    }

    public void goBack(ActionEvent e) throws IOException {
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("tour-lists.fxml"));
        Parent tourListParent = loader.load();
        Scene scene = new Scene(tourListParent);

        stage.setScene(scene);
    }
}
