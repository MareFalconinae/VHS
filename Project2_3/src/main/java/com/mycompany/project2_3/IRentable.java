
package com.mycompany.project2_3;
import java.util.Date;
import java.util.ArrayList;
public interface IRentable {
    public  void rentMe(ArrayList<Vehicle> alist,ArrayList<Vehicle> rlist,Date s,Date e) throws SorryWeDontHaveThatOneException;    
    public  void dropMe(ArrayList<Vehicle> alist,ArrayList<Vehicle> rlist);
}
