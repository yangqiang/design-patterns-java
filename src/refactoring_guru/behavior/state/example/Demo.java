package refactoring_guru.behavior.state.example;

import refactoring_guru.behavior.state.example.ui.Player;
import refactoring_guru.behavior.state.example.ui.UI;

/**
 * EN: Demo class. Everything comes together here.
 *
 * RU: Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
