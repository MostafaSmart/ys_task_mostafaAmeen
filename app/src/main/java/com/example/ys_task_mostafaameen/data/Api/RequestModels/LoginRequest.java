package com.example.ys_task_mostafaameen.data.Api.RequestModels;

import com.google.gson.annotations.SerializedName;

public class LoginRequest {

    @SerializedName("Value")
    private Valuem value;

    public LoginRequest(Valuem value) {
        this.value = value;
    }

    public Valuem getValue() {
        return value;
    }
    public void setValue(Valuem value) {
        this.value = value;
    }
}


