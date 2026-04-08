package androidx.os;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/savedstate/SavedStateWriter;", "", "source", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@JvmInline
public final class SavedStateWriter {
    /* JADX INFO: renamed from: a */
    public static final void m11878a(Bundle bundle, String key, int[] value) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        bundle.putIntArray(key, value);
    }

    /* JADX INFO: renamed from: b */
    public static final void m11879b(Bundle bundle, String key) {
        Intrinsics.m18599g(key, "key");
        bundle.putString(key, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m11880c(Bundle bundle, String key, Parcelable value) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        bundle.putParcelable(key, value);
    }

    /* JADX INFO: renamed from: d */
    public static final void m11881d(Bundle bundle, String key, Bundle value) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        bundle.putBundle(key, value);
    }

    /* JADX INFO: renamed from: e */
    public static final void m11882e(Bundle bundle, String key, String value) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        bundle.putString(key, value);
    }

    /* JADX INFO: renamed from: f */
    public static final void m11883f(Bundle bundle, String key, String[] value) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        bundle.putStringArray(key, value);
    }

    /* JADX INFO: renamed from: g */
    public static final void m11884g(Bundle bundle, String key, List value) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        bundle.putStringArrayList(key, SavedStateWriterKt.m11885a(value));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavedStateWriter)) {
            return false;
        }
        ((SavedStateWriter) obj).getClass();
        return Intrinsics.m18594b(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "SavedStateWriter(source=null)";
    }
}
