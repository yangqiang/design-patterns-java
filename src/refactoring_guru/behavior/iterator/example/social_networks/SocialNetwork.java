package refactoring_guru.behavior.iterator.example.social_networks;

import refactoring_guru.behavior.iterator.example.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
