package androidx.os;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/savedstate/SavedStateReader;", "", "source", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@JvmInline
@SourceDebugExtension
public final class SavedStateReader {
    /* JADX INFO: renamed from: a */
    public static final boolean m11859a(Bundle bundle, String key) {
        Intrinsics.m18599g(key, "key");
        boolean z2 = bundle.getBoolean(key, false);
        if (z2 || !bundle.getBoolean(key, true)) {
            return z2;
        }
        SavedStateReaderKt.m11870a(key);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final double m11860b(Bundle bundle, String key) {
        Intrinsics.m18599g(key, "key");
        double d = bundle.getDouble(key, Double.MIN_VALUE);
        if (d != Double.MIN_VALUE || bundle.getDouble(key, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d;
        }
        SavedStateReaderKt.m11870a(key);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static final float m11861c(Bundle bundle, String key) {
        Intrinsics.m18599g(key, "key");
        float f = bundle.getFloat(key, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f;
        }
        SavedStateReaderKt.m11870a(key);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static final int m11862d(Bundle bundle, String key) {
        Intrinsics.m18599g(key, "key");
        int i = bundle.getInt(key, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        SavedStateReaderKt.m11870a(key);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static final int[] m11863e(Bundle bundle, String key) {
        Intrinsics.m18599g(key, "key");
        int[] intArray = bundle.getIntArray(key);
        if (intArray != null) {
            return intArray;
        }
        SavedStateReaderKt.m11870a(key);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static final long m11864f(Bundle bundle, String key) {
        Intrinsics.m18599g(key, "key");
        long j = bundle.getLong(key, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j;
        }
        SavedStateReaderKt.m11870a(key);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static final Bundle m11865g(Bundle bundle, String key) {
        Intrinsics.m18599g(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        SavedStateReaderKt.m11870a(key);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static final String m11866h(Bundle bundle, String key) {
        Intrinsics.m18599g(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        SavedStateReaderKt.m11870a(key);
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static final String[] m11867i(Bundle bundle, String key) {
        Intrinsics.m18599g(key, "key");
        String[] stringArray = bundle.getStringArray(key);
        if (stringArray != null) {
            return stringArray;
        }
        SavedStateReaderKt.m11870a(key);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static final ArrayList m11868j(Bundle bundle, String key) {
        Intrinsics.m18599g(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        SavedStateReaderKt.m11870a(key);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m11869k(Bundle bundle, String key) {
        Intrinsics.m18599g(key, "key");
        return bundle.containsKey(key) && bundle.get(key) == null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavedStateReader)) {
            return false;
        }
        ((SavedStateReader) obj).getClass();
        return Intrinsics.m18594b(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "SavedStateReader(source=null)";
    }
}
