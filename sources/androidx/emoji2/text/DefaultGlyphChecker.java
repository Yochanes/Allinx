package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RestrictTo
class DefaultGlyphChecker implements EmojiCompat.GlyphChecker {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f24276b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final TextPaint f24277a;

    public DefaultGlyphChecker() {
        TextPaint textPaint = new TextPaint();
        this.f24277a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
