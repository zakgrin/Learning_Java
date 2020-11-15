public class Sum {
    public Integer calcSum(Integer num) {
        if (num == 0)
            return 0;
        else
            return calcSum(num-1) + num; 
    }
}
