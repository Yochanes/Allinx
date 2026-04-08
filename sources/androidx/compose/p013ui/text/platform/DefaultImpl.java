package androidx.compose.p013ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.emoji2.text.EmojiCompat;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/platform/DefaultImpl;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DefaultImpl implements EmojiCompatStatusDelegate {

    /* JADX INFO: renamed from: a */
    public State f20479a;

    /* JADX INFO: renamed from: a */
    public final State m6582a() {
        EmojiCompat emojiCompatM8782a = EmojiCompat.m8782a();
        if (emojiCompatM8782a.m8788d() == 1) {
            return new ImmutableBool(true);
        }
        MutableState mutableStateM4525g = SnapshotStateKt.m4525g(Boolean.FALSE);
        emojiCompatM8782a.m8792k(new DefaultImpl$getFontLoadState$initCallback$1(mutableStateM4525g, this));
        return mutableStateM4525g;
    }
}
