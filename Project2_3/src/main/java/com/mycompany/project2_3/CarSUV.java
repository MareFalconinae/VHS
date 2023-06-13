
package com.mycompany.project2_3;

public class CarSUV extends Car{
    private String WD;
public CarSUV(int id,int plateNumber,int numberOfTires,double dailyFee,String color,int seatingCapacity,int numOfDoors,String WD){
   super(id,plateNumber,numberOfTires,dailyFee,color,seatingCapacity,numOfDoors); 
   this.WD=WD;
}    
public CarSUV(){
}
    public String getWD() {
        return WD;
    }
    public void setWD(String WD) {
        this.WD = WD;
    }
}

