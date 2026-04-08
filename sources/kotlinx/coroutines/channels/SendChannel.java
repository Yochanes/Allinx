package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/channels/SendChannel;", "E", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface SendChannel<E> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static boolean m20727a(SendChannel sendChannel, Object obj) throws Throwable {
            Object objMo11414v = sendChannel.mo11414v(obj);
            if (!(objMo11414v instanceof ChannelResult.Failed)) {
                return true;
            }
            Throwable thM20710a = ChannelResult.m20710a(objMo11414v);
            if (thM20710a == null) {
                return false;
            }
            int i = StackTraceRecoveryKt.f56356a;
            throw thM20710a;
        }
    }

    /* JADX INFO: renamed from: F */
    boolean mo11411F();

    /* JADX INFO: renamed from: b */
    boolean mo11412b(Throwable th);

    boolean offer(Object obj);

    /* JADX INFO: renamed from: t */
    void mo11413t(Function1 function1);

    /* JADX INFO: renamed from: v */
    Object mo11414v(Object obj);

    /* JADX INFO: renamed from: w */
    Object mo11415w(Object obj, Continuation continuation);
}
