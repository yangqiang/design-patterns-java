package refactoring_guru.behavior.iterator.example.iterators;

import refactoring_guru.behavior.iterator.example.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}