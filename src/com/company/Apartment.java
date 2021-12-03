package com.company;

public class Apartment {
    private double totalArea;
    private double livingArea;
    private double kitchenArea;
    private boolean isExistBathroom;
    private boolean isBathroomConnected;
    private boolean isExistLoggia;
    private boolean isBrick;
    private boolean isPanel;
    private int totalLevels;
    private int levelOfApartment;
    private String address;
    private int cost;


    public Apartment(double totalArea, double livingArea, double kitchenArea, boolean isExistBathroom, boolean isBathroomConnected, boolean isExistLoggia, boolean isBrick, boolean isPanel, int totalLevels, int levelOfApartment, String address, int cost) {
        this.totalArea = totalArea;
        this.livingArea = livingArea;
        this.kitchenArea = kitchenArea;
        this.isExistBathroom = isExistBathroom;
        this.isBathroomConnected = isBathroomConnected;
        this.isExistLoggia = isExistLoggia;
        this.isBrick = isBrick;
        this.isPanel = isPanel;
        this.totalLevels = totalLevels;
        this.levelOfApartment = levelOfApartment;
        this.address = address;
        this.cost = cost;
    }

    public Apartment() {

    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public double getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(double livingArea) {
        this.livingArea = livingArea;
    }

    public double getKitchenArea() {
        return kitchenArea;
    }

    public void setKitchenArea(double kitchenArea) {
        this.kitchenArea = kitchenArea;
    }

    public boolean isExistBathroom() {
        return isExistBathroom;
    }

    public void setExistBathroom(boolean existBathroom) {
        isExistBathroom = existBathroom;
    }

    public boolean isBathroomConnected() {
        return isBathroomConnected;
    }

    public void setBathroomConnected(boolean bathroomConnected) {
        isBathroomConnected = bathroomConnected;
    }

    public boolean isExistLoggia() {
        return isExistLoggia;
    }

    public void setExistLoggia(boolean existLoggia) {
        isExistLoggia = existLoggia;
    }

    public boolean isBrick() {
        return isBrick;
    }

    public void setBrick(boolean brick) {
        isBrick = brick;
    }

    public boolean isPanel() {
        return isPanel;
    }

    public void setPanel(boolean panel) {
        isPanel = panel;
    }

    public int getTotalLevels() {
        return totalLevels;
    }

    public void setTotalLevels(int totalLevels) {
        this.totalLevels = totalLevels;
    }

    public int getLevelOfApartment() {
        return levelOfApartment;
    }

    public void setLevelOfApartment(int levelOfApartment) {
        this.levelOfApartment = levelOfApartment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "totalArea=" + totalArea +
                ", livingArea=" + livingArea +
                ", kitchenArea=" + kitchenArea +
                ", isExistBathroom=" + isExistBathroom +
                ", isBathroomConnected=" + isBathroomConnected +
                ", isExistLoggia=" + isExistLoggia +
                ", isBrick=" + isBrick +
                ", isPanel=" + isPanel +
                ", totalLevels=" + totalLevels +
                ", levelOfApartment=" + levelOfApartment +
                ", address='" + address + '\'' +
                ", cost=" + cost +
                '}';
    }
}