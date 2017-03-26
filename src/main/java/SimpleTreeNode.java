import java.util.ArrayList;

/**
 * реализация узла дерева с массивом потомков и значением
 */
public class SimpleTreeNode {
  private ArrayList<SimpleTreeNode> children;
  private Object value;

  public SimpleTreeNode(Object value) {

    this.setValue(value);
  }

  public boolean hasChildren() {
    return getChildren() != null && ! getChildren().isEmpty();
  }

  public ArrayList<SimpleTreeNode> getChildren() {
    return children;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(final Object value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "SimpleTreeNode{" +
            "children=" + children +
            ", value=" + value +
            '}';
  }

  public SimpleTreeNode addChild(final SimpleTreeNode node) {
    if (node != null) {
      if (children == null) {
        children = new ArrayList<SimpleTreeNode>();
      }
      children.add(node);
    }
    return node;
  }
}
