package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material3/FadeInFadeOutAnimationItem;", "T", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final /* data */ class FadeInFadeOutAnimationItem<T> {

    /* JADX INFO: renamed from: a */
    public final SnackbarData f13425a;

    /* JADX INFO: renamed from: b */
    public final ComposableLambdaImpl f13426b;

    public FadeInFadeOutAnimationItem(SnackbarData snackbarData, ComposableLambdaImpl composableLambdaImpl) {
        this.f13425a = snackbarData;
        this.f13426b = composableLambdaImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return Intrinsics.m18594b(this.f13425a, fadeInFadeOutAnimationItem.f13425a) && this.f13426b.equals(fadeInFadeOutAnimationItem.f13426b);
    }

    public final int hashCode() {
        SnackbarData snackbarData = this.f13425a;
        return this.f13426b.hashCode() + ((snackbarData == null ? 0 : snackbarData.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f13425a + ", transition=" + this.f13426b + ')';
    }
}
