package com.octo.composite.dataProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CacheProvider implements DataProvider {
    private DataProvider next;
    private List<String> cache;

    public CacheProvider(DataProvider next) {
        this.next = next;
    }

    @Override
    public List<String> getData() {
        if (cache==null) {
            cache = new ArrayList<>();
            cache.addAll(next.getData().stream().map(s->"Cached:"+s).collect(Collectors.toList()));
        }
        return cache;
    }
}
