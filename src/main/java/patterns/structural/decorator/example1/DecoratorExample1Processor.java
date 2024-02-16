package patterns.structural.decorator.example1;

import patterns.structural.decorator.example1.impl.DataSourceDecorator;
import patterns.structural.decorator.example1.impl.FileDataSource;
import patterns.structural.decorator.example1.impl.ext.CompressionDecorator;
import patterns.structural.decorator.example1.impl.ext.EncryptionDecorator;

public class DecoratorExample1Processor {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("src/main/java/patterns/structural/decorator/example1/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("src/main/java/patterns/structural/decorator/example1/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
