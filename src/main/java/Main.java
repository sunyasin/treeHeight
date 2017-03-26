public class Main {

  public static void main(String[] args)
  {
    SimpleTreeNode root = new SimpleTreeNode("root");

    int result = SimpleTree.getHeight( root );

    System.out.println(root);
    System.out.println("tree height=" + result);
  }
}


