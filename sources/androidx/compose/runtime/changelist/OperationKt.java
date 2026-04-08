package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.SlotWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, m18302d2 = {"", "IntParameter", "runtime_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class OperationKt {
    /* JADX INFO: renamed from: a */
    public static final void m4549a(SlotWriter slotWriter, Applier applier, int i) {
        while (true) {
            int i2 = slotWriter.f16604v;
            if (i > i2 && i < slotWriter.f16603u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            slotWriter.m4480L();
            if (slotWriter.m4512w(slotWriter.f16604v)) {
                applier.mo4190g();
            }
            slotWriter.m4498i();
        }
    }
}
