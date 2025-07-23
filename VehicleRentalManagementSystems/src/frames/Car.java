
package frames;


public class Car {
    

    public Car() {
    }
    private int id;
    private int plate;
    private String brand;
    private String model;
    private String color;
    private int year;
    private double price;
    private boolean available;
   
    public Car(int id, int plate, String brand, String model, String color,
            int year, double price, boolean available){
        this.id = id;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.available =  available;
    
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id= id;
    }
    public int getPlate() {
        return plate;
    }
    public void setPlate(int plate) {
        this.plate = plate;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
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
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
}

    

