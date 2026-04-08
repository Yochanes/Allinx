package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/ScaffoldLayoutContent;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ScaffoldLayoutContent {

    /* JADX INFO: renamed from: a */
    public static final ScaffoldLayoutContent f14295a;

    /* JADX INFO: renamed from: b */
    public static final ScaffoldLayoutContent f14296b;

    /* JADX INFO: renamed from: c */
    public static final ScaffoldLayoutContent f14297c;

    /* JADX INFO: renamed from: d */
    public static final ScaffoldLayoutContent f14298d;

    /* JADX INFO: renamed from: f */
    public static final ScaffoldLayoutContent f14299f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ ScaffoldLayoutContent[] f14300g;

    static {
        ScaffoldLayoutContent scaffoldLayoutContent = new ScaffoldLayoutContent("TopBar", 0);
        f14295a = scaffoldLayoutContent;
        ScaffoldLayoutContent scaffoldLayoutContent2 = new ScaffoldLayoutContent("MainContent", 1);
        f14296b = scaffoldLayoutContent2;
        ScaffoldLayoutContent scaffoldLayoutContent3 = new ScaffoldLayoutContent("Snackbar", 2);
        f14297c = scaffoldLayoutContent3;
        ScaffoldLayoutContent scaffoldLayoutContent4 = new ScaffoldLayoutContent("Fab", 3);
        f14298d = scaffoldLayoutContent4;
        ScaffoldLayoutContent scaffoldLayoutContent5 = new ScaffoldLayoutContent("BottomBar", 4);
        f14299f = scaffoldLayoutContent5;
        f14300g = new ScaffoldLayoutContent[]{scaffoldLayoutContent, scaffoldLayoutContent2, scaffoldLayoutContent3, scaffoldLayoutContent4, scaffoldLayoutContent5};
    }

    public static ScaffoldLayoutContent valueOf(String str) {
        return (ScaffoldLayoutContent) Enum.valueOf(ScaffoldLayoutContent.class, str);
    }

    public static ScaffoldLayoutContent[] values() {
        return (ScaffoldLayoutContent[]) f14300g.clone();
    }
}
