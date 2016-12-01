package com.ocado.panda.newrelic.api.model.channels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.Map;

@Value
@EqualsAndHashCode(exclude={"url"})
@Builder
public class AlertsChannelConfiguration {
    @JsonProperty("user_id")
    String userId;
    @JsonProperty
    String channel;
    @JsonProperty
    String url;
    @JsonProperty("include_json_attachment")
    Boolean includeJsonAttachment;
    @JsonProperty
    String recipients;
    @JsonProperty("payload_type")
    String payloadType;
    @JsonProperty
    String payload;
    @JsonProperty
    Map<String, String> headers;
    @JsonProperty("base_url")
    String baseUrl;
    @JsonProperty("auth_username")
    String authUsername;
    @JsonProperty("auth_password")
    String authPassword;
}
