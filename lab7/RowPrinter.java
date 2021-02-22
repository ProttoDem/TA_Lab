package lab7;

public class RowPrinter implements Printer{
    @Override
    public void print(double[] array) {
        for (double i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
