package kotlin.reflect.jvm.internal.impl.types;

import com.google.android.gms.stats.CodePackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class TypeUsage {

    /* JADX INFO: renamed from: a */
    public static final TypeUsage f54888a;

    /* JADX INFO: renamed from: b */
    public static final TypeUsage f54889b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ TypeUsage[] f54890c;

    static {
        TypeUsage typeUsage = new TypeUsage("SUPERTYPE", 0);
        f54888a = typeUsage;
        TypeUsage typeUsage2 = new TypeUsage(CodePackage.COMMON, 1);
        f54889b = typeUsage2;
        f54890c = new TypeUsage[]{typeUsage, typeUsage2};
    }

    public static TypeUsage valueOf(String str) {
        return (TypeUsage) Enum.valueOf(TypeUsage.class, str);
    }

    public static TypeUsage[] values() {
        return (TypeUsage[]) f54890c.clone();
    }
}
