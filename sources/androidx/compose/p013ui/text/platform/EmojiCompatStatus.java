package androidx.compose.p013ui.text.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.emoji2.text.EmojiCompat;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/platform/EmojiCompatStatus;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class EmojiCompatStatus implements EmojiCompatStatusDelegate {

    /* JADX INFO: renamed from: a */
    public static final EmojiCompatStatusDelegate f20483a;

    static {
        DefaultImpl defaultImpl = new DefaultImpl();
        defaultImpl.f20479a = EmojiCompat.m8785g() ? defaultImpl.m6582a() : null;
        f20483a = defaultImpl;
    }
}
