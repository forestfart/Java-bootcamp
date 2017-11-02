package com.kodilla.good.patterns.challenges;

import java.util.*;

public final class MovieStore {

    final List<String> ironManTranslations = new ArrayList<>();
    final List<String> avengersTranslations = new ArrayList<>();
    final List<String> flashTranslations = new ArrayList<>();
    final Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();

    public MovieStore() {

        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);
    }

    public final Map<String, List<String>> getMovies() {
        return booksTitlesWithTranslations;
    }
}