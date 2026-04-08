package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/ScaffoldLayoutContent;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ScaffoldLayoutContent {

    /* JADX INFO: renamed from: a */
    public static final ScaffoldLayoutContent f10997a;

    /* JADX INFO: renamed from: b */
    public static final ScaffoldLayoutContent f10998b;

    /* JADX INFO: renamed from: c */
    public static final ScaffoldLayoutContent f10999c;

    /* JADX INFO: renamed from: d */
    public static final ScaffoldLayoutContent f11000d;

    /* JADX INFO: renamed from: f */
    public static final ScaffoldLayoutContent f11001f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ ScaffoldLayoutContent[] f11002g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumEntries f11003i;

    static {
        ScaffoldLayoutContent scaffoldLayoutContent = new ScaffoldLayoutContent("TopBar", 0);
        f10997a = scaffoldLayoutContent;
        ScaffoldLayoutContent scaffoldLayoutContent2 = new ScaffoldLayoutContent("MainContent", 1);
        f10998b = scaffoldLayoutContent2;
        ScaffoldLayoutContent scaffoldLayoutContent3 = new ScaffoldLayoutContent("Snackbar", 2);
        f10999c = scaffoldLayoutContent3;
        ScaffoldLayoutContent scaffoldLayoutContent4 = new ScaffoldLayoutContent("Fab", 3);
        f11000d = scaffoldLayoutContent4;
        ScaffoldLayoutContent scaffoldLayoutContent5 = new ScaffoldLayoutContent("BottomBar", 4);
        f11001f = scaffoldLayoutContent5;
        ScaffoldLayoutContent[] scaffoldLayoutContentArr = {scaffoldLayoutContent, scaffoldLayoutContent2, scaffoldLayoutContent3, scaffoldLayoutContent4, scaffoldLayoutContent5};
        f11002g = scaffoldLayoutContentArr;
        f11003i = EnumEntriesKt.m18563a(scaffoldLayoutContentArr);
    }

    public static ScaffoldLayoutContent valueOf(String str) {
        return (ScaffoldLayoutContent) Enum.valueOf(ScaffoldLayoutContent.class, str);
    }

    public static ScaffoldLayoutContent[] values() {
        return (ScaffoldLayoutContent[]) f11002g.clone();
    }
}
