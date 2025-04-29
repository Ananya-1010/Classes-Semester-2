class Node {
    int data; 
    Node left, right;
    Node(int item) {
        this.data = item;
        left = right = null;
    }
    public static void printInorder(Node root) {
        if(root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
}

public class NodeTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Inorder traversal of binary tree is: ");
        Node.printInorder(root);
        System.out.println();
    }
}