package org.dstu;


import org.dstu.domain.IellipseForm;
import org.dstu.domain.ellipse;
import org.dstu.domain.manycorner;
import org.dstu.util.CSVReader;
import org.dstu.util.SerializerUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You must specify file name and serialize file name!");
            return;
        }

        String sourceFile = args[0];
        String binFile = args[1];


        List<String[]> strings = CSVReader.readCsvFile(sourceFile, ";");
        List<IellipseForm> figure = new ArrayList<>();
        for (String[] line: strings) {
            if (line[0].equals("0")) {
                figure.add(new ellipse((line)));
            } else {
                figure.add(new manycorner(line));
            }
        }

        figure.forEach(System.out::println);

        SerializerUtils.serialize(figure, binFile);
        List<IellipseForm> newForms = (List<IellipseForm>)SerializerUtils.deserialize(binFile);
        System.out.println("Новые данные: ");
        figure.forEach(System.out::println);
    }
}
