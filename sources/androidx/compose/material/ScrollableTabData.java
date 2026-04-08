package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/ScrollableTabData;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ScrollableTabData {

    /* JADX INFO: renamed from: a */
    public final ScrollState f11006a;

    /* JADX INFO: renamed from: b */
    public final CoroutineScope f11007b;

    public ScrollableTabData(CoroutineScope coroutineScope, ScrollState scrollState) {
        this.f11006a = scrollState;
        this.f11007b = coroutineScope;
    }
}
