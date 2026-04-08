package io.ktor.utils.p043io;

import io.ktor.utils.p043io.internal.UtilsKt;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class DelimitedKt {
    /* JADX INFO: renamed from: a */
    public static final int m17389a(LookAheadSession lookAheadSession, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iM17560c;
        boolean z2 = false;
        ByteBuffer byteBufferMo17302f = lookAheadSession.mo17302f(0, 1);
        if (byteBufferMo17302f == null) {
            return 0;
        }
        int iM17559b = UtilsKt.m17559b(byteBufferMo17302f, byteBuffer);
        if (iM17559b != -1) {
            int iMin = Math.min(byteBufferMo17302f.remaining() - iM17559b, byteBuffer.remaining());
            int iRemaining = byteBuffer.remaining() - iMin;
            if (iRemaining == 0) {
                iM17560c = UtilsKt.m17561d(byteBuffer2, byteBufferMo17302f, byteBufferMo17302f.position() + iM17559b);
            } else {
                ByteBuffer remembered = byteBufferMo17302f.duplicate();
                ByteBuffer byteBufferMo17302f2 = lookAheadSession.mo17302f(iM17559b + iMin, 1);
                if (byteBufferMo17302f2 == null) {
                    Intrinsics.m18598f(remembered, "remembered");
                    iM17560c = UtilsKt.m17561d(byteBuffer2, remembered, remembered.position() + iM17559b);
                } else if (!UtilsKt.m17562e(byteBufferMo17302f2, byteBuffer, iMin)) {
                    Intrinsics.m18598f(remembered, "remembered");
                    iM17560c = UtilsKt.m17561d(byteBuffer2, remembered, remembered.position() + iM17559b + 1);
                } else if (byteBufferMo17302f2.remaining() >= iRemaining) {
                    Intrinsics.m18598f(remembered, "remembered");
                    iM17560c = UtilsKt.m17561d(byteBuffer2, remembered, remembered.position() + iM17559b);
                } else {
                    Intrinsics.m18598f(remembered, "remembered");
                    iM17560c = UtilsKt.m17561d(byteBuffer2, remembered, remembered.position() + iM17559b);
                }
            }
            z2 = true;
        } else {
            iM17560c = UtilsKt.m17560c(byteBuffer2, byteBufferMo17302f, byteBufferMo17302f.remaining());
        }
        lookAheadSession.mo17337w(iM17560c);
        return z2 ? -iM17560c : iM17560c;
    }

    /* JADX INFO: renamed from: b */
    public static final int m17390b(LookAheadSession lookAheadSession, ByteBuffer byteBuffer) throws IOException {
        int iM17393e = m17393e(lookAheadSession, byteBuffer);
        if (iM17393e == -1) {
            throw new IOException("Failed to skip delimiter: actual bytes differ from delimiter bytes");
        }
        if (iM17393e < byteBuffer.remaining()) {
            return iM17393e;
        }
        lookAheadSession.mo17337w(byteBuffer.remaining());
        return byteBuffer.remaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m17391c(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ContinuationImpl continuationImpl) {
        DelimitedKt$readUntilDelimiter$1 delimitedKt$readUntilDelimiter$1;
        int iIntValue;
        if (continuationImpl instanceof DelimitedKt$readUntilDelimiter$1) {
            delimitedKt$readUntilDelimiter$1 = (DelimitedKt$readUntilDelimiter$1) continuationImpl;
            int i = delimitedKt$readUntilDelimiter$1.f47261b;
            if ((i & Integer.MIN_VALUE) != 0) {
                delimitedKt$readUntilDelimiter$1.f47261b = i - Integer.MIN_VALUE;
            } else {
                delimitedKt$readUntilDelimiter$1 = new DelimitedKt$readUntilDelimiter$1(continuationImpl);
            }
        }
        Object objM17392d = delimitedKt$readUntilDelimiter$1.f47260a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = delimitedKt$readUntilDelimiter$1.f47261b;
        if (i2 == 0) {
            ResultKt.m18313b(objM17392d);
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (byteBuffer == byteBuffer2) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.f51657a = 0;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.f51655a = false;
            byteReadChannel.mo17341y(new DelimitedKt$readUntilDelimiter$2(byteBuffer, byteBuffer2, booleanRef, intRef));
            if (intRef.f51657a == 0 && byteReadChannel.mo17262I()) {
                iIntValue = -1;
            } else if (!byteBuffer2.hasRemaining() || booleanRef.f51655a) {
                iIntValue = intRef.f51657a;
            } else {
                int i3 = intRef.f51657a;
                delimitedKt$readUntilDelimiter$1.f47261b = 1;
                objM17392d = m17392d(byteReadChannel, byteBuffer, byteBuffer2, i3, delimitedKt$readUntilDelimiter$1);
                if (objM17392d == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return new Integer(iIntValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(objM17392d);
        iIntValue = ((Number) objM17392d).intValue();
        return new Integer(iIntValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m17392d(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, ContinuationImpl continuationImpl) {
        DelimitedKt$readUntilDelimiterSuspend$1 delimitedKt$readUntilDelimiterSuspend$1;
        Ref.BooleanRef booleanRef;
        ByteReadChannel byteReadChannel2;
        ByteBuffer byteBuffer3;
        int iIntValue;
        int i2;
        if (continuationImpl instanceof DelimitedKt$readUntilDelimiterSuspend$1) {
            delimitedKt$readUntilDelimiterSuspend$1 = (DelimitedKt$readUntilDelimiterSuspend$1) continuationImpl;
            int i3 = delimitedKt$readUntilDelimiterSuspend$1.f47267b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                delimitedKt$readUntilDelimiterSuspend$1.f47267b = i3 - Integer.MIN_VALUE;
            } else {
                delimitedKt$readUntilDelimiterSuspend$1 = new DelimitedKt$readUntilDelimiterSuspend$1(continuationImpl);
            }
        }
        DelimitedKt$readUntilDelimiterSuspend$1 delimitedKt$readUntilDelimiterSuspend$12 = delimitedKt$readUntilDelimiterSuspend$1;
        Object objMo17331t = delimitedKt$readUntilDelimiterSuspend$12.f47266a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i4 = delimitedKt$readUntilDelimiterSuspend$12.f47267b;
        if (i4 == 0) {
            ResultKt.m18313b(objMo17331t);
            if (!(byteBuffer != byteBuffer2)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            booleanRef = new Ref.BooleanRef();
            booleanRef.f51655a = false;
            DelimitedKt$readUntilDelimiterSuspend$copied$1 delimitedKt$readUntilDelimiterSuspend$copied$1 = new DelimitedKt$readUntilDelimiterSuspend$copied$1(byteReadChannel, i, byteBuffer, byteBuffer2, booleanRef, null);
            delimitedKt$readUntilDelimiterSuspend$12.f47268c = byteReadChannel;
            delimitedKt$readUntilDelimiterSuspend$12.f47269d = byteBuffer2;
            delimitedKt$readUntilDelimiterSuspend$12.f47270f = booleanRef;
            delimitedKt$readUntilDelimiterSuspend$12.f47267b = 1;
            objMo17331t = byteReadChannel.mo17331t(delimitedKt$readUntilDelimiterSuspend$copied$1, delimitedKt$readUntilDelimiterSuspend$12);
            if (objMo17331t != coroutineSingletons) {
                byteReadChannel2 = byteReadChannel;
                byteBuffer3 = byteBuffer2;
            }
            return coroutineSingletons;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = delimitedKt$readUntilDelimiterSuspend$12.f47271g;
            ResultKt.m18313b(objMo17331t);
            int iIntValue2 = ((Number) objMo17331t).intValue();
            iIntValue = i2 + (iIntValue2 >= 0 ? iIntValue2 : 0);
            return new Integer(iIntValue);
        }
        Ref.BooleanRef booleanRef2 = delimitedKt$readUntilDelimiterSuspend$12.f47270f;
        byteBuffer3 = delimitedKt$readUntilDelimiterSuspend$12.f47269d;
        ByteReadChannel byteReadChannel3 = delimitedKt$readUntilDelimiterSuspend$12.f47268c;
        ResultKt.m18313b(objMo17331t);
        booleanRef = booleanRef2;
        byteReadChannel2 = byteReadChannel3;
        iIntValue = ((Number) objMo17331t).intValue();
        if (iIntValue <= 0 || !byteReadChannel2.mo17327r() || booleanRef.f51655a) {
            if (iIntValue == 0 && byteReadChannel2.mo17262I()) {
                iIntValue = -1;
            }
            return new Integer(iIntValue);
        }
        delimitedKt$readUntilDelimiterSuspend$12.f47268c = null;
        delimitedKt$readUntilDelimiterSuspend$12.f47269d = null;
        delimitedKt$readUntilDelimiterSuspend$12.f47270f = null;
        delimitedKt$readUntilDelimiterSuspend$12.f47271g = iIntValue;
        delimitedKt$readUntilDelimiterSuspend$12.f47267b = 2;
        Object objMo17248B = byteReadChannel2.mo17248B(byteBuffer3, delimitedKt$readUntilDelimiterSuspend$12);
        if (objMo17248B != coroutineSingletons) {
            i2 = iIntValue;
            objMo17331t = objMo17248B;
            int iIntValue22 = ((Number) objMo17331t).intValue();
            iIntValue = i2 + (iIntValue22 >= 0 ? iIntValue22 : 0);
            return new Integer(iIntValue);
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: e */
    public static final int m17393e(LookAheadSession lookAheadSession, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferMo17302f = lookAheadSession.mo17302f(0, 1);
        if (byteBufferMo17302f == null) {
            return 0;
        }
        int iM17559b = UtilsKt.m17559b(byteBufferMo17302f, byteBuffer);
        if (iM17559b != 0) {
            return -1;
        }
        int iMin = Math.min(byteBufferMo17302f.remaining() - iM17559b, byteBuffer.remaining());
        int iRemaining = byteBuffer.remaining() - iMin;
        if (iRemaining > 0) {
            ByteBuffer byteBufferMo17302f2 = lookAheadSession.mo17302f(iM17559b + iMin, iRemaining);
            if (byteBufferMo17302f2 == null) {
                return iMin;
            }
            if (!UtilsKt.m17562e(byteBufferMo17302f2, byteBuffer, iMin)) {
                return -1;
            }
        }
        return byteBuffer.remaining();
    }
}
