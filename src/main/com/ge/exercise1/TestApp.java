package com.ge.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestApp {

    public static void main(String[] args) throws IOException {

    String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\pc\\Downloads\\code-test\\src\\main\\com\\ge\\exercise1\\sampleData.json")));

    new MyParser().parseApplicationData(content);
    System.out.println(content);

   }

}