/*Create a base class Vehicle with a method move(). Then, create two subclasses
Car and Bike that provide their own implementation of move(), printing messages like
"The car moves" and "The bike moves". Instantiate objects of both subclasses and call
the move() method to demonstrate inheritance.
 */
public class vehicles {
  public static void main(String[] args) {
      car car = new car();
      bike bike = new bike();
      car.move();
      bike.move();
  }  
}

class vehicle{
    public void move(){
        System.out.println("Vehicle moves");
    
    }
}
class car extends vehicle{
    public void move(){
        System.out.println("The car moves");
    }
}
class bike extends vehicle{
    public void move(){
        System.out.println("The bike moves");
        }
        }

