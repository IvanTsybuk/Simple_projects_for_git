package Opros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Opros {
    public static void main(String[] args) throws IOException {
        File file = new File("filename.txt");
        if(!file.exists());
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file, true);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Имя:");
        String otvet = scanner.nextLine();

        System.out.println("Возраст:");
        String otvet1 = scanner.nextLine();

        System.out.println("Хобби:");
        String otvet2 = scanner.nextLine();

        fileWriter.write("Имя" + " "+ otvet);
        fileWriter.append("\n");
        fileWriter.write("Возраст"+ " " + otvet1);
        fileWriter.append("\n");
        fileWriter.write("Хобби"+ " " + otvet2);
        fileWriter.append("\n");
        fileWriter.close();



    }
}