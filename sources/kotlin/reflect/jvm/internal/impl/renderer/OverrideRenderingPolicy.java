package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class OverrideRenderingPolicy {

    /* JADX INFO: renamed from: a */
    public static final OverrideRenderingPolicy f54307a;

    /* JADX INFO: renamed from: b */
    public static final OverrideRenderingPolicy f54308b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ OverrideRenderingPolicy[] f54309c;

    static {
        OverrideRenderingPolicy overrideRenderingPolicy = new OverrideRenderingPolicy("RENDER_OVERRIDE", 0);
        f54307a = overrideRenderingPolicy;
        OverrideRenderingPolicy overrideRenderingPolicy2 = new OverrideRenderingPolicy("RENDER_OPEN", 1);
        f54308b = overrideRenderingPolicy2;
        f54309c = new OverrideRenderingPolicy[]{overrideRenderingPolicy, overrideRenderingPolicy2, new OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static OverrideRenderingPolicy valueOf(String str) {
        return (OverrideRenderingPolicy) Enum.valueOf(OverrideRenderingPolicy.class, str);
    }

    public static OverrideRenderingPolicy[] values() {
        return (OverrideRenderingPolicy[]) f54309c.clone();
    }
}
