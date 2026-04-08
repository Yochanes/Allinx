package androidx.compose.material3;

import androidx.compose.p013ui.text.input.OffsetMapping;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1", "Landroidx/compose/ui/text/input/OffsetMapping;", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class DateVisualTransformation$dateOffsetTranslator$1 implements OffsetMapping {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DateVisualTransformation f13268a;

    public DateVisualTransformation$dateOffsetTranslator$1(DateVisualTransformation dateVisualTransformation) {
        this.f13268a = dateVisualTransformation;
    }

    @Override // androidx.compose.p013ui.text.input.OffsetMapping
    /* JADX INFO: renamed from: a */
    public final int mo3272a(int i) {
        DateVisualTransformation dateVisualTransformation = this.f13268a;
        if (i <= dateVisualTransformation.f13264b - 1) {
            return i;
        }
        if (i <= dateVisualTransformation.f13265c - 1) {
            return i - 1;
        }
        int i2 = dateVisualTransformation.f13266d;
        return i <= i2 + 1 ? i - 2 : i2;
    }

    @Override // androidx.compose.p013ui.text.input.OffsetMapping
    /* JADX INFO: renamed from: b */
    public final int mo3273b(int i) {
        DateVisualTransformation dateVisualTransformation = this.f13268a;
        if (i < dateVisualTransformation.f13264b) {
            return i;
        }
        if (i < dateVisualTransformation.f13265c) {
            return i + 1;
        }
        int i2 = dateVisualTransformation.f13266d;
        return i <= i2 ? i + 2 : i2 + 2;
    }
}
