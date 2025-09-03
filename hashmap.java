import java.util.HashMap;

public class hashmap {
    public static void main(String args[])
    {//creating hashmap
        HashMap<String,String>m=new HashMap<>();
    //putting keys and values in hashmap
    m.put("Adoor","Pathanamthitta");
    m.put("Maamood","Kollam");
    m.put("Kayamkulam","Alappuzha");
    //printing hashmap
    System.out.println(m);
    
    //getting the value

    System.out.println(m.get("Adoor"));
    System.out.println(m.get("Kayamkulam"));

    //checking whether theres a key or value

    System.out.println(m.containsKey("Adoor"));
    System.out.println(m.containsKey("Kayamkulam"));

    System.out.println(m.containsValue("Kollam"));

    //remove an element

    m.remove("Adoor");
    System.out.println(m);
 
     //clearing
    m.clear();
     System.out.println(m);





    }
    
}
