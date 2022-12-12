class task3{

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int tiny = array[index];
        int tinyIndex = index;

        for(int i = index; i < array.length; i++) {
            if(array[i] < tiny) {
                tiny = array[i];
                tinyIndex = i;
            }
        }
        
        return tinyIndex;
    }

    public static void main(String[] args) {
        
        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));

    }
}