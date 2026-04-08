package com.exchange.allin.p024ui.page.spot;

import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"com/exchange/allin/ui/page/spot/SpotPageKt$SpotPage$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SpotPageKt$SpotPage$nestedScrollConnection$1 implements NestedScrollConnection {
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo21916onPostScrollDzOQY0M(long j, long j2, int i) {
        if (Float.intBitsToFloat((int) (4294967295L & j2)) >= 0.0f) {
            return 0L;
        }
        throw null;
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo21925onPreScrollOzD1aCk(long j, int i) {
        if (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f) {
            return 0L;
        }
        throw null;
    }
}
