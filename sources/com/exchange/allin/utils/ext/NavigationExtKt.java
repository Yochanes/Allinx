package com.exchange.allin.utils.ext;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.ComposeNavigatorDestinationBuilder;
import com.exchange.allin.p024ui.page.spot.C3499s;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"app_localRelease"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class NavigationExtKt {
    /* JADX INFO: renamed from: a */
    public static final void m14210a(NavHostController navHostController, Map map) {
        NavBackStackEntry navBackStackEntryM11205b;
        SavedStateHandle savedStateHandleM11197a;
        Intrinsics.m18599g(navHostController, "<this>");
        if (map != null && (navBackStackEntryM11205b = navHostController.m11205b()) != null && (savedStateHandleM11197a = navBackStackEntryM11205b.m11197a()) != null) {
            for (Map.Entry entry : map.entrySet()) {
                savedStateHandleM11197a.m9162b(entry.getValue(), (String) entry.getKey());
            }
        }
        navHostController.m11207e();
    }

    /* JADX INFO: renamed from: b */
    public static void m14211b(NavGraphBuilder navGraphBuilder, String str, List list, Function4 content, int i) {
        int i2 = i & 2;
        EmptyList<NavDeepLink> emptyList = EmptyList.f51496a;
        if (i2 != 0) {
            list = emptyList;
        }
        C3499s c3499s = new C3499s(14);
        C3499s c3499s2 = new C3499s(15);
        C3499s c3499s3 = new C3499s(16);
        C3499s c3499s4 = new C3499s(17);
        Intrinsics.m18599g(navGraphBuilder, "<this>");
        Intrinsics.m18599g(content, "content");
        NavigatorProvider navigatorProvider = navGraphBuilder.f30248f;
        navigatorProvider.getClass();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navigatorProvider.mo11227b(NavigatorProvider.Companion.m11254a(ComposeNavigator.class)), str, content);
        for (NamedNavArgument namedNavArgument : list) {
            composeNavigatorDestinationBuilder.f30243c.put(namedNavArgument.f30163a, namedNavArgument.f30164b);
        }
        for (NavDeepLink navDeepLink : emptyList) {
            Intrinsics.m18599g(navDeepLink, "navDeepLink");
            composeNavigatorDestinationBuilder.f30244d.add(navDeepLink);
        }
        composeNavigatorDestinationBuilder.f30312h = c3499s;
        composeNavigatorDestinationBuilder.f30313i = c3499s2;
        composeNavigatorDestinationBuilder.f30314j = c3499s3;
        composeNavigatorDestinationBuilder.f30315k = c3499s4;
        navGraphBuilder.f30250h.add(composeNavigatorDestinationBuilder.mo11235a());
    }
}
