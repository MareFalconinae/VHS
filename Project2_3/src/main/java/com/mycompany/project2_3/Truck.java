
package com.mycompany.project2_3;
import java.util.ArrayList;
import java.util.Date;
public class Truck extends Vehicle implements IBookable,ILoadable{
    private double loadingCapacity;
public Truck(int id,int plateNumber,int numberOfTires,double dailyFee,double loadingCapacity){
    super(id,plateNumber,numberOfTires,dailyFee);
    this.loadingCapacity=loadingCapacity;
}
public Truck(){
    
}
    @Override 
    public void bookMe(ArrayList<Vehicle> alist,ArrayList<Vehicle> blist,Date s,Date e) throws SorryWeDontHaveThatOneException{
    if(!alist.contains(this)){
        throw new SorryWeDontHaveThatOneException("we don't have that truck");
    }
    else{
        blist.add(this);
    }
    }
    @Override
    public void cancelMe(ArrayList<Vehicle> alist,ArrayList<Vehicle> blist,Date s,Date c) throws NoCancellationYouMustPayException{
    if(blist.contains(this) && c.getTime()>s.getTime()){
        throw new NoCancellationYouMustPayException("no cancellation till you pay");
    }
    else{
        blist.remove(this);
        alist.add(this);
    }
    }
    @Override 
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
