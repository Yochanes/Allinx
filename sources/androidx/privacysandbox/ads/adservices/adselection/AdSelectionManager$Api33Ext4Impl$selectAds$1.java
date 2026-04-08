package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl", m18559f = "AdSelectionManager.kt", m18560l = {92}, m18561m = "selectAds")
public final class AdSelectionManager$Api33Ext4Impl$selectAds$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31412a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AdSelectionManager.Api33Ext4Impl f31413b;

    /* JADX INFO: renamed from: c */
    public int f31414c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManager$Api33Ext4Impl$selectAds$1(AdSelectionManager.Api33Ext4Impl api33Ext4Impl, Continuation continuation) {
        super(continuation);
        this.f31413b = api33Ext4Impl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31412a = obj;
        this.f31414c |= Integer.MIN_VALUE;
        return this.f31413b.m11430b(null, this);
    }
}
