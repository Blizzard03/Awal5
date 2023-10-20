/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal5.Komputer_Class.Master.Sub;

import awal5.Komputer_Class.Master.Komputer;

/**
 *
 * @author mariq
 */
public class KomputerLaptop extends Komputer {

    private final String wifi;
    private final String LAN;
    private final boolean touchscreen;
    private final boolean keyboard_backlit;

    public KomputerLaptop(String wifi, String LAN, boolean touchscreen, boolean keyboard_backlit, String Brand, String Model, String CPU, String GPU, int RAM_Capacity, double Price, char Series, boolean SSD) {
        super(Brand, Model, CPU, GPU, RAM_Capacity, Price, Series, SSD);
        this.wifi = wifi;
        this.LAN = LAN;
        this.touchscreen = touchscreen;
        this.keyboard_backlit = keyboard_backlit;
    }
    
    public String getWifi() {
        return wifi;
    }

    public String getLAN() {
        return LAN;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public boolean isKeyboard_backlit() {
        return keyboard_backlit;
    }
    

    @Override
    public void tampilkan() {
        // Generated from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Laptop:");
        System.out.printf("%s %s %s %s %d %f %s %b %s%s %b %b",
                getBrand(),
                getModel(),
                getCPU(),
                getGPU(),
                getRAM_Capacity(),
                getPrice(),
                getSeries(),
                isSSD(),
                wifi,
                LAN,
                touchscreen,
                keyboard_backlit
        );

    }
}
