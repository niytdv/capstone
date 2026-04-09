
public class Invert {

    static class TreeNode{
        int val;
        TreeNode left,right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public TreeNode invertTree(TreeNode root){
        if(root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public void printInorder(TreeNode root){
        if(root == null) return;

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        Invert obj = new Invert();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.print("Original Tree (Inorder): ");
        obj.printInorder(root);

        // root = obj.invertTree(root);   // IMPORTANT

        System.out.print("\nInverted Tree (Inorder): ");
        obj.printInorder(root);
    }
}