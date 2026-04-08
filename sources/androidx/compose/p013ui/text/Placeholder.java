package androidx.compose.p013ui.text;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/Placeholder;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Placeholder {

    /* JADX INFO: renamed from: a */
    public final long f19977a;

    /* JADX INFO: renamed from: b */
    public final long f19978b;

    public Placeholder(long j, long j2) {
        this.f19977a = j;
        this.f19978b = j2;
        TextUnitType[] textUnitTypeArr = TextUnit.f20574b;
        if ((j & 1095216660480L) == 0) {
            InlineClassHelperKt.m6567a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            InlineClassHelperKt.m6567a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return TextUnit.m6673a(this.f19977a, placeholder.f19977a) && TextUnit.m6673a(this.f19978b, placeholder.f19978b);
    }

    public final int hashCode() {
        TextUnitType[] textUnitTypeArr = TextUnit.f20574b;
        return Integer.hashCode(4) + AbstractC0455a.m2231f(this.f19978b, Long.hashCode(this.f19977a) * 31, 31);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m6677e(this.f19977a)) + ", height=" + ((Object) TextUnit.m6677e(this.f19978b)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m6384a(4)) + ')';
    }
}
