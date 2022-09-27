package bitwise;

public class ReverseSignedBit {
    public static void main(String args[]){
        Integer a= 2147483647;
        Integer b=0-a;
        String result="";
        while(b!=0){
            int c=b%2;
            b=b/2;
            result=result+c;
        }
        System.out.println(Integer.MAX_VALUE);
//        Integer a=-1;
        //-2147483648
        a=a<<1;
        System.out.println(a);
    }
}
