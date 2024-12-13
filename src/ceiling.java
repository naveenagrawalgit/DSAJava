

public class ceiling {

    public static void main(String[] args){

        int[] num = {1,2,4,4,5,6,7};
        int target = 4 ;

        System.out.println(Ceiling(num,target));

    }

    static  int Ceiling(int[] num, int target){

        int start = 0;
        int end = num.length -1;

        if(target == num[end]){
            // this means last index in array is the last position of element
            System.out.println("last element was target ");
            return -1;
        }
        while(start <= end){

            int mid =  (start + end) /2;
            //1,2,3,4,5,6,7

//            if(num[mid] == target){
//                return mid;
//            }
            if(num[mid] > target){

                end = mid -1;

            }
            else{

                start = mid +1; // ceil of a value

            }
        }
        return num[start];
    }


}
