package androidx.os;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"androidx/savedstate/SavedStateReaderKt__SavedStateReaderKt", "androidx/savedstate/SavedStateReaderKt__SavedStateReader_androidKt"}, m18303k = 4, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SavedStateReaderKt {
    /* JADX INFO: renamed from: a */
    public static final void m11870a(String key) {
        Intrinsics.m18599g(key, "key");
        throw new IllegalArgumentException(AbstractC0000a.m3D("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }
}
