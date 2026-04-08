package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.Navigator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/navigation/NavigatorProvider;", "", "Companion", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SuppressLint({"TypeParameterUnusedInFormals"})
@SourceDebugExtension
public class NavigatorProvider {

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f30282b = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f30283a = new LinkedHashMap();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R&\u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/navigation/NavigatorProvider$Companion;", "", "", "Ljava/lang/Class;", "", "annotationNames", "Ljava/util/Map;", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static String m11254a(Class cls) {
            LinkedHashMap linkedHashMap = NavigatorProvider.f30282b;
            String strValue = (String) linkedHashMap.get(cls);
            if (strValue == null) {
                Navigator.Name name = (Navigator.Name) cls.getAnnotation(Navigator.Name.class);
                strValue = name != null ? name.value() : null;
                if (strValue == null || strValue.length() <= 0) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
                }
                linkedHashMap.put(cls, strValue);
            }
            Intrinsics.m18596d(strValue);
            return strValue;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11253a(Navigator navigator) {
        Intrinsics.m18599g(navigator, "navigator");
        String strM11254a = Companion.m11254a(navigator.getClass());
        if (strM11254a.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f30283a;
        Navigator navigator2 = (Navigator) linkedHashMap.get(strM11254a);
        if (Intrinsics.m18594b(navigator2, navigator)) {
            return;
        }
        boolean z2 = false;
        if (navigator2 != null && navigator2.f30281b) {
            z2 = true;
        }
        if (z2) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        if (!navigator.f30281b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    /* JADX INFO: renamed from: b */
    public Navigator mo11227b(String name) {
        Intrinsics.m18599g(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Navigator navigator = (Navigator) this.f30283a.get(name);
        if (navigator != null) {
            return navigator;
        }
        throw new IllegalStateException(AbstractC0000a.m3D("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
