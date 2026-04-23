package com.brasfoot2;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class TimeRepository {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final String CAMINHO = "data/times.json";

    public static List<Time> carregarTimes() throws IOException {
        try (Reader reader = new FileReader(CAMINHO)) {
            Type tipo = new TypeToken<List<Time>>(){}.getType();
            return gson.fromJson(reader, tipo);
        }
    }

    public static void salvarTimes(List<Time> times) throws IOException {
        try (Writer writer = new FileWriter(CAMINHO)) {
            gson.toJson(times, writer);
        }
    }
}