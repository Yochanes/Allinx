package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/IndexTransformationType;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class IndexTransformationType {

    /* JADX INFO: renamed from: a */
    public static final IndexTransformationType f8943a;

    /* JADX INFO: renamed from: b */
    public static final IndexTransformationType f8944b;

    /* JADX INFO: renamed from: c */
    public static final IndexTransformationType f8945c;

    /* JADX INFO: renamed from: d */
    public static final IndexTransformationType f8946d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ IndexTransformationType[] f8947f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumEntries f8948g;

    static {
        IndexTransformationType indexTransformationType = new IndexTransformationType("Untransformed", 0);
        f8943a = indexTransformationType;
        IndexTransformationType indexTransformationType2 = new IndexTransformationType("Insertion", 1);
        f8944b = indexTransformationType2;
        IndexTransformationType indexTransformationType3 = new IndexTransformationType("Replacement", 2);
        f8945c = indexTransformationType3;
        IndexTransformationType indexTransformationType4 = new IndexTransformationType("Deletion", 3);
        f8946d = indexTransformationType4;
        IndexTransformationType[] indexTransformationTypeArr = {indexTransformationType, indexTransformationType2, indexTransformationType3, indexTransformationType4};
        f8947f = indexTransformationTypeArr;
        f8948g = EnumEntriesKt.m18563a(indexTransformationTypeArr);
    }

    public static IndexTransformationType valueOf(String str) {
        return (IndexTransformationType) Enum.valueOf(IndexTransformationType.class, str);
    }

    public static IndexTransformationType[] values() {
        return (IndexTransformationType[]) f8947f.clone();
    }
}
