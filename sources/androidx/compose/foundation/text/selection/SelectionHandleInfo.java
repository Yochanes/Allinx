package androidx.compose.foundation.text.selection;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.foundation.text.Handle;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class SelectionHandleInfo {

    /* JADX INFO: renamed from: a */
    public final Handle f9773a;

    /* JADX INFO: renamed from: b */
    public final long f9774b;

    /* JADX INFO: renamed from: c */
    public final SelectionHandleAnchor f9775c;

    /* JADX INFO: renamed from: d */
    public final boolean f9776d;

    public SelectionHandleInfo(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z2) {
        this.f9773a = handle;
        this.f9774b = j;
        this.f9775c = selectionHandleAnchor;
        this.f9776d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.f9773a == selectionHandleInfo.f9773a && Offset.m5053c(this.f9774b, selectionHandleInfo.f9774b) && this.f9775c == selectionHandleInfo.f9775c && this.f9776d == selectionHandleInfo.f9776d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9776d) + ((this.f9775c.hashCode() + AbstractC0455a.m2231f(this.f9774b, this.f9773a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f9773a);
        sb.append(", position=");
        sb.append((Object) Offset.m5060j(this.f9774b));
        sb.append(", anchor=");
        sb.append(this.f9775c);
        sb.append(", visible=");
        return AbstractC0455a.m2243r(sb, this.f9776d, ')');
    }
}
