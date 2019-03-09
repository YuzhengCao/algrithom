import java.util.ArrayList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root == null) return listAll;
        list.add(root.val);
        if (root.left == null && root.right == null && root.val == target) 
            listAll.add(new ArrayList<>(list));
        FindPath(root.left, target - root.val);
        FindPath(root.right, target - root.val);
        list.remove(list.size() - 1);
        return listAll;
    }
}
