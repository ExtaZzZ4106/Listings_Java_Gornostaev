package Listing_6;

import Listing_6.ReadInput;

import java.io.*;

public class Listing6_3 {
    private String command;
    private Process process;
    private BufferedReader reader;

    public Listing6_3(String command) throws IOException {
        this.command = command;
        try {
            process = Runtime.getRuntime().exec(command);
            reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        } catch (IOException e) {
            throw e;
        }
    }

    public String readLine() throws IOException {
        String line = reader.readLine();
        while (line == null || line.isEmpty()) {
            line = reader.readLine();
        }
        return line;
    }

    public void close() {
        try {
            reader.close();
            process.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader = null;
            process = null;
        }
    }

    public static void main(String[] args) {
        String command;
        ReadInput ri = null;

        if (args.length > 0) {
            command = args[0];
        } else {
            command = "ping localhost";
        }

        try {
            ri = new ReadInput(command);
            while (true) {
                System.out.println(ri.readLine());
            }
        } finally {
            if (ri != null) {
                ri.close();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        String cmd = "ping localhost";
        ReadInput ri = null;

        try {
            ri = new ReadInput(cmd);
            String line = null;

            // Вывод каждой строки на экран
            while ((line = String.valueOf(ri.readLine())) != null) {
                if (line.equals("\r")) {
                    System.out.println("java:>" + line);
                }
            }
        } finally {
            if (ri != null) {
                ri.close();
            }
        }
    }
}
