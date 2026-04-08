package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/HandleState;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class HandleState {

    /* JADX INFO: renamed from: a */
    public static final HandleState f8406a;

    /* JADX INFO: renamed from: b */
    public static final HandleState f8407b;

    /* JADX INFO: renamed from: c */
    public static final HandleState f8408c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ HandleState[] f8409d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f8410f;

    static {
        HandleState handleState = new HandleState("None", 0);
        f8406a = handleState;
        HandleState handleState2 = new HandleState("Selection", 1);
        f8407b = handleState2;
        HandleState handleState3 = new HandleState("Cursor", 2);
        f8408c = handleState3;
        HandleState[] handleStateArr = {handleState, handleState2, handleState3};
        f8409d = handleStateArr;
        f8410f = EnumEntriesKt.m18563a(handleStateArr);
    }

    public static HandleState valueOf(String str) {
        return (HandleState) Enum.valueOf(HandleState.class, str);
    }

    public static HandleState[] values() {
        return (HandleState[]) f8409d.clone();
    }
}
