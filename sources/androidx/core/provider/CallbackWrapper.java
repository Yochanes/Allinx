package androidx.core.provider;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.provider.FontRequestWorker;
import androidx.core.provider.RequestExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class CallbackWrapper {

    /* JADX INFO: renamed from: a */
    public final TypefaceCompat.ResourcesCallbackAdapter f23263a;

    /* JADX INFO: renamed from: b */
    public final Executor f23264b;

    /* JADX INFO: renamed from: androidx.core.provider.CallbackWrapper$1 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC14391 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TypefaceCompat.ResourcesCallbackAdapter f23265a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Typeface f23266b;

        public RunnableC14391(TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter, Typeface typeface) {
            this.f23265a = resourcesCallbackAdapter;
            this.f23266b = typeface;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ResourcesCompat.FontCallback fontCallback = this.f23265a.f23210a;
            if (fontCallback != null) {
                fontCallback.onFontRetrieved(this.f23266b);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.CallbackWrapper$2 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC14402 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TypefaceCompat.ResourcesCallbackAdapter f23267a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f23268b;

        public RunnableC14402(TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter, int i) {
            this.f23267a = resourcesCallbackAdapter;
            this.f23268b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ResourcesCompat.FontCallback fontCallback = this.f23267a.f23210a;
            if (fontCallback != null) {
                fontCallback.onFontRetrievalFailed(this.f23268b);
            }
        }
    }

    public CallbackWrapper(TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter, Executor executor) {
        this.f23263a = resourcesCallbackAdapter;
        this.f23264b = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m7660a(FontRequestWorker.TypefaceResult typefaceResult) {
        int i = typefaceResult.f23295b;
        Executor executor = this.f23264b;
        TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter = this.f23263a;
        if (i == 0) {
            ((RequestExecutor.HandlerExecutor) executor).execute(new RunnableC14391(resourcesCallbackAdapter, typefaceResult.f23294a));
        } else {
            ((RequestExecutor.HandlerExecutor) executor).execute(new RunnableC14402(resourcesCallbackAdapter, i));
        }
    }
}
