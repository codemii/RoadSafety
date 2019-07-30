package com.softup.utkarsh.uber.Common;

import android.location.Location;

import com.softup.utkarsh.uber.Model.User;
import com.softup.utkarsh.uber.Remote.FCMClient;
import com.softup.utkarsh.uber.Remote.IFCMService;
import com.softup.utkarsh.uber.Remote.IGoogleAPI;
import com.softup.utkarsh.uber.Remote.RetrofitClient;

public class Common
{

    public static final String driver_tb1 = "Drivers";
    public static final String user_driver_tb1 = "DriversInformation";
    public static final String user_rider_tb1 = "RidersInformation";
    public static final String pickup_request_tb1 = "PickupRequest";
    public static final String token_tb1 = "Tokens";
    public static final int PICK_IMAGE_REQUEST = 9999 ;

    public static User currentUser;

    public static Location mLastLocation=null;

    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";

    public static double base_fare = 1.00;
    private static double time_rate = 0.00;
    private static double distance_rate = 1.00;

    public static double formulaPrice(double km,double min)
    {
        return base_fare+(distance_rate*km)+(time_rate*min);
    }

    public static IGoogleAPI getGoogleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }

    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
