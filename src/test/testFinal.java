package test;

public class testFinal {
    public static void main(String[] args) {
        int []a ={2,3,6,7,34,23,1};
        for (int i = 0; i < a.length-1; i++) {
            for (int j=0;j<a.length-i-1;j++)
                if (a[j] >a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ,");
        }
    }

}
