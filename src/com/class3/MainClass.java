package com.class3;

public class MainClass {
    public static void main(String[] args) {
        try {
            JSONManagement jsonManagement = new JSONManagement();
            //jsonManagement.readJSON();
            //jsonManagement.readJSONsample();

            jsonManagement.readJSONP();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
