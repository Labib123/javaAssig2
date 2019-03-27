package javaapplication3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class ParcelList {
    private Parcel[] parcels ;
    private final int SIZE = 50; //static constant for storing the maximum number of parcels
    private int count ; // keep track of how many Parcel objects are actually stored
    int costCall =0 ; 
    public ParcelList(int vLenthOfArr){
        if (vLenthOfArr > 0 ) {
            String pList[] = new String[vLenthOfArr] ;
        }
        else {
            String pList[] = new String[SIZE]; 
        }
    }
    public boolean add(Parcel p ){
        if (count == SIZE ) 
               return false ;
        parcels[count] = p ; 
        count ++ ; 
        return true ; 
}
    public void getNumOfParcels(){
        
    }
    public String allParcels(){
        String msq = "All parcels \n " ; 
        for(int i = 0 ; i < count; i++)
           msq += parcels[i].toString() + "\n" ; 
        return msq ; 
    }
    public double totalCost(){
        double sum = 0.0;  
        for(int i =0 ; i < count ; i++)
            sum +=  parcels[i].getCost() ; 
        return sum ; 
    }
    public Parcel getMaxCostParcel(){
        double max = 0.0; 
        for(int i = 0 ; i < count ; i++){
            if(parcels[i].getCost() > max ){
             max +=  parcels[i].getCost()  ; 
             return parcels[i] ; 
        }   
    }
        return parcels[0] ; 
    }
    public void getParcelsByCost(double cost1 , double cost2) {
        for(int i=0 ; i > count ; i++)
            if( cost1 > parcels[i].getCost() && parcels[i].getCost()  < cost2 ) {
                costCall++ ; 
            }
            Parcel[] costCallArr = new Parcel[costCall] ;
    }
}