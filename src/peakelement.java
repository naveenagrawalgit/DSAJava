public class peakelement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,4,3};

        System.out.println(peak(arr));
    }

    static int peak(int[] arr){

        int start = 0;
        int end = arr.length -1;

        while(start <= end) {

        int mid = start + (end - start)/2;

        if((arr[mid +1] < arr[mid]) && (arr[mid-1] < arr[mid])) {
            return arr[mid];

        }
        else if(arr[mid +1] > arr[mid]) {

            start = mid +1;

        }
        else if(arr[mid-1]  > arr[mid]){

            end = mid -1;
        }
        }
        return -1;
        }

    }
