package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.BaseColumns;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.provider.FontRequestWorker;
import androidx.core.provider.RequestExecutor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class FontsContractCompat {

    /* JADX INFO: compiled from: Proguard */
    public static final class Columns implements BaseColumns {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FontInfo {

        /* JADX INFO: renamed from: a */
        public final Uri f23298a;

        /* JADX INFO: renamed from: b */
        public final int f23299b;

        /* JADX INFO: renamed from: c */
        public final int f23300c;

        /* JADX INFO: renamed from: d */
        public final boolean f23301d;

        /* JADX INFO: renamed from: e */
        public final int f23302e;

        public FontInfo(Uri uri, int i, int i2, boolean z2, int i3) {
            uri.getClass();
            this.f23298a = uri;
            this.f23299b = i;
            this.f23300c = i2;
            this.f23301d = z2;
            this.f23302e = i3;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FontRequestCallback {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface FontRequestFailReason {
        }
    }

    /* JADX INFO: renamed from: a */
    public static FontFamilyResult m7666a(Context context, FontRequest fontRequest) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{fontRequest}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return FontProvider.m7661a(context, Collections.unmodifiableList(arrayList));
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m7667b(Context context, List list, int i, boolean z2, int i2, Handler handler, TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter) {
        CallbackWrapper callbackWrapper = new CallbackWrapper(resourcesCallbackAdapter, new RequestExecutor.HandlerExecutor(handler));
        if (!z2) {
            String strM7664a = FontRequestWorker.m7664a(i, list);
            Typeface typeface = (Typeface) FontRequestWorker.f23280a.get(strM7664a);
            if (typeface != null) {
                callbackWrapper.m7660a(new FontRequestWorker.TypefaceResult(typeface));
                return typeface;
            }
            FontRequestWorker.C14422 c14422 = new FontRequestWorker.C14422(callbackWrapper);
            synchronized (FontRequestWorker.f23282c) {
                try {
                    SimpleArrayMap simpleArrayMap = FontRequestWorker.f23283d;
                    ArrayList arrayList = (ArrayList) simpleArrayMap.get(strM7664a);
                    if (arrayList != null) {
                        arrayList.add(c14422);
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c14422);
                    simpleArrayMap.put(strM7664a, arrayList2);
                    FontRequestWorker.CallableC14433 callableC14433 = new FontRequestWorker.CallableC14433(strM7664a, context, list, i);
                    ThreadPoolExecutor threadPoolExecutor = FontRequestWorker.f23281b;
                    FontRequestWorker.C14444 c14444 = new FontRequestWorker.C14444(strM7664a);
                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                    RequestExecutor.ReplyRunnable replyRunnable = new RequestExecutor.ReplyRunnable();
                    replyRunnable.f23307a = callableC14433;
                    replyRunnable.f23308b = c14444;
                    replyRunnable.f23309c = handler2;
                    threadPoolExecutor.execute(replyRunnable);
                    return null;
                } finally {
                }
            }
        }
        if (list.size() > 1) {
            throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
        }
        FontRequest fontRequest = (FontRequest) list.get(0);
        LruCache lruCache = FontRequestWorker.f23280a;
        ArrayList arrayList3 = new ArrayList(1);
        Object obj = new Object[]{fontRequest}[0];
        Objects.requireNonNull(obj);
        arrayList3.add(obj);
        String strM7664a2 = FontRequestWorker.m7664a(i, Collections.unmodifiableList(arrayList3));
        Typeface typeface2 = (Typeface) FontRequestWorker.f23280a.get(strM7664a2);
        if (typeface2 != null) {
            callbackWrapper.m7660a(new FontRequestWorker.TypefaceResult(typeface2));
            return typeface2;
        }
        if (i2 == -1) {
            ArrayList arrayList4 = new ArrayList(1);
            Object obj2 = new Object[]{fontRequest}[0];
            Objects.requireNonNull(obj2);
            arrayList4.add(obj2);
            FontRequestWorker.TypefaceResult typefaceResultM7665b = FontRequestWorker.m7665b(strM7664a2, context, Collections.unmodifiableList(arrayList4), i);
            callbackWrapper.m7660a(typefaceResultM7665b);
            return typefaceResultM7665b.f23294a;
        }
        try {
            try {
                FontRequestWorker.TypefaceResult typefaceResult = (FontRequestWorker.TypefaceResult) FontRequestWorker.f23281b.submit(new FontRequestWorker.CallableC14411(strM7664a2, context, fontRequest, i)).get(i2, TimeUnit.MILLISECONDS);
                callbackWrapper.m7660a(typefaceResult);
                return typefaceResult.f23294a;
            } catch (InterruptedException e) {
                throw e;
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2);
            } catch (TimeoutException unused) {
                throw new InterruptedException("timeout");
            }
        } catch (InterruptedException unused2) {
            callbackWrapper.m7660a(new FontRequestWorker.TypefaceResult(-3));
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FontFamilyResult {

        /* JADX INFO: renamed from: a */
        public final int f23296a;

        /* JADX INFO: renamed from: b */
        public final List f23297b;

        public FontFamilyResult() {
            this.f23296a = 1;
            this.f23297b = Collections.singletonList(null);
        }

        public FontFamilyResult(ArrayList arrayList) {
            this.f23296a = 0;
            this.f23297b = arrayList;
        }
    }
}
