public class Doublereverseint {
    public static void main(String args[]){
        Doublereverseint d= new Doublereverseint();
        boolean result= d.reverse(526);
        System.out.print(result);
    }
    boolean reverse(int n){
        StringBuilder s1= new StringBuilder();
        StringBuilder s2= new StringBuilder();
        int reverse1=Integer.parseInt(s1.append(n).reverse().toString());
        int reverse2= Integer.parseInt(s2.append(reverse1).reverse().toString());
        return n == reverse2? true: false;
    }
}
