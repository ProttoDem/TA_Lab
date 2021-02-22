package lab7;

public class BubbleSort implements Sorter {
    @Override
    public void sort(double[] array) {
        int length = array.length;
        for (int i = 0; i<length; length--){
            for (int j = 0; j< array.length-1; j++){
                if (array[j]<array[j+1]){
                    double element = array[j];
                    array[j] = array[j+1];
                    array[j+1] = element;
                }
            }
        }
    }
}
