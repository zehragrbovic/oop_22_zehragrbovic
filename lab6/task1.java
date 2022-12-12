class task1{

    public static int smallest(int[] array) {
        int tiny = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] < tiny) tiny = array[i];
        }
        
        return tiny;
    }

    public static void main(String[] args) {
        
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smalles: " + smallest(values));

    }
}