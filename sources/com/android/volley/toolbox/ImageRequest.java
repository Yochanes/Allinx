package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ImageRequest extends Request<Bitmap> {

    /* JADX INFO: renamed from: s */
    public static final Object f35017s = new Object();

    @Override // com.android.volley.Request
    /* JADX INFO: renamed from: b */
    public final void mo12794b(Object obj) {
        throw null;
    }

    @Override // com.android.volley.Request
    /* JADX INFO: renamed from: d */
    public final Request.Priority mo12796d() {
        return Request.Priority.f34958a;
    }

    @Override // com.android.volley.Request
    /* JADX INFO: renamed from: j */
    public final Response mo12801j(NetworkResponse networkResponse) {
        Response responseM12844l;
        synchronized (f35017s) {
            try {
                try {
                    responseM12844l = m12844l(networkResponse);
                } catch (OutOfMemoryError e) {
                    VolleyLog.m12810c("Caught OOM for %d byte image, url=%s", Integer.valueOf(networkResponse.f34938b.length), this.f34943b);
                    return new Response(new ParseError(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return responseM12844l;
    }

    /* JADX INFO: renamed from: l */
    public final Response m12844l(NetworkResponse networkResponse) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = null;
        byte[] bArr = networkResponse.f34938b;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return bitmapDecodeByteArray == null ? new Response(new ParseError(networkResponse)) : new Response(bitmapDecodeByteArray, HttpHeaderParser.m12840b(networkResponse));
    }
}
