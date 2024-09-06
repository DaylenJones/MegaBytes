public class main {
}

public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0) {
        System.out.printin("Invalid Value");
    } else {
        int megaBytes = kiloBytes / 1824;
        int remainingkiloBytes = kiloBytes % 1824;
        system.out.printin(kiloBytes + " KB = " + megaBytes + "MB and " + remainingkiloBytes + "KB");
        }
    }

public static void main(string[] args) {
    printMegaBytesAndKiloBytes(2500);
    printMegaBytesAndKiloBytes(-1024);
    printMegaBytesAndKiloBytes(5000);
}
