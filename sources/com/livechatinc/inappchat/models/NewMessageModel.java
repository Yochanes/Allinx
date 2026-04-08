package com.livechatinc.inappchat.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.models.AttributeType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class NewMessageModel {

    /* JADX INFO: renamed from: a */
    @SerializedName("messageType")
    @Expose
    private String f43356a;

    /* JADX INFO: renamed from: b */
    @SerializedName(AttributeType.TEXT)
    @Expose
    private String f43357b;

    /* JADX INFO: renamed from: c */
    @SerializedName("id")
    @Expose
    private String f43358c;

    /* JADX INFO: renamed from: d */
    @SerializedName("timestamp")
    @Expose
    private String f43359d;

    /* JADX INFO: renamed from: e */
    @SerializedName("author")
    @Expose
    private Author f43360e;

    public final String toString() {
        return "NewMessageModel{messageType='" + this.f43356a + "', text='" + this.f43357b + "', id='" + this.f43358c + "', timestamp='" + this.f43359d + "', author=" + this.f43360e + '}';
    }
}
