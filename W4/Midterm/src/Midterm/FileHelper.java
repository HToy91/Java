package Midterm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FileHelper {
    public static List<Stock> createStockList(String filePath) {
        List<Stock> stocks = new ArrayList<>();
        String line;
        String splitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                String name = data[0];
                String abbrev = data[1];
                double price =  Double.parseDouble(data[2]);
                int quantity =  Integer.parseInt(data[3]);

                stocks.add(new Stock(name, abbrev, price, quantity));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stocks;
    }
}
