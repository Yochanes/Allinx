package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DeserializedContainerAbiStability {

    /* JADX INFO: renamed from: a */
    public static final DeserializedContainerAbiStability f54686a;

    /* JADX INFO: renamed from: b */
    public static final DeserializedContainerAbiStability f54687b;

    /* JADX INFO: renamed from: c */
    public static final DeserializedContainerAbiStability f54688c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ DeserializedContainerAbiStability[] f54689d;

    static {
        DeserializedContainerAbiStability deserializedContainerAbiStability = new DeserializedContainerAbiStability("STABLE", 0);
        f54686a = deserializedContainerAbiStability;
        DeserializedContainerAbiStability deserializedContainerAbiStability2 = new DeserializedContainerAbiStability("FIR_UNSTABLE", 1);
        f54687b = deserializedContainerAbiStability2;
        DeserializedContainerAbiStability deserializedContainerAbiStability3 = new DeserializedContainerAbiStability("IR_UNSTABLE", 2);
        f54688c = deserializedContainerAbiStability3;
        f54689d = new DeserializedContainerAbiStability[]{deserializedContainerAbiStability, deserializedContainerAbiStability2, deserializedContainerAbiStability3};
    }

    public static DeserializedContainerAbiStability valueOf(String str) {
        return (DeserializedContainerAbiStability) Enum.valueOf(DeserializedContainerAbiStability.class, str);
    }

    public static DeserializedContainerAbiStability[] values() {
        return (DeserializedContainerAbiStability[]) f54689d.clone();
    }
}
