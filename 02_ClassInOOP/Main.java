public class Main{
    public static void main(String[] args){
        /*
        1. Crate Class:
            - class name starts with capital letters while the object starts with small letters.
            - no need to import the class!
            - use 'new' to create the class with the constructor
        */ 
        Glass glass = new Glass("Tea"); 
        System.out.println("an object from class Glass was created");
        
        /*
        2. Public Variables:
            - can be called and changed.
        */ 
        glass.initLiquidType = "water"; // changed
        System.out.println(glass.initLiquidType); // called
        
        /*
        3. Private variables 
            - can't be called or changed: 
        */
        // glass.liquidType = "water"; // ERROR.
        // System.out.println(glass.liquidType); // ERROR.

        /*
        4. Public final variables: 
            - can be called and can't be changed.
            - same for all objects.
            - usually written in CAPS.
            - can not be accessed directly in the calss unless we add 'static'.
        */ 
        System.out.println("Maximum Capacity for every glass: " + glass.MAX_LIQUID_AMOUNT);
        // System.out.println("Maximum Capacity for every glass: " + Glass.MAX_LIQUID_AMOUNT); // Error.

        /*
        4. Public static final variables: 
            - can be called and can't be changed
            - same for all objects.
            - usually written in CAPS.
            - can be accessed directly in the calss. 
        */ 
        System.out.println("Maximum Capacity for every Glass: " + Glass.MAX_LIQUID_AMOUNT_UNI);

        /*
        5. Class Methods: 
            - can be used to get private variables
        */
        // Getters:
        System.out.println("Liquid Type: " + glass.getLiquidType() + " | " + 
                           "Liquid Amount: " + glass.getLiquidAmount());
        if (glass.isEmpty())
            System.out.println("currently, the glass is empty!");            
        else
            System.out.println("currently, the glass is filled!");

        // Setters:
        glass.fill();
        System.out.println("Liquid Type: " + glass.getLiquidType() + " | " + 
                           "Liquid Amount: " + glass.getLiquidAmount());
        glass.clean();
        System.out.println("Liquid Type: " + glass.getLiquidType() + " | " + 
                           "Liquid Amount: " + glass.getLiquidAmount());

        // getters and setters:
        if (glass.isEmpty())
            glass.fill();
        else
            glass.clean();
        
        while (glass.serve()){
            System.out.println("Liquid Type: " + glass.getLiquidType() + " | " + 
                               "Liquid Amount: " + glass.getLiquidAmount());

        };

        // Setter with the same name but with input!
        glass.fill(25);
        System.out.println("Liquid Type: " + glass.getLiquidType() + " | " + 
                            "Liquid Amount: " + glass.getLiquidAmount());

        /*
        Raise Exception!:
        */ 
        glass.fill(75); // higher than 75 will raise exception!
        System.out.println("Liquid Type: " + glass.getLiquidType() + " | " + 
                            "Liquid Amount: " + glass.getLiquidAmount());

        /*
        Try and Exception:
        */
        try{
            glass.fill(25);
        } catch(IllegalArgumentException error){
            System.out.println("Error message: " + error.getMessage());
        }
    }
}