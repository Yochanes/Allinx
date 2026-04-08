package androidx.compose.p013ui.text.font;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.text.font.FontVariation;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ResourceFont implements Font {

    /* JADX INFO: renamed from: a */
    public final int f20310a;

    /* JADX INFO: renamed from: b */
    public final FontWeight f20311b;

    /* JADX INFO: renamed from: c */
    public final FontVariation.Settings f20312c;

    public ResourceFont(int i, FontWeight fontWeight, FontVariation.Settings settings) {
        this.f20310a = i;
        this.f20311b = fontWeight;
        this.f20312c = settings;
    }

    @Override // androidx.compose.p013ui.text.font.Font
    /* JADX INFO: renamed from: a */
    public final int mo6506a() {
        return 0;
    }

    @Override // androidx.compose.p013ui.text.font.Font
    /* JADX INFO: renamed from: b */
    public final int mo6510b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        return this.f20310a == resourceFont.f20310a && Intrinsics.m18594b(this.f20311b, resourceFont.f20311b) && this.f20312c.equals(resourceFont.f20312c);
    }

    @Override // androidx.compose.p013ui.text.font.Font
    /* JADX INFO: renamed from: getWeight, reason: from getter */
    public final FontWeight getF20311b() {
        return this.f20311b;
    }

    public final int hashCode() {
        return this.f20312c.f20292a.hashCode() + AbstractC0455a.m2228c(0, AbstractC0455a.m2228c(0, ((this.f20310a * 31) + this.f20311b.f20303a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f20310a + ", weight=" + this.f20311b + ", style=" + ((Object) FontStyle.m6520a(0)) + ", loadingStrategy=Blocking)";
    }
}
