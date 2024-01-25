package top100;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Stack;

/**
 * <a href="https://leetcode.cn/problems/validate-binary-search-tree/?envType=study-plan-v2&envId=top-100-liked">...</a>
 */
public class IsValidBST {
    public static class TreeNode {
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


    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }

        ArrayList<Integer> integers = inOrder(root);
        for (int i = 0; i < integers.size() - 1; i++) {
            if(integers.get(i) >= integers.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private ArrayList<Integer> inOrder(TreeNode node) {
        TreeNode tmp = node;
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> returnList = new ArrayList<>();

        while (tmp != null || !stack.isEmpty()) {
            if(tmp != null) {
                stack.push(tmp);
                tmp = tmp.left;
            } else {
                TreeNode pop = stack.pop();
                returnList.add(pop.val);
                if(pop.right != null) {
                    tmp = pop.right;
                }
            }
        }
        return returnList;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);

        node.left = left;
        node.right = right;

        IsValidBST bst = new IsValidBST();
        System.out.println(bst.isValidBST(node));
    }

}
