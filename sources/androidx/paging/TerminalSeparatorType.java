package androidx.paging;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/TerminalSeparatorType;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class TerminalSeparatorType {

    /* JADX INFO: renamed from: a */
    public static final TerminalSeparatorType f31350a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ TerminalSeparatorType[] f31351b;

    static {
        TerminalSeparatorType terminalSeparatorType = new TerminalSeparatorType("FULLY_COMPLETE", 0);
        f31350a = terminalSeparatorType;
        f31351b = new TerminalSeparatorType[]{terminalSeparatorType, new TerminalSeparatorType("SOURCE_COMPLETE", 1)};
    }

    public static TerminalSeparatorType valueOf(String str) {
        return (TerminalSeparatorType) Enum.valueOf(TerminalSeparatorType.class, str);
    }

    public static TerminalSeparatorType[] values() {
        return (TerminalSeparatorType[]) f31351b.clone();
    }
}
