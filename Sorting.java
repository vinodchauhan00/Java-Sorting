public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
            }
        }
        //java Enhanced for loop
        
        for(int k:arr){
            System.out.print(k+" ");
        }
       
    }
    
}
