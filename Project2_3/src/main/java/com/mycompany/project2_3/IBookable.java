package com.mycompany.project2_3;
import java.util.ArrayList;
import java.util.Date;
public interface IBookable{
    public  void bookMe(ArrayList<Vehicle> alist,ArrayList<Vehicle> blist,Date s,Date e) throws SorryWeDontHaveThatOneException;
    public  void cancelMe(ArrayList<Vehicle> alist,ArrayList<Vehicle> blist,Date s,Date e) throws NoCancellationYouMustPayException;
}

