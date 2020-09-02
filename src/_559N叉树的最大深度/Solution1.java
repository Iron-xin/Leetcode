package _559N叉树的最大深度;
//二叉树是求2个子树，这里是多个子树，因此是for循环
//并且，二叉树由于只有两个子树，因为两个变量即可，这里变量太多，所以算一个就比较一个，而二叉树的是算完后比较，可以去看对应的代码
public class Solution1 {
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int max =0;
        for(int i = 0; i < root.children.size(); i++){
            max = Math.max(max,maxDepth(root.children.get(i)));
        }
        return max+1;
    }
}