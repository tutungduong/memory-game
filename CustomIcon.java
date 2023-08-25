package com.codebind;

import java.awt.Image;
import javax.swing.ImageIcon;

public class CustomIcon {

    private String defaultIconPath; // Path to the default image icon, i.e., educative_logo.jpg
    private String flippedIconPath; // Path to the flipped image icon, i.e., flower1.jpg, flower2.jpg, etc
    private Boolean isDone; // Variable to track whether the icon and its corresponding image icon has been found or not
    private Boolean isFlipped; // Variable to track whether the icon is currently flipped or not.
    private ImageIcon defaultIconImage; // Variable to store image of the default icon.
    private ImageIcon flippedIconImage; // Variable to store image of the flipped icon.

    public CustomIcon(String flippedIconPath) {
        // ----- Write Task 2 Code Below This Line ----- //
        this.defaultIconPath = "src/com/images/educative_logo.jpg";
        this.flippedIconPath = flippedIconPath;
        this.isDone = false;
        this.isFlipped = false;

        this.defaultIconImage = new ImageIcon(this.defaultIconPath);
        Image oldDefaultIconImage = this.defaultIconImage.getImage();
        Image updatedDefaultIconImage = oldDefaultIconImage.getScaledInstance(140, 140, Image.SCALE_SMOOTH);
        this.defaultIconImage = new ImageIcon(updatedDefaultIconImage);

        this.flippedIconImage = new ImageIcon(this.flippedIconPath);
        Image oldFlippedIconImage = this.flippedIconImage.getImage();
        Image updatedFlippedIconImage = oldFlippedIconImage.getScaledInstance(140, 140, Image.SCALE_SMOOTH);
        this.flippedIconImage = new ImageIcon(updatedFlippedIconImage);
    }

    // Getters

    public String getDefaultIconPath() {
        return defaultIconPath;
    }

    public String getFlippedIconPath() {
        return flippedIconPath;
    }

    public Boolean getIsDone() {
        return isDone;
    }

    public Boolean getIsFlipped() {
        return isFlipped;
    }

    public ImageIcon getDefaultIconImage() {
        return defaultIconImage;
    }

    public ImageIcon getFlippedIconImage() {
        return flippedIconImage;
    }

    // Setters

    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }

    public void setIsFlipped(Boolean isFlipped) {
        this.isFlipped = isFlipped;
    }
}