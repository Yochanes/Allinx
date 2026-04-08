package androidx.sqlite.p018db;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "Ljava/io/Closeable;", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface SupportSQLiteDatabase extends Closeable {
    /* JADX INFO: renamed from: D0 */
    boolean mo11761D0();

    /* JADX INFO: renamed from: J */
    boolean mo11762J();

    /* JADX INFO: renamed from: K0 */
    boolean mo11763K0();

    /* JADX INFO: renamed from: P */
    void mo11764P(Object[] objArr);

    /* JADX INFO: renamed from: P0 */
    void mo11765P0(long j);

    /* JADX INFO: renamed from: Q */
    void mo11766Q();

    /* JADX INFO: renamed from: T */
    long mo11767T();

    /* JADX INFO: renamed from: T0 */
    int mo11768T0(ContentValues contentValues, Object[] objArr);

    /* JADX INFO: renamed from: U */
    void mo11769U();

    /* JADX INFO: renamed from: d0 */
    boolean mo11770d0();

    long getPageSize();

    String getPath();

    int getVersion();

    /* JADX INFO: renamed from: l */
    void mo11771l();

    /* JADX INFO: renamed from: m0 */
    boolean mo11772m0();

    /* JADX INFO: renamed from: n0 */
    void mo11773n0();

    /* JADX INFO: renamed from: p */
    List mo11774p();

    /* JADX INFO: renamed from: q */
    void mo11775q(int i);

    /* JADX INFO: renamed from: r */
    void mo11776r(String str);

    /* JADX INFO: renamed from: v */
    boolean mo11777v();

    /* JADX INFO: renamed from: y */
    SupportSQLiteStatement mo11778y(String str);

    /* JADX INFO: renamed from: z0 */
    Cursor mo11779z0(SupportSQLiteQuery supportSQLiteQuery);
}
