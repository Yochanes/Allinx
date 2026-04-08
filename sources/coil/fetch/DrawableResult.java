package coil.fetch;

import android.graphics.drawable.Drawable;
import androidx.compose.animation.AbstractC0455a;
import coil.decode.DataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/fetch/DrawableResult;", "Lcoil/fetch/FetchResult;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DrawableResult extends FetchResult {

    /* JADX INFO: renamed from: a */
    public final Drawable f33630a;

    /* JADX INFO: renamed from: b */
    public final boolean f33631b;

    /* JADX INFO: renamed from: c */
    public final DataSource f33632c;

    public DrawableResult(Drawable drawable, boolean z2, DataSource dataSource) {
        this.f33630a = drawable;
        this.f33631b = z2;
        this.f33632c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawableResult)) {
            return false;
        }
        DrawableResult drawableResult = (DrawableResult) obj;
        return Intrinsics.m18594b(this.f33630a, drawableResult.f33630a) && this.f33631b == drawableResult.f33631b && this.f33632c == drawableResult.f33632c;
    }

    public final int hashCode() {
        return this.f33632c.hashCode() + AbstractC0455a.m2230e(this.f33630a.hashCode() * 31, 31, this.f33631b);
    }
}
