package debugmeone;
/*
 * Debugging Exercise - Chapter 8, Part I
 *
 * Debug the error(s) and submit to the Dropbox 
 * Please do not submit if it is not debugged
 *
 * NOTE:    This program does not produce any valid output.
 *          If you notice below you will see many warnings (tiny yellow light
 *          bulbs on the left hand side) from lines 31 to 37.
 *
 *          The output should read:
 *
 *          Dell Laptop Inspiron 17R
 *          2.30 GHz CPU, 4 GB Memory
 *          500 GB Hard Drive
 *          Cost $1,200.50
 *
 * HINT:    Refer to 8.4, page 317, in your text.
 */
public class Computer {

    private String make;  private String type;  private String modelNumber;
    private double cpuSpeed_GHz;  private int ramSize_GB;
    private int hardDriveSize_GB;  private double price;

    public Computer(String make, String type, String modelNumber,
                    double cpuSpeed_GHz, int ramSize_GB,
                    int hardDriveSize_GB, double price){

       this.make = make;
       this.type = type;
       this.modelNumber = modelNumber;
       this.cpuSpeed_GHz = cpuSpeed_GHz;
       this.ramSize_GB = ramSize_GB;
       this.hardDriveSize_GB = hardDriveSize_GB;
       this.price = price;
    }

    public double getCpuSpeed_GHz() {
        return cpuSpeed_GHz;
    }

    public int getHardDriveSize_GB() {
        return hardDriveSize_GB;
    }

    public String getMake() {
        return make;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getRamSize_GB() {
        return ramSize_GB;
    }

    public String getType() {
        return type;
    }

    public void setCpuSpeed_Ghz(double cpuSpeed_GHz) {
        this.cpuSpeed_GHz = cpuSpeed_GHz;
    }

    public void setHardDriveSize_GB(int hardDriveSize_GB) {
        this.hardDriveSize_GB = hardDriveSize_GB;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRamSize_GB(int ramSize_GB) {
        this.ramSize_GB = ramSize_GB;
    }

    public void setType(String type) {
        this.type = type;
    }
}
