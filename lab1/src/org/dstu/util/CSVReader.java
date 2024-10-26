package org.dstu.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List<String[]> readCsvFile (String fileName, String regex) {
        List<String[]> strings = new ArrayList<>();
        File file = new File(fileName);
        try {
            InputStreamReader streamReader = new InputStreamReader(new FileInputStream(file), "utf-8");
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            String fileline;
            while ((fileline = bufferedReader.readLine()) != null) {
                System.out.println(fileline);
                String[] splitString = fileline.split(regex);
                strings.add(splitString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
}
