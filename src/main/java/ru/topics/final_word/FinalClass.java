package ru.topics.final_word;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public final class FinalClass {

    private String greetings;
    private String name;

    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass()
                .setName("Христичка")
                .setGreetings("Привет");
        System.out.println(finalClass.toString());
    }

    @Override
    public String toString() {
        return greetings + ", " + name;
    }
}