package ua.myTrainings.utils.parser;

import java.io.IOException;
import java.net.URISyntaxException;

public class RunHtmlParser {

    public static void main(String[] args) {

        HtmlParser htmlParser = new HtmlParser();

        try {
            htmlParser.findAndLoadImagesOnHtml(Constans.HTMLPATH,Constans.DEST_PATH);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
