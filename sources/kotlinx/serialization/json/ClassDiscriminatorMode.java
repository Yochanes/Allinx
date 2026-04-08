package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/ClassDiscriminatorMode;", "", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ClassDiscriminatorMode {

    /* JADX INFO: renamed from: a */
    public static final ClassDiscriminatorMode f56801a;

    /* JADX INFO: renamed from: b */
    public static final ClassDiscriminatorMode f56802b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ClassDiscriminatorMode[] f56803c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f56804d;

    static {
        ClassDiscriminatorMode classDiscriminatorMode = new ClassDiscriminatorMode("NONE", 0);
        f56801a = classDiscriminatorMode;
        ClassDiscriminatorMode classDiscriminatorMode2 = new ClassDiscriminatorMode("ALL_JSON_OBJECTS", 1);
        ClassDiscriminatorMode classDiscriminatorMode3 = new ClassDiscriminatorMode("POLYMORPHIC", 2);
        f56802b = classDiscriminatorMode3;
        ClassDiscriminatorMode[] classDiscriminatorModeArr = {classDiscriminatorMode, classDiscriminatorMode2, classDiscriminatorMode3};
        f56803c = classDiscriminatorModeArr;
        f56804d = EnumEntriesKt.m18563a(classDiscriminatorModeArr);
    }

    public static ClassDiscriminatorMode valueOf(String str) {
        return (ClassDiscriminatorMode) Enum.valueOf(ClassDiscriminatorMode.class, str);
    }

    public static ClassDiscriminatorMode[] values() {
        return (ClassDiscriminatorMode[]) f56803c.clone();
    }
}
