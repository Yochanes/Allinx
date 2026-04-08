package androidx.compose.p013ui.text.font;

import androidx.collection.LruCache;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.p013ui.text.platform.SynchronizedObject;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "AsyncTypefaceResult", "Key", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AsyncTypefaceCache {

    /* JADX INFO: renamed from: a */
    public final LruCache f20250a = new LruCache(16);

    /* JADX INFO: renamed from: b */
    public final MutableScatterMap f20251b;

    /* JADX INFO: renamed from: c */
    public final SynchronizedObject f20252c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "", "result", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @JvmInline
    public static final class AsyncTypefaceResult {

        /* JADX INFO: renamed from: a */
        public final Object f20253a;

        public /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.f20253a = obj;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof AsyncTypefaceResult) {
                return Intrinsics.m18594b(this.f20253a, ((AsyncTypefaceResult) obj).f20253a);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f20253a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.f20253a + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class Key {

        /* JADX INFO: renamed from: a */
        public final Font f20254a;

        /* JADX INFO: renamed from: b */
        public final Object f20255b;

        public Key(Font font, Object obj) {
            this.f20254a = font;
            this.f20255b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.m18594b(this.f20254a, key.f20254a) && Intrinsics.m18594b(this.f20255b, key.f20255b);
        }

        public final int hashCode() {
            int iHashCode = this.f20254a.hashCode() * 31;
            Object obj = this.f20255b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "Key(font=" + this.f20254a + ", loaderKey=" + this.f20255b + ')';
        }
    }

    public AsyncTypefaceCache() {
        long[] jArr = ScatterMapKt.f3844a;
        this.f20251b = new MutableScatterMap();
        this.f20252c = new SynchronizedObject();
    }

    /* JADX INFO: renamed from: a */
    public static void m6513a(AsyncTypefaceCache asyncTypefaceCache, Font font, AndroidFontLoader androidFontLoader, Object obj) {
        asyncTypefaceCache.getClass();
        androidFontLoader.getClass();
        Key key = new Key(font, null);
        synchronized (asyncTypefaceCache.f20252c) {
            try {
                if (obj == null) {
                    asyncTypefaceCache.f20251b.m2081m(key, new AsyncTypefaceResult(null));
                } else {
                    asyncTypefaceCache.f20250a.put(key, new AsyncTypefaceResult(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6514b(Font font, AndroidFontLoader androidFontLoader, boolean z2, Function1 function1, ContinuationImpl continuationImpl) {
        AsyncTypefaceCache$runCached$1 asyncTypefaceCache$runCached$1;
        Key key;
        AsyncTypefaceCache asyncTypefaceCache;
        if (continuationImpl instanceof AsyncTypefaceCache$runCached$1) {
            asyncTypefaceCache$runCached$1 = (AsyncTypefaceCache$runCached$1) continuationImpl;
            int i = asyncTypefaceCache$runCached$1.f20261g;
            if ((i & Integer.MIN_VALUE) != 0) {
                asyncTypefaceCache$runCached$1.f20261g = i - Integer.MIN_VALUE;
            } else {
                asyncTypefaceCache$runCached$1 = new AsyncTypefaceCache$runCached$1(this, continuationImpl);
            }
        }
        Object obj = asyncTypefaceCache$runCached$1.f20259d;
        Object obj2 = CoroutineSingletons.f51584a;
        int i2 = asyncTypefaceCache$runCached$1.f20261g;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            androidFontLoader.getClass();
            Key key2 = new Key(font, null);
            synchronized (this.f20252c) {
                try {
                    AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceResult) this.f20250a.get(key2);
                    if (asyncTypefaceResult == null) {
                        asyncTypefaceResult = (AsyncTypefaceResult) this.f20251b.m2109e(key2);
                    }
                    if (asyncTypefaceResult != null) {
                        return asyncTypefaceResult.f20253a;
                    }
                    asyncTypefaceCache$runCached$1.f20256a = this;
                    asyncTypefaceCache$runCached$1.f20257b = key2;
                    asyncTypefaceCache$runCached$1.f20258c = z2;
                    asyncTypefaceCache$runCached$1.f20261g = 1;
                    Object objInvoke = function1.invoke(asyncTypefaceCache$runCached$1);
                    if (objInvoke == obj2) {
                        return obj2;
                    }
                    obj = objInvoke;
                    key = key2;
                    asyncTypefaceCache = this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = asyncTypefaceCache$runCached$1.f20258c;
            key = asyncTypefaceCache$runCached$1.f20257b;
            asyncTypefaceCache = asyncTypefaceCache$runCached$1.f20256a;
            ResultKt.m18313b(obj);
        }
        synchronized (asyncTypefaceCache.f20252c) {
            try {
                if (obj == null) {
                    asyncTypefaceCache.f20251b.m2081m(key, new AsyncTypefaceResult(null));
                } else if (z2) {
                    asyncTypefaceCache.f20251b.m2081m(key, new AsyncTypefaceResult(obj));
                } else {
                    asyncTypefaceCache.f20250a.put(key, new AsyncTypefaceResult(obj));
                }
            } finally {
            }
        }
        return obj;
    }
}
