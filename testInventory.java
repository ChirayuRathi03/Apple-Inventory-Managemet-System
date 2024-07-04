import java.util.*;
import java.lang.Math;
import java.io.*;

interface Products {
    public String displayProducts();
}

class AppleInvent {
    String choiceType;
    String choiceProd;
    int ram;
    int rom;

    public AppleInvent() {
    }

    public AppleInvent(String choiceType) {
        setChoiceType(choiceType);
    }

    public AppleInvent(String choiceType, String choiceProd) {
        setChoiceType(choiceType);
        setChoiceProd(choiceProd);
    }

    public String getChoiceType() {
        return choiceType;
    }

    public void setChoiceType(String choiceType) {
        this.choiceType = choiceType;
    }

    public String getChoiceProd() {
        return choiceProd;
    }

    public void setChoiceProd(String choiceProd) {
        this.choiceProd = choiceProd;
    }
    
}

class AppleProducts implements Products {
    ArrayList<String> mac = new ArrayList<String>();
    ArrayList<Double> macPrice = new ArrayList<Double>();
    ArrayList<String> iPhone = new ArrayList<String>();
    ArrayList<Double> iPhonePrice = new ArrayList<Double>();

    public void setInvent() {
        mac.add("Macbook Air");
        mac.add("Macbook Pro");
        mac.add("Macbook Mini");
        mac.add("iMac");
        
        macPrice.add(99900.00);
        macPrice.add(129900.00);
        macPrice.add(59900.00);
        macPrice.add(129900.00);
    }

    public String displayProducts() {
        StringBuilder sb = new StringBuilder();
        sb.append("MacBooks:\n");
        for (int i = 0; i < mac.size(); i++){
            sb.append((i+1)+") "+mac.get(i)+"\t INR "+macPrice.get(i)+" onwards");
            if (i != mac.size() - 1) {
                sb.append("\n");
            }
        }

        sb.append("\n\niPhones:\n");
        for (int i = 0; i < iPhone.size(); i++){
            sb.append((i+1)+") "+iPhone.get(i)+"\t INR "+iPhonePrice.get(i));
            if (i != iPhone.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}


class Order extends AppleInvent {
    ArrayList<String> Orders = new ArrayList<String>();
    double amt;
    int quantity;
    double totalBill;
    int prodNo;
    double choiceAmt;
    String prodName;
    double initialBill;
    String addElmt;
    ArrayList<String> serialNo = new ArrayList<String>();
    ArrayList<String> selectedSerialNo = new ArrayList<String>();
    ArrayList<String> prodsPurch = new ArrayList<String>(); 

    public void assignSerialNo() {
        serialNo.add("jizheXhS");
        serialNo.add("B7Z3PLUN");
        serialNo.add("kAbKJUom");
        serialNo.add("zdXfCpxV");
        serialNo.add("FLSAwo4D");
        serialNo.add("Mfa5u724");
        serialNo.add("4aKabRWj");
        serialNo.add("Tj5Mi4cc");
        serialNo.add("Xi6bbC5P");
        serialNo.add("iSg22tJR");
        serialNo.add("9u35fsYr");
        serialNo.add("mCsjFQXy");
        serialNo.add("hoQMymF9");
        serialNo.add("NkLr2fbL");
        serialNo.add("9Xgf4k4y");
        serialNo.add("bETejPSF");
        serialNo.add("LMpvtY3V");
        serialNo.add("XomQV7Ax");
        serialNo.add("tjR86j5k");
        serialNo.add("5vUhKe4n");
        serialNo.add("5KmKRZsT");
        serialNo.add("yLEsqftc");
        serialNo.add("42qHwSXJ");
        serialNo.add("MPE3pbrg");
        serialNo.add("HXUD3AJu");
        serialNo.add("X5jrP6mJ");
        serialNo.add("6kMMtfid");
        serialNo.add("K5mig2oi");
        serialNo.add("Zf7i5JNS");
        serialNo.add("2bWSGtPz");
        serialNo.add("MNDVEwWj");
        serialNo.add("rv62DqCM");
        serialNo.add("QBxMX9MK");
        serialNo.add("dee5x6EW");
        serialNo.add("TC5pbmp7");
        serialNo.add("iY8gXvtK");
        serialNo.add("sdUojB7d");
        serialNo.add("3QgE99gg");
        serialNo.add("7Mqcvc29");
        serialNo.add("RKFqU4Yc");
        serialNo.add("uYiTr2V5");
        serialNo.add("5rTsPX9F");
        serialNo.add("KvM7JUxk");
        serialNo.add("2JcTEBsx");
        serialNo.add("tAD7qbXM");
        serialNo.add("uTxadtqY");
        serialNo.add("5NZ4z9gp");
        serialNo.add("fMK87noZ");
        serialNo.add("QqsvihTj");
        serialNo.add("FWxWpAsv");
    }

    public String selectProdMac(String choiceProd, double initialBill) {
        if (choiceProd.equals("Macbook Air")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Configurations Available:8+256\t8+512");
            System.out.println("Chips Available:M1\tM2");
            System.out.println("Chipset: ");
            String chipset = sc.nextLine().toLowerCase();
            while(!chipset.equals("m1") & !chipset.equals("m2")){
                System.out.println("Invalid Chipset");
                System.out.println("Chipset: ");
                chipset = sc.nextLine().toLowerCase();                
            }
            ram = 8;
            System.out.println("RAM: "+ram);
            System.out.println("ROM: ");
            rom = sc.nextInt();
            while(rom != 256 & rom != 512) {
                System.out.println("Invalid ROM Size");
                System.out.println("ROM:256gb\t512gb");
                rom = sc.nextInt();
            }

            if (ram == 8 & rom == 256) {
                if(chipset.equals("m1")){
                    choiceAmt = 99900.00;
                }
                else{
                    choiceAmt = 119900.00;
                }
            }
            else if (ram == 8 & rom == 512){
                choiceAmt = 149900.00;
            }
            else {
                return "Invalid Configuration";
            }
            System.out.println("How many?");
            quantity = sc.nextInt();
            while (quantity<1){
                System.out.println("Enter a Valid Quantity.");
                System.out.println("How many?");
                quantity = sc.nextInt();
            }
            prodName = "Macbook Air";
            totalBill = initialBill + (quantity * choiceAmt);            
            for(int x = 0; x < quantity; x++){
                double randNo = Math.random() * 51 - x;
                int randomNo = (int)randNo;

                while (randomNo>51-x){
                    randomNo = randomNo - 2;
                }

                while(randomNo>serialNo.size()){
                    randomNo = randomNo - 2;
                }

                if(randomNo == serialNo.size()){
                    randomNo = randomNo - 1;
                }

                while (randomNo<0){
                    randomNo = randomNo + 1;
                }

                String serNo = serialNo.get(randomNo);
                selectedSerialNo.add(serNo);
                serialNo.remove(serNo);

                if(serialNo.size() == 0){
                    return "Out of Stock";
                }
            }
            if (quantity > 1) {
                for(int x = 0; x < quantity; x++) {
                    prodsPurch.add(prodName + " " + (x+1));
                }
            }
            addElmt = quantity + " " + prodName + " " + chipset.toUpperCase() +" RAM: " + ram + "gb ROM: " + rom + "gb = " + quantity*choiceAmt;
            Orders.add(addElmt);
        }
        else if (choiceProd.equals("Macbook Pro")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Available Dimensions:13inch\t14inch\t16inch");
            int dimension = sc.nextInt();
            if(dimension == 13){
                try {
                    ram = 8;
                    System.out.println("RAM: "+ram+"gb");
                    System.out.println("ROM: ");
                    rom = sc.nextInt();
                    while(rom != 256 & rom != 512) {
                        System.out.println("Invalid ROM Size");
                        System.out.println("ROM:256gb\t512gb");
                        rom = sc.nextInt();
                    }
                    
                    System.out.println("How many?");
                    quantity = sc.nextInt();
                    while (quantity<1){
                        System.out.println("Enter a Valid Quantity.");
                        System.out.println("How many?");
                        quantity = sc.nextInt();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    return "Null: Reorder due to Error";
                } 
            }
            else if(dimension == 14){
                System.out.println("RAM:16gb\t32gb");
                ram = sc.nextInt();
                while(ram != 16 & ram != 32){
                    System.out.println("Invalid RAM Size");
                    System.out.println("ROM:16gb\t32gb");
                    ram = sc.nextInt();
                }
                System.out.println("ROM:512gb\t1tb");
                rom = sc.nextInt();
                while(rom != 1 & rom != 512) {
                    System.out.println("Invalid ROM Size");
                    System.out.println("ROM:512gb\t1tb");
                    rom = sc.nextInt();
                }
                if (rom == 512 & ram == 16){
                    choiceAmt = 199900.00;
                }
                else if (rom == 1 & ram == 16) {
                    choiceAmt = 249900.00;
                }
                else {
                    choiceAmt = 309900.00;
                }
            }
            else if(dimension == 16) {
                System.out.println("RAM:16gb\t32gb");
                ram = sc.nextInt();
                while(ram != 16 & ram != 32){
                    System.out.println("Invalid RAM Size");
                    System.out.println("ROM:16gb\t32gb");
                    ram = sc.nextInt();
                }
                System.out.println("ROM:512gb\t1tb");
                rom = sc.nextInt();
                while(rom != 1 & rom != 512) {
                    System.out.println("Invalid ROM Size");
                    System.out.println("ROM:512gb\t1tb");
                    rom = sc.nextInt();
                }
                if (rom == 512 & ram == 16){
                    choiceAmt = 249900.00;
                }
                else if (rom == 1 & ram == 16) {
                    choiceAmt = 269900.00;
                }
                else {
                    choiceAmt = 349900.00;
                }
            } 
            System.out.println("How many?");
            quantity = sc.nextInt();
            while (quantity<1){
                System.out.println("Enter a Valid Quantity.");
                System.out.println("How many?");
                quantity = sc.nextInt();
            }
            prodName = "Macbook Pro";
            totalBill = initialBill + (quantity * choiceAmt);
            for(int x = 0; x < quantity; x++){
                double randNo = Math.random() * 51 - x;
                int randomNo = (int)randNo;

                while (randomNo>51-x){
                    randomNo = randomNo - 2;
                }

                while(randomNo>serialNo.size()){
                    randomNo = randomNo - 2;
                }
                
                if(randomNo == serialNo.size()){
                    randomNo = randomNo - 1;
                }

                while (randomNo<0){
                    randomNo = randomNo + 1;
                }

                String serNo = serialNo.get(randomNo);
                selectedSerialNo.add(serNo);
                serialNo.remove(serNo);

                if(serialNo.size() == 0){
                    return "Out of Stock";
                }
            }
            if (quantity > 1) {
                for(int x = 0; x < quantity; x++) {
                    prodsPurch.add(prodName + " " + (x+1));
                }
            }
            addElmt = quantity + " " + prodName + " " + dimension + "inches RAM: " + ram + "gb ROM: " + rom + "gb = " + quantity*choiceAmt ;
            Orders.add(addElmt);
        }
        else if(choiceProd.equals("Macbook Mini")){
            Scanner sc = new Scanner(System.in);
            System.out.println("Configurations Available:8+256\t8+512\t16+512");
            System.out.println("RAM: ");
            ram = sc.nextInt();
            while(ram != 8 & ram != 16) {
                System.out.println("Invalid RAM size.");
                System.out.println("RAM: ");
                ram = sc.nextInt();
            }
            
            if (ram == 16){
                System.out.println("RAM: "+ram);
                rom = 512;
            }
            else {
                System.out.println("ROM: ");
                rom = sc.nextInt();
                while(rom != 256 & rom != 512) {
                    System.out.println("Invalid ROM size.");
                    System.out.println("ROM: ");
                    rom = sc.nextInt();
            }
            }

            if (ram == 8 & rom == 256) {
                choiceAmt = 59900.00;
            }
            else if (ram == 8 & rom == 512){
                choiceAmt = 79900.00;
            }
            else {
                choiceAmt = 129900.00;
            }
            System.out.println("How many?");
            quantity = sc.nextInt();
            while (quantity<1){
                System.out.println("Enter a Valid Quantity.");
                System.out.println("How many?");
                quantity = sc.nextInt();
            }
            prodName = "Macbook Mini";
            totalBill = initialBill + (quantity * choiceAmt);
            for(int x = 0; x < quantity; x++){
                double randNo = Math.random() * 51 - x;
                int randomNo = (int)randNo;

                while (randomNo>51-x){
                    randomNo = randomNo - 2;
                }
                
                while(randomNo>serialNo.size()){
                    randomNo = randomNo - 2;
                }

                if(randomNo == serialNo.size()){
                    randomNo = randomNo - 1;
                }

                while (randomNo<0){
                    randomNo = randomNo + 1;
                }

                String serNo = serialNo.get(randomNo);
                selectedSerialNo.add(serNo);
                serialNo.remove(serNo);

                if(serialNo.size() == 0){
                    return "Out of Stock";
                }
            }
            if (quantity > 1) {
                for(int x = 0; x < quantity; x++) {
                    prodsPurch.add(prodName + " " + (x+1));
                }
            }
            addElmt = quantity + " " + prodName + " " +" RAM: " + ram + "gb ROM: " + rom + "gb = " + quantity*choiceAmt;
            Orders.add(addElmt);
        }
        else if(choiceProd.equals("iMac")){
            Scanner sc = new Scanner(System.in);
            System.out.println("Available Configurations: 8+256\t8+512");
            ram = 8;
            System.out.println("ROM:256gb\t512gb");
            rom = sc.nextInt();
            while(rom != 256 & rom != 512) {
                System.out.println("Invalid ROM Size");
                System.out.println("ROM:512gb\t1tb");
                rom = sc.nextInt();
            }
            if(ram == 8 & rom == 256) {
                choiceAmt = 129900.00;
            }
            else {
                choiceAmt = 169900.00;
            }
            System.out.println("How many?");
            quantity = sc.nextInt();
            while (quantity<1){
                System.out.println("Enter a Valid Quantity.");
                System.out.println("How many?");
                quantity = sc.nextInt();
            }
            prodName = "iMac";
            totalBill = initialBill + (quantity * choiceAmt);
            for(int x = 0; x < quantity; x++){
                double randNo = Math.random() * 51 - x;
                int randomNo = (int)randNo;

                while (randomNo>51-x){
                    randomNo = randomNo - 2;
                }

                while(randomNo>serialNo.size()){
                    randomNo = randomNo - 2;
                }

                if(randomNo == serialNo.size()){
                    randomNo = randomNo - 1;
                }

                while (randomNo<0){
                    randomNo = randomNo + 1;
                }

                String serNo = serialNo.get(randomNo);
                selectedSerialNo.add(serNo);
                serialNo.remove(serNo);

                if(serialNo.size() == 0){
                    return "Out of Stock";
                }
            }
            if (quantity > 1) {
                for(int x = 0; x < quantity; x++) {
                    prodsPurch.add(prodName + " " + (x+1));
                }
            }
            addElmt = quantity + " " + prodName + " " +" RAM: " + ram + "gb ROM: " + rom + "gb = " + quantity*choiceAmt;
            Orders.add(addElmt);
        }
        else {
            return "Invalid Product";
        }

        return Orders.toString() + "\nTotal Bill: "+totalBill;
    }

    public String finalBill() {
        if(Orders.size() == 0) {
            System.out.println("Didnt Order Anything");
        }
        StringBuilder sb = new StringBuilder();
        for(int x = 0; x<Orders.size(); x++) {
            sb.append(Orders.get(x) + "\n");
        }
        return "Final Bill:\n" + sb.toString() + "\nTotal Bill = " + totalBill;
    }

    public String printSerial() {
        StringBuilder serNos = new StringBuilder();
        for (int x = 0; x < selectedSerialNo.size(); x++) {
            serNos.append("Serial Number for " + prodsPurch.get(x) + " is: " + selectedSerialNo.get(x) + "\n");
        }  
        return serNos.toString();
    }
}


class testPractice {
    public static void main(String[] args) {
        double initialBill = 0;
        AppleInvent prod1 = new AppleInvent();
        AppleProducts prod2 = new AppleProducts();
        Order prod3 = new Order();
        
        prod2.setInvent();
        prod3.assignSerialNo();
        
        while(true) {
            Scanner s = new Scanner(System.in);
            System.out.println("What product do you want to purchase? ");
            String choice = "Macbook";
            System.out.println("You chose: "+choice);
            choice = choice.toLowerCase();
            if (choice.equals("macbook")) {
                System.out.println(prod2.displayProducts());
                System.out.println("Which Macbook? ");
                String prodChoice = s.nextLine();
                System.out.println(prod3.selectProdMac(prodChoice, initialBill));
                initialBill = prod3.totalBill;
            }
            System.out.println("Continue Shopping? (Y/N)");
            String cont = s.nextLine().toLowerCase();
            if (cont.equals("n")) {;
                System.out.println(" ");
                System.out.println(prod3.finalBill());
                System.out.println(prod3.printSerial());
                break;
            } 
        }

    }
}