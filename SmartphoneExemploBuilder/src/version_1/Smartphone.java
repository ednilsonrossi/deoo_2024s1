package version_1;

public class Smartphone {
    private String os;
    private String manufacturer;
    private long serialNumber;
    private String processorManufacturer;
    private double screen;
    private int storage;
    private double camera;

    public Smartphone(){
        os = "Not defined";
        manufacturer = "Not defined";
        serialNumber = 0L;
        processorManufacturer = "Not defined";
        screen = 0.0;
        storage = 0;
        camera = 0;
    }

    public Smartphone(String os) {
        this();
        this.os = os;
    }

    public Smartphone(String os, String manufacturer) {
        this();
        this.os = os;
        this.manufacturer = manufacturer;
    }

    public Smartphone(String os, String manufacturer, long serialNumber) {
        this();
        this.os = os;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

    public Smartphone(String os, String manufacturer, long serialNumber, String processorManufacturer) {
        this();
        this.os = os;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.processorManufacturer = processorManufacturer;
    }

    public Smartphone(String os, String manufacturer, long serialNumber, String processorManufacturer, double screen) {
        this();
        this.os = os;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.processorManufacturer = processorManufacturer;
        this.screen = screen;
    }

    public Smartphone(String os, String manufacturer, long serialNumber, String processorManufacturer, double screen, int storage) {
        this();
        this.os = os;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.processorManufacturer = processorManufacturer;
        this.screen = screen;
        this.storage = storage;
    }

    public Smartphone(String os, String manufacturer, long serialNumber, String processorManufacturer, double screen, int storage, double camera) {
        this.os = os;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.processorManufacturer = processorManufacturer;
        this.screen = screen;
        this.storage = storage;
        this.camera = camera;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProcessorManufacturer() {
        return processorManufacturer;
    }

    public void setProcessorManufacturer(String processorManufacturer) {
        this.processorManufacturer = processorManufacturer;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }
}
