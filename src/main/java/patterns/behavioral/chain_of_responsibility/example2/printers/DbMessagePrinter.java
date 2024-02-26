package patterns.behavioral.chain_of_responsibility.example2.printers;

public class DbMessagePrinter extends AbstractMessagePrinter{
    @Override
    void printMessage(String message) {
        System.out.println("print to db: " + message);
    }
}
