package version_2;

public class Smartphone {
    private String os;
    private String manufacturer;
    private long serialNumber;
    private String processorManufacturer;
    private double screen;
    private int storage;
    private double camera;

    private Smartphone(String os, String manufacturer, long serialNumber, String processorManufacturer, double screen, int storage, double camera) {
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

    @Override
    public String toString() {
        return "Smartphone{" +
                "os='" + os + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", serialNumber=" + serialNumber +
                ", processorManufacturer='" + processorManufacturer + '\'' +
                ", screen=" + screen +
                ", storage=" + storage +
                ", camera=" + camera +
                '}';
    }

    public static class SmartphoneBuilder {
        private String os;
        private String manufacturer;
        private long serialNumber;
        private String processorManufacturer;
        private double screen;
        private int storage;
        private double camera;

        public SmartphoneBuilder() {
            this.os = "Not defined";
            this.manufacturer = "Not defined";
            this.serialNumber = 0L;
            this.processorManufacturer = "Not defined";
            this.screen = 0.0;
            this.storage = 0;
            this.camera = 0;
        }

        public SmartphoneBuilder os(String os) {
            this.os = os;
            return this;
        }

        public SmartphoneBuilder manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public SmartphoneBuilder serialNumber(long serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public SmartphoneBuilder processorManufacturer(String processorManufacturer) {
            this.processorManufacturer = processorManufacturer;
            return this;
        }

        public SmartphoneBuilder screen(double screen) {
            this.screen = screen;
            return this;
        }

        public SmartphoneBuilder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public SmartphoneBuilder camera(double camera) {
            this.camera = camera;
            return this;
        }

        public Smartphone build() {
            return new Smartphone(this.os,
                    this.manufacturer,
                    this.serialNumber,
                    this.processorManufacturer,
                    this.screen,
                    this.storage,
                    this.camera
            );
        }
    }
}
