package _590N叉树的后序遍历;

import java.util.ArrayList;
import java.util.List;
//注意后续遍历是，所有节点完事后，遍历根节点
public  class Solution2 {
    private List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root != null) {
            for (Node child : root.children) {
                postorder(child);
            }
            // for(int i=0;i<root.children.size();i++){
            //     postorder(root.children.get(i));
            // }
            res.add(root.val);
        }
        return res;
    }
}
