package ch.springframework.chucknorrisjoke.services;

import java.util.Set;

public interface DisplayService {

    Set<String> getAllMessages();
    String getRandomMessage();
}

