package DataStructure;

public class BST_Tree {
    public TreeNode root;

    public BST_Tree() {
        root = null;
    }

    public boolean contains(int value) {
        // Nếu value < node.value tìm kiếm bên trái
        // Nếu value > node.value tìm kiếm bên phải
        // Nếu value == node.value => True
        // Nếu node.value == null => False
        if (root == null) {
            return false;
        } else {
            TreeNode current = root;
            while (true) {
                if (current == null) {
                    return false;
                }
                if (value > current.data) {
                    current = current.right;
                } else if (value < current.data) {
                    current = current.left;
                } else {
                    return true;
                }
            }
        }
    }
    // Container recursive

}
