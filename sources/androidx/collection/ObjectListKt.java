package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"collection"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ObjectListKt {

    /* JADX INFO: renamed from: a */
    public static final Object[] f3821a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final MutableObjectList f3822b = new MutableObjectList(0);

    /* JADX INFO: renamed from: a */
    public static final void m2102a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            RuntimeHelpersKt.m2144b("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2103b(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            RuntimeHelpersKt.m2143a("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            RuntimeHelpersKt.m2144b("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        RuntimeHelpersKt.m2144b("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
