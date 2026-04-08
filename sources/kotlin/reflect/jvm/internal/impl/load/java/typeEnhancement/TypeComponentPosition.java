package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class TypeComponentPosition {

    /* JADX INFO: renamed from: a */
    public static final TypeComponentPosition f53191a;

    /* JADX INFO: renamed from: b */
    public static final TypeComponentPosition f53192b;

    /* JADX INFO: renamed from: c */
    public static final TypeComponentPosition f53193c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ TypeComponentPosition[] f53194d;

    static {
        TypeComponentPosition typeComponentPosition = new TypeComponentPosition("FLEXIBLE_LOWER", 0);
        f53191a = typeComponentPosition;
        TypeComponentPosition typeComponentPosition2 = new TypeComponentPosition("FLEXIBLE_UPPER", 1);
        f53192b = typeComponentPosition2;
        TypeComponentPosition typeComponentPosition3 = new TypeComponentPosition("INFLEXIBLE", 2);
        f53193c = typeComponentPosition3;
        f53194d = new TypeComponentPosition[]{typeComponentPosition, typeComponentPosition2, typeComponentPosition3};
    }

    public static TypeComponentPosition valueOf(String str) {
        return (TypeComponentPosition) Enum.valueOf(TypeComponentPosition.class, str);
    }

    public static TypeComponentPosition[] values() {
        return (TypeComponentPosition[]) f53194d.clone();
    }
}
