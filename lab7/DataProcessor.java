package lab7;

public class DataProcessor {
    private Sorter sorter;
    private Printer printer;
    private ArrayLength arrayLength;
    private ArrayCreate arrayCreate;


    public void processData(){
        int length = arrayLength.getLength();
        double [] array = arrayCreate.arrayFill(length);
        sorter.sort(array);
        printer.print(array);

    }


    public DataProcessor(ArrayLength arrayLength, ArrayCreate arrayCreate, Sorter sorter, Printer printer){
        this.arrayLength = arrayLength;
        this.arrayCreate = arrayCreate;
        this.sorter = sorter;
        this.printer = printer;

    }
}
