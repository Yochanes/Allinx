package androidx.loader.content;

import android.database.ContentObserver;
import androidx.core.util.DebugUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Loader<D> {

    /* JADX INFO: renamed from: a */
    public boolean f25064a;

    /* JADX INFO: compiled from: Proguard */
    public final class ForceLoadContentObserver extends ContentObserver {
        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnLoadCanceledListener<D> {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnLoadCompleteListener<D> {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        DebugUtils.m7691a(sb, this);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void mo9207a(Object obj) {
    }
}
