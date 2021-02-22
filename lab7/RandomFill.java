package lab7;

public class RandomFill implements ArrayCreate {
    @Override
    public double[] arrayFill(int length) {
        double [] array = new double[length];
        for (int i = 0; i<length; i++){
            array[i] = (Math.random()*100);
        }
        return array;
    }
}
