
package com.Google.oauth.pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)

public class ErrorRoot {

    @JsonProperty("error")
    private InnerError1 error;

    @JsonProperty("error")
    public InnerError1 getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(InnerError1 error) {
        this.error = error;
    }

}
