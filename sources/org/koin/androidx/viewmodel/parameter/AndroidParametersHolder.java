package org.koin.androidx.viewmodel.parameter;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.parameter.ParametersHolder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/androidx/viewmodel/parameter/AndroidParametersHolder;", "Lorg/koin/core/parameter/ParametersHolder;", "koin-android_release"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
public final class AndroidParametersHolder extends ParametersHolder {

    /* JADX INFO: renamed from: c */
    public final CreationExtras f58188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParametersHolder(CreationExtras extras) {
        super(2, new ArrayList());
        Intrinsics.m18599g(extras, "extras");
        this.f58188c = extras;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ Object m21793b(AndroidParametersHolder androidParametersHolder, KClass kClass) {
        return super.mo21794a(kClass);
    }

    @Override // org.koin.core.parameter.ParametersHolder
    /* JADX INFO: renamed from: a */
    public final Object mo21794a(KClass clazz) {
        Intrinsics.m18599g(clazz, "clazz");
        return clazz.equals(Reflection.f51660a.mo18612b(SavedStateHandle.class)) ? SavedStateHandleSupport.m9165a(this.f58188c) : new AndroidParametersHolder$getOrNull$1(this, clazz).invoke();
    }
}
