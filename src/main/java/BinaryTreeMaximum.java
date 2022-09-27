//import java.util.ArrayList;
//import java.util.List;
//
//public class BinaryTreeMaximum {
//    static Integer max=Integer.MIN_VALUE;
//
//    public static void main(String args[]){
//        TreeNode t1=new TreeNode(3);
//        TreeNode t2=new TreeNode(9);
//        TreeNode t3=new TreeNode(20);
//        TreeNode t4=new TreeNode(15);
//        TreeNode t5=new TreeNode(7);
//        t3.left=t4;t3.right=t5;
//        t1.left=t2;t1.right=t3;
//        List<int[]> lists=new ArrayList<>();
//        lists.add(new int[]{t1.val});
//        BinaryTreeMaximum b= new BinaryTreeMaximum();
//        b.traverse(t1);
//        System.out.println(max);
//    }
//
//    public static Void traverse(TreeNode t) {
////        lists.add([]);
//        if (t != null) {
//            int val;
//            if (t.left != null && t.right != null) {
//                if ((t.left.val + t.val + t.right.val) > max) {
//                    max = t.left.val + t.val + t.right.val;
//                }
//            }
//
//            traverse(t.left);
//            traverse(t.right);
//        }
//        return null;
//    }
//
//}
