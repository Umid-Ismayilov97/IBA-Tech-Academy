public class ArraysSort {
    public static void main(String[] args) {
        int[] a = new int[30];

        System.out.print("PE: ");
            for (int i = 0; i < a.length ; i++) {
                a[i] = (int) (Math.random() * 200 -100);
                if(a[i]>0 && a[i]%2==0)
                {
                    System.out.print("[" + a[i]+ "]");
                }}
                System.out.print("\nPO: ");
        for (int i = 0; i < a.length ; i++) {
            if(a[i]>0 && a[i]%2!=0)
            {
                System.out.print("[" + a[i]+ "]");
            }
        }
        System.out.print("\nNE: ");
        for (int i = 0; i < a.length ; i++) {
            if(a[i]<0 && a[i]%2==0)
            {
                System.out.print("[" + a[i]+ "]");
            }
        }
        System.out.print("\nNO: ");
        for (int i = 0; i < a.length ; i++) {
            if(a[i]<0 && a[i]%2!=0)
            {
                System.out.print("[" + a[i]+ "]");
            }
        }
    }}

