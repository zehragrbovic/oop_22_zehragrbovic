class task2{

    public static int indexOfTheSmallest(int[] array) {
        int tiny = array[0];
        int index = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] < tiny) {
                tiny = array[i];
                index = i;
            }
        }
        
        return index;
    }

    public static void main(String[] args) {
        
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Index of the smalles: " + indexOfTheSmallest(values));

    }
}