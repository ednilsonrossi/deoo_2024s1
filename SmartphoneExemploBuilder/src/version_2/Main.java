package version_2;

public class Main {

    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone.SmartphoneBuilder()
                .os("Android")
                .manufacturer("Samsung")
                .serialNumber(123456789)
                .processorManufacturer("Qualcomm")
                .screen(6.2)
                .storage(128)
                .camera(12.0)
                .build();

        Smartphone smartphone2 = new Smartphone.SmartphoneBuilder()
                .os("iOS")
                .serialNumber(987654321)
                .manufacturer("Apple")
                .build();
        
        Smartphone.SmartphoneBuilder builder = new Smartphone.SmartphoneBuilder();
        builder
        	.os("Symbian")
        	.manufacturer("Nokia");
        Smartphone sm = builder.build();
        
        

        System.out.println(smartphone1);
        System.out.println(smartphone2);
        System.out.println(sm);
    }
}
