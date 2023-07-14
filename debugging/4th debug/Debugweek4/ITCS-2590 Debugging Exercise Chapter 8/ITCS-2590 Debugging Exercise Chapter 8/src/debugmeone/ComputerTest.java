package debugmeone;
/*          Run this class to test the Computer class.
 *
 *          The output should read:
 *
 *          Dell Laptop Inspiron 17R
 *          2.30 GHz CPU, 4 GB Memory
 *          500 GB Hard Drive
 *          Cost $1,200.50
 */
public class ComputerTest {
    public static void main(String[] args){
        Computer computer = new Computer("Dell", "Laptop", "Inspiron 17R",
                                          2.3, 4, 500, 1200.50);
        
        System.out.printf("%s", computer.getMake());
        System.out.printf(" %s", computer.getType());
        System.out.printf(" %s\n", computer.getModelNumber());
        System.out.printf("%.2f GHz CPU,", computer.getCpuSpeed_GHz());
        System.out.printf(" %d GB Memory\n", computer.getRamSize_GB());
        System.out.printf("%d GB Hard Drive\n", computer.getHardDriveSize_GB());
        System.out.printf("Cost $%,.2f\n", computer.getPrice());
    }
}
