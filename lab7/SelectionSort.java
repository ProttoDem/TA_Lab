package lab7;

public class SelectionSort implements Sorter {

    @Override
    public void sort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j]> array[max]) {
                    max = j;
                }
            }
            double element = array[i];
            array[i]= array[max];
            array[max]= element;
        }
    }
}


