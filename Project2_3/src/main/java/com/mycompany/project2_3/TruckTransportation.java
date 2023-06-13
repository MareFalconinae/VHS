
package com.mycompany.project2_3;

public class TruckTransportation extends Truck{
    private boolean isAbroad;
public TruckTransportation(int id,int plateNumber,int numberOfTires,double dailyFee,double loadingCapacity,boolean isAbroad){
    super(id,plateNumber,numberOfTires,dailyFee,loadingCapacity);    
    this.isAbroad=isAbroad;
}    

    public boolean isIsAbroad() {
        return isAbroad;
    }
    public void setIsAbroad(boolean isAbroad) {
        this.isAbroad = isAbroad;
    }
}
