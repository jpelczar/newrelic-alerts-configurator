package com.ocado.panda.newrelic.sync.configuration.channel;

/**
 * Notification channel configuration.
 * Implementations:
 * <ul>
 *     <li>{@link EmailChannel}</li>
 *     <li>{@link SlackChannel}</li>
 *     <li>{@link WebhookChannel}</li>
 *     <li>{@link UserChannel}</li>
 * </ul>
 */
public interface Channel {
    ChannelType getType();
    String getChannelName();
    ChannelTypeSupport getChannelTypeSupport();
    default String getTypeString() {
        return getType().name().toLowerCase();
    }
}
