package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.FilteringSequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "D", "", "Name", "Extras", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class Navigator<D extends NavDestination> {

    /* JADX INFO: renamed from: a */
    public NavController.NavControllerNavigatorState f30280a;

    /* JADX INFO: renamed from: b */
    public boolean f30281b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/navigation/Navigator$Extras;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public interface Extras {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/navigation/Navigator$Name;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention
    public @interface Name {
        String value();
    }

    /* JADX INFO: renamed from: a */
    public abstract NavDestination mo11185a();

    /* JADX INFO: renamed from: b */
    public final NavigatorState m11251b() {
        NavController.NavControllerNavigatorState navControllerNavigatorState = this.f30280a;
        if (navControllerNavigatorState != null) {
            return navControllerNavigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    /* JADX INFO: renamed from: d */
    public void mo11240d(List list, NavOptions navOptions) {
        FilteringSequence.C62391 c62391 = new FilteringSequence.C62391();
        while (c62391.hasNext()) {
            m11251b().mo11213f((NavBackStackEntry) c62391.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo11252e(NavBackStackEntry navBackStackEntry, boolean z2) {
        List list = (List) m11251b().f30288e.getValue();
        if (!list.contains(navBackStackEntry)) {
            throw new IllegalStateException(("popBackStack was called with " + navBackStackEntry + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        NavBackStackEntry navBackStackEntry2 = null;
        while (mo11187f()) {
            navBackStackEntry2 = (NavBackStackEntry) listIterator.previous();
            if (Intrinsics.m18594b(navBackStackEntry2, navBackStackEntry)) {
                break;
            }
        }
        if (navBackStackEntry2 != null) {
            m11251b().mo11211c(navBackStackEntry2, z2);
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean mo11187f() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public NavDestination mo11186c(NavDestination navDestination, Bundle bundle, NavOptions navOptions) {
        return navDestination;
    }
}
