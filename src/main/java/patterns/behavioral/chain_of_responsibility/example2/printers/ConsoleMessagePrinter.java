package patterns.behavioral.chain_of_responsibility.example2.printers;

public class ConsoleMessagePrinter extends AbstractMessagePrinter{
    @Override
    void printMessage(String message) {
        System.out.println("print to console: " + message);
    }
}
