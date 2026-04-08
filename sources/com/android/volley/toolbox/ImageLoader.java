package com.android.volley.toolbox;

import android.graphics.Bitmap;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ImageLoader {

    /* JADX INFO: renamed from: com.android.volley.toolbox.ImageLoader$2 */
    /* JADX INFO: compiled from: Proguard */
    class C24572 implements Response.Listener<Bitmap> {
        @Override // com.android.volley.Response.Listener
        /* JADX INFO: renamed from: a */
        public final void mo12807a(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.android.volley.toolbox.ImageLoader$3 */
    /* JADX INFO: compiled from: Proguard */
    class C24583 implements Response.ErrorListener {
        @Override // com.android.volley.Response.ErrorListener
        /* JADX INFO: renamed from: b */
        public final void mo12806b(VolleyError volleyError) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.android.volley.toolbox.ImageLoader$4 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC24594 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class BatchedImageRequest {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ImageCache {
    }

    /* JADX INFO: compiled from: Proguard */
    public class ImageContainer {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ImageListener extends Response.ErrorListener {
    }

    /* JADX INFO: renamed from: com.android.volley.toolbox.ImageLoader$1 */
    /* JADX INFO: compiled from: Proguard */
    class C24561 implements ImageListener {
        @Override // com.android.volley.Response.ErrorListener
        /* JADX INFO: renamed from: b */
        public final void mo12806b(VolleyError volleyError) {
        }
    }
}
