package BinaryTree;

public class BinarySearchTree {

    public Node search(Node root, int key)
    {
        if (root==null || root.key==key)
            return root;
        if (root.key < key)
            return search(root.right, key);
        return search(root.left, key);
    }

    private static Node insert(Node node, int key)
    {
        if (node == null) {
            Node temp = new Node(key);  //menjalankan suatu constractor   
            return temp;
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        }
        else if (key > node.key) {
            node.right = insert(node.right, key);
        }

        return node;
    }

    private static void inorder(Node root) {
        if (root != null){
            inorder(root.left);
            System.out.println(" " + root.key);
            inorder(root.right);
        }
        
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 20);   
        insert(root, 40);
        insert(root, 70);
        insert(root, 60);
        inorder(root);
    }   
    
}
