import java.util.*;
import java.io.*;
class ArrayList1
{
   public static void main(String args[])
   {
    
      ArrayList<String> flower_List=new ArrayList<String>();
      flower_List.add("lotus");
      flower_List.add("jasmine");
      flower_List.add("sunflower");
      flower_List.add("rose");
      System.out.println("Initial ArrayList:" + flower_List);
      flower_List.add(1, "daisy");
      System.out.println("\n ArrayList after adding an element'daisy' at index 1:" + flower_List);
      ArrayList<String>more_flower = new ArrayList<String>(Arrays.asList("orchids", "snowdrop","aster","tulips"));
      flower_List.addAll(4,more_flower);
      System.out.println("\n ArrayList after adding all list at index 4:" + flower_List);
      flower_List.remove(2);

      System.out.println("\n ArrayList after removing element at index 2:" + flower_List);
      flower_List.remove("rose");

      System.out.println("\n ArrayList after removing element 'rose':" + flower_List);
      flower_List.removeAll(more_flower);

      System.out.println("\n ArrayList after call to removeAll from array 'more_flower':" + flower_List);

       System.out.println("ArrayList Size: "+flower_List.size());
       flower_List.add("rose");
       flower_List.add("lotus");
       flower_List.add("tulips");
       flower_List.add("lotus");
       System.out.println("\n ArrayList after adding some elements:" + flower_List);

flower_List.trimToSize();
        
        System.out.println("ArrayList Size after trimToSize() operation: "+flower_List.size());
        System.out.println("indexOf(lotus) : " + flower_List.indexOf("lotus"));
        System.out.println("lastIndexOf(lotus) : " + flower_List.lastIndexOf("lotus"));
        flower_List.clear();
        System.out.println("ArrayList after clearing all elements: "+flower_List);


   }
}
