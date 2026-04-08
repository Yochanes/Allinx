package androidx.compose.p013ui.graphics;

import android.graphics.Paint;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, m18302d2 = {"Landroid/graphics/Paint;", "NativePaint", "ui-graphics_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidPaint_androidKt {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17553a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f17554b;

        static {
            try {
                new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr = new int[Paint.Cap.values().length];
            try {
                iArr[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f17553a = iArr;
            int[] iArr2 = new int[Paint.Join.values().length];
            try {
                iArr2[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f17554b = iArr2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AndroidPaint m5138a() {
        return new AndroidPaint(new Paint(7));
    }
}
