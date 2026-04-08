package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.ExperimentalSerializationApi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/DecodeSequenceMode;", "", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@ExperimentalSerializationApi
public final class DecodeSequenceMode {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ DecodeSequenceMode[] f56805a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f56806b;

    static {
        DecodeSequenceMode[] decodeSequenceModeArr = {new DecodeSequenceMode("WHITESPACE_SEPARATED", 0), new DecodeSequenceMode("ARRAY_WRAPPED", 1), new DecodeSequenceMode("AUTO_DETECT", 2)};
        f56805a = decodeSequenceModeArr;
        f56806b = EnumEntriesKt.m18563a(decodeSequenceModeArr);
    }

    public static DecodeSequenceMode valueOf(String str) {
        return (DecodeSequenceMode) Enum.valueOf(DecodeSequenceMode.class, str);
    }

    public static DecodeSequenceMode[] values() {
        return (DecodeSequenceMode[]) f56805a.clone();
    }
}
