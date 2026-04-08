package androidx.compose.p013ui.text;

import androidx.collection.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/TextLayoutCache;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextLayoutCache {

    /* JADX INFO: renamed from: a */
    public final LruCache f20088a;

    /* JADX INFO: renamed from: b */
    public CacheTextLayoutInput f20089b;

    /* JADX INFO: renamed from: c */
    public TextLayoutResult f20090c;

    public TextLayoutCache(int i) {
        this.f20088a = i != 1 ? new LruCache(i) : null;
    }
}
