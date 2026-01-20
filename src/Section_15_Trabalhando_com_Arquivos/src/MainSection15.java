package Section_15_Trabalhando_com_Arquivos.src;

import Section_15_Trabalhando_com_Arquivos.src.Entities.Product;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainSection15 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);

        Path pathIn = Paths.get("C:\\Users\\Gabriel Ortiz\\Desktop\\CursoPOOJava\\src\\Section_15_Trabalhando_com_Arquivos\\src\\in.csv");
        List<Product> products = new ArrayList<Product>();


        try (BufferedReader br = new BufferedReader((new FileReader(pathIn.toFile())))) {
            String line = br.readLine();

            while (line != null){
                String[] linePart = line.split(",");
                String productName = linePart[0].trim();
                Double productPrice = Double.parseDouble(linePart[1].trim());
                int productQuantity = Integer.parseInt(linePart[2].trim());
                products.add(new Product(productName,productPrice,productQuantity));
                line = br.readLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        Path pathOut = Paths.get("C:\\Users\\Gabriel Ortiz\\Desktop\\CursoPOOJava\\src\\Section_15_Trabalhando_com_Arquivos\\src\\out.csv");
        try (BufferedWriter bw = new BufferedWriter((new FileWriter(pathOut.toFile())))) {
            for (Product product: products){
                bw.write(product.toStringOut());
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
