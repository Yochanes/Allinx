package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.core.provider.RequestExecutor;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class FontRequestWorker {

    /* JADX INFO: renamed from: a */
    public static final LruCache f23280a = new LruCache(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f23281b;

    /* JADX INFO: renamed from: c */
    public static final Object f23282c;

    /* JADX INFO: renamed from: d */
    public static final SimpleArrayMap f23283d;

    /* JADX INFO: renamed from: androidx.core.provider.FontRequestWorker$1 */
    /* JADX INFO: compiled from: Proguard */
    class CallableC14411 implements Callable<TypefaceResult> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f23284a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f23285b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ FontRequest f23286c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f23287d;

        public CallableC14411(String str, Context context, FontRequest fontRequest, int i) {
            this.f23284a = str;
            this.f23285b = context;
            this.f23286c = fontRequest;
            this.f23287d = i;
        }

        @Override // java.util.concurrent.Callable
        public final TypefaceResult call() {
            Object[] objArr = {this.f23286c};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return FontRequestWorker.m7665b(this.f23284a, this.f23285b, Collections.unmodifiableList(arrayList), this.f23287d);
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.FontRequestWorker$2 */
    /* JADX INFO: compiled from: Proguard */
    class C14422 implements Consumer<TypefaceResult> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CallbackWrapper f23288a;

        public C14422(CallbackWrapper callbackWrapper) {
            this.f23288a = callbackWrapper;
        }

        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            TypefaceResult typefaceResult = (TypefaceResult) obj;
            if (typefaceResult == null) {
                typefaceResult = new TypefaceResult(-3);
            }
            this.f23288a.m7660a(typefaceResult);
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.FontRequestWorker$3 */
    /* JADX INFO: compiled from: Proguard */
    class CallableC14433 implements Callable<TypefaceResult> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f23289a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f23290b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f23291c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f23292d;

        public CallableC14433(String str, Context context, List list, int i) {
            this.f23289a = str;
            this.f23290b = context;
            this.f23291c = list;
            this.f23292d = i;
        }

        @Override // java.util.concurrent.Callable
        public final TypefaceResult call() {
            try {
                return FontRequestWorker.m7665b(this.f23289a, this.f23290b, this.f23291c, this.f23292d);
            } catch (Throwable unused) {
                return new TypefaceResult(-3);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.FontRequestWorker$4 */
    /* JADX INFO: compiled from: Proguard */
    class C14444 implements Consumer<TypefaceResult> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f23293a;

        public C14444(String str) {
            this.f23293a = str;
        }

        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            TypefaceResult typefaceResult = (TypefaceResult) obj;
            synchronized (FontRequestWorker.f23282c) {
                try {
                    SimpleArrayMap simpleArrayMap = FontRequestWorker.f23283d;
                    ArrayList arrayList = (ArrayList) simpleArrayMap.get(this.f23293a);
                    if (arrayList == null) {
                        return;
                    }
                    simpleArrayMap.remove(this.f23293a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((Consumer) arrayList.get(i)).accept(typefaceResult);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        RequestExecutor.DefaultThreadFactory defaultThreadFactory = new RequestExecutor.DefaultThreadFactory();
        defaultThreadFactory.f23303a = "fonts-androidx";
        defaultThreadFactory.f23304b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), defaultThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f23281b = threadPoolExecutor;
        f23282c = new Object();
        f23283d = new SimpleArrayMap(0);
    }

    /* JADX INFO: renamed from: a */
    public static String m7664a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((FontRequest) list.get(i2)).f23279e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static TypefaceResult m7665b(String str, Context context, List list, int i) {
        int i2;
        Trace.beginSection(androidx.tracing.Trace.m11952e("getFontSync"));
        LruCache lruCache = f23280a;
        try {
            Typeface typeface = (Typeface) lruCache.get(str);
            if (typeface != null) {
                return new TypefaceResult(typeface);
            }
            FontsContractCompat.FontFamilyResult fontFamilyResultM7661a = FontProvider.m7661a(context, list);
            int i3 = fontFamilyResultM7661a.f23296a;
            List list2 = fontFamilyResultM7661a.f23297b;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else {
                FontsContractCompat.FontInfo[] fontInfoArr = (FontsContractCompat.FontInfo[]) list2.get(0);
                if (fontInfoArr == null || fontInfoArr.length == 0) {
                    i2 = 1;
                } else {
                    int length = fontInfoArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i2 = 0;
                            break;
                        }
                        int i5 = fontInfoArr[i4].f23302e;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i2 = i5;
                        }
                    }
                }
            }
            if (i2 != 0) {
                return new TypefaceResult(i2);
            }
            Typeface typefaceM7573a = (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) ? TypefaceCompat.m7573a(context, (FontsContractCompat.FontInfo[]) list2.get(0), i) : TypefaceCompat.m7574b(context, i, list2);
            if (typefaceM7573a == null) {
                return new TypefaceResult(-3);
            }
            lruCache.put(str, typefaceM7573a);
            return new TypefaceResult(typefaceM7573a);
        } catch (PackageManager.NameNotFoundException unused) {
            return new TypefaceResult(-1);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TypefaceResult {

        /* JADX INFO: renamed from: a */
        public final Typeface f23294a;

        /* JADX INFO: renamed from: b */
        public final int f23295b;

        public TypefaceResult(int i) {
            this.f23294a = null;
            this.f23295b = i;
        }

        public TypefaceResult(Typeface typeface) {
            this.f23294a = typeface;
            this.f23295b = 0;
        }
    }
}
