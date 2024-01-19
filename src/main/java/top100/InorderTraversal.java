package top100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode.cn/problems/binary-tree-inorder-traversal/submissions/496852240/?envType=study-plan-v2&envId=top-100-liked">...</a>
 */
public class InorderTraversal {

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

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> returnList = new ArrayList<>();
        TreeNode temp = root;

        //先遍历左边节点，如果左边节点遍历完了，证明可以加入到list中了，再判断right节点
        while (temp != null || !stack.isEmpty()) {
            if(temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                TreeNode pop = stack.pop();
                returnList.add(pop.val);
                if(pop.right != null) {
                    temp = pop.right;
                }
            }
        }
        return returnList;
    }
}
