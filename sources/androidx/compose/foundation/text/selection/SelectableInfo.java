package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/SelectableInfo;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SelectableInfo {

    /* JADX INFO: renamed from: a */
    public final long f9654a;

    /* JADX INFO: renamed from: b */
    public final int f9655b;

    /* JADX INFO: renamed from: c */
    public final int f9656c;

    /* JADX INFO: renamed from: d */
    public final int f9657d;

    /* JADX INFO: renamed from: e */
    public final int f9658e;

    /* JADX INFO: renamed from: f */
    public final TextLayoutResult f9659f;

    public SelectableInfo(long j, int i, int i2, int i3, int i4, TextLayoutResult textLayoutResult) {
        this.f9654a = j;
        this.f9655b = i;
        this.f9656c = i2;
        this.f9657d = i3;
        this.f9658e = i4;
        this.f9659f = textLayoutResult;
    }

    /* JADX INFO: renamed from: a */
    public final Selection.AnchorInfo m3583a(int i) {
        return new Selection.AnchorInfo(SelectionLayoutKt.m3609a(this.f9659f, i), i, this.f9654a);
    }

    /* JADX INFO: renamed from: b */
    public final CrossStatus m3584b() {
        int i = this.f9656c;
        int i2 = this.f9657d;
        return i < i2 ? CrossStatus.f9618b : i > i2 ? CrossStatus.f9617a : CrossStatus.f9619c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.f9654a);
        sb.append(", range=(");
        int i = this.f9656c;
        sb.append(i);
        sb.append('-');
        TextLayoutResult textLayoutResult = this.f9659f;
        sb.append(SelectionLayoutKt.m3609a(textLayoutResult, i));
        sb.append(',');
        int i2 = this.f9657d;
        sb.append(i2);
        sb.append('-');
        sb.append(SelectionLayoutKt.m3609a(textLayoutResult, i2));
        sb.append("), prevOffset=");
        return AbstractC0000a.m17n(sb, this.f9658e, ')');
    }
}
