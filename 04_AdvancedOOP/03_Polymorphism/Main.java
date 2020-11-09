public class Main {
    public static void main(String[] args) {
        HourlyEmployee hEmployee = new HourlyEmployee("Ahmed", "23343", 23, 80);
        SalariedEmployee sEmployee = new SalariedEmployee("Omar", "34533", 2000);
        System.out.println(hEmployee.toString());
        System.out.println(sEmployee.toString());
    }
}
