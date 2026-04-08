package androidx.compose.p013ui.text.font;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/TypefaceRequest;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class TypefaceRequest {

    /* JADX INFO: renamed from: a */
    public final FontFamily f20315a;

    /* JADX INFO: renamed from: b */
    public final FontWeight f20316b;

    /* JADX INFO: renamed from: c */
    public final int f20317c;

    /* JADX INFO: renamed from: d */
    public final int f20318d;

    /* JADX INFO: renamed from: e */
    public final Object f20319e;

    public TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        this.f20315a = fontFamily;
        this.f20316b = fontWeight;
        this.f20317c = i;
        this.f20318d = i2;
        this.f20319e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return Intrinsics.m18594b(this.f20315a, typefaceRequest.f20315a) && Intrinsics.m18594b(this.f20316b, typefaceRequest.f20316b) && this.f20317c == typefaceRequest.f20317c && this.f20318d == typefaceRequest.f20318d && Intrinsics.m18594b(this.f20319e, typefaceRequest.f20319e);
    }

    public final int hashCode() {
        FontFamily fontFamily = this.f20315a;
        int iM2228c = AbstractC0455a.m2228c(this.f20318d, AbstractC0455a.m2228c(this.f20317c, (((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.f20316b.f20303a) * 31, 31), 31);
        Object obj = this.f20319e;
        return iM2228c + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f20315a);
        sb.append(", fontWeight=");
        sb.append(this.f20316b);
        sb.append(", fontStyle=");
        sb.append((Object) FontStyle.m6520a(this.f20317c));
        sb.append(", fontSynthesis=");
        int i = this.f20318d;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid"));
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f20319e);
        sb.append(')');
        return sb.toString();
    }
}
