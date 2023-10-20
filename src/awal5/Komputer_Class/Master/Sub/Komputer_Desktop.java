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
public class Komputer_Desktop extends Komputer {

    private final int SlotRAM;
    private final int SlotPCIE;
    private final String Mother_Board;
    private final String Casing;


    public Komputer_Desktop(int SlotRAM, int SlotPCIE, String Mother_Board, String Casing, String Brand, String Model, String CPU, String GPU, int RAM_Capacity, double Price, char Series, boolean SSD) {
        super(Brand, Model, CPU, GPU, RAM_Capacity, Price, Series, SSD);
        this.SlotRAM = SlotRAM;
        this.SlotPCIE = SlotPCIE;
        this.Mother_Board = Mother_Board;
        this.Casing = Casing;
    }

    

    public int getSlotPCIE() {
        return SlotPCIE;
    }

    public String getCasing() {
        return Casing;
    }
    public int getSlotRAM() {
        return SlotRAM;
    }

    public String getMother_Board() {
        return Mother_Board;
    }

    @Override
    public void tampilkan() {
        // Generated from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Laptop:");
        System.out.printf("%s %s %s %s %d %f %s %b %d%s",
                getBrand(),
                getModel(),
                getCPU(),
                getGPU(),
                getRAM_Capacity(),
                getPrice(),
                getSeries(),
                isSSD(),
                SlotRAM,
                Mother_Board);

    }
}
