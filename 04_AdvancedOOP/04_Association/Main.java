public class Main {
    public static void main(String[] args) {
        /*
        There are two types of association: 
        */
        
        /*
        1. Aggregation: تجميع
         - 'Has-a relationship' in one direction:
            - A bank contains employee but not vice versa.
         - Bank and Employee are independent 
         - The Bank can exist without an Employee.
        */
        Bank bank = new Bank();
        bank.name = "First Bank";
        Employee employee = new Employee();
        employee.bank = bank;
        
        /*
        2. Composition: التكوين
         - 'Part-of relationship' in two directions:
            - both heart and human need to exist together.
         - Heart and Human are dependent.
         - Human can't exit without Heart and vice-versa. 
        */
        Heart heart = new Heart();
        Human human = new Human(heart); // human needs heart otherwise can't work!
    }
}
