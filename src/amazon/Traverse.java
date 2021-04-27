package amazon;

import java.util.ArrayList;
import java.util.List;




public class Traverse {

    public static void main(String[] args) {
        TreeNode t =new TreeNode(3);
        t.left = new TreeNode(9);
        t.right = new TreeNode(20);
        t.right.left= new TreeNode(15);
        t.right.right= new TreeNode(7);

        Traverse sol = new Traverse();
        List<List<Integer>> lists = sol.levelOrder(t);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.println(integer);
            }
            System.out.println("=====================");
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        traverse(0,root,ans);


        return ans;

    }

    public void traverse(int level , TreeNode root ,  List<List<Integer>> ans){
        if (root == null )
            return;

        if (ans.size()<=level){
            ans.add(new ArrayList<Integer>());
        }
        ans.get(level).add(root.val);
        traverse(level+1,  root.left , ans);
        traverse(level+1,  root.left , ans);


    }

    // Definition for a binary tree node.
     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
