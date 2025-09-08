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
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

         if(root == null) return new ArrayList<>();
         q.add(root);
        //bfs
        while(!q.isEmpty()){
            List<Integer> store = new ArrayList<>();
            int size = q.size();

            for(int i=0; i<size; i++){
                TreeNode currNode = q.remove();
                 //check for if currNode ka left and right exist karta ha ya nahi
                 //then push that currNode in queue

                 if(currNode.left != null){
                    q.add(currNode.left);
                 }
                 if(currNode.right != null){
                    q.add(currNode.right);
                 }
                 store.add(currNode.val);
            }
            ans.add(store);
            
        }
        return ans;

    }
}