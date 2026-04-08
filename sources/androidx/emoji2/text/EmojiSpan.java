package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataItem;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public abstract class EmojiSpan extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final TypefaceEmojiRasterizer f24318b;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f24317a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public short f24319c = -1;

    /* JADX INFO: renamed from: d */
    public float f24320d = 1.0f;

    public EmojiSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        Preconditions.m7698e(typefaceEmojiRasterizer, "rasterizer cannot be null");
        this.f24318b = typefaceEmojiRasterizer;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f24317a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        TypefaceEmojiRasterizer typefaceEmojiRasterizer = this.f24318b;
        this.f24320d = fAbs / (typefaceEmojiRasterizer.m8816b().m8830a(14) != 0 ? r8.f24373b.getShort(r1 + r8.f24372a) : (short) 0);
        MetadataItem metadataItemM8816b = typefaceEmojiRasterizer.m8816b();
        int iM8830a = metadataItemM8816b.m8830a(14);
        if (iM8830a != 0) {
            metadataItemM8816b.f24373b.getShort(iM8830a + metadataItemM8816b.f24372a);
        }
        short s = (short) ((typefaceEmojiRasterizer.m8816b().m8830a(12) != 0 ? r5.f24373b.getShort(r7 + r5.f24372a) : (short) 0) * this.f24320d);
        this.f24319c = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
