package androidx.compose.runtime.collection;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\u0005¨\u0006\f"}, m18302d2 = {"", FirebaseAnalytics.Param.INDEX, "size", "", "c", "(II)V", "toIndex", "e", "fromIndex", "d", "(I)V", "f", "runtime_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableVectorKt {
    /* JADX INFO: renamed from: a */
    public static final void m4581a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            m4583c(i, size);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4582b(List list, int i, int i2) {
        if (i > i2) {
            m4586f(i, i2);
        }
        if (i < 0) {
            m4584d(i);
        }
        if (i2 > list.size()) {
            m4585e(i2, list.size());
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m4583c(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    /* JADX INFO: renamed from: d */
    private static final void m4584d(int i) {
        throw new IndexOutOfBoundsException(AbstractC0000a.m10g(i, "fromIndex (", ") is less than 0."));
    }

    /* JADX INFO: renamed from: e */
    private static final void m4585e(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    /* JADX INFO: renamed from: f */
    private static final void m4586f(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }
}
