package com.octo.composite.dataProvider;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DataProviderTest {

    @Test
    void simpleDataProvider() {
        DataProvider dataProvider = new DataSource();

        final var result = dataProvider.getData();

        Assertions.assertLinesMatch(List.of("a","b","c"),result);
    }

    @Test
    void reverseOrderDataProvider() {
        DataProvider dataProvider = new ReverseOrderProvider(new DataSource());

        final var result = dataProvider.getData();

        Assertions.assertLinesMatch(List.of("c","b","a"),result);
    }

    @Test
    void reverseReverseOrderDataProvider() {
        DataProvider dataProvider = new NaturalOrderProvider(new ReverseOrderProvider(new DataSource()));

        final var result = dataProvider.getData();

        Assertions.assertLinesMatch(List.of("a","b","c"),result);
    }

    @Test
    void cachedReverseOrderDataProvider() {
        DataProvider dataProvider = new CacheProvider(new ReverseOrderProvider(new DataSource()));

        final var result = dataProvider.getData();

        Assertions.assertLinesMatch(List.of("Cached:c","Cached:b","Cached:a"),result);
    }

    @Test
    void reverseOrderCachedDataProvider() {
        DataProvider dataProvider = new ReverseOrderProvider(new CacheProvider(new DataSource()));

        final var result = dataProvider.getData();

        Assertions.assertLinesMatch(List.of("Cached:c","Cached:b","Cached:a"),result);
    }


}
