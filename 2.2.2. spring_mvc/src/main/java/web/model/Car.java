package web.model;

public class Car {
    private int id;
    private String color;
    private String model;

    public Car(int color, String series, String model) {
        this.id = color;
        this.color = series;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car" +
                " id = " + id +
                " color = " + color +
                " model = " + model;
    }
}
