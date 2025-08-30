import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class arraylist {
    public static void main(String args[])
    {ArrayList<Integer>list=new ArrayList<Integer>();
     
    //Adding elements using .add()
    list.add(10);
    list.add(100);
    System.out.println(list);

    //Adding elements using .addAll()
    Collections.addAll(list,1000,10000);
    System.out.println(list);

    //inserting an element at an index  .add(index,element)
      list.add(2,200);
      System.out.println(list);

    //min and max
    System.out.println(Collections.min(list));
    System.out.println(Collections.max(list));
    //reversing arrayList
    Collections.reverse(list);
    System.out.println(list);

    //inserting multiple elements starting from an index     targetedlist.addAll(index,sourcelist)
     ArrayList<Integer>list1=new ArrayList<Integer>();
     list1.add(2500);
     list1.addAll(0,list);
     System.out.println(list1);

     //size()
     System.out.println(list.size());
     System.out.println(list1.size());
    //isEmpty()
    System.out.println(list.isEmpty());
    System.out.println(list1.isEmpty());
    //contains()
     System.out.println(list1.contains(2500));
     System.out.println(list.contains(100000));

     //get(index)

     System.out.println(list.get(2));

     //set(index,element)
     list.set(4,9600);
     System.out.println(list);

     //searching operations
     // 1. indexOf(element) ->returns first index of the element
     System.out.println(list.indexOf(100));
     //2.lastIndexOf(element) ->returns last index of element
     list.add(100);
     System.out.println(list.lastIndexOf(100));
     //3.binarysearch()
      System.out.println("Enter the number to search:");
      Scanner b1=new Scanner(System.in);
      int num=b1.nextInt();
      int k=Collections.binarySearch(list,num);
      if(k<0)
      {System.out.println("Element is not found");
       }
       else{
        System.out.println("Element is found at the index:"+k);
       }

       //Sorting 
       Collections.sort(list);
       System.out.println(list);
       //removing the elements
       //1.remove(index)
       list.remove(0);
       System.out.println(list);
       //2.retainAll(c)
      System.out.println(list1);
      System.out.println(list);
      list1.retainAll(list);
      System.out.println(list1);
      //3.remove all()
      System.out.println("list1:"+list1);
      System.out.println("List: "+list);
      list1.removeAll(list);
      System.out.println(list1);

      //clear()
      list.clear();
      System.out.println(list);









    }
}
