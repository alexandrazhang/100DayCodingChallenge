package CodingChallengeEasy.fromDay1;

import laioffer.inClass.TreeNode;

public class Day3LC671 {
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) {
            return -1;
        }
        if(root.left == null) {
            return -1;
        }
        if(root.right.val == root.left.val) {
            return -1;
        }

        int left = root.left.val;
        int right = root.right.val;

        if (root.left.val == root.val) {
            left = findSecondMinimumValue(root.left);
        }
        if (root.right.val == root.val) {
            right = findSecondMinimumValue(root.right);
        }
        if(left == -1 && right == -1) {
            return Math.max(left, right);
        } else if(left == -1) {
            return right;
        } else{
            return left;
        }
    }
}
