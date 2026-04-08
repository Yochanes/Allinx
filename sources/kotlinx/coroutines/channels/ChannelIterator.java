package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/channels/ChannelIterator;", "E", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface ChannelIterator<E> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    Object mo20706a(Continuation continuation);

    Object next();
}
