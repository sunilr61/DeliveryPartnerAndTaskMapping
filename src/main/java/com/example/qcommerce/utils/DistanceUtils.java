package com.example.qcommerce.utils;

import com.example.qcommerce.models.Location;

public class DistanceUtils {

    public static double calculateDistance(Location location1, Location location2){
        //Haversine Distance formula
        //a = sin²(ΔlatDifference/2) + cos(lat1).cos(lt2).sin²(ΔlonDifference/2)
        //c = 2.atan2(√a, √(1−a))
        //d = R.c
        //where,
        //       ΔlatDifference = lat1 – lat2 (difference of latitude)
        //ΔlonDifference = lon1 – lon2 (difference of longitude)
        //R is radius of earth i.e 6371 KM or 3961 miles
        //and d is the distance computed between two points.

        double lat1 = Math.toRadians(location1.getLatitude());
        double lat2 = Math.toRadians(location2.getLatitude());

        double long1 = Math.toRadians(location1.getLongitude());
        double long2 = Math.toRadians(location2.getLongitude());

        double dLat = lat1 - lat2;
        double dLong = long1 - long2;

        double a = Math.pow(Math.sin(dLat/2),2) + Math.cos(lat2) * Math.cos(lat1) + Math.pow(Math.sin(dLong/2),2);
        double radius= 6371; // In KM

        double c = 2 * Math.atan2(Math.sqrt(a),Math.sqrt(1-a));

        double d = radius * c;
        return d;



        //return Math.sqrt(Math.pow(location1.getLatitude() - location2.getLatitude(), 2) + Math.pow(location1.getLongitude() - location2.getLongitude(), 2));
    }
}
