package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/RangeSliderLogic;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class RangeSliderLogic {

    /* JADX INFO: renamed from: a */
    public final MutableInteractionSource f10879a;

    /* JADX INFO: renamed from: b */
    public final MutableInteractionSource f10880b;

    /* JADX INFO: renamed from: c */
    public final MutableFloatState f10881c;

    /* JADX INFO: renamed from: d */
    public final MutableFloatState f10882d;

    /* JADX INFO: renamed from: e */
    public final MutableState f10883e;

    public RangeSliderLogic(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableState mutableState) {
        this.f10879a = mutableInteractionSource;
        this.f10880b = mutableInteractionSource2;
        this.f10881c = mutableFloatState;
        this.f10882d = mutableFloatState2;
        this.f10883e = mutableState;
    }
}
