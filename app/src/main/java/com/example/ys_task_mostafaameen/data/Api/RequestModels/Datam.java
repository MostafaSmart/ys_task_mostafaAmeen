package com.example.ys_task_mostafaameen.data.Api.RequestModels;

import com.google.gson.annotations.SerializedName;

public class Datam {
    @SerializedName("UserData")
    private UserData userData;

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    @Override
    public String toString() {
        return "Data{" +
                "userData=" + userData +
                '}';
    }
}
