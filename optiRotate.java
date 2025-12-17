import java.util.Scanner;

public class rotate2 {
public static void Reverse(int arr[],int s,int e)
{
int start=s;
int end=e;
while(start<end){
    int temp =arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
}

}
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int[] a= new int[4];
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
        }
        for(int as:a){
            System.out.println(as);
        }
        System.out.println("Enter the postion to rotate");
        int d=sc.nextInt();
        if(d<0){
            d=d+a.length;
        }
        d=d%a.length;
        Reverse(a, 0, d-1);
        Reverse(a, d, a.length-1);
        Reverse(a, 0, a.length-1);
        for(int as:a){
            System.out.println(as);
        }
    }
}
// class Solution {
//     public static void Reverse(int arr[],int s,int e)
// {
// int start=s;
// int end=e;
// while(start<end){
//     int temp =arr[start];
//     arr[start]=arr[end];
//     arr[end]=temp;
//     start++;
//     end--;
// }

// }
//     public void rotate(int[] a, int k) {
//          if(k<0){
//             k=k+a.length;
//         }
//         k=k%a.length;
//          Reverse(a, 0, a.length-1);
//         Reverse(a, 0, k-1);
       
       
//          Reverse(a, k, a.length-1);
        
//     }
// }
