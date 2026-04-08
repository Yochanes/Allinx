package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ViewConfigurationApi26Impl {
    /* JADX INFO: renamed from: a */
    public static float m2680a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    /* JADX INFO: renamed from: b */
    public static float m2681b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
