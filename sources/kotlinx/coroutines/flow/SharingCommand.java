package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SharingCommand {

    /* JADX INFO: renamed from: a */
    public static final SharingCommand f56146a;

    /* JADX INFO: renamed from: b */
    public static final SharingCommand f56147b;

    /* JADX INFO: renamed from: c */
    public static final SharingCommand f56148c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ SharingCommand[] f56149d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f56150f;

    static {
        SharingCommand sharingCommand = new SharingCommand("START", 0);
        f56146a = sharingCommand;
        SharingCommand sharingCommand2 = new SharingCommand("STOP", 1);
        f56147b = sharingCommand2;
        SharingCommand sharingCommand3 = new SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);
        f56148c = sharingCommand3;
        SharingCommand[] sharingCommandArr = {sharingCommand, sharingCommand2, sharingCommand3};
        f56149d = sharingCommandArr;
        f56150f = EnumEntriesKt.m18563a(sharingCommandArr);
    }

    public static SharingCommand valueOf(String str) {
        return (SharingCommand) Enum.valueOf(SharingCommand.class, str);
    }

    public static SharingCommand[] values() {
        return (SharingCommand[]) f56149d.clone();
    }
}
