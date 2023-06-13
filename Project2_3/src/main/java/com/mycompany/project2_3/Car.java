
package com.mycompany.project2_3;

public abstract class Car extends Vehicle{
    private String color;
    private int seatingCapacity,numOfDoors;
public Car(int id,int plateNumber,int numberOfTires,double dailyFee,String color,int seatingCapacity,int numOfDoors){
    super(id,plateNumber,numberOfTires,dailyFee);    
    this.color=color;
    this.seatingCapacity=seatingCapacity;
    this.numOfDoors=numOfDoors;
}    

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }
    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }
    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

}
