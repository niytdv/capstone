import java.util.*;

public class VerticalOrder {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<List<Integer>> verticalOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> cols = new LinkedList<>();

        q.add(root);
        cols.add(0);

        while (!q.isEmpty()) {

            TreeNode node = q.poll();
            int col = cols.poll();

            map.putIfAbsent(col, new ArrayList<>());
            map.get(col).add(node.val);

            if (node.left != null) {
                q.add(node.left);
                cols.add(col - 1);
            }

            if (node.right != null) {
                q.add(node.right);
                cols.add(col + 1);
            }
        }

        // Convert map values into result list
        for (List<Integer> list : map.values()) {
            res.add(list);
        }

        return res;
    }

    public static void main(String[] args) {

        VerticalOrder obj = new VerticalOrder();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = obj.verticalOrder(root);

        System.out.println(result);
    }
}