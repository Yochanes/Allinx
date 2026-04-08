package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface LazyLayoutScrollScope extends ScrollScope {
    /* JADX INFO: renamed from: a */
    int mo2963a();

    /* JADX INFO: renamed from: b */
    void mo2964b(int i, int i2);

    /* JADX INFO: renamed from: c */
    int mo2965c();

    /* JADX INFO: renamed from: d */
    int mo2966d(int i);

    /* JADX INFO: renamed from: f */
    int mo2967f();

    int getItemCount();
}
