package androidx.core.provider;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
@Deprecated
public class SelfDestructiveThread {

    /* JADX INFO: renamed from: androidx.core.provider.SelfDestructiveThread$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14461 implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                throw null;
            }
            if (i != 1) {
                return true;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.SelfDestructiveThread$2 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC14472 implements Runnable {

        /* JADX INFO: renamed from: androidx.core.provider.SelfDestructiveThread$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            try {
                throw null;
            } catch (Exception unused) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.SelfDestructiveThread$3 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC14483 implements Runnable {
        /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            try {
                throw null;
            } catch (Exception unused) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ReplyCallback<T> {
    }
}
