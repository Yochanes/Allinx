package androidx.compose.p013ui.text.font;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontVariation;", "", "Setting", "SettingFloat", "SettingInt", "SettingTextUnit", "Settings", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FontVariation {

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontVariation$Setting;", "", "Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface Setting {
        /* JADX INFO: renamed from: a */
        float mo6522a(Density density);
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class SettingFloat implements Setting {
        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        /* JADX INFO: renamed from: a */
        public final float mo6522a(Density density) {
            return 0.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) obj;
            settingFloat.getClass();
            settingFloat.getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FontVariation.Setting(axisName='null', value=0.0)";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Immutable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class SettingInt implements Setting {
        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        /* JADX INFO: renamed from: a */
        public final float mo6522a(Density density) {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) obj;
            settingInt.getClass();
            settingInt.getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FontVariation.Setting(axisName='null', value=0)";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final class SettingTextUnit implements Setting {
        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        /* JADX INFO: renamed from: a */
        public final float mo6522a(Density density) {
            return density.getF20557b() * TextUnit.m6675c(0L);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) obj;
            settingTextUnit.getClass();
            settingTextUnit.getClass();
            return TextUnit.m6673a(0L, 0L);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FontVariation.Setting(axisName='null', value=" + ((Object) TextUnit.m6677e(0L)) + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontVariation$Settings;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final class Settings {

        /* JADX INFO: renamed from: a */
        public final ArrayList f20292a;

        public Settings(Setting... settingArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Setting setting : settingArr) {
                setting.getClass();
                Object arrayList = linkedHashMap.get(null);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(null, arrayList);
                }
                ((List) arrayList).add(setting);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(AbstractC0455a.m2241p(AbstractC0000a.m23t("'", str, "' must be unique. Actual [ ["), CollectionsKt.m18409J(list, null, null, null, null, 63), ']').toString());
                }
                CollectionsKt.m18434i(arrayList2, list);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            this.f20292a = arrayList3;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                ((Setting) arrayList3.get(i)).getClass();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Settings) && Intrinsics.m18594b(this.f20292a, ((Settings) obj).f20292a);
        }

        public final int hashCode() {
            return this.f20292a.hashCode();
        }
    }
}
