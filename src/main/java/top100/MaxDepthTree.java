package top100;

public class MaxDepthTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int depth) {
        if(node == null) {
            return depth;
        }
        int dfsLeft = dfs(node.left, depth + 1);
        int dfsRight = dfs(node.right, depth + 1);
        return Math.max(dfsLeft, dfsRight);
    }
}
