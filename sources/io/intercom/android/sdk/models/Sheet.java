package io.intercom.android.sdk.models;

import com.google.gson.JsonObject;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class Sheet {
    private final String body;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
        JsonObject sheet_request_body;
        String sheet_title;

        public Sheet build() {
            return new Sheet(this);
        }
    }

    public Sheet(Builder builder) {
        JsonObject jsonObject = builder.sheet_request_body;
        this.body = jsonObject == null ? "" : jsonObject.toString();
    }

    public String getBody() {
        return this.body;
    }
}
