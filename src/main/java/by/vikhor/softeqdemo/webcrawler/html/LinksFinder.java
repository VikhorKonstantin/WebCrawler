package by.vikhor.softeqdemo.webcrawler.html;

import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LinksFinder {

    public List<String> findAllLinks(String htmlDocument) {
        return Jsoup.parse(htmlDocument)
                .body()
                .select("a[href]")
                .stream()
                .map(e -> e.attr("abs:href"))
                .collect(Collectors.toList());
    }

}