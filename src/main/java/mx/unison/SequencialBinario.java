package mx.unison;

import java.util.Hashtable;

public class SequencialBinario {
    public static void main(String[] args) {
        final String dataPath = "src\\main\\java\\mx\\unison\\vendors-data.dat";

        RandomVendorFile randomFile = new RandomVendorFile(dataPath);
        Vendor[] vendorArray = new Vendor[100];

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            vendorArray[i] = randomFile.read(i);
            System.out.println(vendorArray[i].getNombre() + ", " + vendorArray[i].getZona());
        }
        long t2 = System.currentTimeMillis();

        long rt1 = t2 - t1;

        t1 = System.currentTimeMillis();
        randomFile.read(vendorArray);
        t2 = System.currentTimeMillis();

        long rt2 = t2 - t1;

        System.out.printf("%nTiempos de ejecución:%nT1: %d T2: %d%n", rt1, rt2);
    }
}