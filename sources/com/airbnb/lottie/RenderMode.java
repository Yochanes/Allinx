package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class RenderMode {

    /* JADX INFO: renamed from: a */
    public static final RenderMode f34108a;

    /* JADX INFO: renamed from: b */
    public static final RenderMode f34109b;

    /* JADX INFO: renamed from: c */
    public static final RenderMode f34110c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ RenderMode[] f34111d;

    /* JADX INFO: renamed from: com.airbnb.lottie.RenderMode$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C23931 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34112a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f34112a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34112a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34112a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        RenderMode renderMode = new RenderMode("AUTOMATIC", 0);
        f34108a = renderMode;
        RenderMode renderMode2 = new RenderMode("HARDWARE", 1);
        f34109b = renderMode2;
        RenderMode renderMode3 = new RenderMode("SOFTWARE", 2);
        f34110c = renderMode3;
        f34111d = new RenderMode[]{renderMode, renderMode2, renderMode3};
    }

    public static RenderMode valueOf(String str) {
        return (RenderMode) Enum.valueOf(RenderMode.class, str);
    }

    public static RenderMode[] values() {
        return (RenderMode[]) f34111d.clone();
    }
}
