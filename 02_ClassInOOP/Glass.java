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
    public final int MAX_LIQUID_AMOUNT = 100;

    // Public and can't be changed (constant) and can be accessed from the class directly: 
    public static final int MAX_LIQUID_AMOUNT_UNI = 100;
    public static final int FINJAN_LIQUID_AMOUNT = 25;

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
    public boolean serve(){
        boolean didServe = false;
        if (getFnajeen() != 0) {
            liquidAmount-=FINJAN_LIQUID_AMOUNT;
            didServe = true;
            System.out.println("a Finjan was served");
        }
        return didServe;
    }
    public int getFnajeen(){
        return liquidAmount / FINJAN_LIQUID_AMOUNT;
    }
    /*
    Setters: 
    */
    public void clean(){
        liquidAmount = 0;
        System.out.println("the glass was cleaned!");   
    }
    public void fill(){
        // liquidAmount = MAX_LIQUID_AMOUNT;
        fill(MAX_LIQUID_AMOUNT - liquidAmount); // to control the fill amount
        System.out.println("the glass was filled!");
    }
    // Java allows for multiple function with the same name 
    // These functions are differentiated based on the input! 
    public void fill(int liquidAmount){
        int newAmount = this.liquidAmount + liquidAmount;
        if (newAmount > MAX_LIQUID_AMOUNT){
            // Exception:
            throw new IllegalArgumentException("too much amount!");
        }
        this.liquidAmount = newAmount;
        System.out.println("the glass was filled by " + liquidAmount + "!");
    }

}