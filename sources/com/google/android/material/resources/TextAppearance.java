package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.C3734R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public class TextAppearance {
    private static final String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    private Typeface font;

    @Nullable
    public final String fontFamily;

    @FontRes
    private final int fontFamilyResourceId;
    private boolean fontResolved = false;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;

    @Nullable
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;

    @Nullable
    private ColorStateList textColor;

    @Nullable
    public final ColorStateList textColorHint;

    @Nullable
    public final ColorStateList textColorLink;
    private float textSize;
    public final int textStyle;
    public final int typeface;

    /* JADX INFO: renamed from: com.google.android.material.resources.TextAppearance$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C39291 extends ResourcesCompat.FontCallback {
        final /* synthetic */ TextAppearanceFontCallback val$callback;

        public C39291(TextAppearanceFontCallback textAppearanceFontCallback) {
            this.val$callback = textAppearanceFontCallback;
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrievalFailed(int i) {
            TextAppearance.access$102(TextAppearance.this, true);
            this.val$callback.onFontRetrievalFailed(i);
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrieved(@NonNull Typeface typeface) {
            TextAppearance textAppearance = TextAppearance.this;
            TextAppearance.access$002(textAppearance, Typeface.create(typeface, textAppearance.textStyle));
            TextAppearance.access$102(TextAppearance.this, true);
            this.val$callback.onFontRetrieved(TextAppearance.access$000(TextAppearance.this), false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.resources.TextAppearance$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C39302 extends TextAppearanceFontCallback {
        final /* synthetic */ TextAppearanceFontCallback val$callback;
        final /* synthetic */ Context val$context;
        final /* synthetic */ TextPaint val$textPaint;

        public C39302(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
            this.val$context = context;
            this.val$textPaint = textPaint;
            this.val$callback = textAppearanceFontCallback;
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i) {
            this.val$callback.onFontRetrievalFailed(i);
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(@NonNull Typeface typeface, boolean z2) {
            TextAppearance.this.updateTextPaintMeasureState(this.val$context, this.val$textPaint, typeface);
            this.val$callback.onFontRetrieved(typeface, z2);
        }
    }

    public TextAppearance(@NonNull Context context, @StyleRes int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C3734R.styleable.TextAppearance);
        setTextSize(typedArrayObtainStyledAttributes.getDimension(C3734R.styleable.TextAppearance_android_textSize, 0.0f));
        setTextColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C3734R.styleable.TextAppearance_android_textColor));
        this.textColorHint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C3734R.styleable.TextAppearance_android_textColorHint);
        this.textColorLink = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C3734R.styleable.TextAppearance_android_textColorLink);
        this.textStyle = typedArrayObtainStyledAttributes.getInt(C3734R.styleable.TextAppearance_android_textStyle, 0);
        this.typeface = typedArrayObtainStyledAttributes.getInt(C3734R.styleable.TextAppearance_android_typeface, 1);
        int indexWithValue = MaterialResources.getIndexWithValue(typedArrayObtainStyledAttributes, C3734R.styleable.TextAppearance_fontFamily, C3734R.styleable.TextAppearance_android_fontFamily);
        this.fontFamilyResourceId = typedArrayObtainStyledAttributes.getResourceId(indexWithValue, 0);
        this.fontFamily = typedArrayObtainStyledAttributes.getString(indexWithValue);
        this.textAllCaps = typedArrayObtainStyledAttributes.getBoolean(C3734R.styleable.TextAppearance_textAllCaps, false);
        this.shadowColor = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C3734R.styleable.TextAppearance_android_shadowColor);
        this.shadowDx = typedArrayObtainStyledAttributes.getFloat(C3734R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.shadowDy = typedArrayObtainStyledAttributes.getFloat(C3734R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.shadowRadius = typedArrayObtainStyledAttributes.getFloat(C3734R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, C3734R.styleable.MaterialTextAppearance);
        this.hasLetterSpacing = typedArrayObtainStyledAttributes2.hasValue(C3734R.styleable.MaterialTextAppearance_android_letterSpacing);
        this.letterSpacing = typedArrayObtainStyledAttributes2.getFloat(C3734R.styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public static /* synthetic */ Typeface access$000(TextAppearance textAppearance) {
        return textAppearance.font;
    }

    public static /* synthetic */ Typeface access$002(TextAppearance textAppearance, Typeface typeface) {
        textAppearance.font = typeface;
        return typeface;
    }

    public static /* synthetic */ boolean access$102(TextAppearance textAppearance, boolean z2) {
        textAppearance.fontResolved = z2;
        return z2;
    }

    private void createFallbackFont() {
        String str;
        if (this.font == null && (str = this.fontFamily) != null) {
            this.font = Typeface.create(str, this.textStyle);
        }
        if (this.font == null) {
            int i = this.typeface;
            if (i == 1) {
                this.font = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.font = Typeface.SERIF;
            } else if (i != 3) {
                this.font = Typeface.DEFAULT;
            } else {
                this.font = Typeface.MONOSPACE;
            }
            this.font = Typeface.create(this.font, this.textStyle);
        }
    }

    private boolean shouldLoadFontSynchronously(Context context) {
        if (TextAppearanceConfig.shouldLoadFontSynchronously()) {
            return true;
        }
        int i = this.fontFamilyResourceId;
        Typeface typefaceM7542c = null;
        if (i != 0) {
            ThreadLocal threadLocal = ResourcesCompat.f23171a;
            if (!context.isRestricted()) {
                typefaceM7542c = ResourcesCompat.m7542c(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM7542c != null;
    }

    public Typeface getFallbackFont() {
        createFallbackFont();
        return this.font;
    }

    @NonNull
    @VisibleForTesting
    public Typeface getFont(@NonNull Context context) {
        if (this.fontResolved) {
            return this.font;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM7541b = ResourcesCompat.m7541b(context, this.fontFamilyResourceId);
                this.font = typefaceM7541b;
                if (typefaceM7541b != null) {
                    this.font = Typeface.create(typefaceM7541b, this.textStyle);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d(TAG, "Error loading font " + this.fontFamily, e);
            }
        }
        createFallbackFont();
        this.fontResolved = true;
        return this.font;
    }

    public void getFontAsync(@NonNull Context context, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        if (shouldLoadFontSynchronously(context)) {
            getFont(context);
        } else {
            createFallbackFont();
        }
        int i = this.fontFamilyResourceId;
        if (i == 0) {
            this.fontResolved = true;
        }
        if (this.fontResolved) {
            textAppearanceFontCallback.onFontRetrieved(this.font, true);
            return;
        }
        try {
            C39291 c39291 = new C39291(textAppearanceFontCallback);
            ThreadLocal threadLocal = ResourcesCompat.f23171a;
            if (context.isRestricted()) {
                c39291.callbackFailAsync(-4, null);
            } else {
                ResourcesCompat.m7542c(context, i, new TypedValue(), 0, c39291, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.fontResolved = true;
            textAppearanceFontCallback.onFontRetrievalFailed(1);
        } catch (Exception e) {
            Log.d(TAG, "Error loading font " + this.fontFamily, e);
            this.fontResolved = true;
            textAppearanceFontCallback.onFontRetrievalFailed(-3);
        }
    }

    @Nullable
    public ColorStateList getTextColor() {
        return this.textColor;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        this.textColor = colorStateList;
    }

    public void setTextSize(float f) {
        this.textSize = f;
    }

    public void updateDrawState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        updateMeasureState(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.textColor;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.shadowRadius;
        float f2 = this.shadowDx;
        float f3 = this.shadowDy;
        ColorStateList colorStateList2 = this.shadowColor;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void updateMeasureState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        if (shouldLoadFontSynchronously(context)) {
            updateTextPaintMeasureState(context, textPaint, getFont(context));
        } else {
            getFontAsync(context, textPaint, textAppearanceFontCallback);
        }
    }

    public void updateTextPaintMeasureState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(context, typeface);
        if (typefaceMaybeCopyWithFontWeightAdjustment != null) {
            typeface = typefaceMaybeCopyWithFontWeightAdjustment;
        }
        textPaint.setTypeface(typeface);
        int i = this.textStyle & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.textSize);
        if (this.hasLetterSpacing) {
            textPaint.setLetterSpacing(this.letterSpacing);
        }
    }

    public void getFontAsync(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        updateTextPaintMeasureState(context, textPaint, getFallbackFont());
        getFontAsync(context, new C39302(context, textPaint, textAppearanceFontCallback));
    }
}
