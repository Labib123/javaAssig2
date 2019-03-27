/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author ASUS
 */
public class Parcel {
private double weight  ; 
private char destination ; 
private double cost ; 

    /**
     * @param args the command line arguments
     */
   /*constructor method */
    public Parcel (double userWeight , char userDestination){
        weight = userWeight; 
        destination = userDestination ; 
    }
       /*eright Getter method */
    public double getWeight() {
        return weight ; 
    }
       /*destination Getter method */
    public char getDestination(){
        return destination ; 
    }
           /*weight Setter method */
    public void setWeight(double newWeight) {
        this.weight = newWeight ; 
    }
               /*Destination Setter method */
    public void setDestination(char newDestination) {
        this.destination = newDestination ; 
    }
    /*Get Cost method */
    public double getCost(){
        if (this.destination == 'd' || this.destination=='D'){
            computeDomesticCost() ; 
        }
        else if (this.destination == 'i' || this.destination=='I'){
         computeInternationalCost() ; 
        }
    return cost ; 

    }
        /*computeDomesticCost  method */
    private double computeDomesticCost(){
        if (this.weight < 1 ) { 
            this.cost = 6.5 ; 
        }
        else if (this.weight >= 1 && this.weight <5  ){
            this.cost = 7.50 ; 
        }
        else if (this.weight >= 5 ){
            this.cost = 9.00 ; 
        }
        return cost ; 
    }
            /*computeInternationalCost  method */

    private double computeInternationalCost(){
        if (this.weight <= 500 ) {
          return  this.cost = 52.20 ;       
        }
        else if (weight > 500 ){
            double additional = this.weight / 500 ; 
            return (additional * 10.50)  ; 
        }
         return cost ; 
    }
    /*validateParcelWeight method*/
    static boolean validateParcelWeight(double Vweight , char Vdestination){
       if (Vdestination == 'D' || Vdestination == 'd' )  {
           if ( Vweight > 30 ){
               return false ; 
           }
          }
       else if (Vdestination == 'I' || Vdestination == 'i'){
           if(Vweight > 20 ) {
               return false ; 
           }
       }
    return true;
    }
    /*toString' method which return a single String containing the details of a parcel*/
    public String toString (){  
    if (this.destination == 'D' || this.destination == 'd') {
        return( "A domestic" + this.weight + "kg parcel , with cost RM " + this.cost ) ; 
        }
    else {
        return ( "A international" + this.weight + "kg parcel , with cost RM " + String.format("%.2f", this.weight) ) ; 
    }

}
     public static void main(String[] args) {
        Parcel obj1 = new Parcel(18,'i') ; 
         System.out.println(obj1.computeInternationalCost());
    }
}
