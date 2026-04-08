package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p018db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/room/EntityInsertionAdapter;", "T", "Landroidx/room/SharedSQLiteStatement;", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
@SourceDebugExtension
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    /* JADX INFO: renamed from: e */
    public abstract void mo11792e(SupportSQLiteStatement supportSQLiteStatement, Object obj);

    /* JADX INFO: renamed from: f */
    public final void m11793f(Object obj) {
        SupportSQLiteStatement supportSQLiteStatementM11845a = m11845a();
        try {
            mo11792e(supportSQLiteStatementM11845a, obj);
            supportSQLiteStatementM11845a.mo11782W0();
        } finally {
            m11848d(supportSQLiteStatementM11845a);
        }
    }
}
