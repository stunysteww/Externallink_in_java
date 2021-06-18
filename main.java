package com.company;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class a {
    public static void main(String[] args) throws URISyntaxException, IOException {
        Desktop desk = Desktop.getDesktop();
        desk.browse(new URI("https://instagram.com"));
    }
}











