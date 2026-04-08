package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Mask {

    /* JADX INFO: renamed from: a */
    public final MaskMode f34563a;

    /* JADX INFO: renamed from: b */
    public final AnimatableShapeValue f34564b;

    /* JADX INFO: renamed from: c */
    public final AnimatableIntegerValue f34565c;

    /* JADX INFO: renamed from: d */
    public final boolean f34566d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class MaskMode {

        /* JADX INFO: renamed from: a */
        public static final MaskMode f34567a;

        /* JADX INFO: renamed from: b */
        public static final MaskMode f34568b;

        /* JADX INFO: renamed from: c */
        public static final MaskMode f34569c;

        /* JADX INFO: renamed from: d */
        public static final MaskMode f34570d;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ MaskMode[] f34571f;

        static {
            MaskMode maskMode = new MaskMode("MASK_MODE_ADD", 0);
            f34567a = maskMode;
            MaskMode maskMode2 = new MaskMode("MASK_MODE_SUBTRACT", 1);
            f34568b = maskMode2;
            MaskMode maskMode3 = new MaskMode("MASK_MODE_INTERSECT", 2);
            f34569c = maskMode3;
            MaskMode maskMode4 = new MaskMode("MASK_MODE_NONE", 3);
            f34570d = maskMode4;
            f34571f = new MaskMode[]{maskMode, maskMode2, maskMode3, maskMode4};
        }

        public static MaskMode valueOf(String str) {
            return (MaskMode) Enum.valueOf(MaskMode.class, str);
        }

        public static MaskMode[] values() {
            return (MaskMode[]) f34571f.clone();
        }
    }

    public Mask(MaskMode maskMode, AnimatableShapeValue animatableShapeValue, AnimatableIntegerValue animatableIntegerValue, boolean z2) {
        this.f34563a = maskMode;
        this.f34564b = animatableShapeValue;
        this.f34565c = animatableIntegerValue;
        this.f34566d = z2;
    }
}
