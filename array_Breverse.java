public class array_Breverse {
    public static void reverse(int num[]){
        int start=0;
        int end=num.length-1;
        while(start<end){
            int swap=num[end];
            num[end]=num[start];
            num[start]=swap;
            
            start++;
            end--;
            
        }
    }
    public static void main(String[] args){
        int num[]={2,4,5,9,10,12};
        reverse(num);
        
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }

    }
    
}
