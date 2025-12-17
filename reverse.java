public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int[] nums=new int[5];



for(int i=0;i<5;i++){
    nums[i]=sc.nextInt();

}
for(int num:nums){
    System.out.print(num);
}
int start=0,end=4;

while(start<end){
    int temp=nums[start];
nums[start]=nums[end];
nums[end]=temp;
start++;
end--;
}
System.out.println("Reveresed");
for(int num:nums){
    System.out.println(num);
}
}

    }

