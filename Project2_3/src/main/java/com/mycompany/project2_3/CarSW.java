
package com.mycompany.project2_3;

public class CarSW extends Car implements ILoadable{
    private double loadingCapacity;
public CarSW(int id,int plateNumber,int numberOfTires,double dailyFee,String color,int seatingCapacity,int numOfDoors,double loadingCapacity){
    super(id,plateNumber,numberOfTires,dailyFee,color,seatingCapacity,numOfDoors);
    this.loadingCapacity=loadingCapacity;
}    
    public void loadMe(double lc) throws OverWeightException{
        if(lc>getLoadingCapacity()){
            throw new OverWeightException("overwieght");
        }
    }
    public double getLoadingCapacity() {
        return loadingCapacity;
    }
    public void setLoadingCapacity(double loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }
}
