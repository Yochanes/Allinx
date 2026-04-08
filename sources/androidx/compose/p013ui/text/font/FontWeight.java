package androidx.compose.p013ui.text.font;

import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import com.google.firebase.messaging.ServiceStarter;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", "Companion", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@SourceDebugExtension
public final class FontWeight implements Comparable<FontWeight> {

    /* JADX INFO: renamed from: b */
    public static final FontWeight f20293b;

    /* JADX INFO: renamed from: c */
    public static final FontWeight f20294c;

    /* JADX INFO: renamed from: d */
    public static final FontWeight f20295d;

    /* JADX INFO: renamed from: f */
    public static final FontWeight f20296f;

    /* JADX INFO: renamed from: g */
    public static final FontWeight f20297g;

    /* JADX INFO: renamed from: i */
    public static final FontWeight f20298i;

    /* JADX INFO: renamed from: j */
    public static final FontWeight f20299j;

    /* JADX INFO: renamed from: n */
    public static final FontWeight f20300n;

    /* JADX INFO: renamed from: o */
    public static final FontWeight f20301o;

    /* JADX INFO: renamed from: p */
    public static final List f20302p;

    /* JADX INFO: renamed from: a */
    public final int f20303a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static FontWeight m6524a() {
            return FontWeight.f20301o;
        }
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        FontWeight fontWeight2 = new FontWeight(200);
        FontWeight fontWeight3 = new FontWeight(300);
        FontWeight fontWeight4 = new FontWeight(CarouselScreenFragment.CAROUSEL_ANIMATION_MS);
        f20293b = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(ServiceStarter.ERROR_UNKNOWN);
        f20294c = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        f20295d = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        FontWeight fontWeight8 = new FontWeight(800);
        f20296f = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        f20297g = fontWeight3;
        f20298i = fontWeight4;
        f20299j = fontWeight5;
        f20300n = fontWeight6;
        f20301o = fontWeight7;
        f20302p = CollectionsKt.m18414O(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    public FontWeight(int i) {
        this.f20303a = i;
        boolean z2 = false;
        if (1 <= i && i < 1001) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        InlineClassHelperKt.m6567a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    /* JADX INFO: renamed from: a */
    public final int m6523a(FontWeight fontWeight) {
        return Intrinsics.m18601i(this.f20303a, fontWeight.f20303a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(FontWeight fontWeight) {
        return m6523a(fontWeight);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FontWeight) {
            return this.f20303a == ((FontWeight) obj).f20303a;
        }
        return false;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF20303a() {
        return this.f20303a;
    }

    public final String toString() {
        return AbstractC0000a.m17n(new StringBuilder("FontWeight(weight="), this.f20303a, ')');
    }
}
