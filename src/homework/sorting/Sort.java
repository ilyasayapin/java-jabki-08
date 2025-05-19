package homework.sorting;

public class Sort {

}

private static void swap(Sortable[] array, int ind1, int ind2) {
    Sortable tmp = array[ind1];
    array[ind1] = array[ind2];
    array[ind2] = tmp;
}

public static void sort(Sortable[] array) {
    for (int i = 1; i < array.length; i++) {
        int result = array[i].compare(array[i - 1]);
        if (result < 0) {
            swap(other, i, i - 1);
            for (int z = i - 1; (z - 1) >= 0; z--) {
                if (other[z] < other[z - 1]) {
                    swap(other, z, z - 1);
                } else {
                    break;
                }
            }
           }

        }

    }
