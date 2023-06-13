
package com.mycompany.project2_3;
import java.util.Date;
import java.util.ArrayList;
public class CarSport extends Car implements IBookable{
    private double HP;  
public CarSport(int id,int plateNumber,int numberOfTires,double dailyFee,String color,int seatingCapacity,int numOfDoors,double HP){
    super(id,plateNumber,numberOfTires,dailyFee,color,seatingCapacity,numOfDoors); 
    this.HP=HP;
}
    @Override 
    public void bookMe(ArrayList<Vehicle> alist,ArrayList<Vehicle> blist,Date s,Date e) throws SorryWeDontHaveThatOneException{
    if(!alist.contains(this)){
        throw new SorryWeDontHaveThatOneException("we don't have that sport car");
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
    public double getHP() {
        return HP;
    }
    public void setHP(double HP) {
        this.HP = HP;
    }

}
