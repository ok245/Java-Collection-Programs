import java.util.*;

public class ArrayListProgram {

    public static void main(String args[]){

        List<String> colorList=new ArrayList<>();
        colorList.add("White");
        colorList.add("green");
        colorList.add("Black");
        colorList.add("Blue");
        colorList.add("Yellow");


//        System.out.print(colorList);


//        2 Write a Java program to iterate through all elements in an array list.

        Iterator<String> iterator=colorList.iterator();
        while (iterator.hasNext()){
            System.out.println("Color Name : "+iterator.next());
        }

//       3 Write a Java program to insert an element into the array list at the first position.
        colorList.add(0,"Pink");

        System.out.print(colorList);

 //       4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        String color=colorList.get(3);
        System.out.print("color at index 3:"+color);

//       5 Write a Java program to update an array element by the given element.
        colorList.set(5,"Gray");
        System.out.print(colorList);

//        6 Write a Java program to remove the third element from an array list.
        colorList.remove(2);
        System.out.print(colorList);

//        7 Write a Java program to search for an element in an array list.
        boolean isPresent=colorList.contains("Blue");
        if(isPresent){
            System.out.println("color is present in list");
        }else {
            System.out.println("color is not present in list");
        }
//        8. Write a Java program to sort a given array list.
        Collections.sort(colorList);
        System.out.print("After sort"+colorList);

//      9  Write a Java program to copy one array list into another
        ArrayList<String> list2=new ArrayList<>();
        list2.add("Purple");
        list2.add("Red");
        list2.add("Brown");

        colorList.addAll(list2);
        System.out.print("After add another list"+colorList);

//      10  Write a Java program to shuffle elements in an array list.
        Collections.shuffle(colorList);
        System.out.print("After Shuffle list"+colorList);

//       11 Write a Java program to reverse elements in an array list.
        Collections.reverse(colorList);
        System.out.print("After reverse list"+colorList);

//        12. Write a Java program to extract a portion of an array list.
        List<String> subList = colorList.subList(2, 6);
        System.out.print("After reverse list"+colorList);

//      13  Write a Java program to compare two array lists.
        ArrayList<String> list3=new ArrayList<>();
        list2.add("Purple");
        list2.add("Red");
        list2.add("Brown");
        ArrayList<String> list4=new ArrayList<>();
        list2.add("Purple");
        list2.add("Red");
        list2.add("Brown");
        ArrayList<String> list5=new ArrayList<>();
        list2.add("Purple");
        list2.add("Red");


        boolean isEqual=list3.equals(list5);
        System.out.println("list are equals"+isEqual);

//       14 Write a Java program that swaps two elements in an array list.
//        int index1=1;
//        int index2=2;
      System.out.println("Before Swaps"+colorList);
        String temp=colorList.get(1);
        colorList.set(1,colorList.get(3));
        colorList.set(3,temp);
        System.out.println("After Swap"+colorList);

 // 15  Write a Java program to join two array lists.
        ArrayList<String> newList=new ArrayList<>();
        newList.add("Orange");
        newList.add("Violet");
        newList.add("Indigo");


        System.out.println("list before join"+colorList);
        colorList.addAll(newList);
        System.out.println("list after join"+colorList);

 //       16. Write a Java program to clone an array list to another array list.
        System.out.println("list before clone"+colorList);
        ArrayList<String> cloneList= (ArrayList<String>) newList.clone();
        System.out.println("list after clone"+cloneList);

//      17  Write a Java program to empty an array list.
        System.out.println("list before clear"+colorList);
        cloneList.clear();
        System.out.println("list after clear"+cloneList);

//        18 Write a Java program to test whether an array list is empty or not.
        System.out.println("Arralist is empty :"+ cloneList.isEmpty());

//       20 Write a Java program to increase an array list size.
        ArrayList<String> colorList1 = new ArrayList<>(5);  // Initial capacity is 5
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");

        // Print the current size and capacity (capacity is not directly accessible)
        System.out.println("Current size of colorList: " + colorList1.size());


        colorList1.ensureCapacity(10);


        colorList.add("Yellow");
        colorList.add("Purple");
        colorList.add("Orange");
        colorList.add("Pink");
        colorList.add("Brown");


        System.out.println("Updated size of colorList: " + colorList1.size());


 //     21  Write a Java program to replace the second element of an ArrayList with the specified element.
        System.out.println("List before Update"+colorList);
        colorList.set(1,"White");
        System.out.println("List after Update"+colorList);

 //       System.out.println("List before Update"+colorList);
        System.out.println("Printing all elements using their positions:");
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println("Element at position " + i + ": " + colorList.get(i));
        }

















    }
}
