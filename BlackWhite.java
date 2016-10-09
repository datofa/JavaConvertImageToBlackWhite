
import java.awt.Color;
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class BlackWhite {

    BufferedImage image;
    int width;
    int height;

    public BlackWhite(BufferedImage imageSrc) {
        try {

            width = imageSrc.getWidth();
            height = imageSrc.getHeight();

            for (int i = 0; i < height; i++) {

                for (int j = 0; j < width; j++) {

                    Color c = new Color(imageSrc.getRGB(j, i));
                    int Red = c.getRed();
                    int Green = c.getGreen();
                    int Blue = c.getBlue();
                    int Avg = (Red + Green + Blue) / 3;

                    int Gray;

                    if (Avg < 127) {
                        Gray = 0;
                    } else {
                        Gray = 255;
                    }
                    Color newColor = new Color(Gray, Gray, Gray);
                    System.out.println(newColor.getRGB());
                    imageSrc.setRGB(j, i, newColor.getRGB());
                }
            }

            this.image = imageSrc;

        } catch (Exception e) {
        }
    }

    public BufferedImage getImage() {
        return this.image;
    }

}
