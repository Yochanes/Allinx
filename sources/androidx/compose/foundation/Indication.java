package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/Indication;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface Indication {
    /* JADX INFO: renamed from: a */
    default IndicationInstance mo2478a(InteractionSource interactionSource, Composer composer) {
        composer.mo4221N(1257603829);
        NoIndicationInstance noIndicationInstance = NoIndicationInstance.f5118a;
        composer.mo4213F();
        return noIndicationInstance;
    }
}
