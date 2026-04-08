package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class SelectionMode {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ SelectionMode[] f9870a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f9871b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode$Horizontal;", "Landroidx/compose/foundation/text/selection/SelectionMode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Horizontal extends SelectionMode {
        public Horizontal() {
            super("Horizontal", 1);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode$Vertical;", "Landroidx/compose/foundation/text/selection/SelectionMode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Vertical extends SelectionMode {
        public Vertical() {
            super("Vertical", 0);
        }
    }

    static {
        SelectionMode[] selectionModeArr = {new Vertical(), new Horizontal()};
        f9870a = selectionModeArr;
        f9871b = EnumEntriesKt.m18563a(selectionModeArr);
    }

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) f9870a.clone();
    }
}
