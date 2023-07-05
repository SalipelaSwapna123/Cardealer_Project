package project;

class Car {
    private String model;
    private int showroomPrice;

    public Car(String model, int showroomPrice) {
        this.model = model;
        this.showroomPrice = showroomPrice;
    }

    public String getModel() {
        return model;
    }

    public int getShowroomPrice() {
        return showroomPrice;
    }
}
