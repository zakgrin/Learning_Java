public class Glass{

    /*
    Variables: 
    */
    // Public: can be chanced and called outside the class
    public String initLiquidType = "Coffe";

    // Private: can't be changed or called outside the class
    private String liquidType = "Juice";
    private int liquidAmount = 0;

    // Public and can't be changed (constant): 
    public final int MAX_LIQUID_AMOUNT = 1000;

    // Public and can't be changed (constant) and can be accessed from the class directly: 
    public static final int MAX_LIQUID_AMOUNT_UNI = 1000;

    /*
    Constructor:
    */  
    public Glass(String type) {
        liquidType = type;
        // this.liquidType = liquidType // if we want to use the same name as input in the constructor.
    }
    
    /*
    Getters:
    */ 
    public String getLiquidType(){
        return liquidType;
    }
    public Integer getLiquidAmount(){
        return liquidAmount;
    }
    public boolean isEmpty(){
        return liquidAmount == 0;
    }
    /*
    Setters: 
    */
    public void fill(){
        liquidAmount = MAX_LIQUID_AMOUNT;
        System.out.println("the glass was filled!");

    }
    public void clean(){
        liquidAmount = 0;
        System.out.println("the glass was cleaned!");   
    }
}