package androidx.compose.p013ui.semantics;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ScrollAxisRange {

    /* JADX INFO: renamed from: a */
    public final Lambda f19733a;

    /* JADX INFO: renamed from: b */
    public final Lambda f19734b;

    /* JADX INFO: renamed from: c */
    public final boolean f19735c;

    /* JADX WARN: Multi-variable type inference failed */
    public ScrollAxisRange(Function0 function0, Function0 function02, boolean z2) {
        this.f19733a = (Lambda) function0;
        this.f19734b = (Lambda) function02;
        this.f19735c = z2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(((Number) this.f19733a.invoke()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.f19734b.invoke()).floatValue());
        sb.append(", reverseScrolling=");
        return AbstractC0455a.m2243r(sb, this.f19735c, ')');
    }
}
