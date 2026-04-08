package androidx.privacysandbox.ads.adservices.appsetid;

import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl", m18559f = "AppSetIdManager.kt", m18560l = {55}, m18561m = "getAppSetId")
public final class AppSetIdManager$Api33Ext4Impl$getAppSetId$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f31417a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31418b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AppSetIdManager.Api33Ext4Impl f31419c;

    /* JADX INFO: renamed from: d */
    public int f31420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSetIdManager$Api33Ext4Impl$getAppSetId$1(AppSetIdManager.Api33Ext4Impl api33Ext4Impl, Continuation continuation) {
        super(continuation);
        this.f31419c = api33Ext4Impl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31418b = obj;
        this.f31420d |= Integer.MIN_VALUE;
        return this.f31419c.m11431a(this);
    }
}
