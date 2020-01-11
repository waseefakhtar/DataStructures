package datastructures;

import java.util.HashSet;
import java.util.Set;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public static boolean findTarget(TreeNode root, int k) {
        Set< Integer > set = new HashSet();
        return find(root, k, set);
    }

    public static boolean find(TreeNode root, int k, Set < Integer > set) {
        if (root == null)
            return false;
        if (set.contains(k - root.val))
            return true;
        set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
    }
}
