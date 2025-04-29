class Node{
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
    public static void printPreorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }
    public static void printPostorder(Node root) {
        if(root == null) {
            return;
        }
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.data + " ");
    }
}
public class inorder {
    public static void main(String[] args) {
        Node Root = new Node(1);
        Root.left = new Node(20);
        Root.right = new Node(3);
        Root.left.left = new Node(40);
        Root.left.right = new Node(5);
        Root.left.right.left = new Node(11);
        Root.left.right.right = new Node(13);
        Root.left.right.left.right = new Node(15);
        Root.right.left = new Node(7);
        Root.right.right = new Node(9);
        Root.right.left.right = new Node(4);
        Root.right.left.right.left = new Node(50);
        Root.right.left.right.right = new Node(8);
        System.out.println("Inorder traversal of binary tree is: ");
        Node.printInorder(Root);
        System.out.println();
        System.out.println("Preorder traversal of binary tree is: ");
        Node.printPreorder(Root);
        System.out.println();
        System.out.println("Postorder traversal of binary tree is: ");
        Node.printPostorder(Root);
        System.out.println();
    }
}
