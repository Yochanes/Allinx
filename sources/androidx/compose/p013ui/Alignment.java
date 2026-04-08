package androidx.compose.p013ui;

import androidx.compose.p013ui.BiasAlignment;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/Alignment;", "", "Companion", "Horizontal", "Vertical", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface Alignment {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/Alignment$Companion;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final BiasAlignment f17151a = new BiasAlignment(-1.0f, -1.0f);

        /* JADX INFO: renamed from: b */
        public static final BiasAlignment f17152b = new BiasAlignment(0.0f, -1.0f);

        /* JADX INFO: renamed from: c */
        public static final BiasAlignment f17153c = new BiasAlignment(1.0f, -1.0f);

        /* JADX INFO: renamed from: d */
        public static final BiasAlignment f17154d = new BiasAlignment(-1.0f, 0.0f);

        /* JADX INFO: renamed from: e */
        public static final BiasAlignment f17155e = new BiasAlignment(0.0f, 0.0f);

        /* JADX INFO: renamed from: f */
        public static final BiasAlignment f17156f = new BiasAlignment(1.0f, 0.0f);

        /* JADX INFO: renamed from: g */
        public static final BiasAlignment f17157g = new BiasAlignment(-1.0f, 1.0f);

        /* JADX INFO: renamed from: h */
        public static final BiasAlignment f17158h = new BiasAlignment(0.0f, 1.0f);

        /* JADX INFO: renamed from: i */
        public static final BiasAlignment f17159i = new BiasAlignment(1.0f, 1.0f);

        /* JADX INFO: renamed from: j */
        public static final BiasAlignment.Vertical f17160j = new BiasAlignment.Vertical(-1.0f);

        /* JADX INFO: renamed from: k */
        public static final BiasAlignment.Vertical f17161k = new BiasAlignment.Vertical(0.0f);

        /* JADX INFO: renamed from: l */
        public static final BiasAlignment.Vertical f17162l = new BiasAlignment.Vertical(1.0f);

        /* JADX INFO: renamed from: m */
        public static final BiasAlignment.Horizontal f17163m = new BiasAlignment.Horizontal(-1.0f);

        /* JADX INFO: renamed from: n */
        public static final BiasAlignment.Horizontal f17164n = new BiasAlignment.Horizontal(0.0f);

        /* JADX INFO: renamed from: o */
        public static final BiasAlignment.Horizontal f17165o = new BiasAlignment.Horizontal(1.0f);
    }

    /* JADX INFO: compiled from: Proguard */
    @Stable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/Alignment$Horizontal;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface Horizontal {
        /* JADX INFO: renamed from: a */
        int mo4858a(int i, int i2, LayoutDirection layoutDirection);
    }

    /* JADX INFO: compiled from: Proguard */
    @Stable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/Alignment$Vertical;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface Vertical {
        /* JADX INFO: renamed from: a */
        int mo4859a(int i, int i2);
    }

    /* JADX INFO: renamed from: a */
    long mo4857a(long j, long j2, LayoutDirection layoutDirection);
}
