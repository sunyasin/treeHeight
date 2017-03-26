/**
 * методы для работы с узлом дерева
 */

public class SimpleTree
{
  /**
   * считать высоту от заданного узла
   * @param root - стартовый узел
   * @return - максивальное кол-во узлов среди веток-потомков
   */
  public static int getHeight(final SimpleTreeNode root) {
    int maxHeight = 0;
    if (root.hasChildren()) {
      for (SimpleTreeNode node : root.getChildren()) {
        maxHeight = Math.max(maxHeight, 1 + getHeight(node));
      }
    }
    return maxHeight;
  }
}
