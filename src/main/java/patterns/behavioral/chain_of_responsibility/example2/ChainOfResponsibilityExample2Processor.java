package patterns.behavioral.chain_of_responsibility.example2;

import patterns.behavioral.chain_of_responsibility.example2.printers.AbstractMessagePrinter;
import patterns.behavioral.chain_of_responsibility.example2.printers.ConsoleMessagePrinter;
import patterns.behavioral.chain_of_responsibility.example2.printers.DbMessagePrinter;
import patterns.behavioral.chain_of_responsibility.example2.printers.FileMessagePrinter;

public class ChainOfResponsibilityExample2Processor {

    public static void main(String[] args) {
        AbstractMessagePrinter consolePrinter = new ConsoleMessagePrinter();
        AbstractMessagePrinter fileMessagePrinter = new FileMessagePrinter();
        fileMessagePrinter.setNextPrinter(consolePrinter);
        AbstractMessagePrinter dbMessagePrinter = new DbMessagePrinter();
        dbMessagePrinter.setNextPrinter(fileMessagePrinter);
        dbMessagePrinter.print("hello");
    }
}
