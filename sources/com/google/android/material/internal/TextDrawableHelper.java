package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public class TextDrawableHelper {

    @Nullable
    private TextAppearance textAppearance;
    private float textHeight;
    private float textWidth;
    private final TextPaint textPaint = new TextPaint(1);
    private final TextAppearanceFontCallback fontCallback = new C38861();
    private boolean textSizeDirty = true;

    @Nullable
    private WeakReference<TextDrawableDelegate> delegate = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.google.android.material.internal.TextDrawableHelper$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C38861 extends TextAppearanceFontCallback {
        public C38861() {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i) {
            TextDrawableHelper.access$002(TextDrawableHelper.this, true);
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.access$100(TextDrawableHelper.this).get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.onTextSizeChange();
            }
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(@NonNull Typeface typeface, boolean z2) {
            if (z2) {
                return;
            }
            TextDrawableHelper.access$002(TextDrawableHelper.this, true);
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.access$100(TextDrawableHelper.this).get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.onTextSizeChange();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TextDrawableDelegate {
        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    public TextDrawableHelper(@Nullable TextDrawableDelegate textDrawableDelegate) {
        setDelegate(textDrawableDelegate);
    }

    public static /* synthetic */ boolean access$002(TextDrawableHelper textDrawableHelper, boolean z2) {
        textDrawableHelper.textSizeDirty = z2;
        return z2;
    }

    public static /* synthetic */ WeakReference access$100(TextDrawableHelper textDrawableHelper) {
        return textDrawableHelper.delegate;
    }

    private float calculateTextHeight(@Nullable String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.textPaint.getFontMetrics().ascent);
    }

    private float calculateTextWidth(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private void refreshTextDimens(String str) {
        this.textWidth = calculateTextWidth(str);
        this.textHeight = calculateTextHeight(str);
        this.textSizeDirty = false;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.textAppearance;
    }

    public float getTextHeight(@Nullable String str) {
        if (!this.textSizeDirty) {
            return this.textHeight;
        }
        refreshTextDimens(str);
        return this.textHeight;
    }

    @NonNull
    public TextPaint getTextPaint() {
        return this.textPaint;
    }

    public float getTextWidth(String str) {
        if (!this.textSizeDirty) {
            return this.textWidth;
        }
        refreshTextDimens(str);
        return this.textWidth;
    }

    public boolean isTextWidthDirty() {
        return this.textSizeDirty;
    }

    public void setDelegate(@Nullable TextDrawableDelegate textDrawableDelegate) {
        this.delegate = new WeakReference<>(textDrawableDelegate);
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance, Context context) {
        if (this.textAppearance != textAppearance) {
            this.textAppearance = textAppearance;
            if (textAppearance != null) {
                textAppearance.updateMeasureState(context, this.textPaint, this.fontCallback);
                TextDrawableDelegate textDrawableDelegate = this.delegate.get();
                if (textDrawableDelegate != null) {
                    this.textPaint.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.updateDrawState(context, this.textPaint, this.fontCallback);
                this.textSizeDirty = true;
            }
            TextDrawableDelegate textDrawableDelegate2 = this.delegate.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.onTextSizeChange();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }

    public void setTextSizeDirty(boolean z2) {
        this.textSizeDirty = z2;
    }

    public void setTextWidthDirty(boolean z2) {
        this.textSizeDirty = z2;
    }

    public void updateTextPaintDrawState(Context context) {
        this.textAppearance.updateDrawState(context, this.textPaint, this.fontCallback);
    }
}
