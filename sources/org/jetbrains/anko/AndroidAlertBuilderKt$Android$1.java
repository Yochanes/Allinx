package org.jetbrains.anko;

import android.app.AlertDialog;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lorg/jetbrains/anko/AndroidAlertBuilder;", "p1", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "ctx", "invoke"}, m18303k = 3, m18304mv = {1, 1, 13})
public final class AndroidAlertBuilderKt$Android$1 extends FunctionReference implements Function1<Context, AndroidAlertBuilder> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f58161a = 0;

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f51660a.mo18612b(AndroidAlertBuilder.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Landroid/content/Context;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context p1 = (Context) obj;
        Intrinsics.m18600h(p1, "p1");
        AndroidAlertBuilder androidAlertBuilder = new AndroidAlertBuilder();
        new AlertDialog.Builder(p1);
        return androidAlertBuilder;
    }
}
