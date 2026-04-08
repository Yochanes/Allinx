package androidx.compose.foundation.text;

import androidx.compose.p013ui.text.input.OffsetMapping;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/ValidatingOffsetMapping;", "Landroidx/compose/ui/text/input/OffsetMapping;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ValidatingOffsetMapping implements OffsetMapping {

    /* JADX INFO: renamed from: a */
    public final OffsetMapping f8755a;

    /* JADX INFO: renamed from: b */
    public final int f8756b;

    /* JADX INFO: renamed from: c */
    public final int f8757c;

    public ValidatingOffsetMapping(OffsetMapping offsetMapping, int i, int i2) {
        this.f8755a = offsetMapping;
        this.f8756b = i;
        this.f8757c = i2;
    }

    @Override // androidx.compose.p013ui.text.input.OffsetMapping
    /* JADX INFO: renamed from: a */
    public final int mo3272a(int i) {
        int iMo3272a = this.f8755a.mo3272a(i);
        if (i >= 0 && i <= this.f8757c) {
            ValidatingOffsetMappingKt.m3276c(iMo3272a, this.f8756b, i);
        }
        return iMo3272a;
    }

    @Override // androidx.compose.p013ui.text.input.OffsetMapping
    /* JADX INFO: renamed from: b */
    public final int mo3273b(int i) {
        int iMo3273b = this.f8755a.mo3273b(i);
        if (i >= 0 && i <= this.f8756b) {
            ValidatingOffsetMappingKt.m3275b(iMo3273b, this.f8757c, i);
        }
        return iMo3273b;
    }
}
