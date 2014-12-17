/*
 * Created on Jul 30, 2004 by viecili
 */
package rss.generator;

import rss.generator.elem.RSS;

import java.io.File;
import java.io.IOException;

/**
 * The interface definition for RSS Feed Generators.
 * 
 * @author Henrique A. Viecili
 */
public interface RSSFeedGenerator {
    
    /** Generate the RSS Feed content to the specified file.
     * @param rss The RSS Feed content
     * @param xmlFile The output file
     */
    void generateToFile(RSS rss, File xmlFile) throws IOException;

    public String generateAsString(RSS rss) throws IOException;
}