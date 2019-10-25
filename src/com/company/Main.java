package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<First> list = new ArrayList<>();
        list.add(null);
        list.add(new First());
        list.add(new First(new Second()));
        list.add(new First(new Second(Collections.emptyList())));
        list.add(new First(new Second(Collections.singletonList(new Third()))));
        list.add(new First(new Second(Collections.singletonList(new Third("Third")))));

        for (First item : list ) {
            Optional.ofNullable(item)
                    .map(First::getSecond)
                    .map(Second::getThirds)
                    .get();
        }

    }

}

