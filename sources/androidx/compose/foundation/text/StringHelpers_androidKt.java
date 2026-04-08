package androidx.compose.foundation.text;

import androidx.emoji2.text.EmojiCompat;
import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class StringHelpers_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m3243a(int i, String str) {
        EmojiCompat emojiCompatM8782a;
        Integer num = null;
        if (EmojiCompat.m8785g()) {
            emojiCompatM8782a = EmojiCompat.m8782a();
            if (emojiCompatM8782a.m8788d() != 1) {
                emojiCompatM8782a = null;
            }
        }
        if (emojiCompatM8782a != null) {
            int iM8786b = emojiCompatM8782a.m8786b(i, str);
            Integer numValueOf = Integer.valueOf(iM8786b);
            if (iM8786b != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m3244b(int i, String str) {
        EmojiCompat emojiCompatM8782a;
        Integer num = null;
        if (EmojiCompat.m8785g()) {
            emojiCompatM8782a = EmojiCompat.m8782a();
            if (emojiCompatM8782a.m8788d() != 1) {
                emojiCompatM8782a = null;
            }
        }
        if (emojiCompatM8782a != null) {
            int iM8787c = emojiCompatM8782a.m8787c(str, Math.max(0, i - 1));
            Integer numValueOf = Integer.valueOf(iM8787c);
            if (iM8787c != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }
}
