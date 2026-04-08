package androidx.compose.foundation.text.selection;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "", "AnchorInfo", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class Selection {

    /* JADX INFO: renamed from: a */
    public final AnchorInfo f9660a;

    /* JADX INFO: renamed from: b */
    public final AnchorInfo f9661b;

    /* JADX INFO: renamed from: c */
    public final boolean f9662c;

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class AnchorInfo {

        /* JADX INFO: renamed from: a */
        public final ResolvedTextDirection f9663a;

        /* JADX INFO: renamed from: b */
        public final int f9664b;

        /* JADX INFO: renamed from: c */
        public final long f9665c;

        public AnchorInfo(ResolvedTextDirection resolvedTextDirection, int i, long j) {
            this.f9663a = resolvedTextDirection;
            this.f9664b = i;
            this.f9665c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            return this.f9663a == anchorInfo.f9663a && this.f9664b == anchorInfo.f9664b && this.f9665c == anchorInfo.f9665c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f9665c) + AbstractC0455a.m2228c(this.f9664b, this.f9663a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
            sb.append(this.f9663a);
            sb.append(", offset=");
            sb.append(this.f9664b);
            sb.append(", selectableId=");
            return AbstractC0455a.m2240o(sb, this.f9665c, ')');
        }
    }

    public Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z2) {
        this.f9660a = anchorInfo;
        this.f9661b = anchorInfo2;
        this.f9662c = z2;
    }

    /* JADX INFO: renamed from: a */
    public static Selection m3585a(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z2, int i) {
        if ((i & 1) != 0) {
            anchorInfo = selection.f9660a;
        }
        if ((i & 2) != 0) {
            anchorInfo2 = selection.f9661b;
        }
        if ((i & 4) != 0) {
            z2 = selection.f9662c;
        }
        selection.getClass();
        return new Selection(anchorInfo, anchorInfo2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        return Intrinsics.m18594b(this.f9660a, selection.f9660a) && Intrinsics.m18594b(this.f9661b, selection.f9661b) && this.f9662c == selection.f9662c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9662c) + ((this.f9661b.hashCode() + (this.f9660a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.f9660a);
        sb.append(", end=");
        sb.append(this.f9661b);
        sb.append(", handlesCrossed=");
        return AbstractC0455a.m2243r(sb, this.f9662c, ')');
    }
}
