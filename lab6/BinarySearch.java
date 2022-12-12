public class BinarySearch {
    
    public static boolean search(int[] array, int searchedValue) {

        int mid, start = 0, end = array.length - 1;

        while(start <= end) {

            mid = (start + end) / 2;
            if(array[mid] == searchedValue) return true;

            if(start == mid) {
                if(array[end] == searchedValue) return true;
                else return false;
            }

            if(array[mid] < searchedValue) start = mid;
            else end = mid;

        }
        return false;
    }

}
