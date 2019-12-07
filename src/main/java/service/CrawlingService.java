package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

public class CrawlingService {
    public static String getHtmlSourceCode(String url) throws IOException {
        return new BufferedReader(new InputStreamReader(new URL(url).openConnection().getInputStream())).lines().collect(Collectors.joining());
    }

    public static List<String> getHtmlSourceCodeByList(String url) throws IOException {
        if(!url.contains("https://") && !url.contains("http://")){
            url ="https://" + url;
        }
        return new BufferedReader(new InputStreamReader(new URL(url).openConnection().getInputStream())).lines().collect(Collectors.toList());
    }

}