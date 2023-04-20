package com.example.final_prj;

import java.util.Date;

public class Medical_Record {
    private Date date;
    private String Diagnosis;

    public Medical_Record(Date date, String Dignosis) {
        this.date = date;
        this.Diagnosis = Dignosis;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }
}
