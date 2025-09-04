package br.com.mariojp.solid.isp;

public class SimplePrinter implements Printer {
    @Override
    public void print(String content){
        System.out.println(content); // ou: System.out.println("PRINT: " + content);
    }
}
