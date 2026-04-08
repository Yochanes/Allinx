package androidx.compose.material;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material/FadeInFadeOutAnimationItem;", "T", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class FadeInFadeOutAnimationItem<T> {

    /* JADX INFO: renamed from: a */
    public final SnackbarData f10619a;

    /* JADX INFO: renamed from: b */
    public final ComposableLambdaImpl f10620b;

    public FadeInFadeOutAnimationItem(SnackbarData snackbarData, ComposableLambdaImpl composableLambdaImpl) {
        this.f10619a = snackbarData;
        this.f10620b = composableLambdaImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return Intrinsics.m18594b(this.f10619a, fadeInFadeOutAnimationItem.f10619a) && this.f10620b.equals(fadeInFadeOutAnimationItem.f10620b);
    }

    public final int hashCode() {
        SnackbarData snackbarData = this.f10619a;
        return this.f10620b.hashCode() + ((snackbarData == null ? 0 : snackbarData.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f10619a + ", transition=" + this.f10620b + ')';
    }
}
