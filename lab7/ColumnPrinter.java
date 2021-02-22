package lab7;

public class ColumnPrinter implements Printer{
    @Override
    public void print(double[] array) {
        for (double i:array){
            System.out.println(i);
        }
        System.out.println();
    }
}
