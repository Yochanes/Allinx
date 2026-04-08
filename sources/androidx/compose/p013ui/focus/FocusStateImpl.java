package androidx.compose.p013ui.focus;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "", "Landroidx/compose/ui/focus/FocusState;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FocusStateImpl implements FocusState {

    /* JADX INFO: renamed from: a */
    public static final FocusStateImpl f17494a;

    /* JADX INFO: renamed from: b */
    public static final FocusStateImpl f17495b;

    /* JADX INFO: renamed from: c */
    public static final FocusStateImpl f17496c;

    /* JADX INFO: renamed from: d */
    public static final FocusStateImpl f17497d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ FocusStateImpl[] f17498f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumEntries f17499g;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FocusStateImpl focusStateImpl = FocusStateImpl.f17494a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FocusStateImpl focusStateImpl2 = FocusStateImpl.f17494a;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FocusStateImpl focusStateImpl3 = FocusStateImpl.f17494a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        FocusStateImpl focusStateImpl = new FocusStateImpl("Active", 0);
        f17494a = focusStateImpl;
        FocusStateImpl focusStateImpl2 = new FocusStateImpl("ActiveParent", 1);
        f17495b = focusStateImpl2;
        FocusStateImpl focusStateImpl3 = new FocusStateImpl("Captured", 2);
        f17496c = focusStateImpl3;
        FocusStateImpl focusStateImpl4 = new FocusStateImpl("Inactive", 3);
        f17497d = focusStateImpl4;
        FocusStateImpl[] focusStateImplArr = {focusStateImpl, focusStateImpl2, focusStateImpl3, focusStateImpl4};
        f17498f = focusStateImplArr;
        f17499g = EnumEntriesKt.m18563a(focusStateImplArr);
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) f17498f.clone();
    }

    @Override // androidx.compose.p013ui.focus.FocusState
    /* JADX INFO: renamed from: a */
    public final boolean mo5009a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.p013ui.focus.FocusState
    /* JADX INFO: renamed from: b */
    public final boolean mo5010b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}
