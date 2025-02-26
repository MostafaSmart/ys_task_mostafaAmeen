package com.example.ys_task_mostafaameen.data.Api.RequestModels;

import com.google.gson.annotations.SerializedName;

public class UserData {
    @SerializedName("U_ID")
    private String userId;

    @SerializedName("مدير النظام")
    private String adminName;

    @SerializedName("PASSWORD")
    private String password;

    @SerializedName("LOGIN")
    private String login;

    @SerializedName("TRMNL_NO")
    private String terminalNo;

    @SerializedName("TRMNL_NM")
    private String terminalName;

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "userId='" + userId + '\'' +
                ", adminName='" + adminName + '\'' +
                ", password='" + password + '\'' +
                ", login='" + login + '\'' +
                ", terminalNo='" + terminalNo + '\'' +
                ", terminalName='" + terminalName + '\'' +
                '}';
    }
}
