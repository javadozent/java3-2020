package com.example.hallo22.client;

import com.example.hallo22.model.Result;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.time.LocalDate;


/*
REST API - Standard JEE
 */
public class RestClient {

    public final static  String API_KEY ="w5v4Tc2s0c9FOsJ8AYxrdXDFjp73qVXQMVqfY4PK";

    private Client client = ClientBuilder.newClient();

    private WebTarget target = client.target("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos");


    private  String createJson(LocalDate date){


        Response response = target.queryParam("earth_date",date).
                                    queryParam("api_key",API_KEY).
                                    request().get();

        return response.readEntity(String.class);
    }

    public Result createResult(LocalDate date){
        date = date != null ? date : LocalDate.of(2012, 8, 6);
        String jsonString = createJson(date);
        Gson gson = new GsonBuilder().create();
        Result result =gson.fromJson(jsonString, Result.class);
        return result;
    }


    public static void main(String[] args) {
        RestClient rc = new RestClient();
       // System.out.println(rc.createJson(LocalDate.of(2015,6,3)));

        System.out.println(rc.createResult(LocalDate.of(2012,8,9)).getPhotos().size());
     //   System.out.println(rc.createResult(null));

      // Result r = rc.createResult(LocalDate.of(2015,6,3);
       //r.getPhotos()
    }
}
