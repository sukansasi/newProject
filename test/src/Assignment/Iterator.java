package Assignment;
import java.util.ArrayList;

public class Iterator {


        public static void main(String[] args) {

            // Make a collection
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("Volkswagen");
            cars.add("Ford");
            cars.add("Mazda");
            

            // Get the iterator
            java.util.Iterator<String> it = cars.iterator();


            // Loop through a collection
          while(it.hasNext()) {
                String jeep = it.next();
              //if(jeep.contains("Vol")){
                //if(jeep.contains("Ford"));

               //   it.remove();


            }
            System.out.println(cars);
        }
    }

