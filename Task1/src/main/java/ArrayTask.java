public class ArrayTask {
    public static void main(String[] args) {
        int [] a= new int[20];
        for (int i=0;i < a.length; i++){
            a[i]=(int)(Math.random()*(20+1));
            System.out.println(a[i]);
        }
    }
}
