package bg.smg;

public class Car extends Vehicle implements Comparable<Car> {
    String make;
    String model;
    int year;

    public Car(){
        this.make = "";
        this.model = "";
        this.year = 0;
    }
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake(){
        return make;
    }
   public void setMake(String model){
        this.make = model;
   }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    @Override
    public void drive(){System.out.println("Kolata se dviji");}

    @Override
    public int compareTo(Car o) {
        if (this.getYear() <o.getYear()){
            return -1;
        } else if(this.getYear() > o.getYear()) {
            return 1;
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
