package ru.topics.generics.classes;

import lombok.Getter;
import lombok.Setter;
import ru.topics.generics.classes.actions.Action;
import ru.topics.generics.classes.items.Item;

@Getter
@Setter
public class Box<T extends Item, S extends Action> {

    private T item;
    private S action;
}
