package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MainDispatcherLoader {

    /* JADX INFO: renamed from: a */
    public static final MainCoroutineDispatcher f56350a;

    static {
        Object obj;
        String strM20855c = SystemPropsKt.m20855c("kotlinx.coroutines.fast.service.loader");
        if (strM20855c != null) {
            Boolean.parseBoolean(strM20855c);
        }
        Iterator it = SequencesKt.m20376r(SequencesKt.m20360b(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator())).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iMo20656b = ((MainDispatcherFactory) next).mo20656b();
                do {
                    Object next2 = it.next();
                    int iMo20656b2 = ((MainDispatcherFactory) next2).mo20656b();
                    if (iMo20656b < iMo20656b2) {
                        next = next2;
                        iMo20656b = iMo20656b2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
        if (mainDispatcherFactory == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        f56350a = mainDispatcherFactory.mo20655a();
    }
}
