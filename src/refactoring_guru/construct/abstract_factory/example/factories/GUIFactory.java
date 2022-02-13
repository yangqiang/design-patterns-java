package refactoring_guru.construct.abstract_factory.example.factories;

import refactoring_guru.construct.abstract_factory.example.buttons.Button;
import refactoring_guru.construct.abstract_factory.example.checkboxes.Checkbox;

/**
 * EN: Abstract factory knows about all (abstract) product types.
 *
 * RU: Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
