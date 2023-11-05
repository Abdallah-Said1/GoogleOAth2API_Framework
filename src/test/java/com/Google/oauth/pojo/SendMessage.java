
package com.Google.oauth.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class SendMessage {

    @JsonProperty("id")
    private String id;
    @JsonProperty("threadId")
    private String threadId;
    @JsonProperty("labelIds")
    private List<String> labelIds;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("threadId")
    public String getThreadId() {
        return threadId;
    }

    @JsonProperty("threadId")
    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    @JsonProperty("labelIds")
    public List<String> getLabelIds() {
        return labelIds;
    }

    @JsonProperty("labelIds")
    public void setLabelIds(List<String> labelIds) {
        this.labelIds = labelIds;
    }

}
