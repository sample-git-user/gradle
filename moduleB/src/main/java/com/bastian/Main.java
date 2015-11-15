package com.bastian;

import com.bastian.util.Util;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by on 14.11.15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        Predicate<Integer> isEven = new Predicate<Integer>() {
            public boolean test(Integer obj) {
                return obj % 2 == 0;
            }
        };

        for( Integer number : numbers ) {
            if (isEven.test(number)) {
                System.out.print(number + " ");
            }
        }
        Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
        Elements newsHeadlines = doc.select("#mp-itn b a");
        System.out.println(Util.test());
    }
}
