package androidx.paging;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/DiffingChangePayload;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final class DiffingChangePayload {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ DiffingChangePayload[] f30626a = {new DiffingChangePayload("ITEM_TO_PLACEHOLDER", 0), new DiffingChangePayload("PLACEHOLDER_TO_ITEM", 1), new DiffingChangePayload("PLACEHOLDER_POSITION_CHANGE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    DiffingChangePayload EF5;

    public static DiffingChangePayload valueOf(String str) {
        return (DiffingChangePayload) Enum.valueOf(DiffingChangePayload.class, str);
    }

    public static DiffingChangePayload[] values() {
        return (DiffingChangePayload[]) f30626a.clone();
    }
}
