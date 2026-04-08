package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.RequiresApi;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.accessibility.AbstractC1465b;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class UnprecomputeTextOnModificationSpannable implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f24347a = false;

    /* JADX INFO: renamed from: b */
    public Spannable f24348b;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class CharSequenceHelper_API24 {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class PrecomputedTextDetector {
        /* JADX INFO: renamed from: a */
        public boolean mo8818a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class PrecomputedTextDetector_28 extends PrecomputedTextDetector {
        @Override // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
        /* JADX INFO: renamed from: a */
        public final boolean mo8818a(CharSequence charSequence) {
            return AbstractC1465b.m8049A(charSequence) || (charSequence instanceof PrecomputedTextCompat);
        }
    }

    public UnprecomputeTextOnModificationSpannable(Spannable spannable) {
        this.f24348b = spannable;
    }

    /* JADX INFO: renamed from: a */
    public final void m8817a() {
        Spannable spannable = this.f24348b;
        if (!this.f24347a) {
            if ((Build.VERSION.SDK_INT < 28 ? new PrecomputedTextDetector() : new PrecomputedTextDetector_28()).mo8818a(spannable)) {
                this.f24348b = new SpannableString(spannable);
            }
        }
        this.f24347a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f24348b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f24348b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f24348b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f24348b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f24348b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f24348b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f24348b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f24348b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f24348b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m8817a();
        this.f24348b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m8817a();
        this.f24348b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f24348b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f24348b.toString();
    }
}
