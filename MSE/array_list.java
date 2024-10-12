

// import the ArrayList class
import java.util.*;



public class array_list {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<String> cars2 = new ArrayList<String>(); // Create an ArrayList object
        cars.add("BMW");
        cars.add("Suzuki");
        cars.add("Ford");
        cars.add("TATA");
        System.out.println(cars);


        cars.add(0, "Mazada"); //Insert element at the beginning  (item_number, input_value)
        cars.add(3, "Swift");
        System.out.println(cars);

        cars.get(3); //Accessing the array
        

        cars.set(0, "Volvo"); //modify existing list
        System.out.println(cars);

        cars.remove(3); //REmove from list
        System.out.println(cars);

         //returns size of arraylist
        System.out.println(cars.size());

        //cars.clear(); //empty the arraylist
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);
        cars.addAll(cars2);
        
        for(String i: cars)
        {
            System.out.println(i);
        }
        System.out.println(cars2);

    

    }
}
