package web.model;

public class Car {
    private String model;
    private String color;
    private int series;

    public Car(String model, String color, int series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }



    @Override
    public String toString() {
        return "Car " +
                "model ='" + model + "'\n" +
                ", color ='" + color +"'\n" +
                ", series =" + series  ;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSeries() {
        return series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
