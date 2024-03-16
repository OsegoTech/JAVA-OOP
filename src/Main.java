import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        Employee employeeOne = new Employee(35,78000,"Osego Baba","New York");
//        Employee employeeTwo = new Employee(36,652312, "Michael", "Uganda");

//        employeeTwo.raiseSalary();
//        System.out.println(employeeOne.salary);
//        System.out.println(employeeTwo.salary);

//       Tree myFavoriteOakTree = new Tree(120,5, TreeType.OAK);
//       myFavoriteOakTree.announceTallTree();


//       Tree myFavoriteMApleTree = new Tree(90,30, TreeType.MAPLE);
//        System.out.println(myFavoriteMApleTree.getTreeType());
//        System.out.println(myFavoriteMApleTree.getHeightFt());
//        System.out.println(myFavoriteMApleTree.getTrunkDiameterInches());
//
//        myFavoriteMApleTree.announceTallTree();
//        myFavoriteMApleTree.grow();

        BankAccount bankAccount = new BankAccount("Wonder Woman", 1000);
        bankAccount.withdraw(500);
        bankAccount.deposit(7000);
        bankAccount.withdraw(2000);

        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getOwner());
    }
}
