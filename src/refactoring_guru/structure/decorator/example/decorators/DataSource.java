package refactoring_guru.structure.decorator.example.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
