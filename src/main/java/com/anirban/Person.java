package com.anirban;

import lombok.*;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter()
@Builder()
@ToString()
public class Person {

    private String name;
    private int age;
    private String job;



}
