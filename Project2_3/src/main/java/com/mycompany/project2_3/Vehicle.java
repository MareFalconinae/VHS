
package com.mycompany.project2_3;
import java.util.ArrayList;
import java.util.Date;
public abstract class Vehicle implements IRentable{
    private Date startDate;
    private Date finalDate;
    private int id;
    private final int plateNumber, numberOfTires;
    private double dailyFee;
    
public Vehicle(int id,int plateNumber,int numberOfTires,double dailyFee){    
    this.id=id;
    this.plateNumber=plateNumber;
    this.numberOfTires=numberOfTires;
    this.dailyFee=dailyFee;
}
    public double getDailyFee(Vehicle v,Date e){
    Date d=new Date();
    int numberOfDays=(int)(e.getTime()-d.getTime())/86400000;
    return getDailyFee()*numberOfDays;
    }
    
    @Override
    public void rentMe(ArrayList<Vehicle> alist,ArrayList<Vehicle> rlist,Date s,Date f) throws SorryWeDontHaveThatOneException{
        if(!alist.contains(this)){
            throw new SorryWeDontHaveThatOneException("We dont have that vehicle");
        }
        else{
            rlist.add(this);
        }
    }
    @Override
    public void dropMe(ArrayList<Vehicle> alist,ArrayList<Vehicle> rlist){
        rlist.remove(this);
        alist.add(this);
        System.out.println("total price is: "+getDailyFee(this,this.getFinalDate()));
    }
    
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }
    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public double getDailyFee() {
        return dailyFee;
    }
    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }

}