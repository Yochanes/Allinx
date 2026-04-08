package androidx.compose.material;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"material_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SwipeableKt {
    /* JADX INFO: renamed from: a */
    public static final Float m3795a(Object obj, Map map) {
        Object next;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.m18594b(((Map.Entry) next).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }
}
