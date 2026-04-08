package androidx.compose.p013ui.text.android;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/HorizontalPositionCache;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class HorizontalPositionCache {

    /* JADX INFO: renamed from: a */
    public final TextLayout f20127a;

    /* JADX INFO: renamed from: b */
    public int f20128b = -1;

    /* JADX INFO: renamed from: c */
    public float f20129c;

    public HorizontalPositionCache(TextLayout textLayout) {
        this.f20127a = textLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m6419a(int i, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i2 = 1;
        TextLayout textLayout = this.f20127a;
        if (z2) {
            int iM6420a = LayoutCompat_androidKt.m6420a(textLayout.f20155f, i, z2);
            z5 = i == textLayout.f20155f.getLineStart(iM6420a) || i == textLayout.m6439g(iM6420a);
        }
        int i3 = i * 4;
        if (!z4) {
            i2 = z5 ? 2 : 3;
        } else if (z5) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.f20128b == i4) {
            return this.f20129c;
        }
        float fM6441i = z4 ? textLayout.m6441i(i, z2) : textLayout.m6442j(i, z2);
        if (z3) {
            this.f20128b = i4;
            this.f20129c = fM6441i;
        }
        return fM6441i;
    }
}
