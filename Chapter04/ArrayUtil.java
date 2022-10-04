package Chapter04;

public class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        int[] newArr = new int[a.length + b.length];
        for(int i=0;i<newArr.length;i++) {
            if(i<a.length) newArr[i] = a[i];
            else newArr[i] = b[i-a.length];
        }
        return newArr;
    }
    
    public static void print(int[] a) {
        for(int n : a)
            System.out.print(n + " ");
    }
   
}
