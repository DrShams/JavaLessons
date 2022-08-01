package StringUnzip;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        File doc = new File("src/StringUnzip/INPUT.txt");
        Scanner obj = new Scanner(doc);

        String resultText = "";//результирующая строка куда будем сохранять результат
        final int MAX_LENGTH_LINE_SIZE = 40;//максимальная длина строки вывода


        //считываем файл

        String text = obj.nextLine();
        System.out.println(text);

        //считываем цифру если она есть и последующая за цифрой буквы
        Matcher numArr = Pattern.compile("([\\d]*)([A-Z]{1})").matcher(text);

        while(numArr.find()){
            String word;
            try {//если цифра есть выведем ее num число раз
                int num = Integer.parseInt(numArr.group(1));
                word = numArr.group(2);
                resultText = resultText.concat(word.repeat(num));
            }
            catch (NumberFormatException e) {//если цифры нет то выдаем исключение
                word = numArr.group(2);
                //System.out.print(word);
                resultText = resultText.concat(word);
            }
        }

        //очистим содержимое файла
        String fileName = "src/StringUnzip/OUTPUT.txt";

        try (BufferedWriter bf = Files.newBufferedWriter(Path.of(fileName), StandardOpenOption.TRUNCATE_EXISTING)) {
            System.out.println("file " + fileName + " has been truncated");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //выведем строки по 40 символов
        numArr = Pattern.compile("([A-Z]{0,40})").matcher(resultText);
        while(numArr.find()) {
            String line = numArr.group();
            tofile(line + "\n");
        }
    }

    public static void tofile(String args) {
        try {
            FileWriter myWriter = new FileWriter("src/StringUnzip/OUTPUT.txt",true);
            System.out.print(args);
            myWriter.write(args);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}