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
                ", series =" + series ;
    }
}
