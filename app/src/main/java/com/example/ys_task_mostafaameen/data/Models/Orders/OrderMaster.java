package com.example.ys_task_mostafaameen.data.Models.Orders;

import java.util.List;

public class OrderMaster {
    private String BILL_NO;
    private String ORDR_SRL;
    private String BILL_DATE;
    private String BILL_TIME;
    private String ORDR_NOTE;
    private String BILL_DOC_TYPE;
    private String BILL_DOC_TYPE_NM;
    private String LAST_UPDT;
    private String CNCL_FLG;
    private String PRCSSD_FLG;
    private String PRCSSD_U_ID;
    private String PRCSSD_DATE;
    private String AD_DATE;
    private String ORDR_TRC_FLG;
    private String PSSD_TM;
    private String ORDR_STS;
    private List<OrderDetail> ordrDtl; // قائمة بالأصناف داخل الطلب

    // Getters and Setters
    public String getBILL_NO() { return BILL_NO; }
    public void setBILL_NO(String BILL_NO) { this.BILL_NO = BILL_NO; }

    public String getORDR_SRL() { return ORDR_SRL; }
    public void setORDR_SRL(String ORDR_SRL) { this.ORDR_SRL = ORDR_SRL; }

    public String getBILL_DATE() { return BILL_DATE; }
    public void setBILL_DATE(String BILL_DATE) { this.BILL_DATE = BILL_DATE; }

    public String getBILL_TIME() { return BILL_TIME; }
    public void setBILL_TIME(String BILL_TIME) { this.BILL_TIME = BILL_TIME; }

    public String getORDR_NOTE() { return ORDR_NOTE; }
    public void setORDR_NOTE(String ORDR_NOTE) { this.ORDR_NOTE = ORDR_NOTE; }

    public String getBILL_DOC_TYPE() { return BILL_DOC_TYPE; }
    public void setBILL_DOC_TYPE(String BILL_DOC_TYPE) { this.BILL_DOC_TYPE = BILL_DOC_TYPE; }

    public String getBILL_DOC_TYPE_NM() { return BILL_DOC_TYPE_NM; }
    public void setBILL_DOC_TYPE_NM(String BILL_DOC_TYPE_NM) { this.BILL_DOC_TYPE_NM = BILL_DOC_TYPE_NM; }

    public String getCNCL_FLG() { return CNCL_FLG; }
    public void setCNCL_FLG(String CNCL_FLG) { this.CNCL_FLG = CNCL_FLG; }

    public String getPRCSSD_FLG() { return PRCSSD_FLG; }
    public void setPRCSSD_FLG(String PRCSSD_FLG) { this.PRCSSD_FLG = PRCSSD_FLG; }

    public List<OrderDetail> getOrdrDtl() { return ordrDtl; }
    public void setOrdrDtl(List<OrderDetail> ordrDtl) { this.ordrDtl = ordrDtl; }
}
