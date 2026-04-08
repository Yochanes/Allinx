package androidx.media3.p017ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import androidx.media3.p017ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.Output {

    /* JADX INFO: renamed from: a */
    public final ArrayList f29810a;

    /* JADX INFO: renamed from: b */
    public List f29811b;

    /* JADX INFO: renamed from: c */
    public float f29812c;

    /* JADX INFO: renamed from: d */
    public CaptionStyleCompat f29813d;

    /* JADX INFO: renamed from: f */
    public float f29814f;

    public CanvasSubtitleOutput(Context context) {
        super(context, null);
        this.f29810a = new ArrayList();
        this.f29811b = Collections.EMPTY_LIST;
        this.f29812c = 0.0533f;
        this.f29813d = CaptionStyleCompat.f29815g;
        this.f29814f = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    /* JADX INFO: renamed from: a */
    public final void mo11095a(List list, CaptionStyleCompat captionStyleCompat, float f, float f2) {
        this.f29811b = list;
        this.f29813d = captionStyleCompat;
        this.f29812c = f;
        this.f29814f = f2;
        while (true) {
            ArrayList arrayList = this.f29810a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new SubtitlePainter(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x046c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        float f2;
        int i4;
        int i5;
        int i6;
        boolean z2;
        float f3;
        int i7;
        float f4;
        TextPaint textPaint;
        int i8;
        int iMax;
        int iMin;
        int iRound;
        CanvasSubtitleOutput canvasSubtitleOutput = this;
        List list = canvasSubtitleOutput.f29811b;
        if (list.isEmpty()) {
            return;
        }
        int height = canvasSubtitleOutput.getHeight();
        int paddingLeft = canvasSubtitleOutput.getPaddingLeft();
        int paddingTop = canvasSubtitleOutput.getPaddingTop();
        int width = canvasSubtitleOutput.getWidth() - canvasSubtitleOutput.getPaddingRight();
        int paddingBottom = height - canvasSubtitleOutput.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i9 = paddingBottom - paddingTop;
        float fM11180b = SubtitleViewUtils.m11180b(canvasSubtitleOutput.f29812c, 0, height, i9);
        float f5 = 0.0f;
        if (fM11180b <= 0.0f) {
            return;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            Cue cueM9457a = (Cue) list.get(i10);
            float f6 = f5;
            if (cueM9457a.f25534p != Integer.MIN_VALUE) {
                Cue.Builder builderM9455a = cueM9457a.m9455a();
                builderM9455a.f25543h = -3.4028235E38f;
                builderM9455a.f25544i = Integer.MIN_VALUE;
                builderM9455a.f25538c = null;
                int i11 = cueM9457a.f25524f;
                f = -3.4028235E38f;
                float f7 = cueM9457a.f25523e;
                if (i11 == 0) {
                    builderM9455a.f25540e = 1.0f - f7;
                    builderM9455a.f25541f = 0;
                } else {
                    builderM9455a.f25540e = (-f7) - 1.0f;
                    builderM9455a.f25541f = 1;
                }
                int i12 = cueM9457a.f25525g;
                if (i12 == 0) {
                    builderM9455a.f25542g = 2;
                } else if (i12 == 2) {
                    builderM9455a.f25542g = 0;
                }
                cueM9457a = builderM9455a.m9457a();
            } else {
                f = -3.4028235E38f;
            }
            float fM11180b2 = SubtitleViewUtils.m11180b(cueM9457a.f25533o, cueM9457a.f25532n, height, i9);
            SubtitlePainter subtitlePainter = (SubtitlePainter) canvasSubtitleOutput.f29810a.get(i10);
            CaptionStyleCompat captionStyleCompat = canvasSubtitleOutput.f29813d;
            List list2 = list;
            float f8 = canvasSubtitleOutput.f29814f;
            subtitlePainter.getClass();
            Bitmap bitmap = cueM9457a.f25522d;
            int i13 = height;
            boolean z3 = bitmap == null;
            int i14 = i9;
            CharSequence charSequence = cueM9457a.f25519a;
            if (!z3) {
                i = size;
                i2 = -16777216;
            } else if (TextUtils.isEmpty(charSequence)) {
                i5 = paddingLeft;
                i6 = paddingTop;
                f2 = fM11180b;
                i = size;
                i3 = i10;
                z2 = false;
                i10 = i3 + 1;
                canvasSubtitleOutput = this;
                f5 = f6;
                list = list2;
                height = i13;
                i9 = i14;
                size = i;
                fM11180b = f2;
                paddingLeft = i5;
                paddingTop = i6;
            } else {
                i = size;
                i2 = cueM9457a.f25530l ? cueM9457a.f25531m : captionStyleCompat.f29818c;
            }
            i3 = i10;
            CharSequence charSequence2 = subtitlePainter.f30091i;
            TextPaint textPaint2 = subtitlePainter.f30088f;
            float f9 = cueM9457a.f25529k;
            f2 = fM11180b;
            float f10 = cueM9457a.f25528j;
            int i15 = cueM9457a.f25527i;
            float f11 = cueM9457a.f25526h;
            int i16 = cueM9457a.f25525g;
            int i17 = cueM9457a.f25524f;
            float f12 = cueM9457a.f25523e;
            Layout.Alignment alignment = cueM9457a.f25520b;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && Objects.equals(subtitlePainter.f30092j, alignment) && subtitlePainter.f30093k == bitmap && subtitlePainter.f30094l == f12 && subtitlePainter.f30095m == i17) {
                i4 = i16;
                if (Integer.valueOf(subtitlePainter.f30096n).equals(Integer.valueOf(i4)) && subtitlePainter.f30097o == f11 && Integer.valueOf(subtitlePainter.f30098p).equals(Integer.valueOf(i15)) && subtitlePainter.f30099q == f10 && subtitlePainter.f30100r == f9 && subtitlePainter.f30101s == captionStyleCompat.f29816a && subtitlePainter.f30102t == captionStyleCompat.f29817b && subtitlePainter.f30103u == i2 && subtitlePainter.f30105w == captionStyleCompat.f29819d && subtitlePainter.f30104v == captionStyleCompat.f29820e && Objects.equals(textPaint2.getTypeface(), captionStyleCompat.f29821f) && subtitlePainter.f30106x == f2 && subtitlePainter.f30107y == fM11180b2 && subtitlePainter.f30108z == f8 && subtitlePainter.f30073A == paddingLeft && subtitlePainter.f30074B == paddingTop && subtitlePainter.f30075C == width && subtitlePainter.f30076D == paddingBottom) {
                    subtitlePainter.m11175a(canvas, z3);
                    i5 = paddingLeft;
                    i6 = paddingTop;
                    z2 = false;
                    i10 = i3 + 1;
                    canvasSubtitleOutput = this;
                    f5 = f6;
                    list = list2;
                    height = i13;
                    i9 = i14;
                    size = i;
                    fM11180b = f2;
                    paddingLeft = i5;
                    paddingTop = i6;
                }
            } else {
                i4 = i16;
            }
            subtitlePainter.f30091i = charSequence;
            subtitlePainter.f30092j = alignment;
            subtitlePainter.f30093k = bitmap;
            subtitlePainter.f30094l = f12;
            subtitlePainter.f30095m = i17;
            subtitlePainter.f30096n = i4;
            subtitlePainter.f30097o = f11;
            subtitlePainter.f30098p = i15;
            subtitlePainter.f30099q = f10;
            subtitlePainter.f30100r = f9;
            subtitlePainter.f30101s = captionStyleCompat.f29816a;
            subtitlePainter.f30102t = captionStyleCompat.f29817b;
            subtitlePainter.f30103u = i2;
            subtitlePainter.f30105w = captionStyleCompat.f29819d;
            subtitlePainter.f30104v = captionStyleCompat.f29820e;
            textPaint2.setTypeface(captionStyleCompat.f29821f);
            subtitlePainter.f30106x = f2;
            subtitlePainter.f30107y = fM11180b2;
            subtitlePainter.f30108z = f8;
            subtitlePainter.f30073A = paddingLeft;
            subtitlePainter.f30074B = paddingTop;
            subtitlePainter.f30075C = width;
            subtitlePainter.f30076D = paddingBottom;
            if (z3) {
                subtitlePainter.f30091i.getClass();
                CharSequence charSequence3 = subtitlePainter.f30091i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(subtitlePainter.f30091i);
                int i18 = subtitlePainter.f30075C - subtitlePainter.f30073A;
                int i19 = subtitlePainter.f30076D - subtitlePainter.f30074B;
                textPaint2.setTextSize(subtitlePainter.f30106x);
                int i20 = (int) ((subtitlePainter.f30106x * 0.125f) + 0.5f);
                int i21 = i20 * 2;
                int i22 = i18 - i21;
                float f13 = subtitlePainter.f30099q;
                if (f13 != f) {
                    i22 = (int) (i22 * f13);
                }
                int i23 = i22;
                if (i23 <= 0) {
                    Log.m9511g("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f2 = f2;
                    i5 = paddingLeft;
                    i6 = paddingTop;
                } else {
                    f2 = f2;
                    if (subtitlePainter.f30107y > f6) {
                        textPaint = textPaint2;
                        i5 = paddingLeft;
                        i8 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) subtitlePainter.f30107y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        textPaint = textPaint2;
                        i5 = paddingLeft;
                        i8 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (subtitlePainter.f30105w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i8, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i24 = 0;
                        for (int length = foregroundColorSpanArr.length; i24 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i24]);
                            i24++;
                        }
                    }
                    if (Color.alpha(subtitlePainter.f30102t) > 0) {
                        int i25 = subtitlePainter.f30105w;
                        if (i25 == 0 || i25 == 2) {
                            i6 = paddingTop;
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(subtitlePainter.f30102t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            i6 = paddingTop;
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(subtitlePainter.f30102t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    } else {
                        i6 = paddingTop;
                    }
                    Layout.Alignment alignment2 = subtitlePainter.f30092j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, textPaint, i23, alignment3, subtitlePainter.f30086d, subtitlePainter.f30087e, true);
                    subtitlePainter.f30077E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = subtitlePainter.f30077E.getLineCount();
                    int i26 = 0;
                    int iMax2 = 0;
                    while (i26 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(subtitlePainter.f30077E.getLineWidth(i26)), iMax2);
                        i26++;
                        height2 = height2;
                        lineCount = lineCount;
                        spannableStringBuilder2 = spannableStringBuilder2;
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    int i27 = height2;
                    int i28 = ((subtitlePainter.f30099q == f || iMax2 >= i23) ? iMax2 : i23) + i21;
                    float f14 = subtitlePainter.f30097o;
                    if (f14 != f) {
                        int iRound2 = Math.round(i18 * f14);
                        int i29 = subtitlePainter.f30073A;
                        int i30 = iRound2 + i29;
                        int i31 = subtitlePainter.f30098p;
                        if (i31 == 1) {
                            i30 = ((i30 * 2) - i28) / 2;
                        } else if (i31 == 2) {
                            i30 -= i28;
                        }
                        iMax = Math.max(i30, i29);
                        iMin = Math.min(iMax + i28, subtitlePainter.f30075C);
                    } else {
                        iMax = subtitlePainter.f30073A + ((i18 - i28) / 2);
                        iMin = iMax + i28;
                    }
                    int i32 = iMin - iMax;
                    if (i32 <= 0) {
                        Log.m9511g("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f15 = subtitlePainter.f30094l;
                        if (f15 != f) {
                            if (subtitlePainter.f30095m == 0) {
                                iRound = Math.round(i19 * f15) + subtitlePainter.f30074B;
                                int i33 = subtitlePainter.f30096n;
                                if (i33 == 2) {
                                    iRound -= i27;
                                } else if (i33 == 1) {
                                    iRound = ((iRound * 2) - i27) / 2;
                                }
                                z2 = false;
                            } else {
                                z2 = false;
                                int lineBottom = subtitlePainter.f30077E.getLineBottom(0) - subtitlePainter.f30077E.getLineTop(0);
                                float f16 = subtitlePainter.f30094l;
                                iRound = f16 >= f6 ? Math.round(f16 * lineBottom) + subtitlePainter.f30074B : (Math.round((f16 + 1.0f) * lineBottom) + subtitlePainter.f30076D) - i27;
                            }
                            int i34 = iRound + i27;
                            int i35 = subtitlePainter.f30076D;
                            if (i34 > i35) {
                                iRound = i35 - i27;
                            } else {
                                int i36 = subtitlePainter.f30074B;
                                if (iRound < i36) {
                                    iRound = i36;
                                }
                            }
                        } else {
                            z2 = false;
                            iRound = (subtitlePainter.f30076D - i27) - ((int) (i19 * subtitlePainter.f30108z));
                        }
                        subtitlePainter.f30077E = new StaticLayout(spannableStringBuilder3, textPaint, i32, alignment3, subtitlePainter.f30086d, subtitlePainter.f30087e, true);
                        subtitlePainter.f30078F = new StaticLayout(spannableStringBuilder4, textPaint, i32, alignment3, subtitlePainter.f30086d, subtitlePainter.f30087e, true);
                        subtitlePainter.f30079G = iMax;
                        subtitlePainter.f30080H = iRound;
                        subtitlePainter.f30081I = i20;
                    }
                }
                z2 = false;
            } else {
                f2 = f2;
                i5 = paddingLeft;
                i6 = paddingTop;
                z2 = false;
                subtitlePainter.f30093k.getClass();
                Bitmap bitmap2 = subtitlePainter.f30093k;
                int i37 = subtitlePainter.f30075C;
                int i38 = subtitlePainter.f30073A;
                int i39 = subtitlePainter.f30076D;
                int i40 = subtitlePainter.f30074B;
                float f17 = i37 - i38;
                float f18 = (subtitlePainter.f30097o * f17) + i38;
                float f19 = i39 - i40;
                float f20 = (subtitlePainter.f30094l * f19) + i40;
                int iRound3 = Math.round(f17 * subtitlePainter.f30099q);
                float f21 = subtitlePainter.f30100r;
                int iRound4 = f21 != f ? Math.round(f19 * f21) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound3);
                int i41 = subtitlePainter.f30098p;
                if (i41 == 2) {
                    f3 = iRound3;
                } else {
                    if (i41 == 1) {
                        f3 = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f18);
                    i7 = subtitlePainter.f30096n;
                    if (i7 != 2) {
                        f4 = iRound4;
                    } else {
                        if (i7 == 1) {
                            f4 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f20);
                        subtitlePainter.f30082J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f20 -= f4;
                    int iRound62 = Math.round(f20);
                    subtitlePainter.f30082J = new Rect(iRound5, iRound62, iRound3 + iRound5, iRound4 + iRound62);
                }
                f18 -= f3;
                int iRound52 = Math.round(f18);
                i7 = subtitlePainter.f30096n;
                if (i7 != 2) {
                }
                f20 -= f4;
                int iRound622 = Math.round(f20);
                subtitlePainter.f30082J = new Rect(iRound52, iRound622, iRound3 + iRound52, iRound4 + iRound622);
            }
            subtitlePainter.m11175a(canvas, z3);
            i10 = i3 + 1;
            canvasSubtitleOutput = this;
            f5 = f6;
            list = list2;
            height = i13;
            i9 = i14;
            size = i;
            fM11180b = f2;
            paddingLeft = i5;
            paddingTop = i6;
        }
    }
}
