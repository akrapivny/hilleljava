package com.hillel.java.io;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

/**
 * Created by AKRAPIVNY on 01.06.2015.
 */
public class IoMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("hill/data.txt"));
        long[] array = {12L, 13L, 45433L};
        outputStream.writeObject(array);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("hill/data.txt"));
        array = (long[]) inputStream.readObject();
        System.out.println(Arrays.toString(array));


    }

    private static void primitives() throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("hill/data.txt"));
        long[] array = {12L, 13L, 45433L};
        for (long l : array) {
            dataOutputStream.writeLong(l);
        }
        dataOutputStream.close();

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("hill/data.txt"));

        while (true) {
            try {
                long l = dataInputStream.readLong();
            } catch (EOFException e) {
                break;
            }

        }
    }

    private static void bufferedVsUnbuffered() throws IOException {
        Instant begin = Instant.now();
        bufferdCopy();
        Instant end = Instant.now();
        System.out.println("" + Duration.between(begin, end).toMillis());

        begin = Instant.now();
        byteCopy();
        end = Instant.now();
        System.out.println("" + Duration.between(begin, end).toMillis());
    }


    private static void bufferdCopy() throws IOException {
        BufferedReader inputStream = new BufferedReader(new FileReader("hill/myFile.txt"));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter("hill/copy_myFile.txt"));

        String value;
        while ((value = inputStream.readLine()) != null) {
            outputStream.write(value);
        }
        inputStream.close();
        outputStream.close();
    }


    private static void streamReaderTxtFile() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("hill/myFile.txt"));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("hill/copy_myFile.txt"));

        int value;
        while ((value = inputStreamReader.read()) != -1) {
            outputStreamWriter.write(value);
        }
        inputStreamReader.close();
        outputStreamWriter.close();
    }

    private static void swingFileChooser() {
        JFileChooser fileChooser = new JFileChooser();
        int res = fileChooser.showOpenDialog(null);
        //System.out.println(res);
        if (res == 0) {
            File file = fileChooser.getSelectedFile();
            Path path = file.toPath();
        }
    }

    private static void byteCopy() {

        try (InputStream inputStream = new FileInputStream("hill/myFile.txt");
             OutputStream outputStream = new FileOutputStream("hill/copy_myFile.txt")) {

            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void ugly() throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        //OutputStream outputStream = new FileOutputStream("hill/copy_myFile.txt",true);

        try {
            inputStream = new FileInputStream("hill/myFile.txt");
            outputStream = new FileOutputStream("hill/copy_myFile.txt");

            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();

                } catch (IOException e) {
                }

                if (outputStream != null) {
                    try {
                        outputStream.close();

                    } catch (IOException e) {
                    }

                }

            }
        }
    }

    private static void fileCreation() throws IOException {
        Path path = Paths.get("hill/myFile.txt");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());

        Path absolutePath = Paths.get("/hill/myFile.txt");
        System.out.println(absolutePath);
        System.out.println(absolutePath.toAbsolutePath());


        System.out.println(path.toString() + " exists " + Files.exists(path));
        Files.createFile(path);
    }

    private static void pathmethod() {
        System.out.println("yes\\\\no");
        String path = "c:\\program files\\myProrgram";
        String path2 = "c:/program files\\myProrgram";
        String path3 = "c:/program files/myProrgram";
    }
}
