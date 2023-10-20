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

    private String wifi, LAN;

    public KomputerLaptop(String wifi, String LAN, String Brand, String Model, String CPU, String GPU, int RAM_Capacity,
            double Price, char Series, boolean SSD) {
        super(Brand, Model, CPU, GPU, RAM_Capacity, Price, Series, SSD);
        this.wifi = wifi;
        this.LAN = LAN;
    }

    public String getWifi() {
        return wifi;
    }

    public String getLAN() {
        return LAN;
    }

    @Override
    public void tampilkan() {
        // Generated from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Laptop:");
        System.out.printf("%s %s %s %s %d %f %s %b %s%s",
                getBrand(),
                getModel(),
                getCPU(),
                getGPU(),
                getRAM_Capacity(),
                getPrice(),
                getSeries(),
                isSSD(),
                wifi,
                LAN);

    }
}
