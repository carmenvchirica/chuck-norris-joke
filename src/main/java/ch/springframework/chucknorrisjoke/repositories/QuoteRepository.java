package ch.springframework.chucknorrisjoke.repositories;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Repository
public class QuoteRepository {

    private static Set<String> quotes;

    QuoteRepository() {
        quotes = new HashSet<>();
        generateQuotes();
    }

    public void generateQuotes() {
        quotes.add("Time waits for no man. Unless that man is Chuck Norris.");
        quotes.add("If you spell Chuck Norris in Scrabble, you win. Forever.");
        quotes.add("Chuck Norris breathes air … five times a day.");
        quotes.add("In the Beginning there was nothing … then Chuck Norris roundhouse kicked nothing and told it to get a job.");
        quotes.add("When God said, “Let there be light!” Chuck said, “Say Please.”");
        quotes.add("Chuck Norris has a mug of nails instead of coffee in the morning.");
        quotes.add("If Chuck Norris were to travel to an alternate dimension in which there was another Chuck Norris and they both fought, they would both win.");
        quotes.add("The dinosaurs looked at Chuck Norris the wrong way once. You know what happened to them.");
        quotes.add("Chuck Norris’ tears cure cancer. Too bad he has never cried.");
        quotes.add("Chuck Norris once roundhouse kicked someone so hard that his foot broke the speed of light");

    }

    public static Set<String> getAllQuotes() {
        return quotes;
    }

    public static String getRandomQuote() {
        return quotes.stream().skip(new Random().nextInt(quotes.size())).findFirst().orElse(null);
    }

}
