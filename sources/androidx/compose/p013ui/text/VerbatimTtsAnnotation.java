package androidx.compose.p013ui.text;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class VerbatimTtsAnnotation extends TtsAnnotation {

    /* JADX INFO: renamed from: a */
    public final String f20123a;

    public VerbatimTtsAnnotation(String str) {
        this.f20123a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerbatimTtsAnnotation) {
            return Intrinsics.m18594b(this.f20123a, ((VerbatimTtsAnnotation) obj).f20123a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20123a.hashCode();
    }

    public final String toString() {
        return AbstractC0455a.m2241p(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f20123a, ')');
    }
}
