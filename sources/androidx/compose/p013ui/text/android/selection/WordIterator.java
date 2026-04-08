package androidx.compose.p013ui.text.android.selection;

import androidx.compose.p013ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.emoji2.text.EmojiCompat;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "Companion", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class WordIterator {

    /* JADX INFO: renamed from: a */
    public final CharSequence f20174a;

    /* JADX INFO: renamed from: b */
    public final int f20175b;

    /* JADX INFO: renamed from: c */
    public final int f20176c;

    /* JADX INFO: renamed from: d */
    public final BreakIterator f20177d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "", "WINDOW_WIDTH", "I", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static boolean m6501a(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public WordIterator(CharSequence charSequence, int i, Locale locale) {
        this.f20174a = charSequence;
        if (charSequence.length() < 0) {
            InlineClassHelperKt.m6567a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            InlineClassHelperKt.m6567a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f20177d = wordInstance;
        this.f20175b = Math.max(0, -50);
        this.f20176c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i));
    }

    /* JADX INFO: renamed from: a */
    public final void m6492a(int i) {
        boolean z2 = false;
        int i2 = this.f20175b;
        int i3 = this.f20176c;
        if (i <= i3 && i2 <= i) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        StringBuilder sbM24u = AbstractC0000a.m24u("Invalid offset: ", ". Valid range is [", " , ", i, i2);
        sbM24u.append(i3);
        sbM24u.append(']');
        InlineClassHelperKt.m6567a(sbM24u.toString());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6493b(int i) {
        int i2 = this.f20175b + 1;
        if (i > this.f20176c || i2 > i) {
            return false;
        }
        CharSequence charSequence = this.f20174a;
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!EmojiCompat.m8785g()) {
                    return false;
                }
                EmojiCompat emojiCompatM8782a = EmojiCompat.m8782a();
                if (emojiCompatM8782a.m8788d() != 1 || emojiCompatM8782a.m8787c(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6494c(int i) {
        int i2 = this.f20175b + 1;
        if (i > this.f20176c || i2 > i) {
            return false;
        }
        return Companion.m6501a(Character.codePointBefore(this.f20174a, i));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6495d(int i) {
        m6492a(i);
        if (!this.f20177d.isBoundary(i)) {
            return false;
        }
        if (m6497f(i) && m6497f(i - 1) && m6497f(i + 1)) {
            return false;
        }
        return i <= 0 || i >= this.f20174a.length() - 1 || !(m6496e(i) || m6496e(i + 1));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6496e(int i) {
        int i2 = i - 1;
        CharSequence charSequence = this.f20174a;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (Intrinsics.m18594b(unicodeBlockOf, unicodeBlock) && Intrinsics.m18594b(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.m18594b(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && Intrinsics.m18594b(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6497f(int i) {
        if (i >= this.f20176c || this.f20175b > i) {
            return false;
        }
        CharSequence charSequence = this.f20174a;
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!EmojiCompat.m8785g()) {
                return false;
            }
            EmojiCompat emojiCompatM8782a = EmojiCompat.m8782a();
            if (emojiCompatM8782a.m8788d() != 1 || emojiCompatM8782a.m8787c(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6498g(int i) {
        if (i >= this.f20176c || this.f20175b > i) {
            return false;
        }
        return Companion.m6501a(Character.codePointAt(this.f20174a, i));
    }

    /* JADX INFO: renamed from: h */
    public final int m6499h(int i) {
        m6492a(i);
        int iFollowing = this.f20177d.following(i);
        return (m6497f(iFollowing + (-1)) && m6497f(iFollowing) && !m6496e(iFollowing)) ? m6499h(iFollowing) : iFollowing;
    }

    /* JADX INFO: renamed from: i */
    public final int m6500i(int i) {
        m6492a(i);
        int iPreceding = this.f20177d.preceding(i);
        return (m6497f(iPreceding) && m6493b(iPreceding) && !m6496e(iPreceding)) ? m6500i(iPreceding) : iPreceding;
    }
}
