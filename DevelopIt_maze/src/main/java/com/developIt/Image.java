package com.developIt;

import javafx.scene.paint.ImagePattern;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Image {
    public static ImagePattern build(String url) {
        try {
            javafx.scene.image.Image receivedImage = new javafx.scene.image.Image(new FileInputStream(url));
            return new ImagePattern(receivedImage);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
