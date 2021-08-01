/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GlassSwingControl;

/**
 *
 * @author DONI
 */

public enum MyAnimation {

    /**
     * animasi dari kiri
     */
    SHOW_FROM_LEFT("SHOW_FROM_LEFT"),
    /**
     * animasi dari kanan 
     */
    SHOW_FROM_RIGHT("SHOW_FROM_RIGHT"),
    /**
     * animasi dari atas 
     */
    SHOW_FROM_TOP("SHOW_FROM_TOP"),
    /**
     * animasi dari bawah 
     */
    SHOW_FROM_BOTTOM("SHOW_FROM_BOTTOM"),
    /**
     * tak ada animasi
     */
    NO_ANIMATION("NO_ANIMATION"),
    /**
     * animasi ke kiri
     */
    HIDE_TO_LEFT("HIDE_TO_LEFT"),
    /**
     * animasi ke kanan
     */
    HIDE_TO_RIGHT("HIDE_TO_RIGHT"),
    /**
     * animasi ke atas
     */
    HIDE_TO_TOP("HIDE_TO_TOP"),
    /**
     * animasi ke bawah
     */
    HIDE_TO_BOTTOM("HIDE_TO_BOTTOM");
    private String animatedMethode;

    private MyAnimation(String animatedMethode) {
        this.animatedMethode = animatedMethode;
    }

    public String getAnimatedMethode() {
        return animatedMethode;
    }
    
}
