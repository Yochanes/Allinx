package com.exchange.allin.p024ui.page.account.register;

import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import com.engagelab.privates.common.log.MTCommonLog;
import com.exchange.allin.p024ui.theme.AppTheme;
import com.exchange.allin.utils.ext.StringExtKt;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import java.util.concurrent.Flow;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.ReflectionFactory;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.register.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2929c {
    /* JADX INFO: renamed from: a */
    public static long m13696a(Composer composer, int i, Composer composer2) {
        composer.mo4221N(i);
        long jM14087m = AppTheme.m14099a(composer2).m14087m();
        composer.mo4213F();
        return jM14087m;
    }

    /* JADX INFO: renamed from: b */
    public static MutableState m13697b(long j) {
        return SnapshotStateKt.m4525g(new Color(j));
    }

    /* JADX INFO: renamed from: c */
    public static RecomposeScopeImpl m13698c(ComposerImpl composerImpl, boolean z2, boolean z3) {
        composerImpl.m4265W(z2);
        composerImpl.m4265W(z3);
        return composerImpl.m4267Y();
    }

    /* JADX INFO: renamed from: d */
    public static FieldDescriptor m13699d(int i, FieldDescriptor.Builder builder) {
        return builder.withProperty(AtProtobuf.builder().tag(i).build()).build();
    }

    /* JADX INFO: renamed from: e */
    public static SurveyUiColors m13700e(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        return SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(str, str2, i, defaultConstructorMarker));
    }

    /* JADX INFO: renamed from: f */
    public static Object m13701f() {
        return Injector.get().getAppConfigProvider().get();
    }

    /* JADX INFO: renamed from: g */
    public static String m13702g(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m13703h(ComposerImpl composerImpl, Modifier modifier, String str) {
        Updater.m4536b(composerImpl, modifier, ComposeUiNode.Companion.f18645d);
        return StringExtKt.m14217f(str);
    }

    /* JADX INFO: renamed from: i */
    public static String m13704i(ReflectionFactory reflectionFactory, Class cls, StringBuilder sb) {
        sb.append(reflectionFactory.mo18612b(cls));
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static Function0 m13705j(ComposeUiNode.Companion companion, ComposerImpl composerImpl) {
        companion.getClass();
        Function0 function0 = ComposeUiNode.Companion.f18643b;
        composerImpl.mo4241s();
        return function0;
    }

    /* JADX INFO: renamed from: k */
    public static Function2 m13706k(ComposerImpl composerImpl, ColumnMeasurePolicy columnMeasurePolicy, ComposerImpl composerImpl2, PersistentCompositionLocalMap persistentCompositionLocalMap) {
        Updater.m4536b(composerImpl, columnMeasurePolicy, ComposeUiNode.Companion.f18648g);
        Updater.m4536b(composerImpl2, persistentCompositionLocalMap, ComposeUiNode.Companion.f18647f);
        return ComposeUiNode.Companion.f18651j;
    }

    /* JADX INFO: renamed from: l */
    public static Function2 m13707l(ComposerImpl composerImpl, RowMeasurePolicy rowMeasurePolicy, ComposerImpl composerImpl2, PersistentCompositionLocalMap persistentCompositionLocalMap) {
        Updater.m4536b(composerImpl, rowMeasurePolicy, ComposeUiNode.Companion.f18648g);
        Updater.m4536b(composerImpl2, persistentCompositionLocalMap, ComposeUiNode.Companion.f18647f);
        return ComposeUiNode.Companion.f18651j;
    }

    /* JADX INFO: renamed from: m */
    public static FactoryInstanceFactory m13708m(BeanDefinition beanDefinition, Module module) {
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
        module.m21809a(factoryInstanceFactory);
        return factoryInstanceFactory;
    }

    /* JADX INFO: renamed from: n */
    public static void m13709n(String str, StringBuilder sb, Throwable th) {
        sb.append(th.getMessage());
        MTCommonLog.m13013w(str, sb.toString());
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m13710o(Flow.Subscriber subscriber) {
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m13711p(Composer composer, int i, ConstrainedLayoutReference constrainedLayoutReference) {
        composer.mo4219L();
        composer.mo4221N(i);
        return composer.mo4220M(constrainedLayoutReference);
    }

    /* JADX INFO: renamed from: q */
    public static long m13712q(Composer composer, int i, Composer composer2) {
        composer.mo4221N(i);
        long jM14094t = AppTheme.m14099a(composer2).m14094t();
        composer.mo4213F();
        return jM14094t;
    }
}
