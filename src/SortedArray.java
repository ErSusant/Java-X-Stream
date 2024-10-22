public class SortedArray {

    public static void main(String[] args) {
        int[] array={9,7,2,3,1,4,5,6,8};
        int temp;
        for(int i=0;i<= array.length-1;i++){
            for(int j=i+1;j<=array.length-1;j++){
                if(array[i]>array[j]){
                   temp = array[i];
                   array[i]=array[j];
                   array[j]=temp;
                }
            }
        }
        for(int num:array){
            System.out.print(num +" ");
        }
    }
}
