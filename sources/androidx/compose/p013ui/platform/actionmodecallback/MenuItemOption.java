package androidx.compose.p013ui.platform.actionmodecallback;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class MenuItemOption {

    /* JADX INFO: renamed from: c */
    public static final MenuItemOption f19635c;

    /* JADX INFO: renamed from: d */
    public static final MenuItemOption f19636d;

    /* JADX INFO: renamed from: f */
    public static final MenuItemOption f19637f;

    /* JADX INFO: renamed from: g */
    public static final MenuItemOption f19638g;

    /* JADX INFO: renamed from: i */
    public static final MenuItemOption f19639i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ MenuItemOption[] f19640j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ EnumEntries f19641n;

    /* JADX INFO: renamed from: a */
    public final int f19642a;

    /* JADX INFO: renamed from: b */
    public final int f19643b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[MenuItemOption.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuItemOption menuItemOption = MenuItemOption.f19635c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuItemOption menuItemOption2 = MenuItemOption.f19635c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuItemOption menuItemOption3 = MenuItemOption.f19635c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuItemOption menuItemOption4 = MenuItemOption.f19635c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        MenuItemOption menuItemOption = new MenuItemOption("Copy", 0, 0);
        f19635c = menuItemOption;
        MenuItemOption menuItemOption2 = new MenuItemOption("Paste", 1, 1);
        f19636d = menuItemOption2;
        MenuItemOption menuItemOption3 = new MenuItemOption("Cut", 2, 2);
        f19637f = menuItemOption3;
        MenuItemOption menuItemOption4 = new MenuItemOption("SelectAll", 3, 3);
        f19638g = menuItemOption4;
        MenuItemOption menuItemOption5 = new MenuItemOption("Autofill", 4, 4);
        f19639i = menuItemOption5;
        MenuItemOption[] menuItemOptionArr = {menuItemOption, menuItemOption2, menuItemOption3, menuItemOption4, menuItemOption5};
        f19640j = menuItemOptionArr;
        f19641n = EnumEntriesKt.m18563a(menuItemOptionArr);
    }

    public MenuItemOption(String str, int i, int i2) {
        this.f19642a = i2;
        this.f19643b = i2;
    }

    public static MenuItemOption valueOf(String str) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, str);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) f19640j.clone();
    }
}
