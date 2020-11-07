import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        // HashMap are just arrays but with multiple indecies with different types.
        // 1. create:
        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        // 2. fill-in:
        myHashMap.put("key 1", 17);
        myHashMap.put("key 2", 45);
        // 3. get data based on keys:
        System.out.println(myHashMap.get("key 1"));
        // 4. remove data based on keys:
        myHashMap.remove("key 1");
        System.out.println(myHashMap.size());
    }
}