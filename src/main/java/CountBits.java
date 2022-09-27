public class CountBits {
    public static void main(String args[]){
        CountBits cb= new CountBits();
        int c=cb.getCount(1800);
        System.out.print(c);
    }
    public int getCount(int n){
//        Integer.co
//        return Integer.rotateLeft(n,31);
//        return Integer.reverse(n);
        return Integer.reverse(Integer.reverse(n));
//        return 0;
    }
}
