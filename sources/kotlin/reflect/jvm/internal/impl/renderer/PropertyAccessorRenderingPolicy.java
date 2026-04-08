package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class PropertyAccessorRenderingPolicy {

    /* JADX INFO: renamed from: a */
    public static final PropertyAccessorRenderingPolicy f54314a;

    /* JADX INFO: renamed from: b */
    public static final PropertyAccessorRenderingPolicy f54315b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ PropertyAccessorRenderingPolicy[] f54316c;

    /* JADX INFO: Fake field, exist only in values array */
    PropertyAccessorRenderingPolicy EF0;

    static {
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy = new PropertyAccessorRenderingPolicy("PRETTY", 0);
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy2 = new PropertyAccessorRenderingPolicy("DEBUG", 1);
        f54314a = propertyAccessorRenderingPolicy2;
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy3 = new PropertyAccessorRenderingPolicy("NONE", 2);
        f54315b = propertyAccessorRenderingPolicy3;
        f54316c = new PropertyAccessorRenderingPolicy[]{propertyAccessorRenderingPolicy, propertyAccessorRenderingPolicy2, propertyAccessorRenderingPolicy3};
    }

    public static PropertyAccessorRenderingPolicy valueOf(String str) {
        return (PropertyAccessorRenderingPolicy) Enum.valueOf(PropertyAccessorRenderingPolicy.class, str);
    }

    public static PropertyAccessorRenderingPolicy[] values() {
        return (PropertyAccessorRenderingPolicy[]) f54316c.clone();
    }
}
