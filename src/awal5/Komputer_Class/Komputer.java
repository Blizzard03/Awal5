/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal5.Komputer_Class;

/**
 *
 * @author mariq
 */
public class Komputer {

    //Initiate Variable
    private String Brand, Model, CPU, GPU;
    private int RAM_Capacity;
    private double Price;
    private char Series;
    private boolean SSD;

    //Constructors
    public Komputer(String Brand, String Model, String CPU, String GPU, int RAM_Capacity, double Price, char Series, boolean SSD) {
        this.Brand = Brand;
        this.Model = Model;
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM_Capacity = RAM_Capacity;
        this.Price = Price;
        this.Series = Series;
        this.SSD = SSD;
    }
    

    /*
    * Getter Variables
    */
    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public int getRAM_Capacity() {
        return RAM_Capacity;
    }

    public double getPrice() {
        return Price;
    }

    public char getSeries() {
        return Series;
    }

    public boolean isSSD() {
        return SSD;
    }

}
