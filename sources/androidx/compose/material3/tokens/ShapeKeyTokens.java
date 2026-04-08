package androidx.compose.material3.tokens;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/tokens/ShapeKeyTokens;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ShapeKeyTokens {

    /* JADX INFO: renamed from: a */
    public static final ShapeKeyTokens f16032a;

    /* JADX INFO: renamed from: b */
    public static final ShapeKeyTokens f16033b;

    /* JADX INFO: renamed from: c */
    public static final ShapeKeyTokens f16034c;

    /* JADX INFO: renamed from: d */
    public static final ShapeKeyTokens f16035d;

    /* JADX INFO: renamed from: f */
    public static final ShapeKeyTokens f16036f;

    /* JADX INFO: renamed from: g */
    public static final ShapeKeyTokens f16037g;

    /* JADX INFO: renamed from: i */
    public static final ShapeKeyTokens f16038i;

    /* JADX INFO: renamed from: j */
    public static final ShapeKeyTokens f16039j;

    /* JADX INFO: renamed from: n */
    public static final ShapeKeyTokens f16040n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ ShapeKeyTokens[] f16041o;

    static {
        ShapeKeyTokens shapeKeyTokens = new ShapeKeyTokens("CornerExtraLarge", 0);
        f16032a = shapeKeyTokens;
        ShapeKeyTokens shapeKeyTokens2 = new ShapeKeyTokens("CornerExtraLargeTop", 1);
        f16033b = shapeKeyTokens2;
        ShapeKeyTokens shapeKeyTokens3 = new ShapeKeyTokens("CornerExtraSmall", 2);
        f16034c = shapeKeyTokens3;
        ShapeKeyTokens shapeKeyTokens4 = new ShapeKeyTokens("CornerExtraSmallTop", 3);
        f16035d = shapeKeyTokens4;
        ShapeKeyTokens shapeKeyTokens5 = new ShapeKeyTokens("CornerFull", 4);
        f16036f = shapeKeyTokens5;
        ShapeKeyTokens shapeKeyTokens6 = new ShapeKeyTokens("CornerLarge", 5);
        f16037g = shapeKeyTokens6;
        ShapeKeyTokens shapeKeyTokens7 = new ShapeKeyTokens("CornerLargeEnd", 6);
        ShapeKeyTokens shapeKeyTokens8 = new ShapeKeyTokens("CornerLargeTop", 7);
        ShapeKeyTokens shapeKeyTokens9 = new ShapeKeyTokens("CornerMedium", 8);
        f16038i = shapeKeyTokens9;
        ShapeKeyTokens shapeKeyTokens10 = new ShapeKeyTokens("CornerNone", 9);
        f16039j = shapeKeyTokens10;
        ShapeKeyTokens shapeKeyTokens11 = new ShapeKeyTokens("CornerSmall", 10);
        f16040n = shapeKeyTokens11;
        f16041o = new ShapeKeyTokens[]{shapeKeyTokens, shapeKeyTokens2, shapeKeyTokens3, shapeKeyTokens4, shapeKeyTokens5, shapeKeyTokens6, shapeKeyTokens7, shapeKeyTokens8, shapeKeyTokens9, shapeKeyTokens10, shapeKeyTokens11};
    }

    public static ShapeKeyTokens valueOf(String str) {
        return (ShapeKeyTokens) Enum.valueOf(ShapeKeyTokens.class, str);
    }

    public static ShapeKeyTokens[] values() {
        return (ShapeKeyTokens[]) f16041o.clone();
    }
}
