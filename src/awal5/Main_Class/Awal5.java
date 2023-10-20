/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awal5.Main_Class;

import awal5.Komputer_Class.Master.Komputer;
import awal5.Komputer_Class.Master.Sub.Komputer_Desktop;
import awal5.Komputer_Class.Master.Sub.KomputerLaptop;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author mariq
 */
public class Awal5 {

    // private static boolean SSD;

    /*
     * Series Legendary
     * G = Gaming
     * O = Office
     * C = Content Creator
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Curency Formatter
        Locale Indonesia = new Locale(
                "in",
                "ID");
        NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);

        // Komputer class - Edition Full Constructors
        final Komputer cm1 = new Komputer(
                "Acer",
                "Nitro 16",
                "AMD RYZEN™ 5 7535HS",
                "NVIDIA® GeForce RTX™ 4050",
                8,
                16000000.00,
                'G',
                true);
        final Komputer cm2 = new Komputer(
                "Asus",
                "X441BA",
                "AMD A6",
                "AMD Radeon Graphics™",
                4,
                3500000.00,
                'O',
                false);
        final Komputer cm3 = new Komputer(
                "MSI",
                "BRAVO 15 ",
                "AMD Ryzen™ 5 5600H",
                "AMD Radeon RX 5500M",
                8,
                13000000.00,
                'G',
                true);
        final Komputer cm4 = new Komputer(
                "Lenovo",
                "Think Pad T10",
                "Intel® Core™ i5 m250",
                "Intel®  HD Graphic",
                4,
                3000000.00,
                'O',
                false);
        final Komputer cm5 = new Komputer(
                "Lenovo",
                "Legion 5 Gen 7",
                "AMD Ryzen™ 7 6800H",
                "NVIDIA® GeForce RTX™ 3070 Ti",
                16,
                36000000.00,
                'G', true);
        final Komputer cm6 = new Komputer(
                "MSI",
                "Creator Z16 HX Studio - B13VETO",
                "Intel® Core™ i7 - 13700HX",
                "NVIDIA® GeForce RTX™ 4060",
                16,
                49000000,
                'C',
                true);
        final Komputer cm7 = new Komputer(
                "Asus",
                "ExpertBook B5 Flip",
                "Intel® Core™ i5 1240P ",
                "Intel® Iren Xe graphic™",
                8, 1600000,
                'O',
                true);
        final Komputer cm8 = new Komputer(
                "Asus",
                "X441MA",
                "Intel® Celeron N450",
                "Intel®  UHD Graphic",
                4,
                4000000,
                'O',
                false);
        final Komputer cm9 = new Komputer(
                "Acer",
                "Aspire 1",
                "Qualcomm Kyro 468",
                "Qualcomm Adreno 618",
                4,
                600000,
                'O',
                true);
        final Komputer cm10 = new Komputer(
                "Acer",
                "ConceptD 7 SpatialLabs Edition",
                "Intel® Core™ i7 -11800H",
                "NVIDIA® GeForce RTX™ 3050",
                8,
                57000000,
                'C',
                true);

        // Komputer 2 - Blank Constructor
        final Komputer cm11 = new Komputer();
        cm11.Brand = "";
        cm11.Model = "";
        cm11.CPU = "";
        cm11.GPU = "";
        cm11.RAM_Capacity = 0;
        cm11.Price = 0.00;
        cm11.Series = '-';

        final Komputer cm12 = new Komputer();
        cm12.Brand = "";
        cm12.Model = "";
        cm12.CPU = "";
        cm12.GPU = "";
        cm12.RAM_Capacity = 0;
        cm12.Price = 0.00;
        cm12.Series = '-';

        final Komputer cm13 = new Komputer();
        cm13.Brand = "";
        cm13.Model = "";
        cm13.CPU = "";
        cm13.GPU = "";
        cm13.RAM_Capacity = 0;
        cm13.Price = 0.00;
        cm13.Series = '-';

        final Komputer cm14 = new Komputer();
        cm14.Brand = "";
        cm14.Model = "";
        cm14.CPU = "";
        cm14.GPU = "";
        cm14.RAM_Capacity = 0;
        cm14.Price = 0.00;
        cm14.Series = '-';

        final Komputer cm15 = new Komputer();
        cm15.Brand = "";
        cm15.Model = "";
        cm15.CPU = "";
        cm15.GPU = "";
        cm15.RAM_Capacity = 0;
        cm15.Price = 0.00;
        cm15.Series = '-';

        final Komputer cm16 = new Komputer();
        cm16.Brand = "";
        cm16.Model = "";
        cm16.CPU = "";
        cm16.GPU = "";
        cm16.RAM_Capacity = 0;
        cm16.Price = 0.00;
        cm16.Series = '-';

        final Komputer cm17 = new Komputer();
        cm17.Brand = "";
        cm17.Model = "";
        cm17.CPU = "";
        cm17.GPU = "";
        cm17.RAM_Capacity = 0;
        cm17.Price = 0.00;
        cm17.Series = '-';

        final Komputer cm18 = new Komputer();
        cm18.Brand = "";
        cm18.Model = "";
        cm18.CPU = "";
        cm18.GPU = "";
        cm18.RAM_Capacity = 0;
        cm18.Price = 0.00;
        cm18.Series = '-';

        final Komputer cm19 = new Komputer();
        cm19.Brand = "";
        cm19.Model = "";
        cm19.CPU = "";
        cm19.GPU = "";
        cm19.RAM_Capacity = 0;
        cm19.Price = 0.00;
        cm19.Series = '-';

        final Komputer cm20 = new Komputer();
        cm20.Brand = "";
        cm20.Model = "";
        cm20.CPU = "";
        cm20.GPU = "";
        cm20.RAM_Capacity = 0;
        cm20.Price = 0.00;
        cm20.Series = '-';

        // Komputer 3 - Brand, Model, and Price only
        final Komputer cm21 = new Komputer("", "", 0.0);
        final Komputer cm22 = new Komputer("", "", 0.0);
        final Komputer cm23 = new Komputer("", "", 0.0);
        final Komputer cm24 = new Komputer("", "", 0.0);
        final Komputer cm25 = new Komputer("", "", 0.0);
        final Komputer cm26 = new Komputer("", "", 0.0);
        final Komputer cm27 = new Komputer("", "", 0.0);
        final Komputer cm28 = new Komputer("", "", 0.0);
        final Komputer cm29 = new Komputer("", "", 0.0);
        final Komputer cm30 = new Komputer("", "", 0.0);

        // Komputer 4
        final Komputer_Desktop PC = new Komputer_Desktop(0, " ", " ", "", "", "", 0, 0.0, '-', false);
        final KomputerLaptop Laptop = new KomputerLaptop("", "", "", "", "", "", 0, 0.0, '-', false);

        System.out.println("======================= AWAL 5 Program =======================");
        System.out.println("================= Komputer Full Constractor===================");
        System.out.println("======================= Komputer 1 ===========================");
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
        } else {
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
        } else {
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
        } else {
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
        } else {
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
        } else {
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
        } else {
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
        } else {
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
        } else {
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
        } else {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("\n ================= Komputer Blank Constructors===================");
        System.out.println("  ===================== Komputer 11 ==========================");
        System.out.println("  Brand :  " + cm11.getBrand());
        System.out.println("  Model :  " + cm11.getModel());
        System.out.println("  CPU :  " + cm11.getCPU());
        System.out.println("  GPU :  " + cm11.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm11.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm11.getPrice()));
        if (cm11.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm11.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm11.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm11.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("  ===================== Komputer 12 ==========================");
        System.out.println("  Brand :  " + cm12.getBrand());
        System.out.println("  Model :  " + cm12.getModel());
        System.out.println("  CPU :  " + cm12.getCPU());
        System.out.println("  GPU :  " + cm12.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm12.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm12.getPrice()));
        if (cm12.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm12.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm12.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm12.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("  ===================== Komputer 13 ==========================");
        System.out.println("  Brand :  " + cm13.getBrand());
        System.out.println("  Model :  " + cm13.getModel());
        System.out.println("  CPU :  " + cm13.getCPU());
        System.out.println("  GPU :  " + cm13.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm13.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm13.getPrice()));
        if (cm13.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm13.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm13.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm13.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("  ===================== Komputer 14 ==========================");
        System.out.println("  Brand :  " + cm14.getBrand());
        System.out.println("  Model :  " + cm14.getModel());
        System.out.println("  CPU :  " + cm14.getCPU());
        System.out.println("  GPU :  " + cm14.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm14.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm14.getPrice()));
        if (cm14.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm14.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm14.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm14.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("  ===================== Komputer 15 ==========================");
        System.out.println("  Brand :  " + cm15.getBrand());
        System.out.println("  Model :  " + cm15.getModel());
        System.out.println("  CPU :  " + cm15.getCPU());
        System.out.println("  GPU :  " + cm15.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm15.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm15.getPrice()));
        if (cm15.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm15.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm15.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm16.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("  ===================== Komputer 17 ==========================");
        System.out.println("  Brand :  " + cm17.getBrand());
        System.out.println("  Model :  " + cm17.getModel());
        System.out.println("  CPU :  " + cm17.getCPU());
        System.out.println("  GPU :  " + cm17.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm17.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm17.getPrice()));
        if (cm17.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm17.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm17.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm17.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("  ===================== Komputer 18 ==========================");
        System.out.println("  Brand :  " + cm18.getBrand());
        System.out.println("  Model :  " + cm18.getModel());
        System.out.println("  CPU :  " + cm18.getCPU());
        System.out.println("  GPU :  " + cm18.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm18.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm18.getPrice()));
        if (cm18.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm18.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm18.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm18.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("  ===================== Komputer 19 ==========================");
        System.out.println("  Brand :  " + cm19.getBrand());
        System.out.println("  Model :  " + cm19.getModel());
        System.out.println("  CPU :  " + cm19.getCPU());
        System.out.println("  GPU :  " + cm19.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm19.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm19.getPrice()));
        if (cm19.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm19.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm19.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm10.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("  ===================== Komputer 20 ==========================");
        System.out.println("  Brand :  " + cm20.getBrand());
        System.out.println("  Model :  " + cm20.getModel());
        System.out.println("  CPU :  " + cm20.getCPU());
        System.out.println("  GPU :  " + cm20.getGPU());
        System.out.println("  RAM :  " + String.valueOf(cm20.getRAM_Capacity()) + " " + "GB");
        System.out.println("  Price :  " + formater.format(cm20.getPrice()));
        if (cm20.getSeries() == 'G') {
            System.out.println("  Series :  " + "Gaming");
        } else if (cm20.getSeries() == 'O') {
            System.out.println("  Series :  " + "Office");
        } else if (cm20.getSeries() == 'C') {
            System.out.println("  Series :  " + "Content Creator");
        }

        if (cm20.isSSD() == true) {
            System.out.println("  SSD :" + " " + "Yes");
        } else {
            System.out.println("  HDD :" + "  " + "Yes");
        }
        System.out.println("\n==============================================================");
        System.out.println("========= Komputer 3 - Brand, Model, and Price only ============");
        System.out.println("===================== Komputer 21 ==========================");
        System.out.println("  Brand :  " + cm21.getBrand());
        System.out.println("  Model :  " + cm21.getModel());
        System.out.println("  Price :  " + formater.format(cm21.getPrice()));
        System.out.println("===================== Komputer 22 ==========================");
        System.out.println("  Brand :  " + cm22.getBrand());
        System.out.println("  Model :  " + cm22.getModel());
        System.out.println("  Price :  " + formater.format(cm22.getPrice()));
        System.out.println("===================== Komputer 23 ==========================");
        System.out.println("  Brand :  " + cm23.getBrand());
        System.out.println("  Model :  " + cm23.getModel());
        System.out.println("  Price :  " + formater.format(cm23.getPrice()));
        System.out.println("===================== Komputer 24 ==========================");
        System.out.println("  Brand :  " + cm24.getBrand());
        System.out.println("  Model :  " + cm24.getModel());
        System.out.println("  Price :  " + formater.format(cm24.getPrice()));
        System.out.println("===================== Komputer 25 ==========================");
        System.out.println("  Brand :  " + cm25.getBrand());
        System.out.println("  Model :  " + cm25.getModel());
        System.out.println("  Price :  " + formater.format(cm25.getPrice()));
        System.out.println("===================== Komputer 26 ==========================");
        System.out.println("  Brand :  " + cm26.getBrand());
        System.out.println("  Model :  " + cm26.getModel());
        System.out.println("  Price :  " + formater.format(cm26.getPrice()));
        System.out.println("===================== Komputer 27 ==========================");
        System.out.println("  Brand :  " + cm27.getBrand());
        System.out.println("  Model :  " + cm27.getModel());
        System.out.println("  Price :  " + formater.format(cm27.getPrice()));
        System.out.println("===================== Komputer 28 ==========================");
        System.out.println("  Brand :  " + cm28.getBrand());
        System.out.println("  Model :  " + cm28.getModel());
        System.out.println("  Price :  " + formater.format(cm28.getPrice()));
        System.out.println("===================== Komputer 29 ==========================");
        System.out.println("  Brand :  " + cm29.getBrand());
        System.out.println("  Model :  " + cm29.getModel());
        System.out.println("  Price :  " + formater.format(cm29.getPrice()));
        System.out.println("===================== Komputer 30 ==========================");
        System.out.println("  Brand :  " + cm30.getBrand());
        System.out.println("  Model :  " + cm30.getModel());
        System.out.println("  Price :  " + formater.format(cm30.getPrice()));
        System.out.println("===================== Komputer 31 ==========================");
        PC.tampilkan();
        System.out.println("\n ===================== Komputer 32 ==========================");
        Laptop.tampilkan();
        int[] min_v = {
                (int) cm1.getPrice(),
                (int) cm2.getPrice(),
                (int) cm3.getPrice(),
                (int) cm4.getPrice(),
                (int) cm5.getPrice(),
                (int) cm6.getPrice(),
                (int) cm7.getPrice(),
                (int) cm8.getPrice(),
                (int) cm9.getPrice(),
                (int) cm10.getPrice(),
                (int) cm11.getPrice(),
                (int) cm12.getPrice(),
                (int) cm13.getPrice(),
                (int) cm14.getPrice(),
                (int) cm15.getPrice(),
                (int) cm16.getPrice(),
                (int) cm17.getPrice(),
                (int) cm18.getPrice(),
                (int) cm19.getPrice(),
                (int) cm20.getPrice(),
                (int) cm21.getPrice(),
                (int) cm22.getPrice(),
                (int) cm23.getPrice(),
                (int) cm24.getPrice(),
                (int) cm25.getPrice(),
                (int) cm26.getPrice(),
                (int) cm27.getPrice(),
                (int) cm28.getPrice(),
                (int) cm29.getPrice(),
                (int) cm30.getPrice(),
                (int) PC.getPrice(),
                (int) Laptop.getPrice(),

        };
        int min = min_v[0];
        for (int i = 0; i < min_v.length; i++) {
            if (min_v[i] < min) {
                min = min_v[i];

            }
        }
        System.out.println("Harga Tertinggi" + " " + formater.format(Komputer.min_cal(min)));
        System.out.println("============================== END =============================");
        System.out.println("Made by WPA TEAM");
    }

}
