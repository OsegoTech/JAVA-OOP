import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Employee employeeOne = new Employee(35,78000,"Osego Baba","New York");
        Employee employeeTwo = new Employee(36,652312, "Michael", "Uganda");

        employeeTwo.raiseSalary();
        System.out.println(employeeOne.salary);
        System.out.println(employeeTwo.salary);
       Tree myFavoriteOakTree = new Tree(120,5, TreeType.OAK);
       myFavoriteOakTree.announceTallTree();


       Tree myFavoriteMApleTree = new Tree(90,30, TreeType.MAPLE);
       myFavoriteMApleTree.announceTallTree();
        System.out.println(Tree.TRUNK_COLOR);
        Tree.announceTree();

        Color myDefaultWhite = Color.WHITE;
        Color myDefaultBlue = Color.BLUE;
        Color brighterBlue = myDefaultBlue.brighter();
    }
}
