package com.android.volley.toolbox;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class HttpClientStack implements HttpStack {

    /* JADX INFO: compiled from: Proguard */
    public static final class HttpPatch extends HttpEntityEnclosingRequestBase {
        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public final String getMethod() {
            return "PATCH";
        }
    }
}
