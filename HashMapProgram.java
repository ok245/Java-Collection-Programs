import java.util.*;

public class HashMapProgram {
    public static void main(String args[]){
        HashMap<String,String> map=new HashMap<>();
        map.put("name", "omkar");
        map.put("age", "26");
        map.put("city", "pune");


        System.out.println("HashMap: " + map);


//       2 Write a Java program to count the number of key-value (size) mappings in a map.
        int size=map.size();
        System.out.println("Number of key-value mappings: " + size);

//     3   Write a Java program to copy all mappings from the specified map to another map.
        HashMap<String,String> map1=new HashMap<>();
        map1.putAll(map);
        System.out.println("copy map into map1 " +map1);


//        4. Write a Java program to remove all mappings from a map.
        map1.clear();
        System.out.println("after remove all elements from map" +map1);


//      5  Write a Java program to test if a hash set is empty or not.
        HashMap<String,String> map2=new HashMap<>();
        map2.put("name","akash");
        if (map2.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty.");
        }


//  6 Write a Java program to get a shallow copy of a HashMap instance
        HashMap<String,String>map3= (HashMap<String, String>) map2.clone();
        System.out.println("Clone Hash Map"+map3);

//     7   Write a Java program to test if a map contains a mapping for the specified key.
        if (map3.containsKey("name")) {
            System.out.println("The map contains the key 'name'.");
        } else {
            System.out.println("The map does not contain the key 'name'.");
        }

//      8  Write a Java program to test if a map contains a mapping for the specified value.
        String str="akash";
        if (map3.containsValue(str)) {
            System.out.println("The map contains the value ."+str);
        } else {
            System.out.println("The map does not contain the value."+str);
        }
//    9 Write a Java program to create a set view of the mappings contained in a map.
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 20);
        fruitMap.put("Orange", 30);
        fruitMap.put("Mango", 40);

        Set<Map.Entry<String,Integer>> entrySet=fruitMap.entrySet();
        for (Map.Entry<String,Integer>entry:entrySet){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
//     10   Write a Java program to get the value of a specified key in a map.
        String key="Banana";
        Integer value=fruitMap.get(key);

        if(value!=null){
            System.out.println("value of a specified key s"+key+":"+value);
        }else {
            System.out.println("key is not present");
        }


//   11 Write a Java program to get a set view of the keys contained in this map.

        Set<String>keySet=fruitMap.keySet();
        for (String fruit:keySet){
            System.out.println("key :"+fruit);

        }

//   12 Write a Java program to get a collection view of the values contained in this map
    Collection<Integer> values=fruitMap.values();
        System.out.println("Collection view of map values:");
        for (Integer fruit : values) {
            System.out.println(fruit);
        }








    }
}
