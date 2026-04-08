package androidx.os;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"androidx/savedstate/SavedStateWriterKt__SavedStateWriter_androidKt"}, m18303k = 4, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SavedStateWriterKt {
    /* JADX INFO: renamed from: a */
    public static final ArrayList m11885a(Collection collection) {
        Intrinsics.m18599g(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList(collection);
    }
}
