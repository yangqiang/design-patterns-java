package refactoring_guru.construct.factory_method.example.factory;

import refactoring_guru.construct.factory_method.example.buttons.Button;
import refactoring_guru.construct.factory_method.example.buttons.HtmlButton;

/**
 * EN: HTML Dialog will produce HTML buttons.
 *
 * RU: HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
