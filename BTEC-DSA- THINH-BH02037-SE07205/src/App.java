import DataStructure.BST_Tree;
import DataStructure.TreeNode;

public class App {
    public static void main(String[] args) throws Exception {
        BST_Tree bstTree = new BST_Tree();
        TreeNode node55 = new TreeNode(55);
        TreeNode node29 = new TreeNode(29);
        TreeNode node3 = new TreeNode(-3);
        TreeNode node42 = new TreeNode(42);
        TreeNode node87 = new TreeNode(87);
        TreeNode node60 = new TreeNode(60);
        TreeNode node91 = new TreeNode(91);
        bstTree.root = node55;
        node55.left = node29;
        node29.left = node3;
        node29.right = node42;
        node55.right = node87;
        node87.left = node60;
        node87.right = node91;
        System.out.println(bstTree.contains(92));
    }
}
