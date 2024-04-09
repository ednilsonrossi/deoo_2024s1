package version_1;

public class Main {

    public static void main(String[] args) {
//        Smartphone smartphone1 = new Smartphone("Android", "Samsung", 123456789, "Qualcomm", 6.2, 128, 12.0);
//        Smartphone smartphone2 = new Smartphone("iOS", "Apple", 987654321, "Apple", 6.1, 256, 12.0);
//        Smartphone smartphone3 = new Smartphone("Android", "Google", 135792468, "Qualcomm", 6.7, 256, 12.2);
//        Smartphone smartphone4 = new Smartphone("Android", "OnePlus", 246813579, "Snapdragon", 6.78, 256, 48.0);

        Smartphone smartphone1 = new Smartphone();
        smartphone1.setOs("Android");
        smartphone1.setManufacturer("Samsung");
        smartphone1.setSerialNumber(123456789);
        smartphone1.setProcessorManufacturer("Qualcomm");
        smartphone1.setScreen(6.2);
        smartphone1.setStorage(128);
        smartphone1.setCamera(12.0);

        Smartphone smartphone2 = new Smartphone();
        smartphone2.setOs("iOS");
        smartphone2.setManufacturer("Apple");
        smartphone2.setSerialNumber(987654321);
        smartphone2.setProcessorManufacturer("Apple");
        smartphone2.setScreen(6.1);
        smartphone2.setStorage(256);
        smartphone2.setCamera(12.0);

        Smartphone smartphone3 = new Smartphone();
        smartphone3.setOs("Android");
        smartphone3.setManufacturer("Google");
        smartphone3.setSerialNumber(135792468);
        smartphone3.setProcessorManufacturer("Qualcomm");
        smartphone3.setScreen(6.7);
        smartphone3.setStorage(256);
        smartphone3.setCamera(12.2);

        Smartphone smartphone4 = new Smartphone();
        smartphone4.setOs("Android");
        smartphone4.setManufacturer("OnePlus");
        smartphone4.setSerialNumber(246813579);
        smartphone4.setProcessorManufacturer("Snapdragon");
        smartphone4.setScreen(6.78);
        smartphone4.setStorage(256);
        smartphone4.setCamera(48.0);
    }
}
