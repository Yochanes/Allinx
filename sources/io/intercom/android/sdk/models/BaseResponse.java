package io.intercom.android.sdk.models;

import androidx.annotation.Nullable;
import io.intercom.android.sdk.models.User;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseResponse {
    private final Config config;
    private final boolean hasConversations;
    private final User user;

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Builder {

        @Nullable
        Config config;
        boolean has_conversations;

        @Nullable
        User.Builder user;

        public abstract BaseResponse build();
    }

    public BaseResponse(Builder builder) {
        Config config = builder.config;
        this.config = config == null ? new Config() : config;
        this.hasConversations = builder.has_conversations;
        User.Builder builder2 = builder.user;
        this.user = builder2 == null ? User.NULL : builder2.build();
    }

    public Config getConfig() {
        return this.config;
    }

    public User getUser() {
        return this.user;
    }

    public boolean hasConversations() {
        return this.hasConversations;
    }
}
