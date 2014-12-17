package rss.generator;

import org.junit.Test;
import rss.generator.elem.Channel;
import rss.generator.elem.Item;
import rss.generator.elem.RSS;

import java.io.IOException;


public class RssNewsGeneratorTest {

    @Test
    public void generateNewsTest() throws IOException {
        RSSFeedGenerator rssFeed = RSSFeedGeneratorFactory.getDefault();

        RSS rss = new RSS(RSS.VERSION_2_0);

        Channel channel = new Channel("title", "link", "descriprtion");
        Item item = new Item("item_title", "item_description");
        channel.addItem(item);
        rss.addChannel(channel);

        String expectedRssFeed = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<channel><title>title</title><link>link</link><description>descriprtion</description><item><title>item_title</title><description>item_description</description></item></channel>\n";

        //assertEquals(rssFeed.generateAsString(rss), expectedRssFeed);

    }
}
