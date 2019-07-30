package com.softup.utkarsh.uber.Remote;

import com.softup.utkarsh.uber.Model.FCMResponse;
import com.softup.utkarsh.uber.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAABQj5y1g:APA91bHgHSVtQPQPXfeLVgjQZ9XiTPPykaiTn1BqICyCznRa5H8ZKrQsYMdQIUa1F_VQQDR4iYLPdcM7BPNWm5DsktAAEoo0FobgcLFVeizQxh-x9VcQ04xMI-bziJJ8CI0BUQMg9oX1"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
