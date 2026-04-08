package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import androidx.compose.animation.AbstractC0455a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class Shimmer {

    /* JADX INFO: renamed from: a */
    public final float[] f42128a = new float[4];

    /* JADX INFO: renamed from: b */
    public final int[] f42129b = new int[4];

    /* JADX INFO: renamed from: c */
    public int f42130c;

    /* JADX INFO: renamed from: d */
    public int f42131d;

    /* JADX INFO: renamed from: e */
    public int f42132e;

    /* JADX INFO: renamed from: f */
    public int f42133f;

    /* JADX INFO: renamed from: g */
    public int f42134g;

    /* JADX INFO: renamed from: h */
    public int f42135h;

    /* JADX INFO: renamed from: i */
    public float f42136i;

    /* JADX INFO: renamed from: j */
    public float f42137j;

    /* JADX INFO: renamed from: k */
    public float f42138k;

    /* JADX INFO: renamed from: l */
    public float f42139l;

    /* JADX INFO: renamed from: m */
    public float f42140m;

    /* JADX INFO: renamed from: n */
    public boolean f42141n;

    /* JADX INFO: renamed from: o */
    public boolean f42142o;

    /* JADX INFO: renamed from: p */
    public boolean f42143p;

    /* JADX INFO: renamed from: q */
    public int f42144q;

    /* JADX INFO: renamed from: r */
    public int f42145r;

    /* JADX INFO: renamed from: s */
    public long f42146s;

    /* JADX INFO: renamed from: t */
    public long f42147t;

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Builder<T extends Builder<T>> {

        /* JADX INFO: renamed from: a */
        public final Shimmer f42148a = new Shimmer();

        /* JADX INFO: renamed from: a */
        public final Shimmer m14307a() {
            Shimmer shimmer = this.f42148a;
            int i = shimmer.f42133f;
            int[] iArr = shimmer.f42129b;
            if (i != 1) {
                int i2 = shimmer.f42132e;
                iArr[0] = i2;
                int i3 = shimmer.f42131d;
                iArr[1] = i3;
                iArr[2] = i3;
                iArr[3] = i2;
            } else {
                int i4 = shimmer.f42131d;
                iArr[0] = i4;
                iArr[1] = i4;
                int i5 = shimmer.f42132e;
                iArr[2] = i5;
                iArr[3] = i5;
            }
            float[] fArr = shimmer.f42128a;
            if (i != 1) {
                fArr[0] = Math.max(((1.0f - shimmer.f42138k) - shimmer.f42139l) / 2.0f, 0.0f);
                fArr[1] = Math.max(((1.0f - shimmer.f42138k) - 0.001f) / 2.0f, 0.0f);
                fArr[2] = Math.min(((shimmer.f42138k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                fArr[3] = Math.min(((shimmer.f42138k + 1.0f) + shimmer.f42139l) / 2.0f, 1.0f);
                return shimmer;
            }
            fArr[0] = 0.0f;
            fArr[1] = Math.min(shimmer.f42138k, 1.0f);
            fArr[2] = Math.min(shimmer.f42138k + shimmer.f42139l, 1.0f);
            fArr[3] = 1.0f;
            return shimmer;
        }

        /* JADX INFO: renamed from: b */
        public Builder mo14308b(TypedArray typedArray) {
            boolean zHasValue = typedArray.hasValue(3);
            Shimmer shimmer = this.f42148a;
            if (zHasValue) {
                shimmer.f42141n = typedArray.getBoolean(3, shimmer.f42141n);
            }
            if (typedArray.hasValue(0)) {
                shimmer.f42142o = typedArray.getBoolean(0, shimmer.f42142o);
            }
            if (typedArray.hasValue(1)) {
                shimmer.f42132e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (shimmer.f42132e & 16777215);
            }
            if (typedArray.hasValue(11)) {
                m14310e(typedArray.getFloat(11, 1.0f));
            }
            if (typedArray.hasValue(7)) {
                m14309d(typedArray.getInt(7, (int) shimmer.f42146s));
            }
            if (typedArray.hasValue(14)) {
                shimmer.f42144q = typedArray.getInt(14, shimmer.f42144q);
            }
            if (typedArray.hasValue(15)) {
                m14312g(typedArray.getInt(15, (int) shimmer.f42147t));
            }
            if (typedArray.hasValue(16)) {
                shimmer.f42145r = typedArray.getInt(16, shimmer.f42145r);
            }
            if (typedArray.hasValue(5)) {
                int i = typedArray.getInt(5, shimmer.f42130c);
                if (i == 1) {
                    shimmer.f42130c = 1;
                } else if (i == 2) {
                    shimmer.f42130c = 2;
                } else if (i != 3) {
                    shimmer.f42130c = 0;
                } else {
                    shimmer.f42130c = 3;
                }
            }
            if (typedArray.hasValue(17)) {
                if (typedArray.getInt(17, shimmer.f42133f) != 1) {
                    shimmer.f42133f = 0;
                } else {
                    shimmer.f42133f = 1;
                }
            }
            if (typedArray.hasValue(6)) {
                float f = typedArray.getFloat(6, shimmer.f42139l);
                if (f < 0.0f) {
                    throw new IllegalArgumentException("Given invalid dropoff value: " + f);
                }
                shimmer.f42139l = f;
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(9, shimmer.f42134g);
                if (dimensionPixelSize < 0) {
                    throw new IllegalArgumentException(AbstractC0000a.m9f(dimensionPixelSize, "Given invalid width: "));
                }
                shimmer.f42134g = dimensionPixelSize;
            }
            if (typedArray.hasValue(8)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, shimmer.f42135h);
                if (dimensionPixelSize2 < 0) {
                    throw new IllegalArgumentException(AbstractC0000a.m9f(dimensionPixelSize2, "Given invalid height: "));
                }
                shimmer.f42135h = dimensionPixelSize2;
            }
            if (typedArray.hasValue(13)) {
                m14311f(typedArray.getFloat(13, shimmer.f42138k));
            }
            if (typedArray.hasValue(19)) {
                float f2 = typedArray.getFloat(19, shimmer.f42136i);
                if (f2 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid width ratio: " + f2);
                }
                shimmer.f42136i = f2;
            }
            if (typedArray.hasValue(10)) {
                float f3 = typedArray.getFloat(10, shimmer.f42137j);
                if (f3 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid height ratio: " + f3);
                }
                shimmer.f42137j = f3;
            }
            if (typedArray.hasValue(18)) {
                shimmer.f42140m = typedArray.getFloat(18, shimmer.f42140m);
            }
            return mo14306c();
        }

        /* JADX INFO: renamed from: c */
        public abstract Builder mo14306c();

        /* JADX INFO: renamed from: d */
        public final Builder m14309d(long j) {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "Given a negative duration: "));
            }
            this.f42148a.f42146s = j;
            return mo14306c();
        }

        /* JADX INFO: renamed from: e */
        public final Builder m14310e(float f) {
            int iMin = ((int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f)) << 24;
            Shimmer shimmer = this.f42148a;
            shimmer.f42131d = iMin | (shimmer.f42131d & 16777215);
            return mo14306c();
        }

        /* JADX INFO: renamed from: f */
        public final Builder m14311f(float f) {
            if (f >= 0.0f) {
                this.f42148a.f42138k = f;
                return mo14306c();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f);
        }

        /* JADX INFO: renamed from: g */
        public final Builder m14312g(long j) {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "Given a negative repeat delay: "));
            }
            this.f42148a.f42147t = j;
            return mo14306c();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Direction {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Shape {
    }

    public Shimmer() {
        new RectF();
        this.f42130c = 0;
        this.f42131d = -1;
        this.f42132e = 1291845631;
        this.f42133f = 0;
        this.f42134g = 0;
        this.f42135h = 0;
        this.f42136i = 1.0f;
        this.f42137j = 1.0f;
        this.f42138k = 0.0f;
        this.f42139l = 0.5f;
        this.f42140m = 20.0f;
        this.f42141n = true;
        this.f42142o = true;
        this.f42143p = true;
        this.f42144q = -1;
        this.f42145r = 1;
        this.f42146s = 1000L;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AlphaHighlightBuilder extends Builder<AlphaHighlightBuilder> {
        public AlphaHighlightBuilder() {
            this.f42148a.f42143p = true;
        }

        @Override // com.facebook.shimmer.Shimmer.Builder
        /* JADX INFO: renamed from: c */
        public final Builder mo14306c() {
            return this;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ColorHighlightBuilder extends Builder<ColorHighlightBuilder> {
        @Override // com.facebook.shimmer.Shimmer.Builder
        /* JADX INFO: renamed from: b */
        public final Builder mo14308b(TypedArray typedArray) {
            super.mo14308b(typedArray);
            boolean zHasValue = typedArray.hasValue(2);
            Shimmer shimmer = this.f42148a;
            if (zHasValue) {
                shimmer.f42132e = (typedArray.getColor(2, shimmer.f42132e) & 16777215) | (shimmer.f42132e & (-16777216));
            }
            if (typedArray.hasValue(12)) {
                shimmer.f42131d = typedArray.getColor(12, shimmer.f42131d);
            }
            return this;
        }

        @Override // com.facebook.shimmer.Shimmer.Builder
        /* JADX INFO: renamed from: c */
        public final Builder mo14306c() {
            return this;
        }
    }
}
