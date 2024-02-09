package ru.topics.instance_local_vars;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class InstanceLocalVarsProcessor {

    private Integer i;
    private String string;

    public static void main(String[] args) {
        InstanceLocalVarsProcessor processor = new InstanceLocalVarsProcessor(5, "str");
        System.out.println("Переменные i=" + processor.getI() + " и string=\"" + processor.getString() + "\" существуют " +
                "до тех пор пока существует объект processor т.е. до завершения работы этой программы");
        processor.doSmth();
        System.out.println("Здесь переменной str уже не существует");
    }

    private void doSmth() {
        String str = "Что либо";
        System.out.println("Переменная str=\"" + str + "\" существует только пока выполняется метод doSmth()");
    }
}
