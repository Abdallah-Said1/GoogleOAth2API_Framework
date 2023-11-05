
package com.Google.oauth.pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class ProfileUser {

    @JsonProperty("emailAddress")
    private String emailAddress;
    @JsonProperty("messagesTotal")
    private Integer messagesTotal;
    @JsonProperty("threadsTotal")
    private Integer threadsTotal;
    @JsonProperty("historyId")
    private String historyId;

    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @JsonProperty("messagesTotal")
    public Integer getMessagesTotal() {
        return messagesTotal;
    }

    @JsonProperty("messagesTotal")
    public void setMessagesTotal(Integer messagesTotal) {
        this.messagesTotal = messagesTotal;
    }

    @JsonProperty("threadsTotal")
    public Integer getThreadsTotal() {
        return threadsTotal;
    }

    @JsonProperty("threadsTotal")
    public void setThreadsTotal(Integer threadsTotal) {
        this.threadsTotal = threadsTotal;
    }

    @JsonProperty("historyId")
    public String getHistoryId() {
        return historyId;
    }

    @JsonProperty("historyId")
    public void setHistoryId(String historyId) {
        this.historyId = historyId;
    }

}
