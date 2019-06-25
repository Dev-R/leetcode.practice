package leetcode.devr;

import leetcode.devr.data.TreeNode;

public class RangeSum {
    int result = 0;
   void dfs (TreeNode node, int L, int R) {
        if (L <= node.val && node.val <= R) {
            result += node.val;
        }
        if (L < node.val)
            dfs(node.left, L, R);
        if (node.val < R)
            dfs(node.right, L, R);
    }

    int rangeSum (TreeNode node, int L, int R) {
        if ( node != null ) {
            dfs(node, L, R);
        }
        return result;
    }
}
