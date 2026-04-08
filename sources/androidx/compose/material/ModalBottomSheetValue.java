package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ModalBottomSheetValue {

    /* JADX INFO: renamed from: a */
    public static final ModalBottomSheetValue f10756a;

    /* JADX INFO: renamed from: b */
    public static final ModalBottomSheetValue f10757b;

    /* JADX INFO: renamed from: c */
    public static final ModalBottomSheetValue f10758c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ModalBottomSheetValue[] f10759d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f10760f;

    static {
        ModalBottomSheetValue modalBottomSheetValue = new ModalBottomSheetValue("Hidden", 0);
        f10756a = modalBottomSheetValue;
        ModalBottomSheetValue modalBottomSheetValue2 = new ModalBottomSheetValue("Expanded", 1);
        f10757b = modalBottomSheetValue2;
        ModalBottomSheetValue modalBottomSheetValue3 = new ModalBottomSheetValue("HalfExpanded", 2);
        f10758c = modalBottomSheetValue3;
        ModalBottomSheetValue[] modalBottomSheetValueArr = {modalBottomSheetValue, modalBottomSheetValue2, modalBottomSheetValue3};
        f10759d = modalBottomSheetValueArr;
        f10760f = EnumEntriesKt.m18563a(modalBottomSheetValueArr);
    }

    public static ModalBottomSheetValue valueOf(String str) {
        return (ModalBottomSheetValue) Enum.valueOf(ModalBottomSheetValue.class, str);
    }

    public static ModalBottomSheetValue[] values() {
        return (ModalBottomSheetValue[]) f10759d.clone();
    }
}
