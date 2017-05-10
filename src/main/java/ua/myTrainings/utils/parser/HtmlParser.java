package ua.myTrainings.utils.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class HtmlParser {

    void findAndLoadImagesOnHtml(String url, String destination) throws IOException, URISyntaxException {

        Document document = Jsoup.parse(new URL(url), 1000);
        Element element = document.body();
        Elements elementsList = element.getElementsByTag("img");

        List<String> imagesUrls = new ArrayList<>();

        for (Element elem : elementsList) {
            String img = elem.attr("src");
            if (img.contains(".jpg") && img.startsWith("http"))
                imagesUrls.add(img);
        }

        for (String urls : imagesUrls) {
            try (InputStream is = new URI(urls).toURL().openStream();
                 OutputStream outputStream = new FileOutputStream(destination+(int)(Math.random()*100000)+".jpg")) {

                byte[] buff = new byte[1024];
                int count;

                while ((count = is.read(buff)) != -1) {
                    outputStream.write(buff, 0, count);
                    outputStream.flush();
                }

            }
        }
    }
}
