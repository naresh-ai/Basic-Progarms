package Collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashmapExamle {

        public static void main(String[] args) {
            // Creating a HashMap
            HashMap<String, Integer> map = new HashMap<>();

            // Adding key-value pairs to the HashMap
            map.put("Apple", 10);
            map.put("Banana", 20);
            map.put("Orange", 30);
            map.put("Grapes", 40);


            int appleQuantity = map.get("Apple");
            System.out.println("Quantity of Apples: " + appleQuantity);

            // Iterating through the HashMap using Map.Entry
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println("Fruit: " + key + ", Quantity: " + value);
            }
        }
    }



