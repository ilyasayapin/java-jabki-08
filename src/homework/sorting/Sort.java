package homework.sorting;

public class Sort {


    private static void swap(Sortable[] array, int indOne, int indTwo) {
        Sortable tmp = array[indOne];
        array[indOne] = array[indTwo];
        array[indTwo] = tmp;
    }

    public static void sort(Sortable[] array) {
        for (int i = 1; i < array.length; i++) {
            int resultOne = array[i].compare(array[i - 1]);
            if (resultOne < 0) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    int resultTwo = array[z].compare(array[z - 1]);
                    if (resultTwo < 0) {
                        swap(array, z, z - 1);
                    }
                    break;
                }
            }
        }
    }

}
