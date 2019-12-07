package service;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class CrawlingServiceTest {
    @Test
    public void initTest() {
        CrawlingService service = new CrawlingService();
        assertThat(service).isNotNull();
    }

    @Test
    public void getHtmlSourceCodeTest() throws IOException {
        CrawlingService service = new CrawlingService();
        assertThat(CrawlingService.getHtmlSourceCode("https://www.google.com"))
                .contains("doctype");
    }

}