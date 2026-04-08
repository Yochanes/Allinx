package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@ObsoleteCoroutinesApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/channels/TickerMode;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class TickerMode {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ TickerMode[] f55631a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f55632b;

    static {
        TickerMode[] tickerModeArr = {new TickerMode("FIXED_PERIOD", 0), new TickerMode("FIXED_DELAY", 1)};
        f55631a = tickerModeArr;
        f55632b = EnumEntriesKt.m18563a(tickerModeArr);
    }

    public static TickerMode valueOf(String str) {
        return (TickerMode) Enum.valueOf(TickerMode.class, str);
    }

    public static TickerMode[] values() {
        return (TickerMode[]) f55631a.clone();
    }
}
