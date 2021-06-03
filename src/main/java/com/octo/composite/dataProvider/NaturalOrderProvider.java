package com.octo.composite.dataProvider;

import java.util.List;
import java.util.stream.Collectors;

public class NaturalOrderProvider implements DataProvider {
    private DataProvider next;

    public NaturalOrderProvider(DataProvider next) {
        this.next = next;
    }

    @Override
    public List<String> getData() {
        return next.getData().stream().sorted().collect(Collectors.toList());
    }
}
