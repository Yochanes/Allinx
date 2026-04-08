package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p010L.AbstractC0020a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class AppCompatTextViewAutoSizeHelper {

    /* JADX INFO: renamed from: l */
    public static final RectF f1220l = new RectF();

    /* JADX INFO: renamed from: m */
    public static final ConcurrentHashMap f1221m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public int f1222a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f1223b = false;

    /* JADX INFO: renamed from: c */
    public float f1224c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f1225d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f1226e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f1227f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f1228g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f1229h;

    /* JADX INFO: renamed from: i */
    public final TextView f1230i;

    /* JADX INFO: renamed from: j */
    public final Context f1231j;

    /* JADX INFO: renamed from: k */
    public final Impl23 f1232k;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Api23Impl {
        @NonNull
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static StaticLayout m626a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i, int i2, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull Impl impl) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                impl.mo627a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl23 extends Impl {
        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        /* JADX INFO: renamed from: a */
        public void mo627a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) AppCompatTextViewAutoSizeHelper.m617e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl29 extends Impl23 {
        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        /* JADX INFO: renamed from: a */
        public void mo627a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(AbstractC0020a.m50d(textView));
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        /* JADX INFO: renamed from: b */
        public boolean mo628b(TextView textView) {
            return AbstractC0020a.m57k(textView);
        }
    }

    public AppCompatTextViewAutoSizeHelper(TextView textView) {
        this.f1230i = textView;
        this.f1231j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1232k = new Impl29();
        } else {
            this.f1232k = new Impl23();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m615b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static Method m616d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f1221m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m617e(Object obj, String str, Object obj2) {
        try {
            return m616d(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m618a() {
        if (m620f()) {
            if (this.f1223b) {
                if (this.f1230i.getMeasuredHeight() <= 0 || this.f1230i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1232k.mo628b(this.f1230i) ? 1048576 : (this.f1230i.getMeasuredWidth() - this.f1230i.getTotalPaddingLeft()) - this.f1230i.getTotalPaddingRight();
                int height = (this.f1230i.getHeight() - this.f1230i.getCompoundPaddingBottom()) - this.f1230i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1220l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM619c = m619c(rectF);
                        if (fM619c != this.f1230i.getTextSize()) {
                            m621g(fM619c, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f1223b = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m619c(RectF rectF) {
        CharSequence transformation;
        int length = this.f1227f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= i) {
            int i4 = (i3 + i) / 2;
            int i5 = this.f1227f[i4];
            TextView textView = this.f1230i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f1229h;
            if (textPaint == null) {
                this.f1229h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f1229h.set(textView.getPaint());
            this.f1229h.setTextSize(i5);
            StaticLayout staticLayoutM626a = Api23Impl.m626a(charSequence, (Layout.Alignment) m617e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f1230i, this.f1229h, this.f1232k);
            if ((maxLines == -1 || (staticLayoutM626a.getLineCount() <= maxLines && staticLayoutM626a.getLineEnd(staticLayoutM626a.getLineCount() - 1) == charSequence.length())) && staticLayoutM626a.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
        return this.f1227f[i2];
    }

    /* JADX INFO: renamed from: f */
    public final boolean m620f() {
        return m624j() && this.f1222a != 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m621g(float f, int i) {
        Context context = this.f1231j;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f1230i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f1223b = false;
                try {
                    Method methodM616d = m616d("nullLayouts");
                    if (methodM616d != null) {
                        methodM616d.invoke(textView, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m622h() {
        if (m624j() && this.f1222a == 1) {
            if (!this.f1228g || this.f1227f.length == 0) {
                int iFloor = ((int) Math.floor((this.f1226e - this.f1225d) / this.f1224c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f1224c) + this.f1225d);
                }
                this.f1227f = m615b(iArr);
            }
            this.f1223b = true;
        } else {
            this.f1223b = false;
        }
        return this.f1223b;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m623i() {
        boolean z2 = this.f1227f.length > 0;
        this.f1228g = z2;
        if (z2) {
            this.f1222a = 1;
            this.f1225d = r0[0];
            this.f1226e = r0[r1 - 1];
            this.f1224c = -1.0f;
        }
        return z2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m624j() {
        return !(this.f1230i instanceof AppCompatEditText);
    }

    /* JADX INFO: renamed from: k */
    public final void m625k(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f1222a = 1;
        this.f1225d = f;
        this.f1226e = f2;
        this.f1224c = f3;
        this.f1228g = false;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Impl {
        /* JADX INFO: renamed from: b */
        public boolean mo628b(TextView textView) {
            return ((Boolean) AppCompatTextViewAutoSizeHelper.m617e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }

        /* JADX INFO: renamed from: a */
        public void mo627a(StaticLayout.Builder builder, TextView textView) {
        }
    }
}
