package com.developit.image;

import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Image {
    public static Paint build(String source) {
        try {
            return new ImagePattern(new javafx.scene.image.Image(new FileInputStream(source)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
