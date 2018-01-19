package module3.Seri;



import java.io.Serializable;


public class Car extends Transport implements Serializable {
    private transient int id;
    private  String color;
    private  int year;
    private  int mileage;
    private Skoda skoda;

    public Car(int id, String color, int year, int mileage, Skoda skoda, int col) {
        super(col);
        this.id = id;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.skoda = skoda;
    }



    public Skoda getSkoda() {
        return skoda;
    }


    public void setSkoda(Skoda skoda) {
        this.skoda = skoda;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", skoda=" + skoda +
                ",wheels="+getCol()+
                '}';
    }
}
