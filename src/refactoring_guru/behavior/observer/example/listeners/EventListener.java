package refactoring_guru.behavior.observer.example.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
