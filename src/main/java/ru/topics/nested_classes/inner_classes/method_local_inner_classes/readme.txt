*Локальные вложенные классы в методе*

1) Локальные внутренние классы в методе - это подвид внутренних классов

2) Локальный вложенный класс объявляется внутри блока кода чаще всего внутри метода
внешнего класса. Например, можно объявить локальный класс в методе внутри цикла for.
Объект локального класса не может создаваться за пределами метода или блока внутри
которого его объявили.

3) Локальный вложенный класс имеет доступ к локальным переменным и параметрам метода.
Чтобы локальный класс имел доступ к переменной метода, она должна быть effective-final
или просто final.

4) Локальный вложенный класс имеет доступ ко всем, в том числе к приватным и статическим
полям и методам внешнего класса.

5) Если создать локальный класс в статическом методе, такому классу будет доступен
только статический контекст.