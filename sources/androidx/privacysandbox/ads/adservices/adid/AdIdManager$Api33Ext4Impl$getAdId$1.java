package androidx.privacysandbox.ads.adservices.adid;

import androidx.privacysandbox.ads.adservices.adid.AdIdManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl", m18559f = "AdIdManager.kt", m18560l = {62}, m18561m = "getAdId")
public final class AdIdManager$Api33Ext4Impl$getAdId$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f31408a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31409b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AdIdManager.Api33Ext4Impl f31410c;

    /* JADX INFO: renamed from: d */
    public int f31411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIdManager$Api33Ext4Impl$getAdId$1(AdIdManager.Api33Ext4Impl api33Ext4Impl, Continuation continuation) {
        super(continuation);
        this.f31410c = api33Ext4Impl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31409b = obj;
        this.f31411d |= Integer.MIN_VALUE;
        return this.f31410c.m11428a(this);
    }
}
