import service.CrawlingService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(CrawlingService.getHtmlSourceCode("https://www.google.com"));
    }
}
