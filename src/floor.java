public class floor {

    public static void main(String[] args){

        int[] num = {1,2,4,4,4,4,4,5,6,7};
        int target =  0;

        System.out.println(Floor(num,target));
    }

    static  int Floor(int[] num, int target){

        int start = 0;
        int end = num.length -1;

        if(target == num[start]){
            // this means first index in array is the first position of element
            System.out.println("first element was target ");
            return -1;
        }
        while(start <= end){

            int mid =  (start + end) /2;
            //1,2,3,4,5,6,7

            if(target > num[mid]){
                start = mid +1;
            }
            else{
                end = mid -1;
            }

        }
        return num[end];
    }
}
