package org.example;
import java.io.*;
import java.util.*;
import com.opencsv.*;
public class P15_EncryptDecrypt {
    public static void encryption(String mainFilePath, String encryptedFilePath) throws Exception{
        try(CSVReader csvReader = new CSVReader(new FileReader(mainFilePath));
            CSVWriter csvWriter = new CSVWriter(new FileWriter(encryptedFilePath))){
            String[] arr1 = csvReader.readNext();
            csvWriter.writeNext(arr1);

            String[] arr;
            while ((arr = csvReader.readNext()) != null){
                arr[5] = String.valueOf(Integer.parseInt(arr[5]) + 1000);
                arr[1] = shiftCharacters(arr[1], 2);
                csvWriter.writeNext(arr);
            }
            System.out.println("..................");
        }
    }
    public static void decryption(String encryptedFilePath, String decryptedFilePath) throws Exception{
        try (CSVReader csvReader = new CSVReader(new FileReader(encryptedFilePath));
             CSVWriter csvWriter = new CSVWriter(new FileWriter(decryptedFilePath))) {
            String[] arr1 = csvReader.readNext();
            csvWriter.writeNext(arr1);

            String[] arr;
            while ((arr = csvReader.readNext()) != null) {
                arr[5] = String.valueOf(Integer.parseInt(arr[5]) - 1000);
                arr[1] = shiftCharacters(arr[1], -2);
                csvWriter.writeNext(arr);
            }
            System.out.println(".....................");
        }
    }
    public static String shiftCharacters(String text, int shift) {
        StringBuilder res = new StringBuilder();
        for (char ch : text.toCharArray())
            res.append((char) (ch + shift));
        return res.toString();
    }
    public static void main(String[] args) throws Exception {
        String mainFilePath = "csvFile.csv";
        String encryptedFilePath = "encryptedStudents1.csv";
        String decryptedFilePath = "decryptedStudents1.csv";

        encryption(mainFilePath, encryptedFilePath);
        decryption(encryptedFilePath, decryptedFilePath);
    }
}