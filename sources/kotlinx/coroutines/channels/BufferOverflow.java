package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/channels/BufferOverflow;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class BufferOverflow {

    /* JADX INFO: renamed from: a */
    public static final BufferOverflow f55393a;

    /* JADX INFO: renamed from: b */
    public static final BufferOverflow f55394b;

    /* JADX INFO: renamed from: c */
    public static final BufferOverflow f55395c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ BufferOverflow[] f55396d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f55397f;

    static {
        BufferOverflow bufferOverflow = new BufferOverflow("SUSPEND", 0);
        f55393a = bufferOverflow;
        BufferOverflow bufferOverflow2 = new BufferOverflow("DROP_OLDEST", 1);
        f55394b = bufferOverflow2;
        BufferOverflow bufferOverflow3 = new BufferOverflow("DROP_LATEST", 2);
        f55395c = bufferOverflow3;
        BufferOverflow[] bufferOverflowArr = {bufferOverflow, bufferOverflow2, bufferOverflow3};
        f55396d = bufferOverflowArr;
        f55397f = EnumEntriesKt.m18563a(bufferOverflowArr);
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) f55396d.clone();
    }
}
