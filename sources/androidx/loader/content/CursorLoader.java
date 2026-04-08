package androidx.loader.content;

import android.database.Cursor;
import androidx.core.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CursorLoader extends AsyncTaskLoader<Cursor> {

    /* JADX INFO: renamed from: d */
    public Cursor f25062d;

    /* JADX INFO: renamed from: e */
    public CancellationSignal f25063e;

    @Override // androidx.loader.content.Loader
    /* JADX INFO: renamed from: a */
    public final void mo9207a(Object obj) {
        Cursor cursor = (Cursor) obj;
        Cursor cursor2 = this.f25062d;
        this.f25062d = cursor;
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    /* JADX INFO: renamed from: b */
    public final void mo9199b() {
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.f25063e;
                if (cancellationSignal != null) {
                    cancellationSignal.m7645a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    /* JADX INFO: renamed from: d */
    public final Object mo9201d() {
        synchronized (this) {
            try {
                if (this.f25059c != null) {
                    throw new OperationCanceledException("The operation has been canceled.");
                }
                this.f25063e = new CancellationSignal();
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            throw null;
        } catch (Throwable th2) {
            synchronized (this) {
                this.f25063e = null;
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    /* JADX INFO: renamed from: e */
    public final void mo9202e(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }
}
