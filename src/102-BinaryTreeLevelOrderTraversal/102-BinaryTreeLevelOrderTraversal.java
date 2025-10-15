// Last updated: 15/10/2025, 06:02:40
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        TreeNode empty = new TreeNode();
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        q.add(empty);
        List<Integer> clist = new ArrayList<>();
        list.add(clist);

        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            if(node == empty) {
                if(!q.isEmpty()){ 
                    q.add(empty);
                    clist = new ArrayList<>();
                    list.add(clist);
                }

            } else {
                clist.add(node.val);
                if (node.left!= null) q.add(node.left);
                if (node.right!= null) q.add(node.right);
            }
        }
        return list;
    }
}