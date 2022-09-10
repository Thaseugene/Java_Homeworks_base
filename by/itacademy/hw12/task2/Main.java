package by.itacademy.hw12.task2;

import by.itacademy.hw12.task2.service.Counter;
import by.itacademy.hw12.task2.service.TextFileReader;
import by.itacademy.hw12.task2.service.TextFileWriter;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        TextFileReader reader = new TextFileReader();
        TextFileWriter writer = new TextFileWriter();
        Counter counter = new Counter();

        Pattern punctuation = Pattern.compile("\\p{Punct}");
        Pattern words = Pattern.compile("\\b[a-zA-Z]\\B");

        String fileName = "text.txt";
        String text = "One! two, three.five";

        writer.writeFile(text, fileName);

        System.out.printf("\nText that has read: \"%s\"\nNumber of words - %d\nNumber of punctuation - %d",
                reader.readFileToString(fileName), counter.count(words, reader.readFileToString(fileName)),
                counter.count(punctuation, reader.readFileToString(fileName)));

    }

}
