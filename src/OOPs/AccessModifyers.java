//if the Access mod is private the nno one can access the variable from outside the Class.
//to do the same we have to create getters and setters.

package OOPs;

public class AccessModifyers {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(34);
        System.out.println(l1.getPrice());

    }
}
 class Laptop{
    int ram;
    private int price;
    //Creating a setter
     public void setPrice(int price){
         this.price = price;
     }

     //Creating Setters
    public int getPrice(){
         return this.price;
    }

}
