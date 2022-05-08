package com.anirban;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {

    static OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world");


        Person p = Person.builder().name("Raj").age(10).build();
        System.out.println(p.toString());

//        System.out.println(person1.getName());
//        person1.setName("Raj");
//        System.out.println(person1.getName());
        try{
            System.out.println(getUrl("http://example.com"));
        } catch (IOException e) {
            System.err.println(e);
            throw new RuntimeException(e);
        }

    }

    static String getUrl(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
