package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class StringRequest extends Request<String> {
    @Override // com.android.volley.Request
    /* JADX INFO: renamed from: b */
    public final void mo12794b(Object obj) {
        throw null;
    }

    @Override // com.android.volley.Request
    /* JADX INFO: renamed from: j */
    public final Response mo12801j(NetworkResponse networkResponse) {
        String str;
        byte[] bArr = networkResponse.f34938b;
        try {
            str = new String(bArr, HttpHeaderParser.m12841c("ISO-8859-1", networkResponse.f34939c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new Response(str, HttpHeaderParser.m12840b(networkResponse));
    }
}
