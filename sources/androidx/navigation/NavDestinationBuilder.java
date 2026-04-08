package androidx.navigation;

import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDestination;
import androidx.navigation.internal.C2038h;
import androidx.navigation.internal.C2039i;
import androidx.navigation.internal.NavDestinationImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@NavDestinationDsl
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavDestination;", "D", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public class NavDestinationBuilder<D extends NavDestination> {

    /* JADX INFO: renamed from: a */
    public final Navigator f30241a;

    /* JADX INFO: renamed from: b */
    public final String f30242b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f30243c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f30244d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f30245e;

    public NavDestinationBuilder(Navigator navigator, String str) {
        Intrinsics.m18599g(navigator, "navigator");
        this.f30241a = navigator;
        this.f30242b = str;
        this.f30243c = new LinkedHashMap();
        this.f30244d = new ArrayList();
        this.f30245e = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public NavDestination mo11235a() {
        NavDestinationImpl navDestinationImpl;
        NavDestination navDestinationMo11236b = mo11236b();
        navDestinationMo11236b.getClass();
        Iterator it = this.f30243c.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            navDestinationImpl = navDestinationMo11236b.f30232b;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String argumentName = (String) entry.getKey();
            NavArgument argument = (NavArgument) entry.getValue();
            Intrinsics.m18599g(argumentName, "argumentName");
            Intrinsics.m18599g(argument, "argument");
            navDestinationImpl.getClass();
            navDestinationImpl.f30480c.put(argumentName, argument);
        }
        for (NavDeepLink navDeepLink : this.f30244d) {
            Intrinsics.m18599g(navDeepLink, "navDeepLink");
            navDestinationImpl.getClass();
            ArrayList arrayListM11196a = NavArgumentKt.m11196a(navDestinationImpl.f30480c, new C2038h(navDeepLink, 0));
            if (!arrayListM11196a.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + navDeepLink.f30204a + " can't be used to open destination " + navDestinationImpl.f30478a + ".\nFollowing required arguments are missing: " + arrayListM11196a).toString());
            }
            navDestinationImpl.f30479b.add(navDeepLink);
        }
        for (Map.Entry entry2 : this.f30245e.entrySet()) {
            int iIntValue = ((Number) entry2.getKey()).intValue();
            NavAction action = (NavAction) entry2.getValue();
            Intrinsics.m18599g(action, "action");
            if (navDestinationMo11236b instanceof ActivityNavigator.Destination) {
                throw new UnsupportedOperationException("Cannot add action " + iIntValue + " to " + navDestinationMo11236b + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            }
            if (iIntValue == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            navDestinationMo11236b.f30234d.m2136e(iIntValue, action);
        }
        String str = this.f30242b;
        if (str != null) {
            navDestinationImpl.getClass();
            if (StringsKt.m20448x(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String uriPattern = "android-app://androidx.navigation/".concat(str);
            NavDeepLink.Builder builder = new NavDeepLink.Builder();
            Intrinsics.m18599g(uriPattern, "uriPattern");
            builder.f30217a = uriPattern;
            ArrayList arrayListM11196a2 = NavArgumentKt.m11196a(navDestinationImpl.f30480c, new C2038h(new NavDeepLink(builder.f30217a), 1));
            if (!arrayListM11196a2.isEmpty()) {
                StringBuilder sbM23t = AbstractC0000a.m23t("Cannot set route \"", str, "\" for destination ");
                sbM23t.append(navDestinationImpl.f30478a);
                sbM23t.append(". Following required arguments are missing: ");
                sbM23t.append(arrayListM11196a2);
                throw new IllegalArgumentException(sbM23t.toString().toString());
            }
            navDestinationImpl.f30483f = LazyKt.m18299b(new C2039i(uriPattern, 0));
            navDestinationImpl.f30481d = uriPattern.hashCode();
            navDestinationImpl.f30482e = str;
        }
        return navDestinationMo11236b;
    }

    /* JADX INFO: renamed from: b */
    public NavDestination mo11236b() {
        return this.f30241a.mo11185a();
    }
}
