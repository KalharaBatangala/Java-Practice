import java.util.HashMap;

public class Main {

    public static void main(String[] args){

        HashMap<String, Double> map = new HashMap<>();
    
        //input key value pairs to HashMap
        map.put("apple", 0.25);
        map.put("orange", 0.35);
        map.put("grapes", 0.76);
        

        // get the value of a key
        //System.out.println(map.get("orange"));

        // check whether a key is present
        //System.out.println(map.containsKey("orange"));
        
        // SET TO AN ARRAY
        System.out.println(map.keySet());
        
        for(String key: map.keySet())
        {
            System.out.println("\""+key+"\" : $"+map.get(key));
        }

    }

}

