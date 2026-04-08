package io.ktor.network.tls;

import com.engagelab.privates.push.constants.MTPushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CopyableThrowable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/network/tls/NoPrivateKeyException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lkotlinx/coroutines/CopyableThrowable;", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class NoPrivateKeyException extends IllegalStateException implements CopyableThrowable<NoPrivateKeyException> {
    @Override // kotlinx.coroutines.CopyableThrowable
    public final Throwable createCopy() {
        Intrinsics.m18599g(null, MTPushConstants.Operation.KEY_ALIAS);
        Intrinsics.m18599g(null, "store");
        NoPrivateKeyException noPrivateKeyException = new NoPrivateKeyException("Failed to find private key for alias null. Please check your key store: null");
        noPrivateKeyException.initCause(this);
        return noPrivateKeyException;
    }
}
