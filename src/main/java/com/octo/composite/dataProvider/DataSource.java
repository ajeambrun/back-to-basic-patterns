package com.octo.composite.dataProvider;

import java.util.List;

public class DataSource implements DataProvider {
    @Override
    public List<String> getData() {
        return List.of("a","b","c");
    }
}
