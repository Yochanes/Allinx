package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavDestinationImpl;
import com.engagelab.privates.common.constants.MTCommonConstants;
import defpackage.C0023a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Navigator.Name(MTCommonConstants.Lifecycle.KEY_ACTIVITY)
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$Destination;", "Destination", "Extras", "Companion", "navigation-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public class ActivityNavigator extends Navigator<Destination> {

    /* JADX INFO: renamed from: c */
    public final Context f30161c;

    /* JADX INFO: renamed from: d */
    public final Activity f30162d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m18302d2 = {"Landroidx/navigation/ActivityNavigator$Companion;", "", "", "EXTRA_NAV_SOURCE", "Ljava/lang/String;", "EXTRA_NAV_CURRENT", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG", "navigation-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/ActivityNavigator$Destination;", "Landroidx/navigation/NavDestination;", "navigation-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @NavDestination.ClassType
    @SourceDebugExtension
    public static class Destination extends NavDestination {
        @Override // androidx.navigation.NavDestination
        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || !(obj instanceof Destination) || !super.equals(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.navigation.NavDestination
        public final int hashCode() {
            return ((super.hashCode() * 31) + 0) * 31;
        }

        @Override // androidx.navigation.NavDestination
        public final String toString() {
            String str = super.toString();
            Intrinsics.m18598f(str, "toString(...)");
            return str;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/navigation/ActivityNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "Builder", "navigation-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Extras implements Navigator.Extras {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/ActivityNavigator$Extras$Builder;", "", "navigation-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Builder {
        }
    }

    public ActivityNavigator(Context context) {
        Object next;
        Intrinsics.m18599g(context, "context");
        this.f30161c = context;
        Iterator f55142a = SequencesKt.m20368j(context, new C0023a(3)).getF55142a();
        while (true) {
            if (!f55142a.hasNext()) {
                next = null;
                break;
            } else {
                next = f55142a.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f30162d = (Activity) next;
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: a */
    public final NavDestination mo11185a() {
        return new Destination(this);
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: c */
    public final NavDestination mo11186c(NavDestination navDestination, Bundle bundle, NavOptions navOptions) {
        Destination destination = (Destination) navDestination;
        destination.getClass();
        NavDestinationImpl navDestinationImpl = destination.f30232b;
        throw new IllegalStateException(AbstractC0000a.m11h(navDestinationImpl.f30481d, " does not have an Intent set.", new StringBuilder("Destination ")).toString());
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: f */
    public final boolean mo11187f() {
        Activity activity = this.f30162d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
