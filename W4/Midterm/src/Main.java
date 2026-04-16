import Midterm.FileHelper;
import Midterm.Stock;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        String filePath =
                "/Users/josevargasfigueroa/Documents/Java/W4/Midterm/src/Midterm/Stocks.CSV";
        List<Stock> stocks = FileHelper.createStockList(filePath);

        for (Stock stock: stocks) {
            print(stock);
        }
        System.out.println("Your Portfolio Value is: "
                + formatter.format(stocks.stream().mapToDouble(stock -> stock.holdings).sum()));
    }

    public static void print(Stock stock) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(MessageFormat.format("Stock Name: {0}\nStock Abbrev: {1}\nStock Price: {2}\nStock Quantity: {3}\nYour Holdings: {4}\n",
                stock.name,
                stock.abbrev,
                formatter.format(stock.price),
                stock.quantity,
                formatter.format(stock.holdings)
                ));
    }
}