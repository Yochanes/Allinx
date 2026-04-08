package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/SkippableUpdater;", "T", "", "composer", "Landroidx/compose/runtime/Composer;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class SkippableUpdater<T> {

    /* JADX INFO: renamed from: a */
    public final Composer f16554a;

    public /* synthetic */ SkippableUpdater(Composer composer) {
        this.f16554a = composer;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SkippableUpdater) {
            return Intrinsics.m18594b(this.f16554a, ((SkippableUpdater) obj).f16554a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16554a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f16554a + ')';
    }
}
