package com.example.ys_task_mostafaameen.data.Models.Orders;

public class GetAllOrderRequest {
    private ValueGetOrder Value;

    public GetAllOrderRequest(ValueGetOrder value) {
        this.Value = value;
    }

    public ValueGetOrder getValue() {
        return Value;
    }

    public void setValue(ValueGetOrder value) {
        this.Value = value;
    }

    public static class ValueGetOrder {
        private String UNT_NO;
        private String P_BRN_NO;
        private String P_TRMNL_NO;
        private String P_LANG_NO;
        private String P_ORDR_SRL;
        private String P_PRCSSD_FLG;

        public ValueGetOrder(String UNT_NO, String P_BRN_NO, String P_TRMNL_NO, String P_LANG_NO, String P_ORDR_SRL, String P_PRCSSD_FLG) {
            this.UNT_NO = UNT_NO;
            this.P_BRN_NO = P_BRN_NO;
            this.P_TRMNL_NO = P_TRMNL_NO;
            this.P_LANG_NO = P_LANG_NO;
            this.P_ORDR_SRL = P_ORDR_SRL;
            this.P_PRCSSD_FLG = P_PRCSSD_FLG;
        }

        public String getUNT_NO() { return UNT_NO; }
        public void setUNT_NO(String UNT_NO) { this.UNT_NO = UNT_NO; }

        public String getP_BRN_NO() { return P_BRN_NO; }
        public void setP_BRN_NO(String P_BRN_NO) { this.P_BRN_NO = P_BRN_NO; }

        public String getP_TRMNL_NO() { return P_TRMNL_NO; }
        public void setP_TRMNL_NO(String P_TRMNL_NO) { this.P_TRMNL_NO = P_TRMNL_NO; }

        public String getP_LANG_NO() { return P_LANG_NO; }
        public void setP_LANG_NO(String P_LANG_NO) { this.P_LANG_NO = P_LANG_NO; }

        public String getP_ORDR_SRL() { return P_ORDR_SRL; }
        public void setP_ORDR_SRL(String P_ORDR_SRL) { this.P_ORDR_SRL = P_ORDR_SRL; }

        public String getP_PRCSSD_FLG() { return P_PRCSSD_FLG; }
        public void setP_PRCSSD_FLG(String P_PRCSSD_FLG) { this.P_PRCSSD_FLG = P_PRCSSD_FLG; }
    }
}
