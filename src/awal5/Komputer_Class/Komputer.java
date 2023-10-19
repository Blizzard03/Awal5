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

    // Initiate Variable
    public String Brand, Model, CPU, GPU;
    public int RAM_Capacity;
    public double Price;
    public char Series;
    public boolean SSD;

    // Full Constructors
    public Komputer(
            String Brand,
            String Model,
            String CPU,
            String GPU,
            int RAM_Capacity,
            double Price,
            char Series,
            boolean SSD) {

        this.Brand = Brand;
        this.Model = Model;
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM_Capacity = RAM_Capacity;
        this.Price = Price;
        this.Series = Series;
        this.SSD = SSD;
    }

    // Blank Constuctors
    public Komputer() {
        this.Brand = "Uknowns";
        this.Model = "Uknowns";
        this.CPU = "Unknows";
        this.GPU = "Unknows";
        this.RAM_Capacity = 0;
        this.Price = 0.0;
        this.Series = '-';
        this.SSD = true;
    }

    // Brand, Model, and Price only
    public Komputer(String Brand, String Model, Double Price) {
        this.Brand = Brand;
        this.Model = Model;
        this.Price = Price;

    }

    /*
     * Getters Variables
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

    /*
     * Setters Variables
     */
    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setCPU(String cPU) {
        CPU = cPU;
    }

    public void setGPU(String gPU) {
        GPU = gPU;
    }

    public void setRAM_Capacity(int rAM_Capacity) {
        RAM_Capacity = rAM_Capacity;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setSeries(char series) {
        Series = series;
    }

    public void setSSD(boolean sSD) {
        SSD = sSD;
    }

}
