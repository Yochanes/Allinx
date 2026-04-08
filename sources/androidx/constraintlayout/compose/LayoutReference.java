package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/LayoutReference;", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class LayoutReference {

    /* JADX INFO: renamed from: a */
    public final Object f20913a;

    public LayoutReference(Object obj) {
        this.f20913a = obj;
        new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public Object getF20913a() {
        return this.f20913a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutReference) && Intrinsics.m18594b(getF20913a(), ((LayoutReference) obj).getF20913a());
    }

    public final int hashCode() {
        return getF20913a().hashCode();
    }
}
