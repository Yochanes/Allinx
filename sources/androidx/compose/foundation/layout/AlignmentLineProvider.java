package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider;", "", "Block", "Value", "Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;", "Landroidx/compose/foundation/layout/AlignmentLineProvider$Value;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class AlignmentLineProvider {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class Block extends AlignmentLineProvider {
        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        /* JADX INFO: renamed from: a */
        public final int mo2717a(Placeable placeable) {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Block)) {
                return false;
            }
            ((Block) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Block(lineProviderBlock=null)";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider$Value;", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class Value extends AlignmentLineProvider {
        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        /* JADX INFO: renamed from: a */
        public final int mo2717a(Placeable placeable) {
            return placeable.mo5615X(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            ((Value) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Value(alignmentLine=null)";
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo2717a(Placeable placeable);
}
