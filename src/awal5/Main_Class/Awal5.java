/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awal5.Main_Class;

import awal5.Komputer_Class.Komputer;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author mariq
 */
public class Awal5 {

    //private static boolean SSD;

    /*Series Legendary
    * G = Gaming
    * O = Office
    * C = Content Creator
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Curency Formatter
        Locale Indonesia = new Locale("in", "ID");
        NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);

        //Komputer class
        Komputer cm1 = new Komputer("Acer", "Nitro 16", "AMD RYZEN™ 5 7535HS", "NVIDIA® GeForce RTX™ 4050", 8, 16000000, 'G', true);
        Komputer cm2 = new Komputer("Asus", "X441BA", "AMD A6", "AMD Radeon Graphics™", 4, 3500000, 'O', false);
        Komputer cm3 = new Komputer("MSI", "BRAVO 15 ", "AMD Ryzen™ 5 5600H", "AMD Radeon RX 5500M", 8, 13000000, 'G', true);
        Komputer cm4 = new Komputer("Lenovo", "Think Pad T10", "Intel® Core™ i5 m250", "Intel®  HD Graphic", 4, 3000000, 'O', false);
        Komputer cm5 = new Komputer("Lenovo", "Legion 5 Gen 7", "AMD Ryzen™ 7 6800H", "NVIDIA® GeForce RTX™ 3070 Ti", 16, 36000000, 'G', true);
        Komputer cm6 = new Komputer("MSI", "Creator Z16 HX Studio - B13VETO", "Intel® Core™ i7 - 13700HX", "NVIDIA® GeForce RTX™ 4060", 16, 49000000, 'C', true);
        Komputer cm7 = new Komputer("Asus", "ExpertBook B5 Flip", "Intel® Core™ i5 1240P ", "Intel® Iren Xe graphic™", 8, 1600000, 'O', true);
        Komputer cm8 = new Komputer("Asus", "X441MA", "Intel® Celeron N450", "Intel®  UHD Graphic", 4, 4000000, 'O', false);
        Komputer cm9 = new Komputer("Acer", "Aspire 1", "Qualcomm Kyro 468", "Qualcomm Adreno 618", 4, 600000, 'O', true);
        Komputer cm10 = new Komputer("Acer", "ConceptD 7 SpatialLabs Edition", "Intel® Core™ i7 -11800H", "NVIDIA® GeForce RTX™ 3050", 4, 57000000, 'C', true);

        System.out.println("======================= AWAL 5 Program =======================");
        System.out.println("  ===================== Komputer 1 ==========================");
        System.out.println("  Brand :  " + cm1.getBrand());
        System.out.println("  Model :  " + cm1.getModel());
        System.out.println("  CPU :  " + cm1.getCPU());
        System.out.println("  GPU :  " + cm1.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm1.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm1.getPrice()));
        if (cm1.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm1.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm1.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm1.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else if (cm1.isSSD() == false) {
            System.out.println("  HDD :" + " " + "Yes");
        }
        System.out.println("  ===================== Komputer 2 ==========================");
        System.out.println("  Brand :  " + cm2.getBrand());
        System.out.println("  Model :  " + cm2.getModel());
        System.out.println("  CPU :  " + cm2.getCPU());
        System.out.println("  GPU :  " + cm2.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm2.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm2.getPrice()));
        if (cm2.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm2.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm2.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm2.isSSD() == true) {
            System.out.println("  SSD :" + "Yes");
        } else if (cm2.isSSD() == false) {
            System.out.println("  HDD :" + "Yes");
        }
        System.out.println("  ===================== Komputer 3 ==========================");
        System.out.println("  Brand :  " + cm3.getBrand());
        System.out.println("  Model :  " + cm3.getModel());
        System.out.println("  CPU :  " + cm3.getCPU());
        System.out.println("  GPU :  " + cm3.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm3.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm3.getPrice()));
        if (cm3.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm3.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm3.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm3.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else if (cm3.isSSD() == false) {
            System.out.println("  HDD :" + " " + "Yes");
        }
        System.out.println("  ===================== Komputer 4 ==========================");
        System.out.println("  Brand :  " + cm4.getBrand());
        System.out.println("  Model :  " + cm4.getModel());
        System.out.println("  CPU :  " + cm4.getCPU());
        System.out.println("  GPU :  " + cm4.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm4.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm4.getPrice()));
        if (cm4.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm4.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm4.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm4.isSSD() == true) {
            System.out.println("  SSD :" + "Yes");
        } else if (cm4.isSSD() == false) {
            System.out.println("  HDD :" + "Yes");
        }
        System.out.println("  ===================== Komputer 5 ==========================");
        System.out.println("  Brand :  " + cm5.getBrand());
        System.out.println("  Model :  " + cm5.getModel());
        System.out.println("  CPU :  " + cm5.getCPU());
        System.out.println("  GPU :  " + cm5.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm5.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm5.getPrice()));
        if (cm5.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm5.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm5.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm5.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else if (cm5.isSSD() == false) {
            System.out.println("  HDD :" + " " + "Yes");
        }
        System.out.println("  ===================== Komputer 6 ==========================");
        System.out.println("  Brand :  " + cm6.getBrand());
        System.out.println("  Model :  " + cm6.getModel());
        System.out.println("  CPU :  " + cm6.getCPU());
        System.out.println("  GPU :  " + cm6.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm6.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm6.getPrice()));
        if (cm6.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm6.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm6.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm6.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else if (cm2.isSSD() == false) {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("  ===================== Komputer 7 ==========================");
        System.out.println("  Brand :  " + cm7.getBrand());
        System.out.println("  Model :  " + cm7.getModel());
        System.out.println("  CPU :  " + cm7.getCPU());
        System.out.println("  GPU :  " + cm7.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm7.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm7.getPrice()));
        if (cm7.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm7.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm7.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm7.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else if (cm7.isSSD() == false) {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("  ===================== Komputer 8 ==========================");
        System.out.println("  Brand :  " + cm8.getBrand());
        System.out.println("  Model :  " + cm8.getModel());
        System.out.println("  CPU :  " + cm8.getCPU());
        System.out.println("  GPU :  " + cm8.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm8.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm8.getPrice()));
        if (cm8.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm8.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm8.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm8.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else if (cm8.isSSD() == false) {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("  ===================== Komputer 9 ==========================");
        System.out.println("  Brand :  " + cm9.getBrand());
        System.out.println("  Model :  " + cm9.getModel());
        System.out.println("  CPU :  " + cm9.getCPU());
        System.out.println("  GPU :  " + cm9.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm9.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm9.getPrice()));
        if (cm9.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm9.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm9.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm9.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else if (cm9.isSSD() == false) {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("  ===================== Komputer 10 ==========================");
        System.out.println("  Brand :  " + cm10.getBrand());
        System.out.println("  Model :  " + cm10.getModel());
        System.out.println("  CPU :  " + cm10.getCPU());
        System.out.println("  GPU :  " + cm10.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm10.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm10.getPrice()));
        if (cm10.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm10.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm10.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm10.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else if (cm10.isSSD() == false) {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("============================== END =============================");
        System.out.println("Made by WPA TEAM");
    }

}
