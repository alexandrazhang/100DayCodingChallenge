package CodingChallengeEasy.fromDay1;

import laioffer.inClass.TreeNode;

public class Day3LC669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null) {
            return root;
        }
        TreeNode right = trimBST(root.right, L, R);
        TreeNode left = trimBST(root.left, L, R);
        if(root.val < L){
            root = right;
        } else if(root.val > R){
            root = left;
        } else {
            root.left = left;
            root.right = right;
        }
        return root;
    }
}
