package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/material/TextFieldColors;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface TextFieldColors {
    /* JADX INFO: renamed from: a */
    MutableState mo3724a(boolean z2, boolean z3, Composer composer);

    /* JADX INFO: renamed from: a */
    default State mo3725a(boolean z2, boolean z3, Composer composer) {
        composer.mo4221N(-1036335134);
        MutableState mutableStateMo3724a = mo3724a(z2, z3, composer);
        composer.mo4213F();
        return mutableStateMo3724a;
    }

    /* JADX INFO: renamed from: b */
    MutableState mo3726b(boolean z2, Composer composer);

    /* JADX INFO: renamed from: c */
    MutableState mo3727c(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer);

    /* JADX INFO: renamed from: d */
    State mo3728d(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i);

    /* JADX INFO: renamed from: e */
    default State mo3729e(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer) {
        composer.mo4221N(454310320);
        MutableState mutableStateMo3730f = mo3730f(z2, z3, composer);
        composer.mo4213F();
        return mutableStateMo3730f;
    }

    /* JADX INFO: renamed from: f */
    MutableState mo3730f(boolean z2, boolean z3, Composer composer);

    /* JADX INFO: renamed from: g */
    MutableState mo3731g(Composer composer);
}
