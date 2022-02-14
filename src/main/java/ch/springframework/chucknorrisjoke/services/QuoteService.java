package ch.springframework.chucknorrisjoke.services;

import ch.springframework.chucknorrisjoke.repositories.QuoteRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class QuoteService implements DisplayService {

    @Override
    public Set<String> getAllMessages() {
        return QuoteRepository.getAllQuotes();
    }

    @Override
    public String getRandomMessage() {
        return QuoteRepository.getRandomQuote();
    }
}
