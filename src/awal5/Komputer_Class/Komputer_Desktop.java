/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal5.Komputer_Class;

/**
 *
 * @author mariq
 */
public class Komputer_Desktop extends Komputer {

    private int SlotRAM;
    private String Mother_Board;

    public Komputer_Desktop(int SlotRAM, String Mother_Board, String Brand, String Model, String CPU, String GPU,
            int RAM_Capacity, double Price, char Series, boolean SSD) {
        super(Brand, Model, CPU, GPU, RAM_Capacity, Price, Series, SSD);
        this.SlotRAM = SlotRAM;
        this.Mother_Board = Mother_Board;
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
