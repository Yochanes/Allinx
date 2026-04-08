package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/Updater;", "T", "", "composer", "Landroidx/compose/runtime/Composer;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class Updater<T> {
    /* JADX INFO: renamed from: a */
    public static final void m4535a(Composer composer, Function1 function1) {
        if (composer.getF16243O()) {
            composer.mo4223a(Unit.f51459a, new Updater$init$1(function1));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4536b(Composer composer, Object obj, Function2 function2) {
        if (composer.getF16243O() || !Intrinsics.m18594b(composer.mo4229g(), obj)) {
            composer.mo4214G(obj);
            composer.mo4223a(obj, function2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Updater)) {
            return false;
        }
        ((Updater) obj).getClass();
        return Intrinsics.m18594b(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "Updater(composer=null)";
    }
}
