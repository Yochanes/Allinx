package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DebugKt {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r0.equals("on") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r0.equals("") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r0 = kotlinx.coroutines.internal.SystemPropsKt.m20855c("kotlinx.coroutines.stacktrace.recovery");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        java.lang.Boolean.parseBoolean(r0);
     */
    static {
        String strM20855c = SystemPropsKt.m20855c("kotlinx.coroutines.debug");
        if (strM20855c != null) {
            int iHashCode = strM20855c.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 3551) {
                    if (iHashCode == 109935) {
                    }
                }
                throw new IllegalStateException(("System property 'kotlinx.coroutines.debug' has unrecognized value '" + strM20855c + '\'').toString());
            }
        }
        new AtomicLong(0L);
    }
}
