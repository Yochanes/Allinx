package kotlin.reflect.jvm.internal.impl.types.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CaptureStatus {

    /* JADX INFO: renamed from: a */
    public static final CaptureStatus f55002a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ CaptureStatus[] f55003b;

    static {
        CaptureStatus captureStatus = new CaptureStatus("FOR_SUBTYPING", 0);
        f55002a = captureStatus;
        f55003b = new CaptureStatus[]{captureStatus, new CaptureStatus("FOR_INCORPORATION", 1), new CaptureStatus("FROM_EXPRESSION", 2)};
    }

    public static CaptureStatus valueOf(String str) {
        return (CaptureStatus) Enum.valueOf(CaptureStatus.class, str);
    }

    public static CaptureStatus[] values() {
        return (CaptureStatus[]) f55003b.clone();
    }
}
