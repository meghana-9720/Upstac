package org.upgrad.upstac.testrequests.consultation;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateConsultationRequest {

    @NotNull
    private DoctorSuggestion suggestion;

    public void setSuggestion(DoctorSuggestion suggestion) {
        this.suggestion = suggestion;
    }

    public DoctorSuggestion getSuggestion() {
        return suggestion;
    }

    public String getComments() {
        return comments;
    }

    private String comments;
}
