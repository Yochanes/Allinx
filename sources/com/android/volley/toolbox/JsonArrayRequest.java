package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class JsonArrayRequest extends JsonRequest<JSONArray> {
    @Override // com.android.volley.Request
    /* JADX INFO: renamed from: j */
    public final Response mo12801j(NetworkResponse networkResponse) {
        try {
            return new Response(new JSONArray(new String(networkResponse.f34938b, HttpHeaderParser.m12841c("utf-8", networkResponse.f34939c))), HttpHeaderParser.m12840b(networkResponse));
        } catch (UnsupportedEncodingException e) {
            return new Response(new ParseError(e));
        } catch (JSONException e2) {
            return new Response(new ParseError(e2));
        }
    }
}
