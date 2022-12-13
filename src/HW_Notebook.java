import java.util.ArrayList;
import java.util.List;

public class HW_Notebook {

    private String model;
    private int RAM;
    private int hardDiskCapacity;
    private String operatingSystem;
    private String color;


    public HW_Notebook(String model) {
        this.model = model;

    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(int hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "HW_Notebook{" +
                "model='" + model + '\'' +
                ", RAM=" + RAM +
                ", hardDiskCapacity=" + hardDiskCapacity +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public HW_Notebook(String model, int RAM , int hardDiskCapacity,
                  String operatingSystem, String color) {

        this.model = model;
        this.RAM = RAM;
        this.hardDiskCapacity = hardDiskCapacity;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

}
