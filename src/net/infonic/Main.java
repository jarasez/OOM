package net.infonic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<byte[]> list = new ArrayList<>();
        int index = 1;
        while (true) {
            // 100MB each loop, 100 x 1024 x 1024
            byte[] b = new byte[100*1024*1024];
            list.add(b);
            Runtime rt = Runtime.getRuntime();
            System.out.printf("[%d] free memory: %s%n", index++, rt.freeMemory());
        }

    }
}
