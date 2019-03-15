package com.example.gsonimplementaion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarOwner carOwner = new CarOwner("Yogesh", "Mudgal", 32);

        ArrayList<Passenger> passengers=new ArrayList<>();
        passengers.add(new Passenger("Manish",30));
        passengers.add(new Passenger("Yakshit",4));
        Car car = new Car("AStar",2012, "Maruti", carOwner,passengers);


        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        String jsonString = gson.toJson(car);
        Log.d(TAG, "Json String: " + jsonString);

        String jsonString1="{\n" +
                "  \"CarOwner\": {\n" +
                "    \"Age\": 32,\n" +
                "    \"firstName\": \"Yogesh\",\n" +
                "    \"lastName\": \"Mudgal\"\n" +
                "  },\n" +
                "  \"brand\": \"Maruti\",\n" +
                "  \"makeYear\": 2012,\n" +
                "  \"model_name\": \"AStar\",\n" +
                "  \"Passenger\": [\n" +
                "    {\n" +
                "      \"age\": 30,\n" +
                "      \"name\": \"Manish\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"age\": 4,\n" +
                "      \"name\": \"Yakshit\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        Type type=new TypeToken<Car>(){}.getType();
       Car desrializeCar= gson.fromJson(jsonString1,type);
        Log.d(TAG, "Car Object Created: ");



    }
}
