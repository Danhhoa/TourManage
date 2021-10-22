package com.example.tour_project;

public class TourLists {
    private int idTour;
    private String namePacket;
    private String feature;


    public TourLists(int idTour, String namePacket, String feature) {
        this.idTour = idTour;
        this.namePacket = namePacket;
        this.feature = feature;
    }

    public TourLists() {
    }

    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public String getNamePacket() {
        return namePacket;
    }

    public void setNamePacket(String namePacket) {
        this.namePacket = namePacket;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }


}