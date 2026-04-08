package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/BackdropLayers;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class BackdropLayers {

    /* JADX INFO: renamed from: a */
    public static final BackdropLayers f10160a;

    /* JADX INFO: renamed from: b */
    public static final BackdropLayers f10161b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ BackdropLayers[] f10162c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f10163d;

    static {
        BackdropLayers backdropLayers = new BackdropLayers("Back", 0);
        f10160a = backdropLayers;
        BackdropLayers backdropLayers2 = new BackdropLayers("Front", 1);
        f10161b = backdropLayers2;
        BackdropLayers[] backdropLayersArr = {backdropLayers, backdropLayers2};
        f10162c = backdropLayersArr;
        f10163d = EnumEntriesKt.m18563a(backdropLayersArr);
    }

    public static BackdropLayers valueOf(String str) {
        return (BackdropLayers) Enum.valueOf(BackdropLayers.class, str);
    }

    public static BackdropLayers[] values() {
        return (BackdropLayers[]) f10162c.clone();
    }
}
