package com.example.pract_12;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class Hashing {
    @PostConstruct
    public void hashing() {
        try {
            FileReader is = new FileReader("./from.txt");
            FileWriter os = new FileWriter("./hashed.txt");
            MessageDigest md = MessageDigest.getInstance("SHA-256"); // crypto
            File file = new File("./from.txt");
            char[] a = new char[(int) (file.length() / 2)];
            is.read(a);
            is.close();
            String text = String.valueOf(a);
            md.update(text.getBytes(StandardCharsets.UTF_8));
            byte[] digest = md.digest();
            String hex = String.format("%064x", new BigInteger(1, digest));
            os.write(hex);
            os.close();
        } catch (FileNotFoundException e) {
            String text = "null";
            try {
                FileOutputStream os = new FileOutputStream("./hashed.txt");
                byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
                os.write(buffer, 0, buffer.length);
                System.out.println("File not found...");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return;
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
        System.out.println("Hashing successful");
    }

    @PreDestroy
    public void init() {
        File file = new File("./from.txt");
        file.delete();
        System.out.println("File is deleted");
    }
}