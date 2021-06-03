package com.octo.composite.dataProvider;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrderProvider implements DataProvider {
    private DataProvider next;

    public ReverseOrderProvider(DataProvider next) {
        this.next = next;
    }

    @Override
    public List<String> getData() {
        return next.getData().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
