package com.android.volley.cronet;

import com.android.volley.Request;
import com.android.volley.RequestTask;
import com.android.volley.toolbox.AsyncHttpStack;
import com.android.volley.toolbox.UrlRewriter;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CronetHttpStack extends AsyncHttpStack {

    /* JADX INFO: renamed from: com.android.volley.cronet.CronetHttpStack$1 */
    /* JADX INFO: compiled from: Proguard */
    class C24471 extends UrlRequest.Callback {
    }

    /* JADX INFO: renamed from: com.android.volley.cronet.CronetHttpStack$2 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C24482 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34990a;

        static {
            int[] iArr = new int[Request.Priority.values().length];
            f34990a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34990a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34990a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34990a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {

        /* JADX INFO: renamed from: com.android.volley.cronet.CronetHttpStack$Builder$1 */
        /* JADX INFO: compiled from: Proguard */
        class C24491 implements UrlRewriter {
        }

        /* JADX INFO: renamed from: com.android.volley.cronet.CronetHttpStack$Builder$2 */
        /* JADX INFO: compiled from: Proguard */
        class C24502 extends RequestListener {
        }

        /* JADX INFO: renamed from: com.android.volley.cronet.CronetHttpStack$Builder$3 */
        /* JADX INFO: compiled from: Proguard */
        class C24513 implements CurlCommandLogger {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface CurlCommandLogger {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CurlLoggedRequestParameters {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class RequestListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public class SetUpRequestTask<T> extends RequestTask<T> {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // com.android.volley.toolbox.AsyncHttpStack
    /* JADX INFO: renamed from: b */
    public final void mo12816b(Request request, AsyncHttpStack.OnRequestComplete onRequestComplete) {
        throw null;
    }
}
