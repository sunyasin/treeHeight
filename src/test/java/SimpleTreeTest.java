import org.junit.Test;

import static org.junit.Assert.*;

/**
 * tree height test
 */
public class SimpleTreeTest {

  @Test
  public void getHeight_should_calculate_tree_height() throws Exception {
    //prepare
    SimpleTreeNode root = createTree();

    //test
    int result = SimpleTree.getHeight( root );
    System.out.println(root + "\ntree height=" + result);

    //check
    assertTrue (result == 3);
  }

  @Test
  public void emptyNode_getHeight_should_return_0() throws Exception {
    //prepare
    SimpleTreeNode root = new SimpleTreeNode("root");

    //test
    int result = SimpleTree.getHeight( root );
    System.out.println(root + "\ntree height=" + result);

    //check
    assertTrue (result == 0);
  }

  private static SimpleTreeNode createTree() {
    SimpleTreeNode result = new SimpleTreeNode("root");
    SimpleTreeNode child = result.addChild(new SimpleTreeNode("1-1"));
    result.addChild( new SimpleTreeNode("1-2"));
    child = child.addChild( new SimpleTreeNode("2-1"));
    child.addChild( new SimpleTreeNode("3-1"));
    return result;
  }

}