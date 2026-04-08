package androidx.media3.p017ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.LanguageFeatureSpan;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public List f30109a;

    /* JADX INFO: renamed from: b */
    public CaptionStyleCompat f30110b;

    /* JADX INFO: renamed from: c */
    public float f30111c;

    /* JADX INFO: renamed from: d */
    public float f30112d;

    /* JADX INFO: renamed from: f */
    public boolean f30113f;

    /* JADX INFO: renamed from: g */
    public boolean f30114g;

    /* JADX INFO: renamed from: i */
    public int f30115i;

    /* JADX INFO: renamed from: j */
    public Output f30116j;

    /* JADX INFO: renamed from: n */
    public View f30117n;

    /* JADX INFO: compiled from: Proguard */
    public interface Output {
        /* JADX INFO: renamed from: a */
        void mo11095a(List list, CaptionStyleCompat captionStyleCompat, float f, float f2);
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30109a = Collections.EMPTY_LIST;
        this.f30110b = CaptionStyleCompat.f29815g;
        this.f30111c = 0.0533f;
        this.f30112d = 0.08f;
        this.f30113f = true;
        this.f30114g = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.f30116j = canvasSubtitleOutput;
        this.f30117n = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f30115i = 1;
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
        if (this.f30113f && this.f30114g) {
            return this.f30109a;
        }
        ArrayList arrayList = new ArrayList(this.f30109a.size());
        for (int i = 0; i < this.f30109a.size(); i++) {
            Cue.Builder builderM9455a = ((Cue) this.f30109a.get(i)).m9455a();
            if (!this.f30113f) {
                builderM9455a.f25549n = false;
                CharSequence charSequence = builderM9455a.f25536a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        builderM9455a.f25536a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = builderM9455a.f25536a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof LanguageFeatureSpan)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                SubtitleViewUtils.m11179a(builderM9455a);
            } else if (!this.f30114g) {
                SubtitleViewUtils.m11179a(builderM9455a);
            }
            arrayList.add(builderM9455a.m9457a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyle() {
        boolean zIsInEditMode = isInEditMode();
        CaptionStyleCompat captionStyleCompat = CaptionStyleCompat.f29815g;
        if (zIsInEditMode) {
            return captionStyleCompat;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            captionStyleCompat = new CaptionStyleCompat(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return captionStyleCompat;
    }

    private <T extends View & Output> void setView(T t) {
        removeView(this.f30117n);
        View view = this.f30117n;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).f30134b.destroy();
        }
        this.f30117n = t;
        this.f30116j = t;
        addView(t);
    }

    /* JADX INFO: renamed from: a */
    public final void m11176a() {
        setStyle(getUserCaptionStyle());
    }

    /* JADX INFO: renamed from: b */
    public final void m11177b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* JADX INFO: renamed from: c */
    public final void m11178c() {
        this.f30116j.mo11095a(getCuesWithStylingPreferencesApplied(), this.f30110b, this.f30111c, this.f30112d);
    }

    public void setApplyEmbeddedFontSizes(boolean z2) {
        this.f30114g = z2;
        m11178c();
    }

    public void setApplyEmbeddedStyles(boolean z2) {
        this.f30113f = z2;
        m11178c();
    }

    public void setBottomPaddingFraction(float f) {
        this.f30112d = f;
        m11178c();
    }

    public void setCues(@Nullable List<Cue> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f30109a = list;
        m11178c();
    }

    public void setFractionalTextSize(float f) {
        this.f30111c = f;
        m11178c();
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        this.f30110b = captionStyleCompat;
        m11178c();
    }

    public void setViewType(int i) {
        if (this.f30115i == i) {
            return;
        }
        if (i == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.f30115i = i;
    }
}
