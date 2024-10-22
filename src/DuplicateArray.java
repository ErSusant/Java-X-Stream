public class DuplicateArray {
    public static void main(String[] args) {

        //Initialize an array with some duplicate elements
        int[]array={1,2,3,4,2,3,5,6};
        System.out.println("Duplicate Elements");

        //Outer loop iterates over each element
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){

        //Compare the current element with all next elements
                if(array[i]==array[j]){
                    System.out.print(array[i]+" ");
                   break; //Break the inner loop once a duplicate found
                }
            }
        }
    }
}
