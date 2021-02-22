package lab7;

public class Main {
    public static void main(String[] args) {
        DataProcessor dp = new DataProcessor(new GetLength(), new RandomFill(), new InsertionSort(), new RowPrinter());
        dp.processData();
    }
}

