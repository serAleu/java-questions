package patterns.structural.decorator.example1;

/**
 * Интерфейс, задающий базовые операции чтения и записи данных
 */
public interface DataSource {
    void writeData(String data);
    String readData();
}
