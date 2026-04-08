package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.view.View;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class SimpleCursorAdapter extends ResourceCursorAdapter {

    /* JADX INFO: compiled from: Proguard */
    public interface CursorToStringConverter {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ViewBinder {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    /* JADX INFO: renamed from: c */
    public final String mo687c(Cursor cursor) {
        return cursor.getString(0);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    /* JADX INFO: renamed from: e */
    public final void mo689e(View view, Cursor cursor) {
        throw null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    /* JADX INFO: renamed from: h */
    public final Cursor mo8203h(Cursor cursor) {
        if (cursor == null) {
            return super.mo8203h(cursor);
        }
        throw null;
    }
}
