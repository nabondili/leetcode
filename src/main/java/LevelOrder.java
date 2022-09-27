import java.util.ArrayList;
import java.util.List;

public class LevelOrder {

    public static void main(String args[]){
        TreeNode t1=new TreeNode(3);
        TreeNode t2=new TreeNode(9);
        TreeNode t3=new TreeNode(20);
        TreeNode t4=new TreeNode(15);
        TreeNode t5=new TreeNode(7);
        t3.left=t4;t3.right=t5;
        t1.left=t2;t1.right=t3;
        List<int[]> lists=new ArrayList<>();
        lists.add(new int[]{t1.val});
        traverse(t1,lists);
    }

    public static void traverse(TreeNode  t, List<int[]> lists){
//        lists.add([]);
        if(t== null) return;
        List<Integer> l= new ArrayList<>();
        if(t.left !=null && t.right!= null){
            lists.add(new int[]{t.left.val,t.right.val});
        } else if(t.left== null && t.right!=null){
            lists.add(new int[]{t.right==null?0:t.right.val});
        } else if(t.right== null&&t.left!=null){
            lists.add(new int[]{t.left==null?0:t.left.val});
        }
        traverse(t.left,lists);
        traverse(t.right,lists);
    }
}
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
        this.left = null;
        this.right=null;
    }
}

