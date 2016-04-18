package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        double version = Double.parseDouble(System.getProperty("java.specification.version"));
        System.out.println(version);
        return version;
    }

    public static void main(String[] args) {
     getVersion();
    }
}
