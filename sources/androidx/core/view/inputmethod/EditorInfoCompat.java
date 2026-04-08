package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.RequiresApi;
import androidx.core.content.p014pm.AbstractC1430a;
import androidx.core.os.BuildCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class EditorInfoCompat {

    /* JADX INFO: renamed from: a */
    public static final String[] f23544a = new String[0];

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
        /* JADX INFO: renamed from: a */
        public static void m8113a(EditorInfo editorInfo, CharSequence charSequence) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api35Impl {
        /* JADX INFO: renamed from: a */
        public static void m8114a(EditorInfo editorInfo, boolean z2) {
            editorInfo.setStylusHandwritingEnabled(z2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8109a(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            AbstractC1430a.m7521h(editorInfo, strArr);
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* JADX INFO: renamed from: b */
    public static void m8110b(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            Api30Impl.m8113a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            Api30Impl.m8113a(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            m8112d(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            m8112d(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m8112d(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        m8112d(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: c */
    public static void m8111c(EditorInfo editorInfo, boolean z2) {
        if (BuildCompat.m7632b()) {
            Api35Impl.m8114a(editorInfo, z2);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z2);
    }

    /* JADX INFO: renamed from: d */
    public static void m8112d(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
