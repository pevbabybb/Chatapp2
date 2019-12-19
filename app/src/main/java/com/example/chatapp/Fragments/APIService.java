package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAASgW7g-c:APA91bEVZnxVU5K87LC3w-Tw06DvBIpxCvvMKPF3VXVu1BWaBHdYTPUcycnJPj8NgaI6kYtFd0LXVCoREfwgPlwgxCYnmA6Ugw3L7gLe2BXloN0usSLNhIBI7YHY4NG01cUfo8ex0GMm"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> senndNotification(@Body Sender body);
}
