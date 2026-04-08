package androidx.compose.p013ui.layout;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/layout/ContentScale;", "", "Companion", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface ContentScale {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/layout/ContentScale$Companion;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final ContentScale$Companion$Crop$1 f18447a = new ContentScale$Companion$Crop$1();

        /* JADX INFO: renamed from: b */
        public static final ContentScale$Companion$Fit$1 f18448b = new ContentScale$Companion$Fit$1();

        /* JADX INFO: renamed from: c */
        public static final ContentScale$Companion$FillHeight$1 f18449c = new ContentScale$Companion$FillHeight$1();

        /* JADX INFO: renamed from: d */
        public static final ContentScale$Companion$FillWidth$1 f18450d = new ContentScale$Companion$FillWidth$1();

        /* JADX INFO: renamed from: e */
        public static final ContentScale$Companion$Inside$1 f18451e = new ContentScale$Companion$Inside$1();

        /* JADX INFO: renamed from: f */
        public static final FixedScale f18452f = new FixedScale();
    }

    /* JADX INFO: renamed from: a */
    long mo5607a(long j, long j2);
}
