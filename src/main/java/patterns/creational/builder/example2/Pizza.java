package patterns.creational.builder.example2;

import lombok.Setter;

@Setter
public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    @Override
    public String toString() {
        return "Pizza {" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}
