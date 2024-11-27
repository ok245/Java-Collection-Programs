import java.util.*;

public class HashSetProgram {

    public static  void  main(String args[]){
        HashSet<String> set=new HashSet<>();

        set.add("Omkar");
        set.add("Ajay");
        set.add("Rushi");
        set.add("Akash");
        set.add("Suraj");

        for(String name:set){
            System.out.println("name :"+name);
        }

        Iterator iterator=set.iterator();
        System.out.println("using iterator");
        while(iterator.hasNext()){
            System.out.println("name :"+iterator.next());


        }

//       3 Write a Java program to get the number of elements in a hash set
        int numberOfElement=set.size();
        System.out.println(numberOfElement);

//      4  Write a Java program to empty an hash set
        System.out.println("Before Clear"+set);
//        set.clear();
        System.out.println("After clear"+set);

//     5   Write a Java program to test if a hash set is empty or not.
        if(set.isEmpty()){
            System.out.println("set is empty");
        }else {
            System.out.println("set not empty");
        }

//      6  Write a Java program to clone a hash set to another hash set.
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("after clone set"+clonedSet);

 //       7. Write a Java program to convert a hash set to an array.
        Object[] arr=  set.toArray();
        System.out.println("convert to array"+arr.getClass());

//     8    Write a Java program to convert a hash set to a tree set.
        TreeSet treeSet=new TreeSet<>(set);
        System.out.println("convert to treeset"+treeSet);

 //     9 Write a Java program to find numbers less than 7 in a tree set.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        numbers.add(4);

        TreeSet<Integer>lessThanSeven= (TreeSet<Integer>) numbers.headSet(7);
        System.out.println("Numbers less than seven"+lessThanSeven);

//      10  Write a Java program to compare two hash set.4
        HashSet<String> set2=new HashSet<>();

        set2.add("Omkar");
        set2.add("Ajay");
        set2.add("Rushi");
        set2.add("Akash");
        set2.add("Suraj");
        HashSet<String> set3=new HashSet<>();

        set3.add("Omkar");
        set3.add("Ajay");
        set3.add("Rushi");
        set3.add("Suraj");
        set3.add("Akash");



        if (set2.equals(set3)) {
            System.out.println("set1 and set2 are equal.");
        } else {
            System.out.println("set1 and set2 are not equal.");
        }

        if (set2.containsAll(set3)) {
            System.out.println("set1 and set2 are equal.");
        } else {
            System.out.println("set1 and set2 are not equal.");
        }


//       11 Write a Java program to compare two sets and retain elements that are the same.
        set2.add("Vikas");
        set3.add("kadam");
        set2.retainAll(set3);
        System.out.println("common elements in both sets"+set2);

//     12 Write a Java program to remove all elements from a hash set.
        System.out.println("Original HashSet: " + set2);

        // Remove all elements from the set
        set2.clear();

        // Print the HashSet after clearing all elements
        System.out.println("HashSet after removing all elements: " + set2);









    }
}
