package com.example.ys_task_mostafaameen.data.Api.RequestModels;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("Data")
    private Datam data;

    @SerializedName("Result")
    private Result result;

    public Datam getData() { return data; }
    public void setData(Datam data) { this.data = data; }
    public Result getResult() { return result; }
    public void setResult(Result result) { this.result = result; }
}

class Result {
    @SerializedName("ErrNo")
    private int errNo;

    @SerializedName("ErrMsg")
    private String errMsg;

    public int getErrNo() { return errNo; }
    public void setErrNo(int errNo) { this.errNo = errNo; }
    public String getErrMsg() { return errMsg; }
    public void setErrMsg(String errMsg) { this.errMsg = errMsg; }
}

class RequestBody {
    @SerializedName("Value")
    private Value value;

    public RequestBody(Value value) {
        this.value = value;
    }

    public Value getValue() {
        return value;
    }
    public void setValue(Value value) {
        this.value = value;
    }
}

class Value {
    @SerializedName("UNT_NO")
    private String unitNo;

    @SerializedName("P_LANG_NO")
    private String languageNo;

    @SerializedName("P_PASSWORD")
    private String password;

    public Value(String unitNo, String languageNo, String password) {
        this.unitNo = unitNo;
        this.languageNo = languageNo;
        this.password = password;
    }

    public String getUnitNo() {
        return unitNo;
    }
    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }
    public String getLanguageNo() {
        return languageNo;
    }
    public void setLanguageNo(String languageNo) {
        this.languageNo = languageNo;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
