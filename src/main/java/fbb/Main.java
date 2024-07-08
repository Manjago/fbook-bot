package fbb;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        final String json = new Gson().toJson(new Tost());
        System.out.println(json);

    }

    private static class Tost {
        private String hello = "world";
    }
}
