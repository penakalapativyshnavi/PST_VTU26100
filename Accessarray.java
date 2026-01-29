import java.util.*;
class Accessarray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        int i;
        int key=sc.nextInt();
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("target element is"+i+a[i]);
            }
        }
    }
}
