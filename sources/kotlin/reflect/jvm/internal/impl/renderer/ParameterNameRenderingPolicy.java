package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParameterNameRenderingPolicy {

    /* JADX INFO: renamed from: a */
    public static final ParameterNameRenderingPolicy f54310a;

    /* JADX INFO: renamed from: b */
    public static final ParameterNameRenderingPolicy f54311b;

    /* JADX INFO: renamed from: c */
    public static final ParameterNameRenderingPolicy f54312c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ParameterNameRenderingPolicy[] f54313d;

    static {
        ParameterNameRenderingPolicy parameterNameRenderingPolicy = new ParameterNameRenderingPolicy("ALL", 0);
        f54310a = parameterNameRenderingPolicy;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy2 = new ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);
        f54311b = parameterNameRenderingPolicy2;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy3 = new ParameterNameRenderingPolicy("NONE", 2);
        f54312c = parameterNameRenderingPolicy3;
        f54313d = new ParameterNameRenderingPolicy[]{parameterNameRenderingPolicy, parameterNameRenderingPolicy2, parameterNameRenderingPolicy3};
    }

    public static ParameterNameRenderingPolicy valueOf(String str) {
        return (ParameterNameRenderingPolicy) Enum.valueOf(ParameterNameRenderingPolicy.class, str);
    }

    public static ParameterNameRenderingPolicy[] values() {
        return (ParameterNameRenderingPolicy[]) f54313d.clone();
    }
}
