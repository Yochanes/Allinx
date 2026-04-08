package com.livechatinc.inappchat.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class Author {

    /* JADX INFO: renamed from: a */
    @SerializedName("name")
    @Expose
    private String f43355a;

    public final String toString() {
        return AbstractC0000a.m19p(new StringBuilder("Author{name='"), this.f43355a, "'}");
    }
}
