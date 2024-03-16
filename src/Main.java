public class Main {
    public static void main(String[] args) {
       Tree myFavoriteOakTree = new Tree(120,5, TreeType.OAK);
       myFavoriteOakTree.announceTallTree();


       Tree myFavoriteMApleTree = new Tree(90,30, TreeType.MAPLE);
       myFavoriteMApleTree.announceTallTree();
        System.out.println(Tree.TRUNK_COLOR);
        Tree.announceTree();
    }
}
