package CodingChallengeEasy.fromDay1;

import laioffer.inClass.TreeNode;

/**
 * Created by yzhang on 5/3/18.
 */
public class Day2LC112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null && root.val == sum) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

    }
}
