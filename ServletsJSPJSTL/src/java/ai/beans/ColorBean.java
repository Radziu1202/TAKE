/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ai.beans;

/**
 *
 * @author radziu
 */
public class ColorBean {
   private String foregroundColor;
    private String backgroundColor;
    private int frameAppearance;
    public ColorBean() {
    } 

    /**
     * @return the foregroundColor
     */
    public String getForegroundColor() {
        return foregroundColor;
    }

    /**
     * @param foregroundColor the foregroundColor to set
     */
    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    /**
     * @return the backgroundColor
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * @param backgroundColor the backgroundColor to set
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * @return the frameAppearance
     */
    public int getFrameAppearance() {
        return frameAppearance;
    }

    /**
     * @param frameAppearance the frameAppearance to set
     */
    public void setFrameAppearance(int frameAppearance) {
        this.frameAppearance = frameAppearance;
    }
}
