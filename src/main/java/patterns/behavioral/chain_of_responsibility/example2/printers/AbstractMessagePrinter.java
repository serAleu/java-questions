package patterns.behavioral.chain_of_responsibility.example2.printers;

public abstract class AbstractMessagePrinter {
    private AbstractMessagePrinter nextPrinter;

    public void setNextPrinter(AbstractMessagePrinter nextPrinter) {
        this.nextPrinter = nextPrinter;
    }

    public void print(String message) {
        printMessage(message);
        if(nextPrinter != null) {
            nextPrinter.print(message);
        }
    }

    abstract void printMessage(String message);
}
