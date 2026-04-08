package androidx.localbroadcastmanager.content;

import android.os.Handler;
import android.os.Message;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class LocalBroadcastManager {

    /* JADX INFO: renamed from: androidx.localbroadcastmanager.content.LocalBroadcastManager$1 */
    /* JADX INFO: compiled from: Proguard */
    class HandlerC17211 extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                throw null;
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BroadcastRecord {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReceiverRecord {
        public final String toString() {
            StringBuilder sb = new StringBuilder(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            sb.append("Receiver{null filter=null");
            sb.append("}");
            return sb.toString();
        }
    }
}
