package com.example.helloapi;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ConvertBlackWhite {
    public static void main(String[] args) {
    try {
        File input = new File("D:/haut.jpg");
        BufferedImage image = ImageIO.read(input);

        BufferedImage result = new BufferedImage(
                image.getWidth(),
                image.getHeight(),
                BufferedImage.TYPE_BYTE_BINARY
        );
        Graphics2D graphic = result.createGraphics();
        graphic.drawImage(image, 0, 0,null);
        graphic.dispose();

        File output = new File("D:/haut_black_white.png");
        ImageIO.write(result, "png", output);

    } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
