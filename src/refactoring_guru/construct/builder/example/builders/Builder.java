package refactoring_guru.construct.builder.example.builders;

import refactoring_guru.construct.builder.example.cars.CarType;
import refactoring_guru.construct.builder.example.components.Engine;
import refactoring_guru.construct.builder.example.components.GPSNavigator;
import refactoring_guru.construct.builder.example.components.Transmission;
import refactoring_guru.construct.builder.example.components.TripComputer;

/**
 * EN: Builder interface defines all possible ways to configure a product.
 *
 * RU: Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
