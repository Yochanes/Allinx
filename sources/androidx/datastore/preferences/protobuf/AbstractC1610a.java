package androidx.datastore.preferences.protobuf;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintLayoutScope.ConstrainedLayoutReferences;
import androidx.fragment.app.Fragment;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.recyclerview.widget.RecyclerView;
import com.exchange.allin.p024ui.theme.AppTheme;
import com.exchange.allin.utils.ext.NavigationExtKt$navTo$2;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1610a {
    /* JADX INFO: renamed from: A */
    public static long m8722A(ComposerImpl composerImpl, int i, ComposerImpl composerImpl2, boolean z2) {
        composerImpl.mo4221N(i);
        long jM14097w = AppTheme.m14099a(composerImpl2).m14097w();
        composerImpl.m4265W(z2);
        return jM14097w;
    }

    /* JADX INFO: renamed from: a */
    public static int m8723a(int i, int i2, int i3) {
        return CodedOutputStream.m8442q(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: b */
    public static int m8724b(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* JADX INFO: renamed from: c */
    public static long m8725c(ComposerImpl composerImpl, int i, ComposerImpl composerImpl2, boolean z2) {
        composerImpl.mo4221N(i);
        long jM14087m = AppTheme.m14099a(composerImpl2).m14087m();
        composerImpl.m4265W(z2);
        return jM14087m;
    }

    /* JADX INFO: renamed from: d */
    public static MutableState m8726d(int i, ComposerImpl composerImpl) {
        MutableState mutableStateM4525g = SnapshotStateKt.m4525g(Integer.valueOf(i));
        composerImpl.mo4214G(mutableStateM4525g);
        return mutableStateM4525g;
    }

    /* JADX INFO: renamed from: e */
    public static ConstraintLayoutScope.ConstrainedLayoutReferences m8727e(ConstraintLayoutScope constraintLayoutScope, Composer composer, int i) {
        constraintLayoutScope.getClass();
        constraintLayoutScope.f20872a.f21527f.clear();
        constraintLayoutScope.f20884c = 0;
        composer.mo4221N(i);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferences = constraintLayoutScope.f20883b;
        if (constrainedLayoutReferences != null) {
            return constrainedLayoutReferences;
        }
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferences2 = constraintLayoutScope.new ConstrainedLayoutReferences();
        constraintLayoutScope.f20883b = constrainedLayoutReferences2;
        return constrainedLayoutReferences2;
    }

    /* JADX INFO: renamed from: f */
    public static Gson m8728f(String str, String str2) {
        Intrinsics.m18598f(str, str2);
        return new Gson();
    }

    /* JADX INFO: renamed from: g */
    public static Object m8729g(int i, List list) {
        return list.get(list.size() - i);
    }

    /* JADX INFO: renamed from: h */
    public static Object m8730h(Composer composer, int i) {
        composer.mo4213F();
        composer.mo4221N(i);
        return composer.mo4229g();
    }

    /* JADX INFO: renamed from: i */
    public static Object m8731i(ComposerImpl composerImpl, boolean z2, int i) {
        composerImpl.m4265W(z2);
        composerImpl.mo4221N(i);
        return composerImpl.mo4229g();
    }

    /* JADX INFO: renamed from: j */
    public static String m8732j(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m8733k(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: l */
    public static String m8734l(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    /* JADX INFO: renamed from: m */
    public static String m8735m(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    /* JADX INFO: renamed from: n */
    public static Function2 m8736n(Composer composer, RowMeasurePolicy rowMeasurePolicy, Composer composer2, PersistentCompositionLocalMap persistentCompositionLocalMap) {
        Updater.m4536b(composer, rowMeasurePolicy, ComposeUiNode.Companion.f18648g);
        Updater.m4536b(composer2, persistentCompositionLocalMap, ComposeUiNode.Companion.f18647f);
        return ComposeUiNode.Companion.f18651j;
    }

    /* JADX INFO: renamed from: o */
    public static void m8737o(int i, int i2, int i3, int i4, int i5) {
        Util.m9594D(i);
        Util.m9594D(i2);
        Util.m9594D(i3);
        Util.m9594D(i4);
        Util.m9594D(i5);
    }

    /* JADX INFO: renamed from: p */
    public static void m8738p(int i, String str, String str2) {
        Log.m9511g(str2, str + i);
    }

    /* JADX INFO: renamed from: q */
    public static void m8739q(ComposerImpl composerImpl, boolean z2, boolean z3, boolean z4) {
        composerImpl.m4265W(z2);
        composerImpl.m4265W(z3);
        composerImpl.m4265W(z4);
    }

    /* JADX INFO: renamed from: r */
    public static void m8740r(Number number, AnimatedContentScope animatedContentScope, String str, NavBackStackEntry navBackStackEntry, String str2) {
        number.intValue();
        Intrinsics.m18599g(animatedContentScope, str);
        Intrinsics.m18599g(navBackStackEntry, str2);
    }

    /* JADX INFO: renamed from: s */
    public static void m8741s(String str, String str2, String str3) {
        Log.m9511g(str3, str + str2);
    }

    /* JADX INFO: renamed from: t */
    public static void m8742t(Ref.ObjectRef objectRef, boolean z2, NavHostController navHostController, String str) {
        navHostController.m11206c(str, new NavigationExtKt$navTo$2(objectRef, z2, navHostController));
    }

    /* JADX INFO: renamed from: u */
    public static void m8743u(Object[] objArr, int i, String str, StringBuilder sb) {
        sb.append(String.format(str, Arrays.copyOf(objArr, i)));
    }

    /* JADX INFO: renamed from: v */
    public static int m8744v(int i, int i2, int i3, int i4) {
        return CodedOutputStream.m8444s(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: w */
    public static long m8745w(ComposerImpl composerImpl, int i, ComposerImpl composerImpl2, boolean z2) {
        composerImpl.mo4221N(i);
        long jM14092r = AppTheme.m14099a(composerImpl2).m14092r();
        composerImpl.m4265W(z2);
        return jM14092r;
    }

    /* JADX INFO: renamed from: x */
    public static int m8746x(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    /* JADX INFO: renamed from: y */
    public static long m8747y(ComposerImpl composerImpl, int i, ComposerImpl composerImpl2, boolean z2) {
        composerImpl.mo4221N(i);
        long jM14094t = AppTheme.m14099a(composerImpl2).m14094t();
        composerImpl.m4265W(z2);
        return jM14094t;
    }

    /* JADX INFO: renamed from: z */
    public static long m8748z(ComposerImpl composerImpl, int i, ComposerImpl composerImpl2, boolean z2) {
        composerImpl.mo4221N(i);
        long jM14088n = AppTheme.m14099a(composerImpl2).m14088n();
        composerImpl.m4265W(z2);
        return jM14088n;
    }
}
